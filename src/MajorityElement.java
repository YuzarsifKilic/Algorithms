import java.util.HashMap;
import java.util.HashSet;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> list = new HashMap<>();
        int result = 0;
        int maxNumber = 0;

        for (int index : nums) {
            if (list.get(index) == null)
                list.put(index, 0);
            int value = list.get(index);
            list.put(index, value + 1);

            if (list.get(index) > maxNumber) {
                result = index;
            }

            if (maxNumber < list.get(index))
                maxNumber = list.get(index);
        }

        return result;
    }

    public int boyerMoore(int[] nums) {
        int result = 0;
        int count = 0;

        for (int index : nums) {
            if (count == 0)
                result = index;
            if (index == result)
                count = count + 1;
            else
                count = count - 1;
        }

        return result;
    }
}
