package fi15ae.kw52.tag2.hibernate;

import java.util.List;
import java.util.Optional;
import org.hibernate.Session;

public class HibernateTaskRepository implements TaskRepository {

  @Override
  public Task persist(Session session, Task task) {
    session.persist(task);
    return task;
  }

  @Override
  public Task merge(Session session, Task task) {
    session.merge(task);
    return task;
  }

  @Override
  public Optional<Task> findById(Session session, long id) {
    return Optional.ofNullable(session.get(Task.class, id));
  }

  @Override
  public List<Task> findAll(Session session) {
    return session.createQuery("from Task", Task.class).list();
  }

  @Override
  public void remove(Session session, Task task) {
    session.remove(task);
  }
}
