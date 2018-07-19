/**
 * Created by chenjin on 2018/7/19.
 */
//工厂
public class GeneratorFactory  {
    public AbstractGenerator getGenerator(String info){
        if(info.equals("g1")){
            return new Generator1();
        }
        else if(info.equals("g2")){
            return new Generator2();
        }
        return null;
    }
}
