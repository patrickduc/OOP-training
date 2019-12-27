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
public class FormeGeometrique {
    protected float xOrigine, yOrigine;

    public FormeGeometrique() {
        xOrigine = 0.0f;
        yOrigine = 0.0f;
    }

    public FormeGeometrique(float xOrigine, float yOrigine) {
        this.xOrigine = xOrigine;
        this.yOrigine = yOrigine;
    }

    public float perimetre() {
        return 0.0f;
    }

    public float surface() {
        return 0.0f;
    }

    public void afficher() {
        System.out.println("Forme géométrique :\n\tabscisse origine = "
        + xOrigine + "\n\tordonnée d'origine = " + yOrigine
        + "\n\tpérimètre = " + perimetre() + "\n\tsurface = " + surface());
    }
}
