import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String args[])
    {
        int n;
        int[] forces = {0, 0, 0};

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            forces[0] += scanner.nextInt();
            forces[1] += scanner.nextInt();
            forces[2] += scanner.nextInt();
        }

        if(forces[0] != 0 || forces[1] != 0 || forces[2] != 0 ) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    public String isEquilibrium(int[] forces) {
        if(forces[0] != 0 || forces[1] != 0 || forces[2] != 0 ) {
            return "NO";
        } else {
            return "YES";
        }
    }
}
