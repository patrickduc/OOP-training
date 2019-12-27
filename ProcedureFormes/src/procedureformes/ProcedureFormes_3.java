/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procedureformes;

import java.util.Scanner;

/**
 *
 * @author duc
 */
public class ProcedureFormes_3 {

    static final int RECTANGLE = 1;
    static final int CARRE = 2;
    static final int CERCLE = 3;

    static Scanner saisie = new Scanner(System.in);

    static float xOrigineRectangle, yOrigineRectangle, longueurRectangle, largeurRectangle;
    static float xOrigineCarre, yOrigineCarre, coteCarre;
    static float xOrigineCercle, yOrigineCercle, rayonCercle;
    // Nouvelles variables globales
    static int largeurTraitRectangle, largeurTraitCarre, largeurTraitCercle;

    public static int choixForme() {
        int resultat;

        for (resultat = -1; (resultat < 0) || (resultat > 3);) {
            System.out.println("Type de forme ((1 = rectangle, 2 = carré, 3 = cercle, 0 pour sortir du programme) : ");
            resultat = saisie.nextInt();
        }

        return resultat;
    }

    public static void saisieParametresRectangle() {
        System.out.println("Entrez l'abscisse d'origine du rectangle :");
        xOrigineRectangle = saisie.nextFloat();

        System.out.println("Entrez l'ordonnée d'origine du rectangle :");
        yOrigineRectangle = saisie.nextFloat();

        System.out.println("Entrez la longueur du rectangle :");
        longueurRectangle = saisie.nextFloat();

        System.out.println("Entrez la largeur du rectangle :");
        largeurRectangle = saisie.nextFloat();
    }

    public static void saisieParametresCarre() {
        System.out.println("Entrez l'abscisse d'origine du carré :");
        xOrigineCarre = saisie.nextFloat();

        System.out.println("Entrez l'ordonnée d'origine du carré :");
        yOrigineCarre = saisie.nextFloat();

        System.out.println("Entrez le côté du carré :");
        coteCarre = saisie.nextFloat();
    }

    public static void saisieParametresCercle() {
        System.out.println("Entrez l'abscisse d'origine du cercle :");
        xOrigineCercle = saisie.nextFloat();

        System.out.println("Entrez l'ordonnée d'origine du cercle :");
        yOrigineCercle = saisie.nextFloat();

        System.out.println("Entrez le rayon du cercle :");
        rayonCercle = saisie.nextFloat();
    }

    // Nouveau sous-programme
    public static void saisieLargeurTrait(int forme) {
        System.out.print("Entrez la largeur du trait du ");
        switch (forme) {
            case RECTANGLE:
                System.out.println("rectangle :");
                largeurTraitRectangle = saisie.nextInt();
                break;
            case CARRE:
                System.out.println("carré :");
                largeurTraitCarre = saisie.nextInt();
                break;
            case CERCLE:
                System.out.println("cercle :");
                largeurTraitCercle = saisie.nextInt();
                break;
            default:
                System.err.println("Type de forme inattendu !!");
                break;
        }
    }

    static void afficherRectangle() {
        System.out.println("RECTANGLE :");
        System.out.println("\tabscisse de l'origine du rectangle = " + xOrigineRectangle);
        System.out.println("\tordonnée de l'origine du rectangle = " + yOrigineRectangle);
        System.out.println("\tlongueur du rectangle = " + longueurRectangle);
        System.out.println("\tlargeur du rectangle = " + largeurRectangle);
    }

    static void afficherCarre() {
        System.out.println("CARRE :");
        System.out.println("\tabscisse de l'origine du carré = " + xOrigineCarre);
        System.out.println("\tordonnée de l'origine du carré = " + yOrigineCarre);
        System.out.println("\tlongueur du carré = " + coteCarre);
    }

    static void afficherCercle() {
        System.out.println("CERCLE :");
        System.out.println("\tabscisse de l'origine du cercle = " + xOrigineCercle);
        System.out.println("\tordonnée de l'origine du cercle = " + yOrigineCercle);
        System.out.println("\trayon du cercle = " + rayonCercle);
    }

    // Nouveau sous-programme
    static void afficherLargeurTrait(int forme) {
        System.out.print("\tlargeur du trait du ");
        switch (forme) {
            case RECTANGLE:
                System.out.println("rectangle = " + largeurTraitRectangle);
                break;
            case CARRE:
                System.out.println("carré = " + largeurTraitCarre);
                break;
            case CERCLE:
                System.out.println("cercle = " + largeurTraitCercle);
                break;
            default:
                System.err.println("Type de forme inattendu !!");
                break;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("PF_3");
        
        for (int choixForme = choixForme();
                (choixForme >= 0) && (choixForme <= 3);
                choixForme = choixForme()) {

            switch (choixForme) {
                case 0:
                    System.exit(0);
                    break;

                case RECTANGLE:
                    saisieParametresRectangle();
                    saisieLargeurTrait(choixForme); // Nouvel appel
                    afficherRectangle();
                    afficherLargeurTrait(choixForme); // Nouvel appel
                    break;

                case CARRE:
                    saisieParametresCarre();
                    saisieLargeurTrait(choixForme); // Nouvel appel
                    afficherCarre();
                    afficherLargeurTrait(choixForme); // Nouvel appel
                    break;

                case CERCLE:
                    saisieParametresCercle();
                    saisieLargeurTrait(choixForme); // Nouvel appel
                    afficherCercle();
                    afficherLargeurTrait(choixForme); // Nouvel appel
                    break;

                default:
                    System.err.println("Type de forme inattendu !");
                    break;
            }
        }
    }
}
