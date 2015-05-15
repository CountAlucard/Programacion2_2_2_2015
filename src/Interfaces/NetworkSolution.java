
package Interfaces;

import java.util.ArrayList;

public class NetworkSolution {
    public static void main(String[] args) {
        ArrayList<INetwork> network = new ArrayList<>();
        
        network.add(new TecnoResidencia());
        network.add(new ComputerDevice("MacBook"));
        network.add(new StateMachines());
        network.add(new INetwork() {

            @Override
            public void addDevice(String name) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void printNetwork() {
                System.out.println("On-Demand Network");
            }

            @Override
            public boolean connectDeviceWith(String device1, String device2) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean existDevice(String name) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        for(INetwork in: network){
            in.printNetwork();
            if(in instanceof ElectronicDevice)
                System.out.println("Volts =" +((ElectronicDevice)in).getVolts());
            if(in instanceof ComputerDevice)
                ((ComputerDevice)in).formatDisk("FAT-32");
            if(in instanceof ISecureNetwork)
                ((ISecureNetwork)in).getEncryptedMethod();
        }
    }
}
