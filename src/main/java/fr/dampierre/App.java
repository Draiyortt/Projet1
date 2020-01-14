package fr.dampierre;

public final class App {
    public static void main(String[] args) {
        // Guerrier g1 = new Guerrier(); //cration nouveau guerrier, crétion d'une
        // adresse, une boite en mémoire
        // g1.init("Ephrem", 100.0, 100);
        // Guerrier g2 = new Guerrier();
        // g2.init("Théo B.", 80.0, 110);

        // renommer classe = F2

        int victoireG1 = 0;
        int victoirG2 = 0;
        for (int i = 0; i < 10000; i++) {
            Guerrier g1 = new Guerrier(); // création nouveau guerrier, crétion d'une adresse, une boite en mémoire
            g1.init("Ephrem", 100.0, 100);
            Guerrier g2 = new Guerrier();
            g2.init("Théo B.", 80.0, 110);

            while (g1.estEnVie() && g2.estEnVie()) {
                g1.attaquer(g2);

                // System.out.println( g1.getPv() +" "+ g2.getPv() );

                // g1.afficherNom();
                // g1.afficherPv();

                // g2.afficherNom();
                // g2.afficherPv();

                // System.out.println();
            }

            if (g1.estEnVie()) {
                victoireG1++;
            } else {
                victoirG2++;
            }

        }
        // g1.afficherNom();
        System.out.println(victoireG1);
        // g2.afficherNom();
        System.out.println(victoirG2);

    }
    // public void setPv(int val) {
    // pv = val;
    // }
}
