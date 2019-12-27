/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formespolymorphiques;

/**
 *
 * @author duc
 */
public class Rectangle extends FormeGeometrique {
    float longueur, largeur;

    public Rectangle(float xOrigine, float yOrigine, float longueur, float largeur) {
        super(xOrigine, yOrigine);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public float perimetre() {
        return (longueur + largeur)* 2;
    }

    @Override
    public float surface() {
        return longueur * largeur;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("\tRectangle :\n\t\tlongueur = "
        + longueur + "\n\t\tlargeur = " + largeur);
    }

    @Override
    public void enregistrer(String nomDeFichier) {
        System.out.println("Enregistrement du rectangle dans le fichier " + nomDeFichier);
    }
}
