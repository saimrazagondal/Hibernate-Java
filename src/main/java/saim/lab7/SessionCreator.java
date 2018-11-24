package saim.lab7;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class SessionCreator {

    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    public static void createSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(person.class);
        configuration.configure();
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
                configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

}
