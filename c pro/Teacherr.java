public class Teacherr {
    String name, gender;
    int ph;

    // SETINFORMATION MATHODE
    void setInformation(String n, String m, int p) {
        name = n;
        gender = m;
        ph = p;

    }

    // CONSTRACTOR MATHODE
    Teacherr(String n, String m, int p) {
        name = n;
        gender = m;
        ph = p;

    }

    // OUTPUT MATHODE
    void display() {
        System.out.println("gender=" + gender);
        System.out.println("name=" + name);
        System.out.println("phone=" + ph);

    }

}
