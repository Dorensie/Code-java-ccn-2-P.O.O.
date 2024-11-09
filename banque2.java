class Banque2 {
    public static void main(string[] args) {
//   variables locales pour les taux d'interets
        double taux1 = 0.01;
        double taux2 = 0.02;

        //construction des deux clients

        client c1 = new client("chris", "Douala", taux1, 200000.0, taux2, 300000.0);
        client c2 = new client("Aris", "yaounde", taux1, 100000.0, taux2, 400000.0);

        system.out.println("Donnees avant le bouclement des comptes");
        c1.afficher();
        c2.afficher();

        //bouclement des comptes des deux clients
        c1.boucler();
        c2.boucler();

        system.out.println("donnees apres le bouclement");
        c1.afficher();
        c2.afficher();
    }
}
class client {
    private string nom;
    private string ville;
    private compte cpt1;
    private  compte cpt2;

    public client (string nom, string ville, double taux1,double solde1,
                   double taux2, double solde2){
        this.nom = nom;
        this.ville = ville;
        // construction d'un compte prive
        cpt1 = new compte(taux1,solde1);
        cpt2 = new compte(taux2,solde2);
    }

    public void afficher (){
        // methode pour afficher les donnees du client
        system.out.println(" client" + nom + "de" + ville);
        system.out.println(  "compte prive:  "
            + cpt1.getsolde() + "francs");
        system.out.println("  compte d'epargne: " +
                cpt2.getsolde() + "francs");
    }

    public void afficher (){
        //cette methode affiche les donnees du cleint
        system.out.println(" client " + nom + "de" + ville);
        system.ou.println(" compte prive:  " +
                cpt1.getsolde() + "francs");
        system.out.println(" compte d'epargne: "
                + cpt2.getsolde() + " francs ");

    }
    public void boucler() {
        // cette methode boucle les deux comptes du client
        cpt1.boucler();
        cpt2.boucler();
    }
}

class compte {
    private double taux;
    private double solde;

    public compte (double taux, double solde) {
        this.taux = taux;
        this.solde = solde;
    }
    public double getsolde() {
        return solde;
    }

    public void boucler (){
        // cette methode ajoute les interets au solde
        double interets = taux * solde;
        solde = solde + interets;
    }
}