package demo;

public abstract class Shapes {
    protected Points position;


    public Points getPosition() {
        return this.position;
    }

    public void setPosition(Points position) {
        this.position = position;
    }

    public abstract double computeArea();
}
