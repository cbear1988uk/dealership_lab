package visitors;

import property.Vehicle;

public class Customer {

    public String name;
    public Integer budget;
    public Vehicle vehicle1;

    public Customer(String name, Integer budget){
        this.name = name;
        this.budget = budget;
        vehicle1 = new Vehicle("Camry", "Hyrbid", "Black", 15000, false);
    }

    public String getName(){
        return this.name;
    }

    public Integer getBudget(){
        return this.budget;
    }

    public boolean buyCar() {
        if(vehicle1.price <= this.budget){
            return true;
        }
        return false;
    }




}
