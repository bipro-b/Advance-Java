public class Car extends Vehicle {
    String type;
    String model;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setName(String name) {
        return super.name;
    }

    public String getName() {
        super.name = name + "-" + this.model;
    }

    public String toString() {
        String desciption = super.toString() + "Name: " + this.getName() + "\nModel: " + this.model + "\nThype: "
                + this.type + "\n";
        return desciption;

    }

}
