package dip.after;

public class Keyboard {

  private String color;
  private Connectable connectable;

  public Keyboard(String color, Connectable connectable) {
    this.color = color;
    this.connectable = connectable;
  }

  public void inputText(String text) {
    System.out.println(text);
  }

  public void connectBluetooth() {
    if(this.connectable == null) { return; }
    if(this.connectable instanceof BluetoothEnabled){
      System.out.println("블루투스 연결 기능이 없는 키보드 입니다.");
    }
    ((BluetoothEnabled)this.connectable).connectBluetooth();
  }

  public void disconnectBluetooth() {
    if(this.connectable == null) { return; }
    if(this.connectable instanceof BluetoothEnabled){
      System.out.println("블루투스 연결 기능이 없는 키보드 입니다.");
    }
    ((BluetoothEnabled)this.connectable).disconnectBluetooth();
  }

  public void connectWithWire(){
    if(this.connectable == null) { return; }
    if(this.connectable instanceof WireConnectable){
      System.out.println("유선 연결 기능이 없는 키보드 입니다.");
    }
    ((WireConnectable)this.connectable).connectWithWire();
  }

  public void disconnectWithWire(){
    if(this.connectable == null) { return; }
    if(this.connectable instanceof WireConnectable){
      System.out.println("유선 연결 기능이 없는 키보드 입니다.");
    }
    ((WireConnectable)this.connectable).disconnectWithWire();
  }

}
