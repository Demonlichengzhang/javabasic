package java43class_Chapter01;

import java.util.Arrays;

public class Homework67 {

	public static void main(String[] args) {
		int[] arr1={1,7,9,11,13,15,17,19};
		int[] arr2={2,4,6,8,10};
		int[] arr3=new int[13];
		System.arraycopy(arr1, 0, arr3, 0, 8);
		System.arraycopy(arr2, 0, arr3, 8, 5);
		Arrays.sort(arr3);
		 System.out.print("新数组为：");
		 for(int i=0;i<arr3.length;i++){
			 System.out.print(arr3[i]+" ");
		 }
	}

}
