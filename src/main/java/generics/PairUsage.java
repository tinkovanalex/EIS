package generics;

/**
 * Created by Alex on 06.03.2017.
 */
public class PairUsage {

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(2, "wow");
        System.out.println(pair);

        Pair<String , String> credentials = new Pair<>("sdmin", "whatever");
        System.out.println(credentials.getFirst());
        System.out.println(credentials.getSecond());
    }
}
