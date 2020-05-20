
public class removeDuplicateElementInGivenArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 5, 5, 6, 6, 7, 2 };
		int size = arr.length;

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j <= size - 1;) {
				if (arr[i] == arr[j]) {
					for (int k = j; k < size - 1; k++) {
						arr[k] = arr[k + 1];
					}
					size--;
				}else
					j++;
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

//Input:  1, 2, 5, 5, 6, 6, 7, 2

//Output:  1, 2, 5, 6, 7