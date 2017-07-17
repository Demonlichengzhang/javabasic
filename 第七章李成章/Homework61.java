package java43class_Chapter01;
import java.util.Scanner;
public class Homework61 {

	public static void main(String[] args) {
		String[] says=new String[5];
		System.out.println("请输入5句话：");
		for(int i=0;i<says.length;i++){
			System.out.print("第"+(i+1)+"句话为：");
			Scanner input=new Scanner(System.in);
			says[i]=input.next();
		}
		System.out.println("逆序输入5句话为：");
		for(int i=says.length-1;i>=0;i--){
			System.out.println(says[i]);
		}
	}

}
