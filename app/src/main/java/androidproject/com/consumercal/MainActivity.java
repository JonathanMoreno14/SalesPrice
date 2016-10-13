package androidproject.com.consumercal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    EditText editPriceOfItem;
    EditText editPercentOff;
    ImageButton computeBtn;
    Button clearBtn;
    TextView resultsText;
    double percentOff;
    double priceItem;
    double percentAdj; //The percent is adjusted
    double numPercentOff; //The priceItm * percentAdj = numPercentOff
    double numSale; //the sale of the item with the percent off


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPriceOfItem = (EditText) findViewById(R.id.editText);
        editPercentOff = (EditText) findViewById(R.id.editText2);
        computeBtn = (ImageButton) findViewById(R.id.imageButton);
        clearBtn = (Button) findViewById(R.id.button);
        resultsText = (TextView) findViewById(R.id.textView);



        //computeBtn.setOnClickListener(this);
        computeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    computePercentOff();
                }catch (NumberFormatException e){
                    resultsText.setText("Error, input Numbers");
                }
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editPriceOfItem.setText("");
                editPercentOff.setText("");
                resultsText.setText("0"); //might add zero
            }
        });

    }


    /*
    Computations
     */
    public void  computePercentOff(){

        priceItem  =  Double.parseDouble(editPriceOfItem.getText().toString());
        percentOff = Double.parseDouble(editPercentOff.getText().toString());

          percentAdj  =  percentOff / 100 ;
          numPercentOff = priceItem * percentAdj;
          numSale  =  priceItem - numPercentOff;
          String decSale = numSale + "";
          String decimalFormat1 = new DecimalFormat("0.##").format(Double.parseDouble(decSale));
          resultsText.setText("$"+""+decimalFormat1);


         /*
         An Item is selling for $45 dollars at a store, but there is a sale going "take 20% off any item in the store"
           20/100 = 0.2
          45* 0.2 = 9
          45 - 9 = 36
         The item is selling for 36 dollars with the 20% off.
          */
    }

}

