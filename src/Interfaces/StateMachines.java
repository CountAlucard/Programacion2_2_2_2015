
package Interfaces;

public class StateMachines implements INetwork, ISecureNetwork{

    
    
    @Override
    public void addDevice(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printNetwork() {
        System.out.println("Networking with StateMachine");
    }

    @Override
    public boolean connectDeviceWith(String device1, String device2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean existDevice(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEncryptedMethod() {
        return "Encrypted using Patito Method.";
    }

    @Override
    public void applyEncryption() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
