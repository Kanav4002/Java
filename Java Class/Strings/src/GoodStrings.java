import java.util.Scanner;

public class GoodStrings {
	// public static void main(String[] args) {
	// Scanner input = new Scanner(System.in);
	// String str = input.nextLine();
	// int ans = 0;
	// for(int i = 0; i < str.length(); i++) {
	// for(int j = i; j < str.length(); j++){
	// int flag=0;
	// for(int k = i; k <= j; k++){
	// if(str.charAt(k) != 'a' && str.charAt(k) != 'e' && str.charAt(k) != 'i' &&
	// str.charAt(k) != 'o' && str.charAt(k) != 'u') {
	// flag = 1;
	// break;
	// }
	// }
	// if(flag == 0){
	// if((j - i + 1) > ans){
	// ans = (j - i + 1);
	// }
	// }
	// }
	// }
	// System.out.println(ans);
	// }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();

		int max_length = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				if (goodString(str, i, j)) {
					int length = j - i + 1;
					if (length > max_length) {
						max_length = length;
					}
				}
			}
		}
		System.out.println("Length of the longest good substring is : " + max_length);
	}

	static boolean goodString(String str, int i, int j) {
		while (i <= j) { 
			char ch = str.charAt(i);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				return false;
			}
			i++;
		}
		return true;
	}
}
