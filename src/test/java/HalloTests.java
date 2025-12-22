import fi15ae.kw52.tag1.Hallo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HalloTests {


  @Test
  public void testAddiere() {

    var hallo = new Hallo();

    Assertions.assertEquals(3, hallo.addiere(1, 2));


  }

}
