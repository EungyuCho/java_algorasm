package common;

import java.util.Scanner;

public class InputView {
    private static final Scanner sc = new Scanner(System.in);

    public static String getLine() {
        return sc.nextLine();
    }

    public static int getInt() {
        return sc.nextInt();
    }

    public static double getDouble() {
        return sc.nextDouble();
    }
}
