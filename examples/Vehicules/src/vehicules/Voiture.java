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
public class Voiture extends Vehicule {

    public Voiture(int anneeDeFabrication, String numeroDImmatriculation) {
        this.anneeDeFabrication = anneeDeFabrication;
        this.numeroDImmatriculation = numeroDImmatriculation;
        this.typeDeCarburant = 1;
    }

    void affiche() {
        System.out.println("L'annee de fabrication est " + anneeDeFabrication
                + " et le numero d'immatriculation est " + numeroDImmatriculation);
    }
}
