import java.util.HashMap;
import java.util.Set;

public class HashTest {
    public static void main(String[] args) {

        HashMap<String, String> tracklist = new HashMap<String, String>();
        tracklist.put("Animated Octo", "Lorem Ipsum neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit.");
        tracklist.put("Refactored Robot", "Proin fringilla scelerisque eros, vel imperdiet magna ornare vel. Proin scelerisque enim ac nulla suscipit maximus.");
        tracklist.put("Shiny Garbanzo", "Nam ipsum ipsum, eleifend a dui vitae, facilisis eleifend diam. Morbi dapibus arcu in nisi dictum, id mattis nisl luctus. In venenatis magna sed egestas consectetur.");
        tracklist.put("Solid Memory", "Integer vulputate erat augue, a vestibulum ex sagittis non.");

        System.out.println(tracklist.get("Solid Memory"));

        for(String key : tracklist.keySet()) {
            System.out.println(key);
            System.out.println(tracklist.get(key));
            System.out.println();
        }
    }
}