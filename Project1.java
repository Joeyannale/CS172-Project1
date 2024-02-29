
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

  }
 public static void permuteIt(String binaryInput) {
    String[] input = new String[binaryInput.length()];
    String[] output = new String[binaryInput.length()];
    for (int i = 0; i < binaryInput.length(); i++) {
      input[i] = binaryInput.substring(i, i + 1);
    }
    output[1] = input[16];
    output[2] = input[7];
    output[3] = input[20];
    output[4] = input[21];
    output[5] = input[29];
    output[6] = input[12];
    output[7] = input[28];
    output[8] = input[17];
    output[9] = input[1];
    output[10] = input[15];
    output[11] = input[23];
    output[12] = input[26];
    output[13] = input[5];
    output[14] = input[18];
    output[15] = input[31];
    output[16] = input[10];
    output[17] = input[2];
    output[18] = input[8];
    output[19] = input[24];
    output[20] = input[14];
    output[21] = input[32];
    output[22] = input[27];
    output[23] = input[3];
    output[24] = input[9];
    output[25] = input[19];
    output[26] = input[13];
    output[27] = input[30];
    output[28] = input[6];
    output[29] = input[22];
    output[30] = input[11];
    output[31] = input[4];
    output[32] = input[25];
  }
  
  public static void main(String[] args) {
    System.out.println(xorIt("1001", "0101"));
  }
}
