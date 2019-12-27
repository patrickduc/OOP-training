/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formes;

/**
 *
 * @author duc
 */
class Cercle extends FormeGeometrique {
    float rayon;

    public Cercle(float xOrigine, float yOrigine, float rayon) {
        super(xOrigine, yOrigine);
        this.rayon = rayon;
    }

    @Override
    public float perimetre() {
        return rayon * (float) Math.PI * 2;
    }

    @Override
    public float surface() {
        return (float) Math.PI * rayon * rayon;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("\tCercle :\n\t\trayon = " + rayon);
    }
}
