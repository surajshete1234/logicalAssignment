
public class sumOfUniqueElementInArray {

	public static void main(String[] args) {
		int [] arr ={1, 1, 3, 2, 2, 3};
		int size = arr.length;

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j <= size - 1;) {
				if (arr[i] == arr[j]) {
					for (int k = j; k < size - 1; ++k) {
						arr[k] = arr[k + 1];
					}
					size=size-1;
				}else
					j++;
			}
		}
		int sum=0;
		for (int i = 0; i < size; i++)
			sum+=arr[i];
		System.out.println("SUM "+sum);
	}

}




//  3)Write a Java Program to find sum of unique elements in given Array?
//
//   Input = {1, 6, 4, 3, 2, 2, 3, 8, 1};
//    Output : 24 
//    Input= {1, 1, 3, 2, 2, 3};
//   Output : 6 
//   (Unique elements are: 1, 2, 3)