
/**
 * Project 1
 * Author: Joey Zhang
 * Author: Gary Wang
 * Version: 3/6/24
 */
import java.util.Arrays;

public class Project1 {
  static String[][] S = new String[][] {
      { "01100011", "01111100", "01110111", "01111011", "11110010", "01101011", "01101111", "11000101", "00110000",
          "00000001", "01100111", "00101011", "11111110", "11010111", "10101011", "01110110" },
      { "11001010", "10000010", "11001001", "01111101", "11111010", "01011001", "01000111", "11110000", "10101101",
          "11010100", "10100010", "10101111", "10011100", "10100100", "01110010", "11000000" },
      { "10110111", "11111101", "10010011", "00100110", "00110110", "00111111", "11110111", "11001100", "00110100",
          "10100101", "11100101", "11110001", "01110001", "11011000", "00110001", "00010101" },
      { "00000100", "11000111", "00100011", "11000011", "00011000", "10010110", "00000101", "10011010", "00000111",
          "00010010", "10000000", "11100010", "11101011", "00100111", "10110010", "01110101" },
      { "00001001", "10000011", "00101100", "00011010", "00011011", "01101110", "01011010", "10100000", "01010010",
          "00111011", "11010110", "10110011", "00101001", "11100011", "00101111", "10000100" },
      { "01010011", "11010001", "00000000", "11101101", "00100000", "11111100", "10110001", "01011011", "01101010",
          "11001011", "10111110", "00111001", "01001010", "01001100", "01011000", "11001111" },
      { "11010000", "11101111", "10101010", "11111011", "01000011", "01001101", "00110011", "10000101", "01000101",
          "11111001", "00000010", "01111111", "01010000", "00111100", "10011111", "10101000" },
      { "01010001", "10100011", "01000000", "10001111", "10010010", "10011101", "00111000", "11110101", "10111100",
          "10110110", "11011010", "00100001", "00010000", "11111111", "11110011", "11010010" },
      { "11001101", "00001100", "00010011", "11101100", "01011111", "10010111", "01000100", "00010111", "11000100",
          "10100111", "01111110", "00111101", "01100100", "01011101", "00011001", "01110011" },
      { "01100000", "10000001", "01001111", "11011100", "00100010", "00101010", "10010000", "10001000", "01000110",
          "11101110", "10111000", "00010100", "11011110", "01011110", "00001011", "11011011" },
      { "11100000", "00110010", "00111010", "00001010", "01001001", "00000110", "00100100", "01011100", "11000010",
          "11010011", "10101100", "01100010", "10010001", "10010101", "11100100", "01111001" },
      { "11100111", "11001000", "00110111", "01101101", "10001101", "11010101", "01001110", "10101001", "01101100",
          "01010110", "11110100", "11101010", "01100101", "01111010", "10101110", "00001000" },
      { "10111010", "01111000", "00100101", "00101110", "00011100", "10100110", "10110100", "11000110", "11101000",
          "11011101", "01110100", "00011111", "01001011", "10111101", "10001011", "10001010" },
      { "01110000", "00111110", "10110101", "01100110", "01001000", "00000011", "11110110", "00001110", "01100001",
          "00110101", "01010111", "10111001", "10000110", "11000001", "00011101", "10011110" },
      { "11100001", "11111000", "10011000", "00010001", "01101001", "11011001", "10001110", "10010100", "10011011",
          "00011110", "10000111", "11101001", "11001110", "01010101", "00101000", "11011111" },
      { "10001100", "10100001", "10001001", "00001101", "10111111", "11100110", "01000010", "01101000", "01000001",
          "10011001", "00101101", "00001111", "10110000", "01010100", "10111011", "00010110" }
  };

  /**
   * Method to xor two binary inputs
   *
   * @param binary 1 The first binary input
   * @param binary 2 The second binary input
   * @return The result of xored binary 1 and 2.
   */
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

