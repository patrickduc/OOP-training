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
public class ProcedureFormes_1 {

    static final int RECTANGLE = 1;
    static final int CARRE = 2;
    static final int CERCLE = 3;

    static Scanner saisie = new Scanner(System.in);

    static float xOrigineRectangle, yOrigineRectangle, longueurRectangle, largeurRectangle;
    static float xOrigineCarre, yOrigineCarre, coteCarre;
    static float xOrigineCercle, yOrigineCercle, rayonCercle;

    public static int choixForme() {
        int resultat;

        for (resultat = -1; (resultat < 0) || (resultat > 3);) {
            System.out.println("Type de forme ((1 = rectangle, 2 = carré, 3 = cercle, 0 pour sortir du programme) : ");
            resultat = saisie.nextInt();
        }

        return resultat;
    }

    public static void saisieParametresRectangle() {
        System.out.println("Entrez l'abscisse d'origine du rectangle : ");
        xOrigineRectangle = saisie.nextFloat();

        System.out.println("Entrez l'ordonnée d'origine du rectangle : ");
        yOrigineRectangle = saisie.nextFloat();

        System.out.println("Entrez la longueur du rectangle : ");
        longueurRectangle = saisie.nextFloat();

        System.out.println("Entrez la largeur du rectangle : ");
        largeurRectangle = saisie.nextFloat();
    }

    public static void saisieParametresCarre() {
        System.out.println("Entrez l'abscisse d'origine du carre : ");
        xOrigineCarre = saisie.nextFloat();

        System.out.println("Entrez l'ordonnée d'origine du carre : ");
        yOrigineCarre = saisie.nextFloat();

        System.out.println("Entrez le côté du carre : ");
        coteCarre = saisie.nextFloat();
    }

    public static void saisieParametresCercle() {
        System.out.println("Entrez l'abscisse d'origine du cercle : ");
        xOrigineCercle = saisie.nextFloat();

        System.out.println("Entrez l'ordonnée d'origine du cercle : ");
        yOrigineCercle = saisie.nextFloat();

        System.out.println("Entrez le rayon du cercle : ");
        rayonCercle = saisie.nextFloat();
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
        System.out.println("\tcôté du carré = " + coteCarre);
    }

    static void afficherCercle() {
        System.out.println("CERCLE :");
        System.out.println("\tabscisse de l'origine du cercle = " + xOrigineCercle);
        System.out.println("\tordonnée de l'origine du cercle = " + yOrigineCercle);
        System.out.println("\trayon du cercle = " + rayonCercle);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("PF_1");

        for (int choixForme = choixForme();
                (choixForme >= 0) && (choixForme <= 3);
                choixForme = choixForme()) {

            switch (choixForme) {
                case 0:
                    System.exit(0);
                    break;

                case RECTANGLE:
                    saisieParametresRectangle();
                    afficherRectangle();
                    break;

                case CARRE:
                    saisieParametresCarre();
                    afficherCarre();
                    break;

                case CERCLE:
                    saisieParametresCercle();
                    afficherCercle();
                    break;

                default:
                    System.err.println("Type de forme inattendu !");
                    break;
            }
        }
    }
}
