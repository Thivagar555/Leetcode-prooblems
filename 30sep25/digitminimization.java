import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;


public class codeForces {
    public static void main(String[] args) throws IOException {
          // TODO Auto-generated method stub
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- >0)
		{
			int  num = Integer.parseInt(br.readLine());
			if(num < 100) 
				{
				System.out.println(num%10);
				
				}
			else
			{
				int minimum = Integer.MAX_VALUE;
				int temp = num;
				while(temp > 0)
				{
					int digit = temp%10;
					minimum = Math.min(digit, minimum);
					temp /= 10;
				}
				System.out.println(minimum);
			}
			
		}
    }
}
