package entity;

public class Cheque  extends Compte{
    private final double frais=0.08;

    @Override
    public void depot(Transaction transaction) {
       double mntFrais=transaction.getMontant()*frais;
       super.solde+=(transaction.getMontant()-mntFrais);
       super.transactions.add(transaction);
        
    }

    @Override
    public boolean retrait(Transaction transaction) {
        double mntFrais=transaction.getMontant()*frais+transaction.getMontant();
        if (mntFrais<solde) {
            super.solde-=mntFrais;
            super.transactions.add(transaction);
            return true;
        }
        return false;
  
    }

    @Override
    public String toString() {
        return "Cheque [frais=" + frais + ", dateCreation=" + dateCreation + ", solde=" + solde + ", typeCompte="
                + typeCompte + ", getTypeCompte()=" + getTypeCompte() + ", getId()=" + getId() + "]";
    }
}
