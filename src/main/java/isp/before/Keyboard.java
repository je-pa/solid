package isp.before;


public class Keyboard {

  private String color;
  private additionalPhoneFeatures additionalPhoneFeatures;

  public void inputText(String text) {
    System.out.println(text);
  }

  public void connectBluetooth() {
    if(this.additionalPhoneFeatures == null) { return; }
    this.additionalPhoneFeatures.connectBluetooth();
  }

  public void disconnectBluetooth() {
    if(this.additionalPhoneFeatures == null) { return; }
    this.additionalPhoneFeatures.disconnectBluetooth();
  }

  public void showMiniScreen() {
    if(this.additionalPhoneFeatures == null) { return; }
    this.additionalPhoneFeatures.showMiniScreen();
  }

  public void turnOnBackLight() {
    if(this.additionalPhoneFeatures == null) { return; }
    this.additionalPhoneFeatures.turnOnBackLight();
  }

  public void turnOffBackLight() {
    if(this.additionalPhoneFeatures == null) { return; }
    this.additionalPhoneFeatures.turnOffBackLight();
  }
}
