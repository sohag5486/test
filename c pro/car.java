public class car extends super_key {
    // String color ,double weight,
    // void display
    int set;

    car(String c, double w, int s) {
        super(c, w);
        set = s;

    }

    @Override
    void display() {
        // display();
        System.out.println("color=" + color);
        System.out.println("weight=" + weight);
        System.out.println("set=" + set);

    }

}
