import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        main insertElementIntoArray = new main();
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 10;
        array[1] = 4;
        array[2] = 6;
        array[3] = 7;
        array[4] = 8;
        System.out.println("Enter value: ");
        int value = input.nextInt();
        System.out.println("Enter index of array: ");
        int index = input.nextInt();
        insertElementIntoArray.InsertElement(array, value, index);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void InsertElement(int[] x, int value, int index) {
        if (index >= 0 && index < x.length - 1) {
            for (int i = x.length - 1; i > index; i--) {
                x[i] = x[i - 1];
            }
            x[index] = value;
        } else {
            System.out.println("Index error.");
        }
    }
}
