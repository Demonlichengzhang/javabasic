package java43class_Chapter01;
import java.util.Scanner;
public class Homework24 {

	public static void main(String[] args) {
		System.out.println("\n\t\t��ӭʹ���������ع���ϵͳ");
		System.out.println("\t\t\t1.��¼ϵͳ");
		System.out.println("\t\t\t2.�˳� ");
		System.out.println("***************************");
		Scanner input=new Scanner(System.in);
		System.out.println("��ѡ���������֣�");
		int num=input.nextInt();
		switch(num){
			case 1:
			System.out.println("\n\t\t��ӭʹ���������ع���ϵͳ");
			System.out.println("\t\t\t1.�ͻ���Ϣ����");
			System.out.println("\t\t\t2.�������");
			System.out.println("\t\t\t3.�������");
			System.out.println("\t\t\t4.ע��");
			System.out.println("***************************");
			
			System.out.println("��ѡ���������֣�");
			int num2=input.nextInt();
			break;
			case 2:
			System.out.println("лл����ʹ�ã�");
			break;
			default:
			System.out.println("�������");
			break;
		}
	}

}
