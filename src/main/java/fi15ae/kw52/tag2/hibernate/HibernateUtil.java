package fi15ae.kw52.tag2.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public final class HibernateUtil {


  private static final SessionFactory sessionFactory = build();

  private HibernateUtil() {
  }

  private static SessionFactory build() {
    var config = new Configuration();
    config.addAnnotatedClass(Task.class);

    var serviceRegistry =
        new StandardServiceRegistryBuilder().
            applySettings(Environment.getProperties()).
            applySettings(config.getProperties()).build();

    return config.buildSessionFactory(serviceRegistry);
  }

  public static SessionFactory sessionFactory() {
    return sessionFactory;
  }
}
