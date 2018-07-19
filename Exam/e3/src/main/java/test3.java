/**
 * Created by chenjin on 2018/7/19.
 */
public class test3 {
    public static void main(String[] args) {
        AbstractGenerator g1 = new GeneratorFactory().getGenerator("g1");
        AbstractGenerator g2 = new GeneratorFactory().getGenerator("g2");
        System.out.println("==================第三题答案===============");
        g1.generate();
        System.out.println("-------------------------------------");
        g2.generate();
        System.out.println("===========================================");
    }
}
