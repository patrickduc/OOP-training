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
public class Vehicule {
    int anneeDeFabrication, typeDeCarburant;
    String numeroDImmatriculation;

    void demarrer() {
        System.out.println("Demarrage");
    }

    void arreter() {
        System.out.println("Arret");
    }
}
