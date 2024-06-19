package srp.before;

public class KeyboardWithBluetoothAndMiniScreenAndBackLight {
  private String color;

  public void inputText(String text){
    System.out.println(text);
  }

  public void connectBluetooth(){
    System.out.println("Connected to Bluetooth");
  }

  public void disconnectBluetooth(){
    System.out.println("Disconnected from Bluetooth");
  }

  public void showMiniScreen(){
    System.out.println("Mini screen");
  }

  public void turnOnBackLight(){
    System.out.println("turned on back light");
  }

  public void turnOffBackLight(){
    System.out.println("turned off back light");
  }
}
