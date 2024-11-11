package lecture_nr_4;

public class ArrayMain {

    public static void main(String[] args) {

        int[] array1 = new int[4];

        array1[0] = 3;
        array1[1] = 5;
        array1[2] = -3;
        array1[3] = 20;

        System.out.println(array1[2]);

        int[] array2 = new int[]{
                3, 5, -3, 20
        };

        System.out.println(array2[3]);

        int[] array3 = new int[4];

        array3[0] = 30;
        System.out.println(array3[0]);
        System.out.println(array3[1]);

        Integer[] array4 = new Integer[10];

        array4[0] = 30;
        System.out.println(array4[0]);
        System.out.println(array4[1]);

        for(int i = 0; i < 4; i++){
            System.out.println(array1[i]);
        }

        System.out.println("Size of array1: " + array1.length);

        for(int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }

        char[] charArray = new char[]{
                'A', 'B', 'C', 'D'
        };

        System.out.println(charArray.length);

        //find sum of all elements
        int[] array5 = new int[]{
                3, 5, -3, 20
        };

        int sum = 0;

        for(int i = 0; i < array5.length; i++){

            sum += array5[i];
        }

        System.out.println(sum);

        //find sum of odd numbers
        int sumOfOdd = 0;

        for(int i = 0; i < array5.length; i++){

            if(array5[i] % 2 != 0){
                sumOfOdd += array5[i];
            }
        }

        System.out.println(sumOfOdd);

        //bidimensional array

        int[][] biarray1 = new int[][]{
                {3, 7},
                {-7, 15, 33}
        };

        System.out.println("----------------------------");
        System.out.println(biarray1[1][1]);

        System.out.println(biarray1.length);
        System.out.println(biarray1[0].length);

        System.out.println("--------------------------");
        for(int j = 0; j != biarray1.length; j++){
            for(int i = 0; i != biarray1[j].length; i++){
                System.out.println(biarray1[j][i]);
            }
        }
    }
}
