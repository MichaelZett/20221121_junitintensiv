package date;

public class YearHelper {

    static boolean isSchaltjahr(int jahr) {
        return isDurch4Teilbar(jahr)
                && (isNichtDurch100Teilbar(jahr)
                || isDurch400Teilbar(jahr));
    }

    private static boolean isDurch400Teilbar(int jahr) {
        return jahr % 400 == 0;
    }

    private static boolean isNichtDurch100Teilbar(int jahr) {
        return jahr % 100 != 0;
    }

    private static boolean isDurch4Teilbar(int jahr) {
        return jahr % 4 == 0;
    }
}
