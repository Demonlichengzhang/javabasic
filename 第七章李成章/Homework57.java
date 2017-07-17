package java43class_Chapter01;
import java.util.Arrays;
public class Homework57 {

	public static void main(String[] args) {
		String[] feel=new String[]{"a","c","u","b","e","p","f","z"};
		System.out.print("Ô­×Ö·ûÐòÁÐ£º");
		for(int i=0;i<feel.length;i++){
			System.out.print(feel[i]+" ");
		}	
		Arrays.sort(feel);
			System.out.print("\nÉýÐòÅÅÐòºó£º");
		for(int i=0;i<feel.length;i++){
			System.out.print(feel[i]+" ");
	}
		System.out.print("\nÄæÐòÊä³öÎª£º");
		for(int i=0;i<feel.length;i++){	 //for(int i=feel.length-1;i>=0;i--)
		
		System.out.print(feel[feel.length-1-i]+" ");//System.out.print(feel[i]+" ");
		}
	}

}
