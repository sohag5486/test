import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer> numb = new ArrayList<>();
        System.out.println("sizw=" + numb.size());
        numb.add(3);
        numb.add(4);
        numb.add(5);
        numb.add(6);
        numb.add(7);

        for (int x : numb) {
            System.out.println(x);
        }
        System.out.println("sizw=" + numb.size());
        numb.remove(0);
        System.out.println("after removeing 0 index" + numb);
        numb.clear();
        System.out.println("after clearing 0 index" + numb);
        boolean em = numb.isEmpty();
        System.out.println(em);
        boolean con = numb.contains(5);
        System.out.println("5 is present:" + con);
        int index = numb.indexOf(4);
        System.out.println(+index);
        numb.set(3, 40);
        System.out.println(numb);
        System.out.println(numb.get(0));

    }
}
