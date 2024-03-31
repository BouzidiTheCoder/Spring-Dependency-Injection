package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Implémentation de l'interface IMetier pour la couche métier
@Component("metier")
public class IMetierImpl implements IMetier {

    @Autowired
    private IDao dao; // Couplage Faible

    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }

    /*
    Setter pour injecter un objet IDao.
    Utilisé pour l'injection de dépendances par instanciation dynamique.
    */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
