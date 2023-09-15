package sectionseven;

public class MainCarObject {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Tesla");
        car.setModel("Model Y");
        car.setNoOfDoors(4);
        car.setConvertible(true);
        car.setColor("Black");
        car.getMake();
        car.getColor();
        car.getModel();
        car.carFields();
    }
}
