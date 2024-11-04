package lecture_nr_1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Privet mir");
        System.out.println("Tekwill!");

        int x = 7;
        char y = 'A';
        boolean z = true;
        float f = 3.14F;
        double d = 3.14D;

        x = 10;
        z = false;
        y = 'B';

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        int number1 = 3;
        int number2 = 5;
        int result = number1 % number2;

        System.out.println(result);

        int number3 = 3;
        float number4 = 3.14f;

        number4 = number3;

        int x1 = 10;
        int x2 = 3;
        int x3 = 7;

        float average = (x1 + x2 + x3) / 3.0f;

        System.out.println(average);

        char c1 = 'A';
        char c2 = 76;
        System.out.println(c1);
        System.out.println(c2);

        int t = 3;
        t++;
        t--;

        System.out.println(t);

        int u = 3;
        System.out.println(u++);
        System.out.println(++u);

        int pre = 1;
        int post = 1;

        System.out.println(++pre);
        System.out.println(post++);

        char c3 = 'K';

        System.out.println(c3);
        c3++;
        System.out.println(c3);

        System.out.println(Integer.MAX_VALUE);

        String s1 = "Hello World!";
        String s2 = "Tekwill!";

        System.out.println(s1 + s2);





    }
}