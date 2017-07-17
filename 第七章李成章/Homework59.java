package java43class_Chapter01;
import java.util.Scanner;
public class Homework59 {

	public static void main(String[] args) {
		int[] call=new int[6];
		call[0]=100;
		call[1]=90;
		call[2]=80;
		call[3]=70;
		call[4]=60;	
		int index=call.length-1;
		System.out.print("原序列为：");
		for(int i=0;i<call.length-1;i++){
			System.out.print(call[i]+" ");
		}
		System.out.println("\n请输入要插入的数字：");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		for(int i=0;i<call.length;i++){
			if(num>call[i]){
				index=i;
				break;
			}	
		}
		System.out.println("要插入的数字下标："+index);
		
		for(int j=call.length-1;j>index;j--){
			call[j]=call[j-1];
		}
		call[index]=num;
		System.out.print("\n插入数字后的序列为：");
		for(int k=0;k<call.length;k++){
			System.out.print(call[k]+" ");
		}
	}

}
