public class Rocchia {

    public int setNumerator(char firstObj[], char secObj[]) {

        int numerator = 0;
        for (int i = 0; i < firstObj.length; i++) {
            for (int j = 0; j < secObj.length; j++) {
                if (firstObj[i] == secObj[j]) {
                    numerator++;
                }
            }
        }
        return numerator;
    }

    public int setDenominator(char firstObj[], char secObj[]) {
        int denominator = firstObj.length + secObj.length;
        for (int i = 0; i < firstObj.length; i++) {
            for (int j = 0; j < secObj.length; j++) {
                if (firstObj[i] == secObj[j]) {
                    denominator--;
                }
            }
        }
        return denominator;
    }

    public double corelation(double numerator, double denominator) {
        return numerator / denominator;
    }

}
