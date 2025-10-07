import java.util.*;
 
public class codeForces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long a = scanner.nextLong();
 
        long tilesLength = (n + a - 1) / a;
        long tilesWidth = (m + a - 1) / a;
        long totalTiles = tilesLength * tilesWidth;
 
        System.out.println(totalTiles);
    }
}