  /**
   * Permute the s-tabled string using the permute table.
   *
   * @param binaryInput The input 32-bit string.
   */
  public static String permuteIt(String binaryInput) {
    String[] input = new String[binaryInput.length()];
    String[] output = new String[binaryInput.length()];
    for (int i = 0; i < binaryInput.length(); i++) {
      input[i] = binaryInput.substring(i, i + 1);
    }
    output[0] = input[15];
    output[1] = input[6];
    output[2] = input[19];
    output[3] = input[20];
    output[4] = input[28];
    output[5] = input[11];
    output[6] = input[27];
    output[7] = input[16];
    output[8] = input[0];
    output[9] = input[14];
    output[10] = input[22];
    output[11] = input[25];
    output[12] = input[4];
    output[13] = input[17];
    output[14] = input[30];
    output[15] = input[9];
    output[16] = input[1];
    output[17] = input[7];
    output[18] = input[23];
    output[19] = input[13];
    output[20] = input[31];
    output[21] = input[26];
    output[22] = input[2];
    output[23] = input[8];
    output[24] = input[18];
    output[25] = input[12];
    output[26] = input[29];
    output[27] = input[5];
    output[28] = input[21];
    output[29] = input[10];
    output[30] = input[3];
    output[31] = input[24];
    binaryInput = "";
    for (int i = 0; i < output.length; i++) {
      binaryInput = binaryInput + output[i];
    }
    return binaryInput;
  }

  /**
   * Shifts the binary input to the left by one.
   *
   * @param The input.
   * @return The shifted binary expression.
   *         Passed the test.
   */
  public static String shiftIt(String binaryInput) {
    String[] input = new String[binaryInput.length()];
    String[] output = new String[binaryInput.length()];
    for (int i = 0; i < binaryInput.length(); i++)
      input[i] = binaryInput.substring(i, i + 1);
    for (int i = 0; i < input.length - 1; i++)
      output[i] = input[i + 1];
    output[output.length - 1] = input[0];
    binaryInput = "";
    for (int i = 0; i < output.length; i++)
      binaryInput = binaryInput + output[i];
    return binaryInput;
  }

  public static String substitutionS(String binaryInput) {
    String bileft = binaryInput.substring(0, 4);
    String biright = binaryInput.substring(0, 4);
    int deleft = Integer.parseInt(bileft, 2);
    int deright = Integer.parseInt(biright, 2);
    String binaryOutput = "";
    binaryOutput = S[deleft][deright];
    return binaryOutput;
  }

  /**
   * The f-function.
   *
   * @param rightHalf The right half of a 64-bit block.
   * @param The       first 32 digits of the encrypt key.
   * @return 32-bit string after applied the f-function.
   */
  public static String functionF(String rightHalf, String subKey) {
    String current = xorIt(rightHalf, subKey);
    String group1 = current.substring(0, 8);
    String group2 = current.substring(8, 16);
    String group3 = current.substring(16, 24);
    String group4 = current.substring(24, 32);
    group1 = substitutionS(group1);
    group2 = substitutionS(group2);
    group3 = substitutionS(group3);
    group4 = substitutionS(group4);
    current = group1 + group2 + group3 + group4;
    current = permuteIt(current);
    return current;
  }

  /**
  * The key schedule.
  *
  * @param inputKey The 56-digit key.
  * @return An array of 32-digit subkeys.
  */
  public static String[] keyScheduleTransform(String inputKey) {
    String[] keySchedule = new String[10];
    String left = inputKey.substring(0, 28);
    String right = inputKey.substring(28, 56);
    for(int i = 0; i < keySchedule.length; i++) {
      left = shiftIt(left);
      right = shiftIt(right);
      keySchedule[i] = left + right.substring(0, 4);
    }
    return keySchedule;
  }

  public static String encryptBlock(String block, String inputKey) {
    if (block == "all zeros") {
      block = "";
      for (int i = 0; i < 64; i++) {
        block = block + "0";
      }
    }
    if (block == "all ones") {
      block = "";
      for (int i = 0; i < 64; i++) {
        block = block + "1";
      }
    }
    if (inputKey == "all zeros") {
      inputKey = "";
      for (int i = 0; i < 56; i++) {
        inputKey = inputKey + "0";
      }
    }
    if (inputKey == "all ones") {
      inputKey = "";
      for (int i = 0; i < 56; i++) {
        inputKey = inputKey + "1";
      }
    }
    return block + inputKey;
  }

  public static String encryption(String longBinaryInput, String inputKey) {
    return "";
  }

  public static void main(String[] args) {
    // System.out.println(xorIt("1001", "0101"));
    // System.out.println(shiftIt("10010001"));
    // System.out.println(substitutionS("10001000"));
    // System.out.println(encryptBlock("all zeros", "all zeros"));
    // System.out.println(functionF("00000000000000000000000000000000", "00000000000000000000000000000000"));
    String[] test = keyScheduleTransform("10000000000000000000000000001000000000000000000000000000");
    for(String i : test)
      System.out.println(i);
  }
}
