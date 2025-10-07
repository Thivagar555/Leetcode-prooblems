import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    String input = sc.nextLine();
		    int idx = 0;
		    if(input.matches("R\\d+C\\d+"))
		    {
		        for(int i =0; i<input.length() && input.charAt(i) != 'C'; i++)
		        {
		            idx++;
		        }
		        String row = (input.substring(1,idx));
		        int col = Integer.parseInt(input.substring(idx+1));
		        StringBuilder sb = new StringBuilder();
		        while(col>0)
		        {
		            col--;
		            char c = (char)('A' + col%26);
		            sb.insert(0, c);
		            col/=26;
		        }
		        sb.append(row);
		        System.out.println(sb.toString());
		    }
		    else
		    {
		        int index = 0;
		        while(index < input1.length() && Character.isLetter(input1.charAt(index))) index++;
		        String row = input1.substring(index);
		        String columnPart = input1.substring(0, index);
		        
		        int col =0;
		        for(int i =0; i<columnPart.length(); i++)
		        {
		            col = col*26 + ( columnPart.charAt(i) - 'A' + 1);
		        }
		        System.out.println("R"+row+"C"+col);
		    }
		}
	}
}