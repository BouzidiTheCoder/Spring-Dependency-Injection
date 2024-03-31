package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

// Classe de présentation pour l'injection de dépendances par instanciation dynamique
public class Presentation2 {
    public static void main(String[] args) throws Exception {

        // DaoImpl dao=new DaoImpl();
        // Lecture du fichier de configuration
        Scanner scanner = new Scanner (new File("config.txt"));

        // Récupération du nom de la classe DAO à partir du fichier de configuration
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.getConstructor().newInstance(); // => new DaoImpl()

        // IMetierImpl metier=new MetierImpl();
        // Récupération du nom de la classe Métier à partir du fichier de configuration
        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();

        // metier.setDao(dao); //STATIQUE

        // Injection dynamique de la dépendance DAO dans Métier
        Method method = cMetier.getMethod("setDao", IDao.class);
        method.invoke(metier,dao);

        System.out.println("Résultat = " + metier.calcul());

    }
}
