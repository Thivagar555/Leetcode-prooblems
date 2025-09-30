import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;


public class codeForces {
    public static void main(String[] args) throws IOException {
          // TODO Auto-generated method stub
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- >0)
		{
			int  num = Integer.parseInt(br.readLine());
			String value = br.readLine();
			char[] arr =  value.toCharArray();
			Arrays.sort(arr);
			int count = 0;
			for(int i=0; i<arr.length; i++)
			{
				if(value.charAt(i) != arr[i]) count++;
				
			}
			System.out.println(count);
			
		}
		
    }
}
