public class Rocchia {

    public int setNumerator(char biggerObj[], char smallerObj[]) {
        int numerator = 0;
        for (int i = 0; i < biggerObj.length; i++) {
            for (int j = 0; j < smallerObj.length; j++) {
                if (biggerObj[i] == smallerObj[j]) {
                    numerator++;
                }
            }
        }
        return numerator;
    }

    public int setDenominator(char biggerObj[], char smallerObj[]) {
        int denominator = biggerObj.length + smallerObj.length;
        for (int i = 0; i < biggerObj.length; i++) {
            for (int j = 0; j < smallerObj.length; j++) {
                if (biggerObj[i] == smallerObj[j]) {
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
