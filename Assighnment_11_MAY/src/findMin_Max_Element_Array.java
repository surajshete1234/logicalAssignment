
public class findMin_Max_Element_Array {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 5, 6, 6, 7, 2 };
		int size = arr.length;
		boolean flag = false;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
			if (flag == false) {
				System.out.println("Data is already sorted");
				break;
			}
		}
		
		System.out.println("Max Number= "+arr[size-1]);
		System.out.println("Min Number= "+arr[0]);

	}

}

//6)Write a Java Program to find Min and Max elements in given Array?
//
//Input:  1, 2, 5, 5, 6, 6, 7, 2
//
//Output:   Min : 1  Max : 7

