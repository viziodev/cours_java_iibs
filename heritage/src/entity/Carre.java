package entity;

public   class Carre extends Figure {
    private int cote;

    public Carre(int cote) {
        this.cote = cote;
        diagonale =(int)Math.sqrt(Math.pow(cote, 2)*2);
        this.type=TypeFigure.CARRE;
    }

    public Carre() {
        super();//Figure()
        this.type=TypeFigure.CARRE;

    }

    public int getCote() {
        return cote;
        
    }

    public void setCote(int cote) {
        this.cote = cote;
        diagonale =(int)Math.sqrt(Math.pow(cote, 2)*2);
    }

    @Override
    public String toString() {
        return "Carre [cote=" + this.cote + ", getDiagonale()=" + super.diagonale + "]";
    }

    @Override
    public int perimetre() {
        return cote*4;
    }

    @Override
    public int surface() {
        return cote*cote;
    }


    
    
}
