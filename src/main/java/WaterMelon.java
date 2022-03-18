import java.util.Scanner;

public class WaterMelon {

    public static void main(String args[])
    {
        int w;
        Scanner scanner = new Scanner(System.in);
        w = scanner.nextInt();

        if(w % 2 == 0 && w != 2) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    public String divide(int weight) {
        if(weight % 2 == 0 && weight != 2) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
}
