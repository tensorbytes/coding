package week2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 9/7/2021
 */
public class ImplementStack_225 {

    static class MyStack{

        Queue<Integer> queue1;
        //Queue<Integer> queue2;

        public MyStack() {
            queue1 = new LinkedList<Integer>();
            //queue2 = new LinkedList<Integer>();
        }

        public void push(int x) {
            queue1.offer(x);
            int size = queue1.size();
            for(int i=0;i<size-1;i++) {
                queue1.offer(queue1.poll());
            }
        }

        public int pop() {
            return queue1.poll();
        }

        public int top() {
            return queue1.peek();
        }

        public boolean empty() {
            return queue1.isEmpty();
        }

    }




    public static void main(String[] args) {
        MyStack obj = new MyStack();
         obj.push(3);
         int param_2 = obj.pop();
         int param_3 = obj.top();
         boolean param_4 = obj.empty();
    }


}
