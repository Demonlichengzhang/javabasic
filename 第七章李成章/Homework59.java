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
		System.out.print("ԭ����Ϊ��");
		for(int i=0;i<call.length-1;i++){
			System.out.print(call[i]+" ");
		}
		System.out.println("\n������Ҫ��������֣�");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		for(int i=0;i<call.length;i++){
			if(num>call[i]){
				index=i;
				break;
			}	
		}
		System.out.println("Ҫ����������±꣺"+index);
		
		for(int j=call.length-1;j>index;j--){
			call[j]=call[j-1];
		}
		call[index]=num;
		System.out.print("\n�������ֺ������Ϊ��");
		for(int k=0;k<call.length;k++){
			System.out.print(call[k]+" ");
		}
	}

}
