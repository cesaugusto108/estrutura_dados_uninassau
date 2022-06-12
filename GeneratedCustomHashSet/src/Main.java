import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CustomHashSet customHashSet = new CustomHashSet();

        int chosenSize = 0;
        try (Scanner scn = new Scanner(System.in)) {
            System
                    .out
                    .print("Escolha o tamanho do Hashset: ");

            chosenSize = scn
                    .nextInt();
        } catch (InputMismatchException e) {
            System
                    .out
                    .println("Você deve digitar um número.");
        }

        while (customHashSet.getHashSet().size() < chosenSize) {
            customHashSet
                    .add(randomString());
        }

        while (customHashSet.getHashSet().size() > chosenSize * 0.5) {
            customHashSet
                    .remove(randomString());
        }

        List<String> list = customHashSet
                .getHashSet()
                .stream()
                .toList();

        System
                .out
                .println("\nQuantidade impressa no console: " + list.size() + "\n");

        int rowSize = 25;
        for (int i = 0; i < list.size(); i++) {
            if (i >= rowSize && i % rowSize == 0) {
                System
                        .out
                        .print("\n¬" + list.get(i) + "¬ ");
            } else {
                System
                        .out
                        .print("¬" + list.get(i) + "¬ ");
            }
        }
    }

    public static int randomSize() {

        return (int)
            Math
                .floor(Math.random() * 3) + 1;
    }

    public static String randomString() {

        return RandomStringGenerator
                .generateRandomString(randomSize());
    }
}
