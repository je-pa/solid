package isp.before;

public class NoBluetoothAndBackLightAndNoScreen implements additionalPhoneFeatures{

  @Override
  public void connectBluetooth() {
    System.out.println("지원되지 않습니다.");
  }

  @Override
  public void disconnectBluetooth() {
    System.out.println("지원되지 않습니다.");
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
