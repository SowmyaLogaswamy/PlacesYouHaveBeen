import java.util.ArrayList;
import java.util.List;

public class Place {
    private String mPlaceName;
    private String mPlaceDescription;
    private static List<Place> instances = new ArrayList<Place>();
    private int mId;

  public Place(String placeName, String placeDescription) {
    mPlaceName = placeName;
    mPlaceDescription = placeDescription;
    instances.add(this);
    mId = instances.size();
  }

    public String getPlaceName() {
      return mPlaceName;
    }

    public String getPlaceDescription() {
      return mPlaceDescription;
    }

    public static List<Place> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static Place find(int id) {
    return instances.get(id - 1);
  }
}
