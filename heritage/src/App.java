import java.util.Scanner;

import entity.Figure;
import entity.TypeFigure;
import services.FigureService;
import views.FigureView;


public class App {
     private static  Scanner scanner=new Scanner(System.in);  
    public static void main(String[] args) throws Exception {
        FigureService figureService=new FigureService();
        int choix;
      do {
           choix=menu();
           switch (choix) {
            case 1:
                Figure figure=FigureView.saisieFigure();
                figureService.creerFigure(figure);
                break;

                case 2:
                   FigureView.affiche(figureService.listerFigures());
                break;

                case 3:
                int type;
                do {
                      System.out.println("1-Carre");
                      System.out.println("2-Rectangle");
                      System.out.println("Veuillez choisir une Figure");
                      type=scanner.nextInt();
                } while (type!=1 && type!=2);
                   FigureView.affiche(figureService.listerFigures(TypeFigure.getEnumByValue(type)));
             break;
           
            default:
                break;
           }    
      } while (choix!=4);
       
    }

    public static int menu(){
        System.out.println("1-Creer une Figure");
        System.out.println("2-Afficher une Figure");
        System.out.println("3-Afficher figure par Type");
        System.out.println("4-Quitter");
        return scanner.nextInt();
    }
}
