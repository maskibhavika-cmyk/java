public class ShallowCopyDeepcopy {
  public static void main(String[] args) {
      int[] arr={10, 39, 4, 6, 25};
       int[] x = arr;
       x[0] = 100;
      System.out.println(arr[0]);
   }

}

