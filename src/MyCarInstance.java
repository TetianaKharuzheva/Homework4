public class MyCarInstance {
    public static void main(String[] args) {
        // create car of class Car
        Car newCar = new Car();
        newCar.brand = "Toyota";
        newCar.model = "Verso";
        newCar.year = 2002;
        System.out.println("Brand :" + newCar.brand);
        System.out.println("Model :" + newCar.model);
        System.out.println("Year :" + newCar.year);
        // execute methods
        newCar.startEngine();
        newCar.stopEngine();
    }
}
