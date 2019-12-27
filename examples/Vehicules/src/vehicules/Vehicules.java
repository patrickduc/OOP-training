/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicules;

/**
 *
 * @author duc
 */
public class Vehicules {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture voiture = new Voiture(2008, "AL 703 QB");
        voiture.demarrer();
        voiture.affiche();
        Vehicule vehicule = voiture;
        vehicule.arreter();
    }
}
