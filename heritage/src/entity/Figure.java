package entity;
// public class Figure extends Object
public abstract class Figure {
    protected int diagonale;
    public  abstract int perimetre();
    public abstract int surface();

    protected TypeFigure type;

    public TypeFigure getType() {
        return type;
    }
    protected Figure() {
    }

    protected Figure(int diagonale) {
        this.diagonale = diagonale;
    }

    public int getDiagonale() {
        return diagonale;
    }

    public void setDiagonale(int diagonale) {
        this.diagonale = diagonale;
    }

    @Override
    public String toString() {
        return "Figure [diagonale=" + diagonale + "]";
    }
}
