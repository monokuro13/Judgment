import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String hoge = scanner.next();

    if ( Character.isUpperCase(hoge.charAt(0))) {
      System.out.println(true);
    }else {
      System.out.println(false);
    }
  }
}

