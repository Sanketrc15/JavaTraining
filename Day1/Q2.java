import java.util.Scanner;

	public class Q2 {
		public static void main(String[] args) {
			int[] digits = new int[4];
			String[][] digit = new String[][] {
					{ "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
							"Ninteen" },
					{ " ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" },
					{ "And", " ", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Sevevnty", "Eighty", "Ninety" },
					{ "And", "One Hundred", "Two Hundred", "Three Hundred", "Four Hundred", "Five Hundred", "Six Hundred",
							"Seven Hundred", "Eight Hundred", "Nine Hundred" },
					{ "And", "One Thousand", "Two Thousand", "Three Thousand", "Four Thousand", "Five Thousand",
							"Six Thousand", "Seven Thousand", "Eight Thousand", "Nine Thousand" } };
			Scanner scn = new Scanner(System.in);
			int length = 0, i = 0;
			int num = scn.nextInt();
			int temp = num;
			while (temp > 0) {
				digits[i] = temp % 10;
				temp /= 10;
				length++;
				i++;
			}
			for (int j = length; j > 0; j--) {
				if (digits[1] == 1 && j == 2) {
					System.out.print(digit[0][digits[0]]);
					break;
				}
				System.out.print(digit[j][digits[j - 1]]+" ");
			}
		}

	}