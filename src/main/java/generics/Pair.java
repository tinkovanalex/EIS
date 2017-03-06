package generics;

/**
 * Created by Alex on 06.03.2017.
 */
public class Pair<F, S> {

    private F first;
    private S second;

    public Pair(){
        this(null, null);
    }

    public Pair(F first, S second){
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public String toString(){
        return "pair of " + first.getClass().getName() + ": " + first.toString()
                + " and " + second.getClass().getName() + ": " + second.toString();
    }


}
