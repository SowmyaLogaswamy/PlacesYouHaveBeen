import org.junit.*;
import static org.junit.Assert.*;

public class PlaceTest {

  @Test
  public void Place_instantiatesCorrectly_true() {
    Place myPlace = new Place("China");
    assertEquals(true, myPlace instanceof Place);
  }

  @Test
  public void Place_instantiatesWithPlaceName_String() {
    Place myPlace = new Place("China");
    assertEquals("China", myPlace.getPlaceName());
  }

  @Test
  public void all_returnsAllInstancesOfPlace_true() {
    Place firstPlace = new Place("China");
    Place secondPlace = new Place("India");
    assertEquals(true, Place.all().contains(firstPlace));
    assertEquals(true, Place.all().contains(secondPlace));
  }

  @Test
  public void clear_emptiesAllPlacesFromArrayList_0() {
    Place myPlace = new Place("Portland");
    Place.clear();
    assertEquals(0, Place.all().size());
  }

  @Test
  public void getID_placesInstantiateWithAnID_1() {
    Place.clear();
    Place myPlace = new Place("Canada");
    assertEquals(1, myPlace.getId());
  }

  @Test
  public void find_returnsPlaceWithSameId_secondPlace() {
    Place firstPlace = new Place("India");
    Place secondPlace = new Place("United States");
    assertEquals(Place.find(secondPlace.getId()), secondPlace);
  }
}
