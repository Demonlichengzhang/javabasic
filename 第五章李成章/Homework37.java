package java43class_Chapter01;
import java.util.Scanner;
public class Homework37 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
			int num=1;
			String day="";
			while(num>=1&&num<=7){
				System.out.println("请输入数字1-7(输入0结束)");
					num=input.nextInt();
				if(num==0){
					break;
				}
				switch(num){
					case 1:
						day="MON";
						System.out.println("今天是"+day);
						break;
					case 2:
						day="TUE";
						System.out.println("今天是"+day);
						break;
					case 3:
						day="WED";
						System.out.println("今天是"+day);
						break;
					case 4:
						day="THU";
						System.out.println("今天是"+day);
						break;
					case 5:
						day="FRI";
						System.out.println("今天是"+day);
						break;
					case 6:
						day="SAT";
						System.out.println("今天是"+day);
						break;
					case 7:
						day="SUN";
						System.out.println("今天是"+day);
						break;
					default:
						System.out.println("输入错误，请重新输入");	
						num=input.nextInt();
				}
			
			}
				
			
			System.out.println("程序结束");
	}

}
