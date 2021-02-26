import Rocchia.*;

public class main {
    public static void main(String args[]) {
        Corelation rocchia = new Corelation();

        Objects obj = new Objects("abcde", "x1");
        Objects objs[] = { new Objects("abcde", "x1"), new Objects("abcd", "x2") };
        String test[] = { "abcde", "abcd" };
        rocchia.allObjCorelation(test, "abcd");
        rocchia.sort(rocchia.corelations);
        for (double x : rocchia.corelations) {
            System.out.println(x);
        }
    }
}