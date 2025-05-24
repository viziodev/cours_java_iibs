package views;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Carre;
import entity.Figure;
import entity.Rectangle;

public class FigureView {
    private static  Scanner scanner=new Scanner(System.in);  

    private FigureView(){

    }

    public static Figure saisieFigure(){
     Figure figure=null;
     int type;
     do {
           System.out.println("1-Carre");
           System.out.println("2-Rectangle");
           System.out.println("Veuillez choisir une Figure");
           type=scanner.nextInt();
     } while (type!=1 && type!=2);

     if (type==1) {
          System.out.println("Entrer le cote du carre");
          int cote =scanner.nextInt();
          //1-Constructeur surcharge
            figure=new Carre(cote);
     }else{
         figure=new Rectangle();
         System.out.println("Entrer la longeur");
          int longeur =scanner.nextInt();

          System.out.println("Entrer la largeur");
          int largeur =scanner.nextInt();

          //1-Conversion Classe Mere vers Fille
          Rectangle rectangle=(Rectangle) figure;
          rectangle.setLargeur(largeur);
          rectangle.setLongeur(longeur);
     }

     return figure;

    }

    public static void affiche(ArrayList<Figure> figures){
        for (Figure figure : figures) {
              System.out.println(figure);
        }
    }

}
