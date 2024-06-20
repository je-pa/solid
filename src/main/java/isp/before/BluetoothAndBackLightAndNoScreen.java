package isp.before;

public class BluetoothAndBackLightAndNoScreen implements additionalPhoneFeatures{

  @Override
  public void connectBluetooth() {
    System.out.println("Connected to Bluetooth");
  }

  @Override
  public void disconnectBluetooth() {
    System.out.println("Disconnected from Bluetooth");
  }

  @Override
  public void turnOnBackLight() {
    System.out.println("Mini screen");
  }

  @Override
  public void turnOffBackLight() {
    System.out.println("turned on back light");
  }

  @Override
  public void showMiniScreen() {
    System.out.println("지원되지 않습니다.");
  }
}
