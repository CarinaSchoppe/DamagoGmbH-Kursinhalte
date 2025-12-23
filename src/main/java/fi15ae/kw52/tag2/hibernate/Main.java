package fi15ae.kw52.tag2.hibernate;

public class Main {


  static void main() {
    var sessionFactory = HibernateUtil.sessionFactory();


    long id;
    //CREATE
    try (var session = sessionFactory.openSession()) {
      var tx = session.beginTransaction();
      var task = new Task("Hibernate und SQLite Intro");
      session.persist(task);
      tx.commit();
      id = task.getId();
      System.out.println("Task gesaved mit id:" + id);
    }

    //READ
    try (var session = sessionFactory.openSession()) {
      var task = session.get(Task.class, id);
      System.out.println("Loaded Task" + task.getTitle());
    }

    //LIST
    try (var session = sessionFactory.openSession()) {
      var tasks = session.createQuery("from Task", Task.class).list();
      System.out.println("All tasks:" + tasks);
    }

    sessionFactory.close();


  }


  void extraMain() {
    var sessionFactory = HibernateUtil.sessionFactory();

    var repository = new HibernateTaskRepository();
    var service = new TaskService(sessionFactory, repository);

    var created = service.create("Hibernate + SQLITE Manuell Intro");
    System.out.println("Created" + created);
    System.out.println("All tasks:" + service.list());
    service.markDone(created.getId());
    System.out.println("After done: " + service.get(created.getId()));

    sessionFactory.close();
  }

}
