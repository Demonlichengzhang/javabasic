package java43class_Chapter01;
import java.util.Scanner;
public class Homework44 {

	public static void main(String[] args) {
		int young=0;
		int age=0;
		Scanner input=new Scanner(System.in);
		for(int i=0;i<10;i++){
			System.out.println("�������"+(i+1)+"λ�˿͵�����");
			age=input.nextInt();
			if(age>0&&age<=30){
				young++;
			}else if(age>100){
				System.out.println("�������󣡣�����������");
				age=input.nextInt();
			}
		}
		System.out.println("30�����µı����ǣ�"+young*1.0/10.0*100+"%");
		System.out.println("30�����ϵı����ǣ�"+(1-young*1.0/10.0)*100+"%");
	}

}
