import Rocchia.*;

public class main {
    public static void main(String args[]) {
        Corelation rocchia = new Corelation();

        Objects objs[] = { new Objects("abef", "x1"), new Objects("abefg", "x2"), new Objects("abfg", "x3"),
                new Objects("ace", "x4"), new Objects("aeh", "x5"), new Objects("bcf", "x6"), new Objects("abe", "x7"),
                new Objects("abf", "x8"), new Objects("ab", "x9"), new Objects("ef", "x10"), new Objects("abce", "x11"),
                new Objects("abfgh", "x12"), new Objects("abcef", "x13"), new Objects("abcd", "x14"),
                new Objects("efgh", "x15"), new Objects("dgh", "x16"), };
        rocchia.allObjCorelation(objs, "abef");
        rocchia.setRanks(rocchia.corelations);
        rocchia.sort(rocchia.corelations);

        for (Objects cor : rocchia.corelations) {
            System.out.println(cor.getName() + " " + cor.getCor() + " " + cor.getRank());
        }
        Density test = new Density();
        test.setN1(6);
        test.setN2(2);
        test.setP1(0.55);
        test.setP2(0.65);
        test.densityTest(rocchia.corelations);
        test.setGroups(rocchia.corelations);

        for (Objects o : test.m1) {
            System.out.println(o.getName() + " " + o.getCor() + " " + o.getRank());
        }

        System.out.println(test.setPmin(test.m1));

    }

}