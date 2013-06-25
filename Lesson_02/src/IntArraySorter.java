/**
 * Created with IntelliJ IDEA.
 * User: eddiewashington
 * Date: 6/24/13
 * Time: 7:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class IntArraySorter {


    public static int[] sortArray(int[] array) {
        for (int x = 0; x < array.length; x++) {
            for (int y = x; y < array.length; y++) {
                if(array[x] > array[y]){
                    int first = array[x];
                    int second = array[y];
                    array[x] = second;
                    array[y] = first;
                }
            }
        }
        return array;
    }
}
