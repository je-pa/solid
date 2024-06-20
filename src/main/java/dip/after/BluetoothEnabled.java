package dip.after;

public interface BluetoothEnabled extends Connectable{

  default void connectBluetooth(){
    System.out.println("Connected to Bluetooth");
  }

  default void disconnectBluetooth(){
    System.out.println("Disconnected from Bluetooth");
  }
}
