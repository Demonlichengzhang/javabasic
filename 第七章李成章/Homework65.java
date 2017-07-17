package java43class_Chapter01;
import java.util.Arrays;
import java.util.Scanner;
public class Homework65 {

	public static void main(String[] args) {
		String[] music={"Island","Ocean","Pretty","Sun"};
		String names="";
		System.out.print("插入前的数组为：");
		for(int i=0;i<music.length;i++){
			System.out.print(music[i]+" ");
		}
	
		new Music=Arrays.copyOf(music,5);
		int index=music.length-1;
		Scanner input=new Scanner(System.in);
		System.out.print("\n请输入歌曲名称：");
		String name=input.next();
		for(int i=0;i<newMusic.length;i++){
			if(music[i].compareToIgnoreCase(music[i])>0){
				index=i;
				break;
			}
		}
		for(int i=newMusic.length-1;i>index;i--){
			newMusic[i]=newMusic[i-1];
		}
		newMusic[index]=names;
		System.out.print("插入后的数组为：");
		for(int i=0;i<music.length;i++){
			System.out.print(music[i]+" ");
		}
	}

}
