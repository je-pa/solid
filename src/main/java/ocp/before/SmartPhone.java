package ocp.before;

public class SmartPhone {

  private String type;

  public SmartPhone(String type) {
    this.type = type;
  }

  public void turnOn(){
    showTurnOnScreen();
    System.out.println("Phone is turned on");
  }

  public void showTurnOnScreen(){
    switch (type){
      case "GalaxyS23":
        System.out.println("GalaxyS23 turn on 영상을 보여줍니다.");
      case "GalaxyS24":
        System.out.println("GalaxyS24 turn on 영상을 보여줍니다.");
    }
  }

  public void call(){
    System.out.println("전화를 겁니다.");
  }
}
