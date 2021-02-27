package Rocchia;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.Comparator;

public class Corelation {

    public Objects objects[];
    public List<Objects> corelations = new ArrayList<Objects>();
    public List<Objects> corelationsSorted = new ArrayList<Objects>();

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

    public void allObjCorelation(Objects objects[], String groupCenter) {
        char cent[] = groupCenter.toCharArray();

        for (int i = 0; i < objects.length; i++) {
            Objects o = new Objects(objects[i].getValue(), objects[i].getName());
            char obj[] = objects[i].getValue().toCharArray();
            o.setCor(corelation(setNumerator(obj, cent), setDenominator(obj, cent)));
            corelations.add(o);
        }
    }

    public void setRanks(List<Objects> corelations) {

        for (int i = 0; i < corelations.size(); i++) {
            for (int j = 0; j < corelations.size(); j++) {
                if (corelations.get(i).getCor() < corelations.get(j).getCor()) {
                    corelations.get(i).incRank();
                }
            }
        }
    }

    public void sort(List<Objects> corelations) {
        Collections.sort(corelations);
    }
}