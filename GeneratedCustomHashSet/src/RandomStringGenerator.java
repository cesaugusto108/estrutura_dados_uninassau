import java.util.Arrays;

public class RandomStringGenerator {

    private static String returnFromAscii(int... asciiCode) {

        return new String(asciiCode, 0, asciiCode.length);
    }

    private static int generateAsciiCode() {

        return (int)
                Math
                    .floor(Math.random() * 93) + 33;
    }

    public static String generateRandomString(int size) {
        String[] randomStr = new String[size];

        for (int i = 0; i < randomStr.length; i++) {
            randomStr[i] = returnFromAscii(generateAsciiCode());
        }

        StringBuilder str = new StringBuilder();
        for (String s : randomStr) {
            str
                .append(s);
        }

        return str
                .toString();
    }
}
