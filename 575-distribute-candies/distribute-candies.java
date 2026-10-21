import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);

        List<Integer> list = new ArrayList<>();

        for (int candy : candyType) {
            if (list.isEmpty() || list.get(list.size() - 1) != candy) {
                list.add(candy);
            }
        }

        return Math.min(list.size(), candyType.length / 2);
    }
}