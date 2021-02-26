import jdk.internal.jshell.tool.resources.l10n;

public class main {
    public static void main(String args[]) {
        Rocchia rocchia = new Rocchia();

        char first[] = { 'a', 'b', 'c', 'd', 'e' };
        char second[] = { 'a', 'b', 'c', 'd' };
        int numerator = rocchia.setNumerator(first, second);
        int denominator = rocchia.setDenominator(first, second);

        System.out.println(rocchia.corelation(numerator, denominator));
        System.out.println(numerator);
        System.out.println(denominator);
    }
}