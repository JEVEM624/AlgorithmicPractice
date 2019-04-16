package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/4/16
 * @Version 1.0
 */
public class WordSearch {
    public static void main(String[] args) {
        new WordSearch().exist(new char[][]{{'a','a'}},"aaa");
    }
    boolean[][]visit;
    public boolean exist(char[][] board, String word) {
        visit=new boolean[board.length][board[0].length];
        char target=word.charAt(0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (target==board[i][j]){
                    boolean flag=false;
                    visit[i][j]=true;
                    flag|= helper(board, i-1, j, word, 1);
                    flag|= helper(board, i+1, j, word, 1);
                    flag|= helper(board, i, j-1, word, 1);
                    flag|= helper(board, i, j+1, word, 1);
                    if (flag==true){
                        return true;
                    }else {
                        visit[i][j]=false;
                        continue;
                    }
                }
            }
        }
        return false;
    }
    public boolean helper(char[][]board,int h,int l,String word,int index){
        if (index==word.length()){
            return true;
        }
        if (h<0||h>=board.length){
            return false;
        }
        if (l<0||l>=board[0].length){
            return false;
        }
        if (visit[h][l]){
            return false;
        }
        char target=word.charAt(index);
        if (board[h][l]==target){
            visit[h][l]=true;
            boolean flag=false;
            flag|= helper(board, h-1, l, word, index+1);
            flag|= helper(board, h+1, l, word, index+1);
            flag|= helper(board, h, l-1, word, index+1);
            flag|= helper(board, h, l+1, word, index+1);
            if (flag){
                return flag;
            }else {
                visit[h][l]=false;
                return false;
            }
        }
        return false;
    }
}
