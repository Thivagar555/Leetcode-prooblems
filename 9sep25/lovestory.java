import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeForces {
    public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
		String state = "codeforces";
		while( t-- >0)
		{
		String input = br.readLine();
		int count = 0;
		for(int i=0; i<state.length(); i++)
		{
			if(state.charAt(i) != input.charAt(i)) count++;
		}
		System.out.println(count);
		
		}
        
    }
}
