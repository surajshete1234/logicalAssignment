
public class findMaximumDifferenceBetweenTwoGivenAray {

	public static void main(String[] args) {
		int [] a={1,2,3,5,4,6,7,8};
		int size=a.length;
		boolean flag=false;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=true;
				}
			}
			if(flag==false) {
				System.out.println("Data is already sorted");
				break;
			}
		}
		int diff=a[size-1]-a[0];
		System.out.println("Difference = "+diff);
	}

}


//Input = { 2, 5, 1, 7, 3, 9, 5}
//Output = 8  
//
//Explanation : The maximum difference is between 1 and 9
//
//Input = { 9, 2, 12, 5, 4, 7, 3, 19, 5}
//Output: 17
//
//Explanation : The maximum difference is between 19 and 2