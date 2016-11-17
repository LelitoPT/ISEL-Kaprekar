import java.util.*;
import java.lang.*;
//skype matilde.pato
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
    for (int i = 0; i < in.length() ; i++) {
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

    int k_num = Integer.parseInt(in);

    int i = 1;
    String num_a = "";
    String num_b = "";
    int minus_ab = 0;
    char [] comp =  new char [in.length()];
    do {
        for (int x = 0 ; x < in.length() ; x++ ) {
          tgt = in.charAt(x);
            for (int a = 1; a < in.length() ; a++ ) {
              if (tgt > in.charAt(a)) {
                continue;
              }
              else {
                break;
              }
            }
            comp[x] = tgt;
        }
        System.out.println(
          i + ": N=" + in +
          " A=" + num_a +
          " B=" + num_b +
          " A-B=" + minus_ab
        );
        i++;
    } while (i <= 8);
    System.out.println(Arrays.toString(args) + Arrays.toString(comp));
  }
}
