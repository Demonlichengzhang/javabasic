package java43class_Chapter01;
import java.util.Scanner;
public class Homework58 {

	public static void main(String[] args) {
		char[] call={'a','b','c','e','f','p','u','z'};
		int index=call.length-1;
		System.out.print("ԭ�ַ����У�");
		for(int i=0;i<call.length;i++){
			System.out.print(call[i]+" ");
		}
		System.out.print("\n��������ַ�Ϊ��");
		Scanner input=new Scanner(System.in);
		char num =input.next().charAt(0);
		for(int i=0;i<call.length;i++){
			if(num<call[i]){
				index=i;
				break;
			}
		}
			System.out.print("�����ַ����±꣺"+index);
			for(int j=call.length-1;j<index;j--){
				call[j]=call[j-1];
			}call[index]=num;
			System.out.print("\n������˳��");
			for(int k=0;k<call.length;k++){
				System.out.print(call[k]+"\t");
			}
		
	}

}
