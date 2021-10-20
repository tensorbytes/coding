package week9;

import java.util.*;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 10/19/2021
 */
public class WordSearch_212 {

    static class Node {

        boolean isEnd =false;
        char c;
        Node[] map;

        public Node(char c){
            this.c = c;
            map = new Node[26];
        }

    }

    static class TrieTree{

        Node root;

        public TrieTree(){
            root = new Node('.');
        }

        public void insert(String word){
            Node tmp= root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                int pos = c-'a';
                if(tmp.map[pos] == null){
                    tmp.map[pos] = new Node(c);
                }
                tmp = tmp.map[pos];
            }
            tmp.isEnd = true;
        }

    }


    static class Solution {
        public List<String> findWords(char[][] board, String[] words) {
            // 构建字典树
            TrieTree t = new TrieTree();
            for (String word:words
                 ) {
                t.insert(word);
            }
            HashSet<String> res = new HashSet<>();


            int row = board.length;
            int col = board[0].length;

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    HashSet<String> dup = new HashSet<>();
                    dfs(i,j,row,col,res,dup,t.root,board,"");
                }
            }
            ArrayList<String> list = new ArrayList<>(res.size());
            for (String word:res
                 ) {
                list.add(word);
            }
            return list;
        }

        public void dfs(int x,int y,int row,int col,Set<String> res,Set<String> dup,Node lastNode,char[][] board,String word){
            if(x <0 || x == row ||  y == col || y <0 || dup.contains(x+","+y)){
                return;
            }

            char c = board[x][y];

            Node tmp = lastNode.map[c-'a'];
            if(tmp ==null ){
                return;
            }
            lastNode = tmp;
            word += c;
            if(lastNode.isEnd){
                res.add(word);

            }
            dup.add(x+","+y);
            //往4个方向前进

            dfs(x-1,y,row,col,res,dup,lastNode,board,word);//上
            dfs(x+1,y,row,col,res,dup,lastNode,board,word);//下
            dfs(x,y-1,row,col,res,dup,lastNode,board,word);//左
            dfs(x,y+1,row,col,res,dup,lastNode,board,word);//右
            dup.remove(x+","+y);
        }

    }


    public static void main(String[] args) {


        Solution s = new Solution();

        /*char[][] borad = new char[4][4];
        borad[0] = new char[]{'o','a','a','n'};
        borad[1] = new char[]{'e','t','a','e'};
        borad[2] = new char[]{'i','h','k','r'};
        borad[3] = new char[]{'i','f','l','v'};
        String[] words = new String[]{"oath","pea","eat","rain"};

        System.out.println(s.findWords(borad,words));*/

        char[][] borad2 = new char[][]{
                {'a','a'}
        };
        String[] words2 = new String[]{"aaa"};
        System.out.println(s.findWords(borad2,words2));
    }

}
