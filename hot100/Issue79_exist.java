package hot100;

public class Issue79_exist {
    public static void main(String[] args) {
        char[][]board=new char[][]{{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
        String word="ABCESEEEFS";
        exist(board,word);
    }
    public static boolean exist(char[][]board,String word){
        int wordIndex=0;
        boolean[][]used=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board,word,wordIndex,used,i,j)) return true;
            }
        }
        return false;
    }
    public static boolean dfs(char[][]board, String word, int wordIndex, boolean[][]used, int i_index, int j_index){
        if(wordIndex==word.length()) {
            return true;
        }
        if(i_index<0||i_index>=board.length||j_index<0||j_index>=board[0].length) return false;
        int wordIndexLast=wordIndex;
        if(!used[i_index][j_index]&&board[i_index][j_index]==word.charAt(wordIndex)) {
            used[i_index][j_index]=true;
            wordIndex++;
        }
        else {
            return false;
        }
        if(dfs(board,word,wordIndex,used,i_index+1,j_index)||
        dfs(board,word,wordIndex,used,i_index-1,j_index)||
        dfs(board,word,wordIndex,used,i_index,j_index+1)||
        dfs(board,word,wordIndex,used,i_index,j_index-1)){
            return true;
        }
        used[i_index][j_index] = false;
        return false;
    }
}


//ABCE
//SFES
//ADEE

//"ABCESEEEFS"
