package Rocchia;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;

public class Corelation {

    public String objects[];
    public List<Double> corelations = new ArrayList<Double>();

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

    public void allObjCorelation(String objects[], String groupCenter) {
        char cent[] = groupCenter.toCharArray();

        for (int i = 0; i < objects.length; i++) {
            char obj[] = objects[i].toCharArray();
            corelations.add(corelation(setNumerator(obj, cent), setDenominator(obj, cent)));
        }
    }

    public void sort(List<Double> corelations) {
        Collections.sort(corelations);
        Collections.reverse(corelations);
    }
}
