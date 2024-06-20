package lsp.after;

public class PopSinger extends Singer{
  private String songType = "pop ";

  @Override
  public void sing() {
    System.out.println(songType);
    super.sing();
  }
}
