package java43class_Chapter01;
import java.util.Scanner;
public class Homework22 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你的考试成绩：");
		int score=input.nextInt();
		if(score==100){
			System.out.println("父亲说：不错，奖励一辆车");
		}
		else if(score>=90){
			System.out.println("母亲说：不错，奖励一部笔记本电脑");
			
		}
		else if(score>=60){
			System.out.println("母亲说：不错，奖励一部手机");
		}
		else{
			System.out.println("这次考试考的很差，没有奖励。回家等着跪搓衣板！！");
		}
		

	}

}

