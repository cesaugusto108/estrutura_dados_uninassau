import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CustomHashSet customHashSet = new CustomHashSet();

        try (Scanner scn = new Scanner(System.in)) {
            System
                    .out
                    .print("Escolha o tamanho do Hashset: ");
            int chosenSize = scn.nextInt();
        } catch (InputMismatchException e) {
            System
                    .out
                    .println("Você deve digitar um número.");
        }
    }
}
