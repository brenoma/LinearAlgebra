package MenuOptions;

import MenuOptions.Operations.Transpose;

import java.util.Scanner;

public class MenuCLI {

    public static void menuOptions() {
        System.out.println();
        System.out.println("|------------------------------------------------------|");
        System.out.println("|     Welcome to the CLI Linear Algebra Operations     |");
        System.out.println("|------------------------------------------------------|");
        System.out.println("| 1 - Transpose of a matrix.                           |");
        System.out.println("| 2 - Sum of 2 matrices.                               |");
        System.out.println("| 3 - Multiply a matrix by a scalar number.            |");
        System.out.println("| 4 - Multiply a matrix by other matrix o a vector.    |");
        System.out.println("| 5 - Gauss-Jordan elimination Method.                 |");
        System.out.println("| 0 - Exit program.                                    |");
        System.out.println("|------------------------------------------------------|");
        selectOption();
    }

    public static void selectOption() {
        Integer option;
        Scanner sc = new Scanner(System.in);

        System.out.print("Select an option: ");
        option = sc.nextInt();

        switch (option) {
            case 1:
                Transpose transpose = new Transpose();
                transpose.start();
                break;
            case 2:
                System.out.println("Option 2");
                break;
            case 3:
                System.out.println("Option 3");
                break;
            case 4:
                System.out.println("Option 4");
                break;
            case 5:
                System.out.println("Option 5");
                break;
            case 0:
                System.out.println("Terminating program");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
