package com.paws.util;

        import org.hibernate.HibernateException;
        import org.hibernate.Session;
        import org.hibernate.SessionFactory;
        import org.hibernate.boot.MetadataSources;
        import org.hibernate.boot.registry.StandardServiceRegistry;
        import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Mysql {
    private static SessionFactory sessionFactory;

    static {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .applySetting("hibernate.connection.username", "root")
                .applySetting("hibernate.connection.password", "new_password")
                .build();

        try {
            sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
        }
        catch (Exception e) {
            StandardServiceRegistryBuilder.destroy( registry );
        }
    }

    public static Session getSession() throws HibernateException {
        return sessionFactory.openSession();
    }
}