package lecture_nr_6;

public class InheritanceMain {

    public static void main(String[] args) {

        Parent p = new Parent("parentString");
        Child c = new Child("parentString", "childString");

        System.out.println(p.parentString);

        System.out.println(c.parentString);
        System.out.println(c.childString);
    }
}
