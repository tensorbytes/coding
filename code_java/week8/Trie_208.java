package week8;

import java.util.HashMap;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 10/15/2021
 */
public class Trie_208 {

    static class Node {
        boolean isEnd = false;
        Node[] data = new Node[26];

    }

    static class Trie {

        Node root;

        public Trie() {
            root = new Node();
        }

        public void insert(String word) {
            Node cur = root;
            Node tmp = null;
            int pos;
            for (int i = 0; i < word.length(); i++) {
                pos = word.charAt(i)-'a';
                if(cur.data[pos] == null){
                    cur.data[pos] = new Node();
                }
                cur = cur.data[pos];
            }
            cur.isEnd = true;
        }

        public boolean search(String word) {
            Node cur = root;
            for (int i = 0; i < word.length(); i++) {
                int pos = word.charAt(i)-'a';
                if(cur.data[pos] !=null){
                    cur = cur.data[pos];
                }else{
                    return false;
                }
            }
            return cur.isEnd;
        }

        public boolean startsWith(String prefix) {
            Node cur = root;
            for (int i = 0; i < prefix.length(); i++) {
                int pos = prefix.charAt(i)-'a';
                if(cur.data[pos] !=null){
                    cur = cur.data[pos];
                }else{
                    return false;
                }
            }
            return true;
        }
    }


    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.search("apple");   // 返回 True
        trie.search("app");     // 返回 False
        trie.startsWith("app"); // 返回 True
        trie.insert("app");
        System.out.println(trie.search("app"));     // 返回 True


        System.out.println('z'-'a');
    }
}
