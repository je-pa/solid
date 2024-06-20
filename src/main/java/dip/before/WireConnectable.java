package dip.before;

public interface WireConnectable {

  default void connectWithWire(){
    System.out.println("connectWithWire");
  }

  default void disconnectWithWire(){
    System.out.println("disconnectWithWire");
  }
}
