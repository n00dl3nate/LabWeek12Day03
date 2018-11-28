package Dealership.Components;

public class Tyre {


    private String type;
    private String make;

    public Tyre(String type,String make){
        this.type = type;
        this.make = make;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
