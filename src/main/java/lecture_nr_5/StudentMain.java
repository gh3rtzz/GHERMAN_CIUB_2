package lecture_nr_5;

public class StudentMain {

    public static void main(String[] args) {

        Student s1 = new Student("Alex", "Soloviov", 5,6,10,9,6,5,4,2,10,9);
        Student s2 = new Student("Serghei", "Ivanov", 8,4,10,6,8,9,10,3,2,9);
        Student s3 = new Student("Maxim", "Sokolov", 8,4,10,6,8,9,10,3,2,9);
        Student s4 = new Student("Ivan", "Ivanov", 1,7,10,10,10,10,10,6,9);
        Student s5 = new Student("Ivan", "Ivanov");

        System.out.println(s1.getAverage());
        System.out.println(s2.getAverage());

        Student[] studentArray = new Student[]{
                s1, s2, s3, s4, s5};

        for(int i = 0; i != studentArray.length; i++){
            System.out.println(studentArray[i].getAverage());
        }

        //Find max average grade of student
        float max = studentArray[0].getAverage();
        for(int i = 1; i != studentArray.length; i++){
            if(studentArray[i].getAverage() > max){
                max = studentArray[i].getAverage();
            }
        }

        System.out.println("Maximum average of students: " + max);

        //Find max average grade of student and print it's name and surname
        Student maxStudent = studentArray[0];
        for(int i = 1; i != studentArray.length; i++){
            if(studentArray[i].getAverage() > maxStudent.getAverage()){
                maxStudent = studentArray[i];
            }
        }
        System.out.println("NAME: " + maxStudent.name + " SURNAME: " + maxStudent.surname + " AVG Grade: " + maxStudent.getAverage());
    }
}
