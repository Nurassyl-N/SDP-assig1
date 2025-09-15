public class Car {
    private final String make;
    private final String model;
    private final int year;
    private final String engine;
    private final String color;
    private final int seats;
    private final boolean gps;


    private Car(Builder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.engine = builder.engine;
        this.color = builder.color;
        this.seats = builder.seats;
        this.gps = builder.gps;
    }


    public static class Builder {
        private String make;
        private String model;
        private int year;
        private String engine;
        private String color;
        private int seats;
        private boolean gps;

        public Builder withMake(String make) {
            this.make = make;
            return  this;
        }

        public Builder withModel(String model) {
            this.model = model;
            return  this;
        }

        public Builder withYear(int year) {
            this.year = year;
            return this;
        }

        public Builder withEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder withColor(String color) {
            this.color = color;
            return this;
        }

        public Builder withSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Builder withGPS(boolean gps) {
            this.gps = gps;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car {" +
                "make ='" + make + '\'' +
                ", model ='" + model + '\'' +
                ", yaer = " + year +
                ", engine ='" + engine + '\'' +
                ", color ='" + color + '\'' +
                ", gps = " + gps +
                '}';
    }
}
