package java43class_Chapter01;
import java.util.Scanner;
public class Homework45 {

	public static void main(String[] args) {
		int num,score;
		String bir;
		Scanner input=new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("�������Ա��(<��λ����>)��");
			num=input.nextInt();
			System.out.println("�������Ա������(��/��<����λ������ʾ):");
			bir=input.next();
			System.out.println("�������Ա���֣�");
			score=input.nextInt();
			if(num>999&&num<10000&&score>=0){
				System.out.println("��¼�����ϢΪ��"+num+"\t"+bir+"\t"+score);
			}
			else{
				System.out.println("��Ϣ���󣡣�¼��ϵͳʧ�ܡ�������¼����Ϣ");
				System.out.println("�������Ա��(<��λ����>)��");
				num=input.nextInt();
				System.out.println("�������Ա������(��/��<����λ������ʾ):");
				bir=input.next();
				System.out.println("�������Ա���֣�");
				score=input.nextInt();
				continue;
			}
				
		}System.out.println("�������");
			
	}

}
