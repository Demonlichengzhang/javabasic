package java43class_Chapter01;
import java.util.Scanner;
public class Homework41 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year=input.nextInt();
		System.out.println("�������·ݣ�");
		int month=input.nextInt();
		int sum=0;
		for(int i=1900;i<year;i++){
			if((i%4==0&&i%100!=0)&&i%400==0){
				sum+=366;
			}else{
				sum+=365;
			}
		}
		for(int a=1;a<month;a++){
			if(a==1||a==3||a==5||a==7||a==8||a==10||a==12){
				sum+=31;
			}else if(a==2){
				if((year%4==0&&year%100!=0)&&year%400==0){
					sum+=29;
				}else{
					sum+=28;
				}
			}else{
				sum+=30;
			}
		}
		System.out.println("�û������������1900��1��1���У�"+sum+"��");
	}

}
