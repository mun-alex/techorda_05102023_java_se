package core.inheritance;

public class PassengerTaxi extends Taxi {
    private String type;
    private int passengerCapacity;

    public PassengerTaxi() {
        System.out.println("passenger taxi");
    }

    public PassengerTaxi(String model, int year, String color, String type, int passengerCapacity) {
        super(model, year, color);
        this.type = type;
        this.passengerCapacity = passengerCapacity;
        carsCount++;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
    @Override
    public int getPrice(int distance) {
       switch (type) {
           case "Econom":
               return passengerCapacity * distance * 50;
           case "Business":
               return passengerCapacity * distance * 150;
           default:
               return super.getPrice(distance);
       }
    }
}
