package fr.dampierre;

import java.util.Random;

public class Guerrier {

    private String nom = "Yoh";
    private int pv = 100;
    private double force = 102.5;
    // private Armure armure; // état, variable d'instance
    private int vitesse = 95;

    // ne pas mettre "public" et "static" : package only
    public void attaquer(Guerrier autre) {
        Random rand = new Random(); // instanciation d'un random
        int puissMoi = rand.nextInt((int) (force * vitesse));
        int puissAutre = rand.nextInt((int) (autre.force * autre.vitesse));

        if (puissMoi > puissAutre) {
            autre.pv -= 10;
        } else {
            pv -= 10;
        }
    }

    public boolean estEnVie() {
        return pv > 0;
    }

    public void afficherPv() {
        System.out.print(pv + "    ");
    }

    public void afficherNom() {
        System.out.print(nom + " : ");
    }

    public void init(String leNom, double force, int vitesse) {
        nom = leNom;
        this.force = force;
        this.vitesse = vitesse;

    }

    // public int getPv(){ // c'est un guetteur
    // return pv;
    // }

    // public void attaquer() { //static : on ne se refère pas a un objet en
    // particulier, ici non
    // if(suffisammentPuissant()) //comportement

    // }
    // private boolean suffisammentPuissant(){
    // return force > 100;
    // }

}