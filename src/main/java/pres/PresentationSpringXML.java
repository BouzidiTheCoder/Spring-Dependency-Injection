package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Classe de présentation pour l'injection de dépendances à l'aide de Spring avec XML
public class PresentationSpringXML {
    public static void main(String[] args) {
        ApplicationContext springContext=new ClassPathXmlApplicationContext("config.xml");

        IMetier metier=springContext.getBean(IMetier.class);

        // Affichage du résultat du calcul
        System.out.println("------- Spring Version XML -------");
        System.out.println("Résultat : "+metier.calcul());

    }
}
