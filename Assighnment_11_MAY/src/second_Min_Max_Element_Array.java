
public class second_Min_Max_Element_Array {

	public static void main(String[] args) {
		int[] arr = {1, 2, 5, 9, 6, 4, 7, 2};
		int size=arr.length;
		boolean flag=false;
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr [j];
					arr[j]=arr[j+1];
					arr[j+1] =temp;
					//flag=true;
				}
				flag=true;
			}
			if(flag=false) {
				System.out.println("Already Sorted");
			}
		}

		System.out.println("2nd Min Number "+ arr[1]);

		System.out.println("2nd Max Number "+ arr[size-2]);
	}

}



//7)Write Java Program to find second Min and Second Max elements in given Array ?
//
//Input: 1, 2, 5, 9, 6, 4, 7, 2
//Output: Second Min-2  Second Max-7





