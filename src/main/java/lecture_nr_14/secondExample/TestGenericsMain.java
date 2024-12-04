package lecture_nr_14.secondExample;

public class TestGenericsMain {

    public static void main(String[] args) {

        TestGenerics<String> stringGenerics = new TestGenerics<>();
        TestGenerics<Integer> intGenerics = new TestGenerics<>();

        stringGenerics.print("asd");
        intGenerics.print(3);

        stringGenerics.print("as");
    }
}
