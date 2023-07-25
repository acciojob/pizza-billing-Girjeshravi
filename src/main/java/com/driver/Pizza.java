package com.driver;

public class Pizza {
    private Boolean isVeg;
    private String bill;
    private int basePrice;
    private boolean echeese;
    private boolean  eToppings;
    private boolean paperBag;
    private int totalPrice;
    private int toppingsPrice;
    private int paperBagPrice;
    private int cheesePrice;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            basePrice=300;
            toppingsPrice=70;
        }else{
            basePrice=400;
            toppingsPrice=120;
        }
        paperBagPrice=20;
        cheesePrice=80;
    }

    public int getPrice(){
        return this.totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!echeese){
            bill="extra chees: "+cheesePrice+ "/n";
            echeese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!eToppings){
            bill=bill+"extra tooping: "+ toppingsPrice+"/n";
            eToppings=false;
        }
    }

    public void addTakeaway(){
        // your code goes here
        bill=bill+"paper bag price: "+paperBagPrice+"/n";
        paperBag=true;
    }

    public String getBill(){
        // your code goes here
        return "Pizza base price "+this.basePrice +" "+ this.bill;
    }
}
