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
public abstract class FormeGeometrique implements Enregistreur {
    protected float xOrigine, yOrigine;

    protected FormeGeometrique(float xOrigine, float yOrigine) {
        this.xOrigine = xOrigine;
        this.yOrigine = yOrigine;
    }

    public abstract float perimetre();
    public abstract float surface();

    public void afficher() {
        System.out.println("Forme géométrique :\n\tabscisse origine = "
        + xOrigine + "\n\tordonnée d'origine = " + yOrigine
        + "\n\tpérimètre = " + perimetre() + "\n\tsurface = " + surface());
    }
}
