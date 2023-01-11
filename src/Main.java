import java.util.Random;

public class Main {
    public static void main(String[] args) {

           Random random = new Random();

        int a = random.nextInt(-100,100);
        int b = 0;
        for (int i = 0; i < a; i++) {
            System.out.println(a>b);
            i++;
            }

        }


    }
}