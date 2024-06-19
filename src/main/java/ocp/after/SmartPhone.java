package ocp.after;

public abstract class SmartPhone {

  public void turnOn(){
    showTurnOnScreen();
    System.out.println("Phone is turned on");
  }

  abstract void showTurnOnScreen();

  public void call(){
    System.out.println("전화를 겁니다.");
  }
}
