
package Interfaces;

public class ElectronicDevice {
    private String name;
    private String type;

    public ElectronicDevice(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    public int getVolts(){
        return 110;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    
    
}
