import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by chenjin on 2018/7/19.
 */
//使用普通方式
public class Generator1 implements AbstractGenerator{
    Random r = new Random();
    public void generate(){
        //随机50个小于100的数
        List<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 50 ; i++) {
            list1.add(r.nextInt(100));
        }

        //除以10
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < 50; i++) {
             int ele = (int)list1.get(i) / 10;
             list2.add(ele);
        }

        //装到map中
        Map<Integer,List<Integer>> map1 = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < 50; i++) {
            if(map1.containsKey(list2.get(i))){
                map1.get(list2.get(i)).add(list1.get(i));
            }else{
                List<Integer> temp1 = new ArrayList<Integer>();
                map1.put(list2.get(i),temp1);
            }
        }

        //对map中的数据进行排序,使用java8中的stream()
        for (Integer key : map1.keySet()) {
            List<Integer> list3 =  map1.get(key);
            Integer [] arr1 = new Integer[list3.size()];
            for (int i = 0; i < list3.size(); i++) {
                arr1[i] = list3.get(i);
            }
            GeneratorUtil.BubbleSort(arr1);
            map1.put(key,Arrays.asList(arr1));
        }


        System.out.println("第一种方式(非java8):");
        for (Integer key : map1.keySet()) {
            System.out.println(key+" ==> "+map1.get(key));
        }

    }

}
