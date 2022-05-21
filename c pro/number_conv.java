public class number_conv {
    public static void main(String[] args) {
        String bainari = "10101";
        int dicimal = Integer.parseInt(bainari, 2);
        System.out.println(dicimal);
        int d = 12;
        String bi = Integer.toBinaryString(d);
        System.out.println(bi);
    }

}
