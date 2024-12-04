package lecture_nr_14.secondExample;

public class TestGenerics<T> {


    public void print(T input){
        System.out.println(input);
    }

    /*
    WON'T COMPILE BECAUSE OF TYPE ERASURE
    public void print(Object input){

    }
    */
}
