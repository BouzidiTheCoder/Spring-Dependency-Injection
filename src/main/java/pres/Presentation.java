package pres;

import ext.DaoImpl2;
import metier.IMetierImpl;

// Classe de présentation pour l'injection de dépendances par instanciation statique
public class Presentation {
    public static void main(String[] args) {

        // Injection des dépendances par instanciation statique (new)

        DaoImpl2 dao = new DaoImpl2();
        IMetierImpl metier = new IMetierImpl();

        // Injection de la dépendance de DaoImpl2 à IMetierImpl
        metier.setDao(dao);

        System.out.println("Résultat = " +metier.calcul());

    }
}
