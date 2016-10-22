public class ArraysCopier {
  int[] array;

  public ArraysCopier(int[] array) {
    this.array = array;
  }

  public int[] copyOf(int newLength) {
    if (newLength == 0) {
      return new int[0];
    }
    if (newLength == array.length) {
      return array;
    }

    int[] newArray = new int[newLength];
    for (int i = 0; i < newLength; i++) {
      newArray[i] = (i < array.length) ? array[i] : 0;
    }
    return newArray;
  }

  public int[] copyOfRange(int from, int to) {
    int newLength = to - from;

    if (newLength < 0) {
      return null;
    }

    int[] newArray = new int[newLength];
    for (int i = from, newIndex = 0; i < to; i++, newIndex++) {
      newArray[newIndex] = array[i];
    }
    return newArray;
  }

  public int[] fill(int value) {
    int[] newArray = new int[array.length];
    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = value;
    }
    return newArray;
  }
}
