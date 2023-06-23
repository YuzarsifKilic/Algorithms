public class SingleNumber {

    public int singleNumber(int[] nums) {
        int base = 0;

        for (int value : nums) {
            base = base ^ value;
        }

        return base;
    }
}
