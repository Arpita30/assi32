//To check if 2 strings are same or not
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class StringEquCheck {

	public static void main(String []x)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean same;
		System.out.println("Enter First String: ");
		String s1=br.readLine();
		System.out.println("Enter Second String: ");
		String s2=br.readLine();
		if(s1.equals(s2)==true){
			 same=true;
			
		}
		else{
			 same=false;
		}
		System.out.println(same);

	}

}
