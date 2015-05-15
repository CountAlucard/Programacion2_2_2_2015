
package Interfaces;

import java.io.Serializable;

public class ComputerDevice extends ElectronicDevice implements IFullNetwork, Serializable{

    public ComputerDevice(String name) {
        super(name, "Computer");
    }
    
    public void formatDisk(String format){
        System.out.println("Formatting the disk with "+format);
    }  
    

    @Override
    public void addDevice(String name) {        
    }

    @Override
    public void printNetwork() {
        System.out.println("Connecting My Files with INetwork.");
    }

    @Override
    public boolean connectDeviceWith(String device1, String device2) {
        return true;
    }

    @Override
    public boolean existDevice(String name) {
        return true;
    }

    @Override
    public String getEncryptedMethod() {
        return "UTF8 Encrypted Script";
    }

    @Override
    public void applyEncryption() {
        
    }

    @Override
    public void full() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
