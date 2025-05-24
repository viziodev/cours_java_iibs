package entity;

public enum TypeFigure {
    CARRE(1,"CARRRE"),RECTANGLE(2,"CARRRE");
    private int value;
    private String message;
    private TypeFigure(int value,String message){
         this.value=value;
         this.message=message;
     }

     public static  TypeFigure getEnumByValue(int value){
        return value==1?TypeFigure.CARRE:TypeFigure.RECTANGLE;
     }

}
