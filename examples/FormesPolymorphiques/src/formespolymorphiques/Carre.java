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
public class Carre extends Rectangle {

    public Carre(float xOrigine, float yOrigine, float cote) {
        super(xOrigine, yOrigine, cote, cote);
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("\tCarre :\n\t\tcôté = " + longueur);
    }
}
