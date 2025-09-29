import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeForces {
    public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
		while( t-- >0)
		{
		String input = br.readLine();
		String result = "";
		result += input.charAt(0);
		
		for(int i=1; i<input.length()-1; i+=2)
		{
		result += input.charAt(i);
		}
		result += input.charAt(input.length()-1);
		System.out.println(result);
		}
        
    }
}
