public class test {

    public static void main(String[] args) {
        methode test1 = new methode("Kamal", "Radhanagar");
        test1.disPlaymehode();
        System.out.println();
        methode test2 = new methode();
        test2.disPlaymehode();
        System.out.println();
        methode test3 = new methode("Soroar", "Baler Bari", 54225);
        test3.disPlaymehode();
        methode test4 = new methode();
        int result = test4.value(5);
        System.out.println("tthe result is=" + result);
    }

};
