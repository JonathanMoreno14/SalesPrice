# SalesPrice

![feature graphic version 6](https://cloud.githubusercontent.com/assets/11635523/19369949/60d59222-916e-11e6-8df4-dd082d5f98bb.png)


SalesPrice is an Android application I published via Google Play Store

![salesprice](https://cloud.githubusercontent.com/assets/11635523/19369945/5b248a54-916e-11e6-8682-e074881046d2.gif
) 



```java
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
      
```

[![google-play-badge size 2](https://cloud.githubusercontent.com/assets/11635523/19371891/9c9d3be4-917c-11e6-9a56-15148887821c.png)](https://play.google.com/store/apps/details?id=androidproject.com.consumercal)
