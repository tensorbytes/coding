package week2;

import java.util.ArrayList;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 9/9/2021
 */
public class HeapSort_703 {

    static class Heap{

        int[] data;
        int windows;
        int count;

        public Heap(int size){
            this.windows = size;
            this.data = new int[this.windows+2];
            this.data[0] = -1;
            this.count = 0;
        }

        public void push(int one){
            this.count += 1;
            this.data[count]=one;

            int pos = this.count;
            int parent=count/2;
            while(parent>0){
                if(data[pos]<data[parent]){
                    swap(pos,parent);
                    pos = parent;
                    parent = pos/2;
                }else{
                    break;
                }
            }
            if(this.count >= this.windows + 1){
                this.pop();
            }
        }

        public int pop(){

            if(this.count==0){
                return -1;
            }
            swap(1,this.count);
            this.count -= 1;

            //自定向下调整堆
            int tmp=1,pos = 1;
            while(true){
                if(tmp*2 <= this.count && data[tmp*2] < data[pos]){
                    pos  = tmp*2;
                }

                if(tmp*2+1 <= this.count && data[tmp*2+1] < data[pos]){
                    pos = tmp*2 + 1;
                }

                if(tmp == pos){
                    break;
                }
                swap(tmp,pos);
                tmp = pos;
            }
            return this.data[this.count + 1];
        }

        public void swap(int indexA,int indexB){
            int tmp = data[indexA];
            data[indexA] = data[indexB];
            data[indexB] = tmp;
        }

        public int top(){
            return this.data[1];
        }
    }

    static class KthLargest{
        Heap heap;
        public KthLargest(int k,int[] nums){
            heap = new Heap(k);
            for(int i:nums){
                heap.push(i);
            }
        }

        public int add(int one){
            this.heap.push(one);
            return this.heap.top();
        }
    }

    public static void main(String[] args) {
        //[3],[5],[10],[9],[4]

        KthLargest k = new KthLargest(3,new int[]{4,5,8,2});
        System.out.println(k.add(3));
        System.out.println(k.add(5));
        System.out.println(k.add(10));
        System.out.println(k.add(9));
        System.out.println(k.add(4));
    }


}
