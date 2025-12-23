package fi15ae.kw52.tag2.hibernate;

import java.util.List;
import java.util.Optional;
import org.hibernate.Session;

public interface TaskRepository {


  Task persist(Session session, Task task);

  Task merge(Session session, Task task);

  Optional<Task> findById(Session session, long id);

  List<Task> findAll(Session session);

  void remove(Session session, Task task);

}
