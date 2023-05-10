public class Car extends Vehicle {
    
    private int doorNum;
    private int passengerNum;

    public Car(String aMake, String aModel, String aPlate, int numDoors, int numPass){
        super(aMake, aModel, aPlate);
        this.doorNum = numDoors;
        this.passengerNum = numPass;
    }

    public int getDoors(){
        return this.doorNum;
    }

    public int getPassengers(){
        return this.passengerNum;
    }

    @Override
    public String toString(){

        String result = "";
        result = String.format("%d-door %s %s with license %s", this.doorNum, super.getMake(), super.getModel(), super.getPlate());

        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Car)){
            return false;
        }

        Car other = (Car) obj;

        if(this.doorNum == other.doorNum && this.passengerNum == other.passengerNum){
            return true;
        }
        return false;
    }


    
    public Car copy(){
        int theDoors = this.doorNum;
        int thePassenger = this.passengerNum;
        String theMake = super.getMake();
        String theModel = super.getModel();
        String thePlate = super.getPlate();

        Car theCopy = new Car(theMake, theModel, thePlate, theDoors, thePassenger);

        return theCopy;

    }
}
