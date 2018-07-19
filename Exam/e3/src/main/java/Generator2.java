import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by chenjin on 2018/7/19.
 */
//使用java8zhongdenstream
public class Generator2 implements AbstractGenerator {
    Random r = new Random();
    public void generate(){
        //随机50个小于100的数
        List<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 50 ; i++) {
            list1.add(r.nextInt(100));
        }
        //list1 = r.ints(0,100).limit(50).forEach(list1::add);

        //除以10,使用java8新特性
        List<Integer> list2 = list1.stream().map(i -> (int)i / 10).collect(Collectors.toList());

        //装到map中,使用java8新特性
        Map<Integer,List<Integer>> map1 = new HashMap<Integer, List<Integer>>();
        list2 = list2.stream().filter(i -> i != null).collect(Collectors.toList());
        for (int i = 0; i < 50; i++) {
            if (map1.containsKey(list2.get(i))) {
                map1.get(list2.get(i)).add(list1.get(i));
            } else {
                List<Integer> temp1 = new ArrayList<Integer>();
                map1.put(list2.get(i), temp1);
            }
        }
        //对map中的数据进行排序
        for (Integer key : map1.keySet()) {
            List<Integer> list3 =  map1.get(key);
            list3 = list3.stream().sorted().collect(Collectors.toList());
            map1.put(key,list3);
        }

        System.out.println("(java8):");
        for (Integer key : map1.keySet()) {
            System.out.println(key+" ==> "+map1.get(key));
        }

    }
}
