public class BitwiseCalc {
  public static String and(String binaryLeft, String binaryRight) {
    if (binaryLeft.length() > binaryRight.length()) {
      binaryRight = addPaddingsTo(binaryRight, binaryLeft.length());
    } else {
      binaryLeft = addPaddingsTo(binaryLeft, binaryRight.length());
    }

    String result = "";
    for (int i = 0; i < binaryLeft.length(); i++) {
      result += (binaryLeft.charAt(i) == '1' && binaryRight.charAt(i) == '1') ? '1' : '0';
    }
    return result;
  }

  private static String addPaddingsTo(String input, int expectedLength) {
    return String.format("%" + expectedLength + "s", input);
  }

  public static String or(String binaryLeft, String binaryRight) {
    String result = "";
    for (int i = 0; i < binaryLeft.length(); i++) {
      result += (binaryLeft.charAt(i) == '1' || binaryRight.charAt(i) == '1') ? '1' : '0';
    }
    return result;
  }

  public static String xor(String binaryLeft, String binaryRight) {
    String result = "";
    for (int i = 0; i < binaryLeft.length(); i++) {
      result += (binaryLeft.charAt(i) == '1' ^ binaryRight.charAt(i) == '1') ? '1' : '0';
    }
    return result;
  }

  public static String not(String binary) {
    String result = "";
    for (int i = 0; i < binary.length(); i++) {
      result += (binary.charAt(i) == '1' ? '0' : '1');
    }
    return result;
  }
}
