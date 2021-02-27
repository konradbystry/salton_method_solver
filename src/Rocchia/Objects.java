package Rocchia;

public class Objects implements Comparable {
    private String value;
    private String name;
    private double cor;
    private int rank;

    public Objects(String value, String name) {
        this.value = value;
        this.name = name;
        setRank(1);
    }

    public Objects() {

    }

    public void setCor(double cor) {
        this.cor = cor;
    }

    public double getCor() {
        return cor;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public void incRank() {
        rank++;
    }

    @Override
    public int compareTo(Object compareObj) {
        int compareRank = ((Objects) compareObj).getRank();
        /* For Ascending order */
        return this.rank - compareRank;
    }

    @Override
    public String toString() {
        return "[ value=" + value + ", name=" + name + ", cor=" + cor + ", rank=" + rank + "]";
    }

}
