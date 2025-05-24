package entity;

import java.time.LocalDate;

public class Transaction {
     private static int nbreTransaction;
     private int id;
     private String numero;
     protected LocalDate dateCreation=LocalDate.now();
     protected double montant;
     protected TypeTransaction typeTransaction;



    public void setMontant(double montant) {
        this.montant = montant;
    }



     public void setTypeTransaction(TypeTransaction typeTransaction) {
         this.typeTransaction = typeTransaction;
     }



    public Transaction(double montant, TypeTransaction typeTransaction) {
        this.montant = montant;
        this.typeTransaction = typeTransaction;
        id=++nbreTransaction;
        numero="TRANS_"+id;
    }



    public Transaction() {
        id=++nbreTransaction;
        numero="TRANS_"+id;
    }



    public static int getNbreTransaction() {
        return nbreTransaction;
    }



    public int getId() {
        return id;
    }



    public String getNumero() {
        return numero;
    }



    public LocalDate getDateCreation() {
        return dateCreation;
    }



    public double getMontant() {
        return montant;
    }



    public TypeTransaction getTypeTransaction() {
        return typeTransaction;
    }



    @Override
    public String toString() {
        return "Transaction [id=" + id + ", numero=" + numero + ", dateCreation=" + dateCreation + ", montant="
                + montant + ", typeTransaction=" + typeTransaction + "]";
    }

}
