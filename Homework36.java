package java43class_Chapter01;
import java.util.Scanner;
public class Homework36 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("������һ������(0����)");
		int max;
		int min;
		int num;
		min=max=num=input.nextInt();
		while(num!=0){
			if(max<num){
			max=num;
			}
			if(num<min){
				min=num;
			}
			System.out.println("������һ������(0����)");	
			num=input.nextInt();
		}
		System.out.println("���ֵ��"+max+"��Сֵ��"+min);
	}

}
