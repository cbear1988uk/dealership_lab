package property;

import behaviours.ISalesPitch;

public class Vehicle extends CarStock implements ISalesPitch {

    public String model;
    public String type;
    public String colour;
    public Integer price;
    public boolean damage;

    public Vehicle(String model, String type, String colour, Integer price, boolean damage){
        this.model = model;
        this.type = type;
        this.colour = colour;
        this.price = price;
        this.damage = damage;
    }

    public String getModel(){
        return this.model;
    }

    public String getType(){
        return this.type;
    }

    public String getColour(){
        return this.colour;
    }

    public Integer getPrice(){
        return this.price;
    }

    public boolean getDamage(){
        return false;
    }

    public String outputData(String data) {
        return display(data);
    }

    public Integer deductDamage(){
       if(this.damage = true){
           return this.price - (this.price / 4);
       }
       return this.price;
    }

}
