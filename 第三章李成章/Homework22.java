package java43class_Chapter01;
import java.util.Scanner;
public class Homework22 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("��������Ŀ��Գɼ���");
		int score=input.nextInt();
		if(score==100){
			System.out.println("����˵����������һ����");
		}
		else if(score>=90){
			System.out.println("ĸ��˵����������һ���ʼǱ�����");
			
		}
		else if(score>=60){
			System.out.println("ĸ��˵����������һ���ֻ�");
		}
		else{
			System.out.println("��ο��Կ��ĺܲû�н������ؼҵ��Ź���°壡��");
		}
		

	}

}

