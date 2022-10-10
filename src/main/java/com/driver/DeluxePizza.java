package com.driver;

public class DeluxePizza extends Pizza {
 boolean del=false;
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
           this.del=false;

        // your code goes here
    }
    public void addExtraCheese(){

        if(!cheese&&del){
            this.cheese=true;
            setPrice(80);
        }
        // your code goes here
    }

    public void addExtraToppings(){

        if(!topping&&del){
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
    public String getBill(){
        String Bill="";
        if(isVeg){
            Bill += "Base Price Of The Pizza: " + "300" + "\n";
        }else{
            Bill += "Base Price Of The Pizza: " + "400" + "\n";
        }
        if(cheese&&del){
            Bill += "Extra Cheese Added: "+"80"+"\n";
        }
        if(topping&&del){
            if(isVeg){
                Bill +=  "Extra Toppings Added: "+"70"+"\n";
            }else{
                Bill +=  "Extra Toppings Added: "+"120"+"\n";
            }
        }
        if(bag&&del){
            Bill += "Paperbag Added: "+"20"+"\n";

        }
        Bill += "Total Price: "+""+this.price;
        // your code goes here
        this.bill = Bill;
        return this.bill;
    }
    public void addTakeaway(){

        if(!bag&&del){
            this.bag=true;
            setPrice(20);
        }
        // your code goes here
    }
}
