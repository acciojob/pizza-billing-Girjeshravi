package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private int basePrice;
    private boolean echeese;
    private boolean  eToppings;
    private boolean paperBag;
    private boolean issBillgenerated;
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
        price=basePrice;
        bill="Base Price Of The Pizza: "+price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!echeese){
            echeese=true;
            price=basePrice+cheesePrice;
        }
    }

    public void addExtraToppings(){
        if(!eToppings){
            eToppings=true;
            price=price+toppingsPrice;
        }
    }

    public void addTakeaway(){
        if(!paperBag){
            paperBag=true;
            price=price+paperBagPrice;
        }
    }
    public String getBill(){
        if(!issBillgenerated){
            issBillgenerated=true;
            if(echeese){
                bill=bill+"Extra Cheese Added: "+cheesePrice+ "\n";
            }
            if(eToppings){
                bill=bill+"Extra Toppings Added: "+ toppingsPrice+"\n";
            }
            if(paperBag){
                bill= bill+"Paperbag Added: "+paperBagPrice+"\n";
            }
            bill=bill+"Total Price: "+price+"\n";
            return this.bill;
        }
        return "";
    }
}
