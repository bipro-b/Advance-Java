public class Vehicle {
    private int doors;
    private int wheels;
    private String color;
    private String name;

    public String toString() {
        String description = "This vehicle has " + doors + "\n Wheels is :" + wheels + "\nand color is :" + color;
        return description;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}