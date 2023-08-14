import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class checkOddNumbersInList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(onlyOddNumbers(list));
    }

    public static boolean onlyOddNumbers(List<Integer> list) {
        /*for(Integer i: list) {
            if(i % 2 == 0) {
                return false;
            }
        }
        return true;*/
        return list.parallelStream().allMatch(x -> x % 2 != 0);
    }
}
