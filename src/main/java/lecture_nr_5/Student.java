package lecture_nr_5;

//Create objects of Student type
//Create method to find out average grade of student
public class Student {

    String name;
    String surname;
    int[] grades;

    public Student(String name, String surname, int... grades) {
        this.name = name;
        this.surname = surname;
        this.grades = grades;
    }

    public float getAverage(){

        float allGrades = CalculatorOptimized.calculate('+', grades);
        if(grades.length == 0){
            return 0;
        } else {
            float average = allGrades / grades.length;
            return average;
        }
    }
}
