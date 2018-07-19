/**
 * Created by chenjin on 2018/7/19.
 */
public class test2 {
    public static void main(String[] args) {
        //获取唯一的一个计算类
        caculator c = caculator.getCaculator();

        System.out.println("Second:");
        System.out.println("USERA:"+ c.caculate(5000));
        System.out.println("USERB:"+ c.caculate(10000));
        System.out.println("USERC:"+ c.caculate(15000));
        System.out.println("USERD:"+ c.caculate(60000));
    }
}
