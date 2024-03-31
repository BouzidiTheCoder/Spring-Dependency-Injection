package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Classe de présentation pour l'injection de dépendances à l'aide de Spring avec des annotations
public class PresentationSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext springContext=new AnnotationConfigApplicationContext("dao","metier");
        IMetier metier=springContext.getBean(IMetier.class);

        // Affichage du résultat du calcul
        System.out.println("------- Spring Version Annotation -------");
        System.out.println("Résultat : "+metier.calcul());

    }
}
