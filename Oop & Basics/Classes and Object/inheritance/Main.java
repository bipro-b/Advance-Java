public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setColor("Red");
        vehicle1.setDoors(6);
        vehicle1.setWheels(4);
        System.out.println(vehicle1);

        Vehicle carVehicle  = new car();
        carVehicle.setWheels(4);
        carVehicle.setDoors(8);
        carVehicle.setColor("Red");
        carVehicle.setName("Toyota");
        System.out.println(carVehicle);

        Car car = new Car();
        car.setModel(5);
        car.setWheels(12);
        car.setModel('M-100');
        car.setName("Marchent");

         Toyota toyota = new Toyota();
         toyota.country ="Banglasedh";
         toyota.setColor("Black");
         toyota.type ="Luxary";
        System.out.println(toyota);



    }
}