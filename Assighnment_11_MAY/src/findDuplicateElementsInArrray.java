
public class findDuplicateElementsInArrray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 5, 5, 6, 6, 7, 2 };
		int size = arr.length;
		System.out.println(size);
		for (int i = 0; i < size; i++) {

			for (int j = i + 1; j <= size - 1; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
				}
			}
		}

	}
}

//Input:  1, 2, 5, 5, 6, 6, 7, 2

//Output:  2, 5, 6