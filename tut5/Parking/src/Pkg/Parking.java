package Pkg;

/**
 * Created by gimy on 10/19/2016.
 */

public class Parking {

  //data Fields
  private int vehicleType;
    private int hours;
    private double fees;

    public Parking(){

    }

    public Parking(int vehicleType, int hours){

        this.vehicleType = vehicleType;
        this.hours = hours;
        setFees(vehicleType, hours);
    }

  public int getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(int vehicleType) {
    this.vehicleType = vehicleType;
  }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(int vehicleType, int hours) {
        if(vehicleType == 1){
            if(hours > 2){
                this.fees = 2 + (hours -2) * 0.5;

                if(this.fees > 6){
                    this.fees = 6;
                }
            }else{
                this.fees = 2;
            }
        }else if(vehicleType == 2){
            if(hours > 2){
                this.fees = 3 + (hours - 2) * 0.5;

                if(fees > 12){
                    this.fees = 12;
                }
            }else{
                this.fees = 3;
            }
        }
    }


}
