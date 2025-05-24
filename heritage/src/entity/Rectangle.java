package entity;

public  class Rectangle extends Figure {
   private int longeur=0;
   private int largeur=0;


    public Rectangle() {
        this.type=TypeFigure.RECTANGLE;
     }

    @Override
    public int perimetre() {
       return 2*(longeur+largeur);
    }

    @Override
    public int surface() {
        return longeur*largeur;
    }

    public int getLongeur() {
        return longeur;
    }

    public void setLongeur(int longeur) {
        this.longeur = longeur;
        diagonale =(int)Math.sqrt(Math.pow(longeur, 2)+Math.pow(largeur, 2));
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;      
          diagonale =(int)Math.sqrt(Math.pow(longeur, 2)+Math.pow(largeur, 2));
    }

    @Override
    public String toString() {
        return "Rectangle [longeur=" + longeur + ", largeur=" + largeur + ", diagonale=" + diagonale + ", perimetre()="
                + perimetre() + ", surface()=" + surface() + "]";
    }
    
}
