package unit_tests.car;

public class Car {
    private String make;
    private String model;
    private String fuelType;
    private int year;

    public Car() {
    }

    public Car(String make, String model, String fuelType, int year) {
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public Car setMake(String make) {
        this.make = make;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public String getFuelType() {
        return fuelType;
    }

    public Car setFuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Car setYear(int year) {
        this.year = year;
        return this;
    }
}
