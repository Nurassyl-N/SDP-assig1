public class Main {
    public static void main(String[] args) {
        Car sportsCar = new Car.Builder()
                .withMake("BWM")
                .withModel("M880")
                .withYear(2024)
                .withEngine("V8")
                .withColor("Red")
                .withSeats(2)
                .withGPS(true)
                .build();

        Car familyCar = new Car.Builder()
                .withMake("BWM")
                .withModel("M330")
                .withYear(1999)
                .withEngine("V4")
                .withColor("Blue")
                .withSeats(5)
                .withGPS(false)
                .build();

        System.out.println(sportsCar);
        System.out.println(familyCar);
    }
}