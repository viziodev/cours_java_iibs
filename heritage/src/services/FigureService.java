package services;

import java.util.ArrayList;

import entity.Figure;
import entity.TypeFigure;

public class FigureService {
    ArrayList<Figure> figures=new ArrayList<>();

    public ArrayList<Figure> listerFigures() {
        return figures;
    }

    public ArrayList<Figure> listerFigures(TypeFigure type) {
        ArrayList<Figure> figuresOfType=new ArrayList<>();
        for (Figure figure : figures) {
              if (figure.getType()==type) {
                figuresOfType.add(figure);
              }
        }
        return figuresOfType;
    }

    public void creerFigure(Figure figure){
        figures.add(figure);
    }
    
}
