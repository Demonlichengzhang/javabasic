package java43class_Chapter01;
import java.util.Scanner;
public class Homework27 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("��������ĳɼ��� ");
		int score=input.nextInt();
		score=score/10;
		switch(score){
			case 10:
				System.out.println("��������һ������ ");
				break;
			case 9:
				System.out.println("��������һ���ʼǱ� ");
		        break;
			case 8:
			case 7:
			case 6:
				System.out.println("��������һ���ֻ� ");
				break;
			default:
				System.out.println("�ؼҹ���°壡�������� ");
				break;
		}

	}

}
