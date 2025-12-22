import fi15ae.kw52.tag1.andererkram.Hallo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HalloTests {


  private Hallo hallo;

  @BeforeEach
  public void setUp() {
    hallo = new Hallo();
    System.out.println("test1");
  }

  @Test
  public void testAddiere() {
    Assertions.assertEquals(3, hallo.addiere(1, 2));
  }

  @AfterEach
  public void tearDown() {
    System.out.println("test2");
  }
}
