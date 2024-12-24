public class Array {
  public static void main(String[] args) {
    // int[] myArr = new int[5];
    // myArr[0] = 12;
    // myArr[1] = 65;
    // myArr[2] = 49;
    // myArr[3] = 97;
    // myArr[4] = 53;''
    int[] myArr = {98, 2, 8, 65, 37};
    // int index = 2;
    // System.out.println(myArr[0]);
    // System.out.println(myArr[1]);
    // System.out.println(myArr[index]);
    // System.out.println(myArr[3]);
    // System.out.println(myArr[4]);
    // System.out.println(myArr[5]);

    // Array Traversal
    int index = 0;
    while(index < myArr.length) {
      System.out.println(myArr[index]);
      index++;
    }
  }
}
