package EISClassW;

/**
 * Created by Alex on 13.02.2017.
 */
public abstract class Animal implements Moveable {


    protected boolean warmBloded;

    public boolean isWarmBloded() {
        return warmBloded;
    }

    public void setWarmBloded(boolean warmBloded) {
        this.warmBloded = warmBloded;
    }

    public void breath(){
        System.out.println("I Breath");
    }

    protected abstract void drink();
}
