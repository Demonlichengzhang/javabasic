package java43class_Chapter01;
import java.util.Scanner;
public class Homework63 {

	public static void main(String[] args) {
		int[] nums=new int[10];
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		System.out.println("������ʮ������");
		Scanner input=new Scanner(System.in);
		for(int i=0;i<nums.length;i++){
			nums[i]=input.nextInt();
				switch(nums[i]){
					case 1:
						a++;
						break;
					case 2:
						b++;
						break;
					case 3:
						c++;
						break;
					default:
						d++;
						break;
						
				}				
		}
		
		
		System.out.print("����1�ĸ���Ϊ��"+a+"\n����2�ĸ���Ϊ��"+b+"\n����3�ĸ���Ϊ��"+c+"\n�Ƿ����ֵĸ���Ϊ��"+d);

	}

}
