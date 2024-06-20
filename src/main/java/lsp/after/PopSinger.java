package lsp.after;

public class PopSinger extends Singer{
  private String songType = "pop ";

  public PopSinger(Composable composable) {
    super(composable);
  }

  @Override
  public void sing() {
    System.out.println(songType);
    super.sing();
  }
}
