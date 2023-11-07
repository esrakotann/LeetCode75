import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int number: arr){
            map.put(number,map.getOrDefault(number,0)+1);
        }
        return map.size() == new HashSet<Integer>(map.values()).size();
    }

}
