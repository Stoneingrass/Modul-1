package modul1;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[5][8];
        int bottomLimit=-99;
        int topLimit=99;

        //array filling
        for (int i=0; i< array.length; i++) {
            for (int j=0; j< array[i].length; j++)
            {
                array[i][j] = (int)(Math.random()*(topLimit-bottomLimit+1)-topLimit);
            }
        }

        //array output
        System.out.println("The array:");

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

        //max element search
        int maxElement=array[0][0];
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (maxElement < anInt) {
                    maxElement = anInt;
                }
            }
        }

        //max element output
        System.out.println("Maximum element in the array: " + maxElement + ".");
    }
}