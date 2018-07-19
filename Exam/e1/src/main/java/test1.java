import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjin on 2018/7/19.
 */
public class test1 {
    public static void main(String[] args) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 100; i < 200; i++) {
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    break;
                }
                if(j == i-1){
                    res.add(i);
                }
            }
        }
        System.out.println("First:");
        System.out.println("All:"+res.size());
        System.out.println("They are:");
        for (Integer re : res) {
            System.out.println(re+",");
        }
    }
}
