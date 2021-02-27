import Rocchia.*;

public class main {
    public static void main(String args[]) {
        Corelation rocchia = new Corelation();

        Objects objs[] = { new Objects("abcde", "x1"), new Objects("abcd", "x2"), new Objects("abcdef", "x3") };
        rocchia.allObjCorelation(objs, "abcd");
        rocchia.setRanks(rocchia.corelations);
        rocchia.sort(rocchia.corelations);

        for (Objects cor : rocchia.corelations) {
            System.out.println(cor.getName() + " " + cor.getCor() + " " + cor.getRank());
        }
    }
}