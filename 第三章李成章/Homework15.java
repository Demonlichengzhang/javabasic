package java43class_Chapter01;
import java.util.Scanner;
public class Homework15 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�������ع������ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ");
		System.out.print("�������Ա��(<��λ��>)��");
		int custNo=input.nextInt();
		System.out.print("�������Ա������(��/��<����λ����ʾ>):");
		String custBirth=input.next();
		System.out.print("��������֣�");
		int cust=input.nextInt();
		
		
		
		if(custNo>999&&custNo<10000){
			System.out.print("��¼��Ļ�Ա��Ϣ�ǣ�");
			System.out.print(custNo+"\t"+custBirth+"\t"+cust);
		}
		else{
			System.out.print("��Ϣ¼��ʧ�ܣ�");
		}
	}

}
