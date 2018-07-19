/**
 * Created by chenjin on 2018/7/19.
 */
public class caculator {
    private static caculator c = new caculator();
    //私有化构造器
    private caculator(){
    };
    public static caculator getCaculator(){
        return c;
    }
    //计算所得税的方法
    public Double caculate(Integer salary){
        salary = salary - 3500;
        Double res = 0.0;
        if(salary <= 1500){
            res = salary * 0.03;
        }else if(salary <= 4500){
            res = (salary-1500) * 0.1 + 1500 * 0.03;
        }else if(salary <= 9000){
            res = 1500 * 0.03 + 3000 * 0.1 + (salary - 4500) * 0.2;
        }else if(salary <= 35000){
            res = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + (salary - 9000)*0.25;
        }else if(salary <= 55000){
            res = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + 26000 * 0.25 + (salary - 35000) * 0.3;
        }else if(salary <= 80000){
            res = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + 26000 * 0.25 + 20000 * 0.3 + (salary - 55000) * 0.35;
        }else {
            res = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + 26000 * 0.25 + 20000 * 0.3 + 25000 * 0.35 + (salary - 80000) * 0.45;
        }
        return res;
    }
}
