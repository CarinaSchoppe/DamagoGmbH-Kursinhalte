package fi15ae.kw52.tag2.spring;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Service;

@Service
public class TaskService {


  private final AtomicLong sequence = new AtomicLong(0);

  private final Map<Long, TaskResponse> store = new LinkedHashMap<>();

  public List<TaskResponse> list() {
    return new ArrayList<>(store.values());
  }

  public TaskResponse create(String title) {
    long id = sequence.incrementAndGet();
    var task = new TaskResponse(id, title, false);
    store.put(id, task);
    return task;
  }

  public Optional<TaskResponse> get(long id) {
    return Optional.ofNullable(store.get(id));
  }

  public Optional<TaskResponse> markDone(long id) {
    var existing = store.get(id);
    if (existing == null) {
      return Optional.empty();
    }
    var updated = new TaskResponse(existing.id(), existing.title(), true);
    store.put(id, updated);
    return Optional.of(updated);
  }
}
