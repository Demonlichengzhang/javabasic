package java43class_Chapter01;
import java.util.Scanner;
public class Homework118 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�������û�����");
		String name=input.next();
		
		System.out.println("���������룺");
		int nums=input.nextInt();
		if(name.equals("��")||nums==123){
			System.out.println("��ӭ�㡰��");
		}
		else{
			System.out.println("�Բ����㲻�ǡ���");
		}
	}

}
