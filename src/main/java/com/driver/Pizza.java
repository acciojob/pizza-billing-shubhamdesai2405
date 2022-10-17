package com.driver;

public class Pizza {

     int price;
    Boolean isVeg;
    String bill;

     boolean cheese=false;
   boolean topping =false;
     boolean bag=false;

boolean isBillGenerated;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
//            this.price = 300;
            setPrice(300);
        }else{
//            this.price = 400;
            setPrice(400);
        }

        // your code goes here
    }

    public void setPrice(int price){
        this.price += price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){

        if(!cheese){
            this.cheese=true;
            setPrice(80);
        }
        // your code goes here
    }

    public void addExtraToppings(){

        if(!topping){
            this.topping=true;
            int vegTopping = 70;
            int nonVegTopping = 120;
            if(isVeg){
                setPrice(vegTopping);
            }else{
                setPrice(nonVegTopping);
            }
        }
        // your code goes here
    }

    public void addTakeaway(){

       if(!bag){
           this.bag=true;
           setPrice(20);
       }
        // your code goes here
    }

    public String getBill() {
        String Bill = "";

        if (isBillGenerated == false) {

            isBillGenerated = true;

            if (isVeg) {
                Bill += "Base Price Of The Pizza: " + "300" + "\n";
            } else {
                Bill += "Base Price Of The Pizza: " + "400" + "\n";
            }
            if (cheese) {
                Bill += "Extra Cheese Added: " + "80" + "\n";
            }
            if (topping) {
                if (isVeg) {
                    Bill += "Extra Toppings Added: " + "70" + "\n";
                } else {
                    Bill += "Extra Toppings Added: " + "120" + "\n";
                }
            }
            if (bag) {
                Bill += "Paperbag Added: " + "20" + "\n";

            }
            Bill += "Total Price: " + "" + this.price+"\n";
            // your code goes here
            this.bill = Bill;

        }

        return this.bill;
    }
}
