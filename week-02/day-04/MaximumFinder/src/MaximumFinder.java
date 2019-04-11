public class MaximumFinder {
  public static void main(String[] args) {

    int myArrays[] = {2, 6, 5, 3, 1};
    int n = myArrays.length;
    //int findMax = findMax(myArrays, 5)
    System.out.println(findMax(myArrays, 5));

  }

  public static int findMax (int myArrays [], int n) {
    if (n==1)
      return myArrays [0];
      return Math.max(myArrays[n-1], findMax(myArrays, n-1));
  }
}


