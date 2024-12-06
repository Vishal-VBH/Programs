package programming;
import java.util.Scanner;
public class BubbleSort {

	public static void sort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[8];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		sort(arr);
		
		for(int ele:arr) {
			System.out.println(ele+ " ");
		}
		
	}
}
