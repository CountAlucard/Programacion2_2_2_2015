
package Interfaces;

import java.util.ArrayList;

public class TecnoResidencia implements INetwork{

    ArrayList<String> casas = new ArrayList<>();
    
    @Override
    public void addDevice(String name) {
        casas.add(name);
    }

    @Override
    public void printNetwork() {
        for(String h: casas)
            System.out.println("-"+h);
    }

    @Override
    public boolean connectDeviceWith(String device1, String device2) {
        return false;
    }

    @Override
    public boolean existDevice(String name) {
        return casas.contains(name);
    }
    
}
