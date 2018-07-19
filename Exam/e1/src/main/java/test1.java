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
        System.out.println("第一题题目答案是:");
        System.out.println("在此区间内共有"+res.size()+"个素数");
        System.out.println("分别是:");
        for (Integer re : res) {
            System.out.println(re+",");
        }
    }
}
