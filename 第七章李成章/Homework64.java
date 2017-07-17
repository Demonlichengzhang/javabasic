package java43class_Chapter01;

public class Homework64 {

	public static void main(String[] args) {
		int[] array=new int[]{1,3,-1,5,-2};
		System.out.print("原数组为：");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
			System.out.print("\n逆序后数组为：");
			for(int i=array.length-1;i>=0;i--){
				if(array[i]<0){
					array[i]=0;
				}System.out.print(array[i]+" ");
			}
	}

}
