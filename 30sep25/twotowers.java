import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class codeForces {
    public static void main(String[] args) throws IOException {
          // TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- >0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			String first = br.readLine();
			String second = br.readLine();
			
			StringBuilder sb = new StringBuilder(second).reverse();
			String result = first + sb.toString();
			int count = 0;
			for(int i =0; i<result.length()-1; i++)
			{
				if(result.charAt(i) == result.charAt(i+1))
				{
					count++;
				}
			}
			if(count > 1) System.out.println("No");
			else System.out.println("Yes");
		}
    }
}
