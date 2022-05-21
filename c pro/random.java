import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random rand = new Random();
        int randm = rand.nextInt(10) + 1;

        System.out.println(randm);
    }

}
