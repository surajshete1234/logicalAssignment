
public class findCommonElement_Array {

	public static void main(String[] args) {
		int[] a = { 1,11,5, 10, 20, 40, 80 };
		int[] b = { 6, 7,11, 20, 80, 100 };
		int[] c = { 3, 4, 15, 11,20, 30, 70, 80, 120 };
		int[] d = {};
		int[] q = {};

		int size_A = a.length;
		int size_B = b.length;
		int size_C = c.length;

		for (int i = 0; i < size_A; i++) {
			for (int j = 0; j < size_B; j++) {
				for (int k = 0; k < size_C; k++) {
					if (a[i] == b[j] && c[k] == a[i] && b[j] == c[k]) {
						System.out.println("Commont element " + a[i]);
					}
				}
			}
		}

	}

}

//8)Write a Java Program to find common elements among below 3 Arrays?
//
//Input: 
//
//ar1[] = {1, 5, 10, 20, 40, 80}
//ar2[] = {6, 7, 20, 80, 100}
//ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
