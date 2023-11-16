package core.inheritance;

public class TaxiPark {
    public static void main(String[] args) {
        PassengerTaxi taxi = new PassengerTaxi("Kia", 2021, "Red", "Econom", 4);
        System.out.println(taxi.getPrice(10));

        DeliveryTaxi deliveryTaxi = new DeliveryTaxi("Mercedes", 2023, "Black", "Express", 200);
        System.out.println(deliveryTaxi.getPrice(15));

        System.out.println(Taxi.getCarsCount());
    }
}
