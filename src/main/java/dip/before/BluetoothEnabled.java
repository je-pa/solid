package dip.before;

public interface BluetoothEnabled {

  default void connectBluetooth(){
    System.out.println("Connected to Bluetooth");
  }

  default void disconnectBluetooth(){
    System.out.println("Disconnected from Bluetooth");
  }
}
