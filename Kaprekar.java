import java.util.*;
import java.lang.*;

public class Kaprekar {
  public static void main (String [] args) {
    if (args.length == 0) {
      System.out.println("Use: java Kaprekar DDDD");
      System.exit(0);
    }
    String in = args[0];
    if (in.length() <= 3) {
      System.out.println("O valor não tem 4 dígitos");
      System.exit(0);
    }
    int count = 0;
    char tgt = in.charAt(0);
    char prev = tgt;
    for (int i = 0; i < in.length() ;i++) {
      tgt = in.charAt(i);
      if (tgt < 48 || tgt > 57) {
        System.out.println("Dígito " + tgt + " inválido");
        System.exit(0);
      }
      if (prev == tgt) {
        count++;
        prev = tgt;
      }
      else {
        prev = tgt;
      }
    }
    if (count == in.length()) {
      System.out.println("Os dígitos não podem ser todos iguais");
      System.exit(0);
    }
    //Scanner in = new Scanner(System.in);
    System.out.println(Arrays.toString(args));
  }
}
