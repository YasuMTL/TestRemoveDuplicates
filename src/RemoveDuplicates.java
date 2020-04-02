import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates implements RemoveDuplicatesFromArray {

    @Override
    public ArrayList<Integer> removeDuplicates(int[] intArray) {
        // This HashMap removes duplicates
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        // This ArrayList will contain values without duplicates
        ArrayList<Integer> objectsWithoutDuplicates = new ArrayList<>();

        // 1. Remove duplicates getting through a HashMap
        for (int value : intArray) {
            hashMap.put(value, 0);
        }

        // 2. Transfer values from HashMap
        objectsWithoutDuplicates.addAll(hashMap.keySet());
        /*for (int o : hashMap.keySet()) {
            objectsWithoutDuplicates.add(o);
        }*/

        return objectsWithoutDuplicates;
    }

    // A demonstration
    /*public static void main(String[] args) {
        // An array for test
        int[] arrayContainDuplicates = {1, 2, 2, 3, 4, 4, 1};

        // Get an instance of "RemoveDuplicates"
        RemoveDuplicates instance = new RemoveDuplicates();

        // An ArrayList contains values without duplicates
        ArrayList<Integer> liste = instance.removeDuplicates(arrayContainDuplicates);

        for (Integer i : liste) {
            System.out.println(i);
        }
    }*/
}

