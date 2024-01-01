public class evenOdd {
  static void evenodd(int arr[]) {
    int res = 0;
    for (int i = 0; i < arr.length; i++) {
    int count = 1;
    for (int j = i + 1; j < arr.length; j++) {
      if ((arr[j - 1] % 2 == 0 && arr[j] % 2 != 0) || (arr[j - 1] % 2 != 0 && arr[j]
       % 2 == 0)) {
        count++;
      } else break;
    }
    res = Math.max(res, count);
  }

    System.out.println("The length of the longest even-odd subarray is "+res);
  }

  public static void main(String args[]) {
    int arr[] = {1,2,3,4,5,7,9};
    evenodd(arr);
  }
}