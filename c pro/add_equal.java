import java.util.ArrayList;

public class add_equal {
    public static void main(String[] args) {
        ArrayList<Integer> sohag = new ArrayList<>();

        ArrayList<Integer> sohag2 = new ArrayList<>();
        ArrayList<Integer> sohag3 = new ArrayList<>();
        sohag.add(1);
        sohag.add(2);
        sohag.add(3);
        sohag.add(4);
        sohag.add(5);

        sohag2.add(10);
        sohag2.add(20);
        sohag2.add(30);
        sohag2.add(40);
        sohag2.add(50);

        sohag3.addAll(sohag);
        System.out.println(sohag);
        System.out.println(sohag2);
        System.out.println(sohag3);

        boolean mil1 = sohag.equals(sohag2);
        System.out.println(mil1);
        boolean mil2 = sohag.equals(sohag3);
        System.out.print(mil2);

    }
}
