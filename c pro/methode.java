
public class methode {
    String Name, Home;
    int Phone;

    methode(String name, String home) {
        Name = name;
        Home = home;
    }

    methode() {

    }

    methode(String name, String home, int phone) {
        Name = name;
        Home = home;
        Phone = phone;

    }

    void disPlaymehode() {
        System.out.println("The name is =" + Name);
        System.out.println("The home is =" + Home);
        System.out.println("The phone number is =" + Phone);

    }

    int value(int n) {
        return n * n;

    }

}
