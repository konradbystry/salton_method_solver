package Rocchia;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.Iterator;

public class Density extends Corelation {
    int n1, n2, n1p, n2p;
    double p1, p2, p1p, p2p;
    public List<Objects> m1 = new ArrayList<Objects>();
    public List<Objects> m2 = new ArrayList<Objects>();
    private Iterator i = m2.iterator();

    // private List<Double> corelations = new ArrayList<Double>();

    /*
     * Density(List<Double> corelations) { this.corelations = corelations; }
     */
    public void setP1(double p1) {
        this.p1 = p1;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public void setP1p(double p1p) {
        this.p1p = p1p;
    }

    public void setP2p(double p2p) {
        this.p2p = p2p;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void setN1p(int n1p) {
        this.n1p = n1p;
    }

    public void setN2p(int n2p) {
        this.n2p = n2p;
    }

    public double getP1() {
        return p1;
    }

    public double getP2() {
        return p2;
    }

    public double getP1p() {
        return p1p;
    }

    public double getP2p() {
        return p2p;
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public int getN1p() {
        return n1p;
    }

    public int getN2p() {
        return n2p;
    }

    public boolean densityTest(List<Objects> corelations) {
        int counterN1 = 0;
        int counterN2 = 0;
        for (Objects cor : corelations) {
            if (cor.getCor() >= getP1()) {
                counterN1++;
            }
            if (cor.getCor() >= getP2()) {
                counterN2++;
            }
        }
        if (counterN1 >= getN1() && counterN2 >= getN2()) {
            System.out.println("succes");
            return true;
        } else
            System.out.println("failed");
        return false;
    }

    public void setGroups(List<Objects> obj) {

        for (Objects o : obj) {
            if (o.getCor() >= getP2()) {
                m2.add(o);
            }
            if (o.getCor() >= getP1()) {
                m1.add(o);
            }
        }
    }

    public double setPmin(List<Objects> obj) {
        double pmin = m2.get(m2.size() - 1).getCor();
        double currentMin = 0;
        double result = 0;

        for (Objects o : obj) {

            currentMin = pmin - o.getCor();

            if (currentMin > result && o.getCor() <= m2.get(m2.size() - 1).getCor()) {
                result = o.getCor();

            }
            pmin = o.getCor();
        }

        return result;
    }
}
