package dip.after;

public interface WireConnectable extends Connectable{

  default void connectWithWire(){
    System.out.println("connectWithWire");
  }

  default void disconnectWithWire(){
    System.out.println("disconnectWithWire");
  }
}
