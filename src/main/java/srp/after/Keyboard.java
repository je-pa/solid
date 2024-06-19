package srp.after;

public class Keyboard {

  private String color;
  private BackLightEnabled backLightEnabled;
  private BluetoothEnabled bluetoothEnabled;
  private MiniScreenEnabled miniScreenEnabled;

  public Keyboard(BackLightEnabled backLightEnabled,
      BluetoothEnabled bluetoothEnabled,
      String color,
      MiniScreenEnabled miniScreenEnabled) {
    this.color = color;
    this.backLightEnabled = backLightEnabled;
    this.bluetoothEnabled = bluetoothEnabled;
    this.miniScreenEnabled = miniScreenEnabled;
  }

  public void inputText(String text) {
    System.out.println(text);
  }

  public void connectBluetooth() {
    if(this.bluetoothEnabled == null) { return; }
    this.bluetoothEnabled.connectBluetooth();
  }

  public void disconnectBluetooth() {
    if(this.bluetoothEnabled == null) { return; }
    this.bluetoothEnabled.disconnectBluetooth();
  }

  public void showMiniScreen() {
    if(this.miniScreenEnabled == null) { return; }
    this.miniScreenEnabled.showMiniScreen();
  }

  public void turnOnBackLight() {
    if(this.backLightEnabled == null) { return; }
    this.backLightEnabled.turnOnBackLight();
  }

  public void turnOffBackLight() {
    if(this.backLightEnabled == null) { return; }
    this.backLightEnabled.turnOffBackLight();
  }
}
