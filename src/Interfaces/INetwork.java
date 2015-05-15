
package Interfaces;

public interface INetwork {
    void addDevice(String name);
    void printNetwork();
    boolean connectDeviceWith(String device1, String device2);
    boolean existDevice(String name);
}
