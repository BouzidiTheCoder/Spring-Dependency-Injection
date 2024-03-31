package ext;

import dao.IDao;

// Implémentation de l'interface IDao pour la version Web Service
public class DaoImplVWS implements IDao {

    @Override
    public double getData() {
        System.out.println("Version Web Service");
        return 90;
    }
}
