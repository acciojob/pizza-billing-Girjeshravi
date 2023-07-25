package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private int basePrice;
    private boolean echeese;
    private boolean  eToppings;
    private boolean paperBag;
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
        return this.price;
    }

    public void addExtraCheese(){
        if(!echeese){
            bill="Extra Cheese Added: "+cheesePrice+ "\n";
            echeese=true;
            price=basePrice+cheesePrice;
        }
    }

    public void addExtraToppings(){
        if(!eToppings){
            bill=bill+"Extra Toppings Added: "+ toppingsPrice+"\n";
            eToppings=false;
            price=price+toppingsPrice;
        }
    }

    public void addTakeaway(){
        if(!paperBag){
            bill=bill+"Paperbag Added: "+paperBagPrice+"\n";
            paperBag=true;
            price=price+paperBagPrice;
        }

    }

    public String getBill(){
        return "Base Price Of The Pizza: "+basePrice+"\n"+ this.bill+"Total Price: "+this.price+"\n";
    }
}
