package java43class_Chapter01;
import java.util.Scanner;
public class Homework33 {

	public static void main(String[] args) {
		System.out.println("��ӭʹ��MyShopping����ϵͳ");
		System.out.println("***********************************");
		System.out.println("1.�ͻ���Ϣ����");
		System.out.println("2.�������");
		System.out.println("3.�������");
		System.out.println("4.ע��");
		System.out.println("***********************************");
		Scanner input=new Scanner(System.in);
		boolean isRight=true;
		do{
			System.out.println("��ѡ���������֣�");
			int num=input.nextInt();
			switch(num){
		 	case 1:
		 		System.out.println("ִ�пͻ���Ϣ����");
		 		isRight=true;
		 		break;
		 	case 2:
		 		System.out.println("ִ�й������");
		 		isRight=true;
		 		break;
		 	case 3:
		 		System.out.println("ִ���������");
		 		isRight=true;
		 		break;
		 	case 4:
		 		System.out.println("ִ��ע��");
		 		isRight=true;
		 		break;
		 	default:
				System.out.println("��������������������֣�");
				isRight=false;
				break;
			}
		}while(isRight==false);
			System.out.println("���������");
	}

}
