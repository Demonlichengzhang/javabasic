package java43class_Chapter01;
import java.util.Scanner;
public class Homework52 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个整数：");
	int N=input.nextInt();
	for(int i=2;i<N;i++){
		if(N%i==0){
			System.out.println(N+"不是质数");
		}
	}
	System.out.println(N+"是一个质数");
	}

}
