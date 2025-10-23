public class Vehicle{

    public String brand;
    public double max_speed;
    public boolean on;

    public Vehicle(String brand, double max_speed){

        this.brand=brand;
        this.max_speed=max_speed;
        this.on = false;

    }

    public void setMaxSpeed(double maxSpeed){
        if(maxSpeed < 0){
            System.out.println();
        }
    }

    public void turnOn(){
        if(this.on){
            System.out.println(x:"Vehicle is already on!");
        }
        else{
            System.out.println(x:"Vehicle is turning on!");
            this.on =true;
        }
    

    public void TurnOff(){
        if(!this.on){
            System.out.println(x:"Vehicle is turning off!");
        }
        else {
            System.out.println(x:"Vehicle is turning off!");
            this .on = false;
        }
    }

}
