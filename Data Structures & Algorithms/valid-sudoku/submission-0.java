class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        //for rows
        for (int i = 0; i < 9; i++) {
            HashSet<Integer> nums = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int num = Character.getNumericValue(board[i][j]);
                if (!nums.contains(num)) {
                    System.out.println("adding " + num);
                    nums.add(num);
                } else {
                    System.out.println("Here in rows " + num);
                    return false;
                }
            }
        }

        //for cols
        for (int i = 0; i < 9; i++) {
            HashSet<Integer> nums = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.') {
                    continue;
                }
                int num = Character.getNumericValue(board[j][i]);
                if (!nums.contains(num)) {
                    
                    nums.add(num);
                } else {
                    System.out.println("Here in cols");
                    return false;
                }
            }
        }

        HashMap<Integer, HashSet<Integer>> blockMap = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            blockMap.put(i, new HashSet<>());
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int key = i/3*3+j/3;
                if (board[i][j] == '.') {
                    continue;
                }
                int num = Character.getNumericValue(board[i][j]);
                if (!blockMap.get(key).contains(num)) {
                    
                    blockMap.get(key).add(num);
                } else {
                    System.out.println("Here in bloc");
                    return false;
                }

            }
        }


        

        return true;
    }
}
