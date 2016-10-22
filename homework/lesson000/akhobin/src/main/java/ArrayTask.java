import java.util.Arrays;

class ArrayTask {
  public static void main(String[] args) {
    int[] myArray = {1, 2, 3, 4, 50, 60, 70, 80, 90, 100};

    ArraysCopier copier = new ArraysCopier(myArray);

    System.out.println(copier);

    System.out.println(Arrays.toString(copier.copyOf(5)));
    System.out.println(Arrays.toString(copier.copyOfRange(2, 5)));
    System.out.println(Arrays.toString(copier.fill(7)));
  }
}

class ArraysCopier {
  public int[] array;

  public ArraysCopier(int[] array) {
    this.array = array;
  }

   public String toString() {
     return Arrays.toString(array);
   }

   public int[] copyOf(int newLength) {
     int[] result = new int[newLength];

     for (int i = 0; i < newLength; i++) {
       result[i] = array[i];
     }

     return result;
   }

   public int[] copyOfRange(int from, int to) {
     int newLength = Math.abs(to - from);
     int[] result = new int[newLength];

     for (int i = 0; i < newLength; i++) {
       result[i] = array[i + from];
     }

     return result;
   }

   public int[] fill(int value) {
     int[] result = new int[array.length];
     for (int i = 0; i < array.length; i++) {
        result[i] = value;
     }

     return result;
   }



}
