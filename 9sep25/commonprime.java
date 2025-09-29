import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long g = gcd(a, b);
        if (g == 1) {
            System.out.println(-1);
            return;
        }

        for (long i = 2; i * i <= g; i++) {
            if (g % i == 0) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(g);
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}