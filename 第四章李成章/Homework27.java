package java43class_Chapter01;
import java.util.Scanner;
public class Homework27 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你的成绩： ");
		int score=input.nextInt();
		score=score/10;
		switch(score){
			case 10:
				System.out.println("不错，奖励一辆狗车 ");
				break;
			case 9:
				System.out.println("不错，奖励一部笔记本 ");
		        break;
			case 8:
			case 7:
			case 6:
				System.out.println("不错，奖励一部手机 ");
				break;
			default:
				System.out.println("回家跪搓衣板！！！！！ ");
				break;
		}

	}

}
