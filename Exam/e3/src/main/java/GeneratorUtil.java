import java.util.Arrays;

/**
 * Created by chenjin on 2018/7/19.
 */
public class GeneratorUtil {
        public static void BubbleSort(Integer[] arr) {
            int temp;//定义一个临时变量
            for(int i=0;i<arr.length-1;i++){//冒泡趟数
                for(int j=0;j<arr.length-i-1;j++){
                    if(arr[j+1]<arr[j]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
        public static void main(String[] args) {
            Integer arr[] = new Integer[]{1,6,2,2,5};
            BubbleSort(arr);
            System.out.println(Arrays.toString(arr));
        }
}
