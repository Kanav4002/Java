public class EvenDigits {
  // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
  public static void main(String[] args) {
    int[] nums = {18, 124, 9, 1764, 98, 1};
    System.out.println(findNumbers(nums));
    // System.out.println(digits(341234242));
    System.out.println(digits(341234242));
  }

  static int findNumbers(int[] nums) {
    int count = 0;

    for(int num : nums) {
      if(even(num)) {
        count++;
      }
    }

    return count;
  }

  // function to check whether a num contains even digits or not
  static boolean even(int num) {
    int numberOfDigits = digits2(num);

    // if(numberOfDigits % 2 == 0) {
    //   return true;
    // } 
    // return false;

    return numberOfDigits % 2 == 0;
  }

  static int digits2(int num) {

    if(num < 0) {
      return num * -1;
    }

    if(num == 0) {
      return 1;
    }

    return (int)(Math.log10(num)) + 1;
  }

  static int digits(int num) {
    int count = 0;

    if(num < 0) {
      return num * -1;
    }

    if(num == 0) {
      return 1;
    }

    while(num > 0) {
      count++;
      num = num / 10; 
    }

    return count;
  }

}
