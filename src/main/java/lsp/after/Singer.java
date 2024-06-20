package lsp.after;

public class Singer {
  private Composable composable;

  public Singer(Composable composable) {
    this.composable = composable;
  }

  public void sing(){
    System.out.println("노래를 부른다.");
  }

  public void compose(){
    if(composable == null) return;
    composable.compose();
  }
}
