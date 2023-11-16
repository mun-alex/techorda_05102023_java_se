package core.inheritance;

public class DeliveryTaxi extends Taxi {
    private String deliveryType;
    private int loadCapacity;

    public DeliveryTaxi() {
    }

    public DeliveryTaxi(String model, int year, String color, String deliveryType, int loadCapacity) {
        super(model, year, color);
        this.deliveryType = deliveryType;
        this.loadCapacity = loadCapacity;
        carsCount++;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public int getPrice(int distance) {
        switch (deliveryType) {
            case "normal":
                return loadCapacity * distance * 20;
            case "express":
                return loadCapacity * distance * 50;
            default:
                return super.getPrice(distance);
        }
    }
}
