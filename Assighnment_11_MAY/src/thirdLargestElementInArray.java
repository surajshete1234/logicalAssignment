
public class thirdLargestElementInArray {

	public static void main(String[] args) {
		int[] a = { 6, 8, 1, 9, 2, 1, 10};
		int size = a.length;
		boolean flag = false;
		if (size > 3) {
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size - i - 1; j++) {
					if (a[j] > a[j + 1]) {
						int temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
						flag = true;
					}
				}
				if (flag = false)
					break;
			}
			System.out.print(a[size - 3] + " ");
		} else {
			System.out.println("Invalid Input, array size is less than 3");
		}
	}
}

//Input = { 6, 8, 1, 9, 2, 1, 10}
//Output: Third largest element : 8

//Int [] a = { 6, 8, 1, 9, 2, 1, 10, 12}
//Output: Third largest element : 9

//Int [] a = {6}
//Output: Invalid Input, array size is less than 3
