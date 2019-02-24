package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/2/24
 * @Version 1.0
 */
public class AvailableCapturesforRook {
    public int numRookCaptures(char[][] board) {
        int h=-1;
        int l=-1;
        int sum=0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j]=='R'){
                    h=i;
                    l=j;
                }
            }
        }

        for (int i = h; i >=0; i--) {
            if(board[i][l]=='B'){
                break;
            }
            if(board[i][l]=='p'){
                sum++;
                break;
            }
        }

        for (int i = h; i <8; i++) {
            if(board[i][l]=='B'){
                break;
            }
            if(board[i][l]=='p'){
                sum++;
                break;
            }
        }

        for (int i = l; i >=0; i--) {
            if(board[h][i]=='B'){
                break;
            }
            if(board[h][i]=='p'){
                sum++;
                break;
            }
        }

        for (int i = l; i >=0; i--) {
            if(board[h][i]=='B'){
                break;
            }
            if(board[h][i]=='p'){
                sum++;
                break;
            }
        }
        return sum;
    }
}
