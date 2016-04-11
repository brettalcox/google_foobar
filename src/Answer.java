import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by BA042808 on 4/11/2016.
 */
public class Answer {

    public static void main(String [] args) {
        int[] test = {1,2,3,4,5,2,4,5,2,1,3,4,5};
        answer(test);
    }

    public static int answer(int[] numbers) {
        int count = 0;

        ArrayList<Integer> list = new ArrayList<Integer>();

        if (numbers.length >= 2 && numbers.length <= 5000) {
            for (int i = 0; i < numbers.length; i++) {

                if (list.contains(i)) {
                    return list.size() - i;
                }

                list.add(count, i);
                count++;

                i = numbers[i] - 1;
            }
        }
        return 0;
    }
}
