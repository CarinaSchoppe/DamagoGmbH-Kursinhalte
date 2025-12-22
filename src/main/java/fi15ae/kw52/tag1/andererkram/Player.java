package fi15ae.kw52.tag1.andererkram;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import fi15ae.kw51.tag4.aufgaben.iterator.domain.Point;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
@AllArgsConstructor
public class Player {


  @Expose
  private String name;

  @Expose
  private Point point;

  @Expose(serialize = false, deserialize = true)
  private int level;
  private int age;
  private int health;
  private int damage;
  private boolean maleCharacter;
  private boolean isLeftHanded;

  @NotNull
  public static Player fromJson(@NotNull String json) {
    Gson gson = new Gson();
    return gson.fromJson(json, Player.class);
  }

  static void main() {
    Player player = new Player("name", new Point(1, 2, 3), 1, 20, 100, 10, true, false);
    String json = player.toJson();
    Path path = Path.of("X:\\Privat\\DamagoGmbH-Kursinhalte\\test.json");
    try {
      Files.writeString(path, json, StandardOpenOption.CREATE,
          StandardOpenOption.TRUNCATE_EXISTING);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    System.out.println(json);


  }

  @NotNull
  public String toJson() {
    var gson =
        new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();
    return gson.toJson(this);
  }
}
