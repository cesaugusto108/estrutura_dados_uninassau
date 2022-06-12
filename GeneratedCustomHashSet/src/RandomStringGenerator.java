import java.util.Arrays;

public class RandomStringGenerator {

    private static String returnFromAscii(int... asciiCode) {

        return new String(asciiCode, 0, asciiCode.length);
    }

    public static String generateRandomString(int size) {
        String[] randomStr = new String[size];

        int asciiCode = (int) Math.floor(Math.random() * 93) + 33;

        Arrays.fill(randomStr, returnFromAscii(asciiCode));

        StringBuilder str = new StringBuilder();
        for (String s : randomStr) {
            str
                    .append(s);
        }

        return str
                .toString();
    }
}
