import java.util.Scanner;

public class Practise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int k = scn.nextInt();
			String s = scn.next();
			int one = 0;
			int zero = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '1') {
					one++;
				} else {
					zero++;
				}
			}
			
			int division = n / k;
			
			if (one % division == 0 && zero % division == 0) {
				for (int i = 0; i < division; i++) {
					if (i % 2 == 0) {
						for (int j = 0; j < zero / division; j++) {
							System.out.print("0");
						}
						for (int j = 0; j < one / division; j++) {
							System.out.print("1");
						}
					}else {
						for (int j = 0; j < one / division; j++) {
							System.out.print("1");
						}
						for (int j = 0; j < zero / division; j++) {
							System.out.print("0");
						}
					
					}
				}
				System.out.println();
			}else {
				System.out.println("IMPOSSIBLE");
			}

			t--;
		}
	}
}
