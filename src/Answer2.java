import java.util.LinkedList;
import java.lang.Math;

/**
 * Created by BA042808 on 4/11/2016.
 */
public class Answer2 {
    public static void main(String[] args) {
        answer(1);
    }

    public static long convertToBaseThree(Integer input) {
        long ret = 0, factor = 1;
        while (input > 0) {
            ret += input % 3 * factor;
            input /= 3;
            factor *= 10;
        }
        return ret;
    }

    public static String[] answer(int x) {
        if (x > 0 && x <= 1000000000) {
            Integer inputValue = x;

            long ret = convertToBaseThree(x);

            LinkedList<Long> stack = new LinkedList<Long>();
            while (ret > 0) {
                stack.push( ret % 10 );
                ret = ret / 10;
            }

            LinkedList<Long> weight = new LinkedList<Long>();
            Boolean hasSeenTwo = false;

            for (int i = stack.size() - 1; i >= 0; i--) {
                if (stack.get(i) == 2) {
                    if (hasSeenTwo) {
                        weight.push((long) 0);
                    }
                    if (!hasSeenTwo && i == stack.size() - 1) {
                        weight.push((long) 1);
                        hasSeenTwo = true;
                    }
                    if (!hasSeenTwo && i != stack.size() - 1){
                        weight.push((long) 1);
                        hasSeenTwo = true;
                    }
                }
                if (stack.get(i) == 0) {
                    weight.push((long) 0);
                    if (hasSeenTwo) {
                        hasSeenTwo = false;
                    }
                }
                if (stack.get(i) == 1) {
                    if (hasSeenTwo) {
                        weight.push((long) 1);
                    } else {
                        weight.push((long) 0);
                    }
                }
            }

            int baseTenWeight = 0;
            int j = 0;
            for (int i = weight.size() - 1; i >= 0; i--) {
                baseTenWeight += (weight.get(j) * Math.pow(3, i));
                j++;
            }

            int totalSum = baseTenWeight + inputValue;
            ret = convertToBaseThree(totalSum);

            LinkedList<Long> endSum = new LinkedList<Long>();
            while (ret > 0) {
                endSum.push( ret % 10 );
                ret = ret / 10;
            }

            int endingSum = 0;
            j = 0;
            for (int i = endSum.size() - 1; i >= 0; i--) {
                endingSum += (endSum.get(j) * Math.pow(3, i));
                j++;
            }

            String[] weightString = new String[endSum.size()];

            if (weight.size() != endSum.size()) {
                weight.push((long) 0);
            }

            int k = 0;
            for (int i = endSum.size() - 1; i >= 0; i--) {

                if (weight.get(i) == 1) {
                    weightString[k] = "L";
                }
                if (weight.get(i) == 0 && endSum.get(i) == 0 && i != 0) {
                    weightString[k] = "-";
                }

                if (endSum.get(i) == 1) {
                    weightString[k] = "R";
                }

                if (weight.get(i) == 0 && endSum.get(i) == 0 && i == 0) {
                }
                k++;
            }

            for (int i = 0; i < weightString.length; i++) {
                System.out.print(weightString[i]);
            }
            return weightString;

        }
        return null;
    }
}