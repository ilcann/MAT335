
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        test(1, new int[]{5, 2, 5, 3, 2, 5});
        test(2, new int[]{-2, -12, 8, 8, 2, 12});
        test(3, new int[]{4, 17, 0, 32, -3, 0, 0});
        test(4, new int[]{-2, -5, 0, 5, -92, -2, 0, 43});
        test(5, new int[]{1, 2, 3, 4, 5});
        test(6, new int[]{5, 5, 5, 5, 5});
        test(7, new int[]{});
    }
    public static int[] compress(int[] arr) {
        //Check if the input array is empty
        if (arr.length == 0) {
            return new int[0];
        }

        //To store the result list
        List<Integer> compressed = new ArrayList<>();

        //Add the first element to the result list
        compressed.add(arr[0]);

        //Check the unique elements of the input array
        boolean isUnique = true;
        for (int i = 1; i < arr.length; i++) {
            isUnique = true;
            for (int j = 0; j < compressed.size(); j++) {
                if (compressed.get(j) == arr[i]) 
                {
                    isUnique = false;
                }
            }
            if (isUnique == true) {
                compressed.add(arr[i]);
            }
        }

        //Convert result List to result array
        int[] result = new int[compressed.size()];
        for (int i = 0; i < compressed.size(); i++) {
            result[i] = compressed.get(i);
        }

        //Return the result array
        return result;
    }
    public static String arrToString(int[] arr) {
        String result = "{";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) result += String.format("%d, ", arr[i]);
            else result += String.format("%d", arr[i]);
        }
        result += "}";
        return result;
    }
    public static void test(int testId,int[] arr) {
        System.out.print(String.format("Test %d:\nInput: %s\nOutput: %s\n", 
        testId, arrToString(arr), arrToString(compress(arr))));
    }
}
