import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by BA042808 on 4/11/2016.
 */
public class Answer2 {
    public static void main(String[] args) {
        answer(265789);
    }
    public static String[] answer(int x) {
        long ret = 0, factor = 1;
        while (x > 0) {
            ret += x % 3 * factor;
            x /= 3;
            factor *= 10;
        }

        LinkedList<Long> stack = new LinkedList<Long>();
        while (ret > 0) {
            stack.push( ret % 10 );
            ret = ret / 10;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        return null;
    }
}