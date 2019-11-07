import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static boolean checkIfExists(String[] myStringArray, String stringToLocate){
        return Arrays.asList( myStringArray ).contains( stringToLocate );
    }

    public static boolean searchSet(String[] strings, String searchString) {
        Set<String> stringSet = new HashSet<>(Arrays.asList(strings));
        return stringSet.contains(searchString);
    }

    public static void main( String[] args ){
        boolean found = searchSet(new String[] {"Riz", "JP", "Greg"}, "Jared");
        if (found) {
            System.out.println("The value is found");
        } else {
            System.out.println("The value is not found");
        }
    }
}
