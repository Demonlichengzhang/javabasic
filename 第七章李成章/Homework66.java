package java43class_Chapter01;
import java.util.Arrays;
public class Homework66 {

	public static void main(String[] args) {
		int num=0;
		int[] oldArr={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
				System.out.print("原数组为：");
		for(int i=0;i<oldArr.length;i++){
				System.out.print(oldArr[i]+" ");
		}
		
		for(int i=0;i<oldArr.length;i++){
				if(oldArr[i]!=0){
					num++;
				}
		}
				int[] newArr=new int[num];	
				int size=0;
		for(int i=0;i<oldArr.length;i++){
				if(oldArr[i]!=0){
					newArr[size]=oldArr[i];
					size++;
				}	
		}

				System.out.print("\n新数组为：");
		for(int i=0;i<newArr.length;i++){
				System.out.print(newArr[i]+" ");
		}
				
			
			
	}

}
