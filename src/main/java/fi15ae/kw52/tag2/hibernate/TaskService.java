package fi15ae.kw52.tag2.hibernate;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TaskService {


  private final SessionFactory sessionFactory;
  private final TaskRepository taskRepository;

  public TaskService(SessionFactory sessionFactory, TaskRepository taskRepository) {
    this.sessionFactory = sessionFactory;
    this.taskRepository = taskRepository;
  }

  private <T> T inTx(Function<Session, T> work) {
    try (Session session = sessionFactory.openSession()) {
      var tx = session.beginTransaction();
      try {
        T result = work.apply(session);
        tx.commit();
        return result;
      } catch (Exception e) {
        tx.rollback();
        throw e;
      }
    }
  }

  public Task create(String title) {
    return inTx(session -> {
      var task = new Task(title);
      return taskRepository.persist(session, task);
    });
  }


  public Optional<Task> get(long id) {
    return inTx(session -> taskRepository.findById(session, id));
  }

  public List<Task> list() {
    return inTx(taskRepository::findAll);
  }

  public Optional<Task> markDone(long id) {
    return inTx(session -> {
      var optional = taskRepository.findById(session, id);
      optional.ifPresent(task -> task.setDone(true));
      return optional;
    });
  }

  public boolean delete(long id) {
    return inTx(session -> {
      var optional = taskRepository.findById(session, id);
      optional.ifPresent(task -> taskRepository.remove(session, task));
      return optional.isPresent();
    });
  }


  public Task updateDetached(Task detached) {
    return inTx(session -> taskRepository.merge(session, detached));
  }
}
