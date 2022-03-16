package basiccommand;
import java.util.Scanner;


public class positivenegitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int number;
         Scanner s =new Scanner(System.in);
         System.out.println("enter number");
         number=s.nextInt();
         String result = number<0? "negetive":"positive";
         System.out.println(result);
	}

}
