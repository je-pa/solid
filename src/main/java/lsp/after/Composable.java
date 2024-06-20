package lsp.after;

public interface Composable {
  default void compose(){
    System.out.println("작곡한다.");
  }
}
