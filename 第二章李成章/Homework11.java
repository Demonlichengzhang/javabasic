package java43class_Chapter01;

public class Homework11 {

	public static void main(String[] args) {
		int num1=10,num2=8,temp;
		System.out.println("输出互换前手中的纸牌：");
		System.out.println("左手中的纸牌："+num1);
		System.out.println("右手中的纸牌："+num2);
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("输出互换后手中的纸牌：");
		System.out.println("左手中的纸牌："+num1);
		System.out.println("右手中的纸牌："+num2);
	}

}
