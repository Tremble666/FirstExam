/**
 * Created by chenjin on 2018/7/19.
 */
public class test2 {
    public static void main(String[] args) {
        //获取唯一的一个计算类
        caculator c = caculator.getCaculator();

        System.out.println("第二题的答案是:");
        System.out.println("USERA的税费是:"+ c.caculate(5000));
        System.out.println("USERB的税费是:"+ c.caculate(10000));
        System.out.println("USERC的税费是:"+ c.caculate(15000));
        System.out.println("USERD的税费是:"+ c.caculate(60000));
    }
}
