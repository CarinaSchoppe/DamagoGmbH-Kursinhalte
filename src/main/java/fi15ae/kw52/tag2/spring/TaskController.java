package fi15ae.kw52.tag2.spring;


import jakarta.validation.Valid;
import java.net.URI;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {


  private final TaskService taskService;

  public TaskController(TaskService taskService) {
    this.taskService = taskService;
  }

  @GetMapping("/{id}")
  public ResponseEntity<TaskResponse> get(@PathVariable long id) {
    return taskService.get(id).map(ResponseEntity::ok)
        .orElseGet(() -> ResponseEntity.notFound().build());

  }

  @GetMapping
  public List<TaskResponse> list() {
    return taskService.list();
  }

  @PostMapping
  public ResponseEntity<TaskResponse> create(@RequestBody @Valid TaskCreateRequest request) {
    var created = taskService.create(request.title());
    return ResponseEntity.created(URI.create("/tasks/" + created.id())).body(created);
  }

  @PutMapping("/{id}/done")
  public ResponseEntity<TaskResponse> put(@RequestBody long id) {
    return taskService.markDone(id).map(ResponseEntity::ok)
        .orElseGet(() -> ResponseEntity.notFound().build());
  }


}
