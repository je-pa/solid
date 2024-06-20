package dip.before;

public class Keyboard {

  private String color;
//  private BluetoothEnabled bluetoothEnabled;
  private BothBluetoothAndWireLink bothBluetoothAndWireLink;

  public Keyboard(
//      BluetoothEnabled bluetoothEnabled,
      BothBluetoothAndWireLink bothBluetoothAndWireLink,
      String color) {
    this.color = color;
//    this.bluetoothEnabled = bluetoothEnabled;
    this.bothBluetoothAndWireLink = bothBluetoothAndWireLink;
  }

  public void inputText(String text) {
    System.out.println(text);
  }

  public void connectBluetooth() {
    if(this.bothBluetoothAndWireLink == null) { return; }
    this.bothBluetoothAndWireLink.connectBluetooth();
  }

  public void disconnectBluetooth() {
    if(this.bothBluetoothAndWireLink == null) { return; }
    this.bothBluetoothAndWireLink.disconnectBluetooth();
  }

  public void connectWithWire(){
    if(this.bothBluetoothAndWireLink == null) { return; }
    this.bothBluetoothAndWireLink.connectWithWire();
  }

  public void disconnectWithWire(){
    if(this.bothBluetoothAndWireLink == null) { return; }
    this.bothBluetoothAndWireLink.disconnectWithWire();
  }
}
