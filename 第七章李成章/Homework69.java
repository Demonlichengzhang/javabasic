package java43class_Chapter01;
import java.util.Scanner;
public class Homework69 {

	public static void main(String[] args) {
		int[][] scores=new int[5][5];
		int[] students=new int[5];
		double avg=0.0;
		String[] course={"C++","Java","Python","C#","C"};
			int total;
			Scanner input=new Scanner(System.in);
			for(int i=0;i<students.length;i++){
				total=0;
			for(int j=0;j<course.length;j++){
					System.out.print(course[(j)]+"�ɼ�Ϊ��");
				int nums=input.nextInt();
					total+=nums;
					avg=total*1.0/course.length;
					
			}
					System.out.println("��"+(i+1)+"��ͬѧ�ɼ��ܷ�Ϊ��"+total);
					System.out.println("��"+(i+1)+"��ͬѧ�ɼ�ƽ����Ϊ��"+avg);
			}
			
			
	}

}
