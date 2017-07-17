package java43class_Chapter01;
import java.util.Scanner;
public class Homework44 {

	public static void main(String[] args) {
		int young=0;
		int age=0;
		Scanner input=new Scanner(System.in);
		for(int i=0;i<10;i++){
			System.out.println("请输入第"+(i+1)+"位顾客的年龄");
			age=input.nextInt();
			if(age>0&&age<=30){
				young++;
			}else if(age>100){
				System.out.println("输入有误！！请重新输入");
				age=input.nextInt();
			}
		}
		System.out.println("30岁以下的比例是："+young*1.0/10.0*100+"%");
		System.out.println("30岁以上的比例是："+(1-young*1.0/10.0)*100+"%");
	}

}
