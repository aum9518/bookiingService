public class Car {
   private String brand;
   private String model;
   private int year;
    private int price;
    private String color;
    private boolean booked;

    public Car(String brand, String model, int year, int price, String color, boolean booked) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.booked = booked;
    }

    public Car(String brand, String model, int year, int price, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public boolean isBooked() {
        return booked;
    }
}
