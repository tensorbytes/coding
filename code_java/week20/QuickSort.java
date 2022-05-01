package week20;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2022/5/1 0001
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] data = new int[]{2, 3, 4, 10, 3, 17, 9, 31};
        quicksort(data);
        for (int a :  data) {
            System.out.print(a + ",");
        }
    }

    private static void quicksort(int[] data) {
        int size = data.length;
        quickSortBetween(data,0,size-1);
    }

    private static void quickSortBetween(int[] data, int low, int high) {

        if(low>=high){
            return;
        }
        int pos = partition(data,low,high);
        quickSortBetween(data,low,pos-1);
        quickSortBetween(data,pos+1,high);
    }

    private static int partition(int[] data, int low, int high) {

        int pos = low;

        int left = low+1;
        int right = high;

        while(left < right){
            if(data[left]<data[pos]){
                pos +=1;
                swap(data,left,pos);
            }
            left ++;
        }
        swap(data,low,pos);
        return pos;
    }

    private static void swap(int[] data, int left, int pos) {
        int tmp = data[left];
        data[left]= data[pos];
        data[pos] = tmp;
    }


}
