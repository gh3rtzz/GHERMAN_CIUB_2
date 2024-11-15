package lecture_nr_6;

public class Child extends Parent{

    String childString;


    public Child(String parentString, String childString) {
        super(parentString);
        this.childString = childString;
    }
}
