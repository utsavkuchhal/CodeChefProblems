import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class Practise {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int k = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}
			System.out.println(solution(arr, n, k));
			t--;
		}
	}

	public static int solution(int[] arr, int n, int k) {
		int ans = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] > k) {
				return -1;
			} else {
				int temp = k;
				int j = i;
				while (temp > 0 && j < arr.length) {
					if (arr[j] <= temp)
						temp = temp - arr[j];
					else
						break;
					j++;
				}
				i = j;
				ans++;
			}
		}
		return ans;
	}

}
