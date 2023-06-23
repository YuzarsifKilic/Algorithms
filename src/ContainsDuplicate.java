import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> setList = new HashSet<>();
        for (int num : nums) {
            setList.add(num);
        }

        return setList.size() != nums.length;
    }
}
