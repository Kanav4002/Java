import java.util.Scanner;

public class GoodStringOptimized {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();

		int max_length = 0, length = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				length++;
				if(length > max_length) {
					max_length = length;
				}
			} else {
				length = 0;
			}
		}
		System.out.println("Length of the longest good substring is : " + max_length);

		input.close();
	}
}
