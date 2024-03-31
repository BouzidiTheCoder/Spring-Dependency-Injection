package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

// Implémentation de l'interface IDao pour la version Capteurs
@Component("dao")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {

        System.out.println("Version Capteurs");
        double data = 55;
        return data;
    }

}
