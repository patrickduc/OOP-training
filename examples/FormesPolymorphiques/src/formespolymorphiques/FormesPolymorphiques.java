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
public class FormesPolymorphiques {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        FormeGeometrique formeGeometrique = new FormeGeometrique();
        System.out.println("Périmètre de la forme géométrique par défaut : " + formeGeometrique.perimetre());
        System.out.println("Surface de la forme géométrique par défaut : " + formeGeometrique.surface());
        formeGeometrique.afficher();

        formeGeometrique = new FormeGeometrique(10.0f, 10.0f);
        System.out.println("Périmètre de la forme géométrique : " + formeGeometrique.perimetre());
        System.out.println("Surface de la forme géométrique : " + formeGeometrique.surface());
        formeGeometrique.afficher();
        */

        Rectangle rectangle = new Rectangle(10.0f, 8.0f, 100.0f, 80.0f);
        System.out.println("Périmètre du rectangle : " + rectangle.perimetre());
        System.out.println("Surface du rectangle : " + rectangle.surface());
        rectangle.afficher();
        rectangle.enregistrer("rectangle.data");

        Carre carre = new Carre(50.0f, 50.0f, 70.0f);
        System.out.println("Périmètre du carré : " + carre.perimetre());
        System.out.println("Surface du carré : " + carre.surface());
        carre.afficher();
        carre.enregistrer("carre.data");

        Cercle cercle = new Cercle(0.0f, 0.0f, 63.5f);
        System.out.println("Périmètre du cercle : " + cercle.perimetre());
        System.out.println("Surface du cercle : " + cercle.surface());
        cercle.afficher();
        cercle.enregistrer("cercle.data");
    }
}
