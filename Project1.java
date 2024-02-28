
/**
 * Project 1
 * Author: Joey Zhang
 * Author: Gary Wang
 * Version: 2/28/24
 */
import java.util.Arrays;

public class Project1 {
  public static String xorIt(String binary1, String binary2) {
    String xorEd = "";
    for (int i = 0; i < binary1.length(); i++) {
      if ((binary1.substring(i, i + 1)).equals(binary2.substring(i, i + 1))) {
        xorEd = xorEd + "0";
      } else {
        xorEd = xorEd + "1";
      }
    }
    return xorEd;
  }

  public static void permuteIt(String binaryInput) {
    String[] input = new String[binaryInput.length()];
    String[] output = new String[binaryInput.length()];
    for (int i = 0; i < binaryInput.length(); i++) {
      input[i] = binaryInput.substring(i, i + 1);
    }

  }

  public static void main(String[] args) {
    System.out.println(xorIt("1001", "0101"));
  }
}
