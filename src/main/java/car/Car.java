package car;

import java.util.Objects;

public class Car {
    private static int count = 0;

    private int id;
    private String brand;
    private String model;
    private int year;
    private String colour;
    private int price;
    private String carNumber;

    public Car(String brand, String model, int year, int price) {
        count++;
        this.id = count;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car(String brand, String model, int year, String colour, int price, String carNumber) {
        count++;
        this.id = count;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.colour = colour;
        this.price = price;
        this.carNumber = carNumber;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && year == car.year && price == car.price && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(colour, car.colour) && Objects.equals(carNumber, car.carNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, year, colour, price, carNumber);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                ", carNumber='" + carNumber + '\'' +
                '}';
    }
}
