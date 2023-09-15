package sectionseven;

public class Car {
    private String make = "Tesla";
    private String model;
    private int noOfDoors;
    private String color;
    private boolean convertible;
    public String getMake(){
        return make;
        }
    public String getModel() {
        return model;
    }
    public int noOfDoors() {
        return noOfDoors;
    }
    public String getColor() {
        return color;
    }
    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make) {
        if(make == null) make = "unknown";
        String lowercase = make.toLowerCase();
        switch(lowercase){
            case "holden", "porsche","tesla" -> this.make =make;
            default -> {
                this.make = "Unsupported";
            }

        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void carFields(){
        System.out.println("My "+ make+ " " +model+ " " + color+ "" + " is having "+noOfDoors+"-Doors" + " and it is " + (convertible ? "Convertible" : " "));
    }
}
