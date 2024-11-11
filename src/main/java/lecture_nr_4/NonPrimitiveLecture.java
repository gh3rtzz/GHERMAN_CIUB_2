package lecture_nr_4;

public class NonPrimitiveLecture {

    public static void main(String[] args) {

        String number = "123";

        Integer x = Integer.parseInt(number);
        System.out.println(x);

        //primitive variables
        int p1 = 3;
        char p2 = 'C';
        float p3 = 13.33f;
        boolean p4 = true;

        //non-primitive variables
        Integer n1 = 3;
        Character n2 = 'C';
        Float n3 = 13.33f;
        Boolean n4 = true;

        System.out.println(Integer.parseInt("123"));
    }
}
