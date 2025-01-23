public class RichestCustomerWealth {
  // https://leetcode.com/problems/richest-customer-wealth/
  public static void main(String[] args) {
    RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();
    int[][] accounts = {{1, 2, 3}, {3, 2, 1}, {1, 1, 1}};
    int result = richestCustomerWealth.maximumWealth(accounts);
    System.out.println("The maximum wealth is: " + result);
  }

  
  public int maximumWealth(int[][] accounts) {
    // person = i, account = j
    int ans = Integer.MIN_VALUE;
    for (int person = 0; person < accounts.length; person++) {
      int sum = 0;
      for(int account = 0; account < accounts[person].length; account++) {
        sum = sum + accounts[person][account];
      }

      if(sum > ans) {
        ans = sum;
      }
    }
    return ans;
  }
}
