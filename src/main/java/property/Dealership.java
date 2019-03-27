package property;

import behaviours.ISalesPitch;

public class Dealership {

    private ISalesPitch pitchOutput;
    public Vehicle vehicle;
    public Integer singleCarBudget;

    public Dealership(ISalesPitch pitchOutput, Integer singleCarBudget){
        this.pitchOutput = pitchOutput;
        this.singleCarBudget = singleCarBudget;
        vehicle = new Vehicle("Tundra", "Gas-Guzzler", "White", 18000, false);
    }

    public String throwPitch(String pitch) {
        return this.pitchOutput.outputData(pitch);
    }

    public boolean buyCar() {
        if(vehicle.price <= (this.singleCarBudget / 2)){
            return true;
        }
        return false;
    }

}
