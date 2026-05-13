class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> set = new HashSet<>();

        for (int r = 0; r < 9; r++) {

            for (int c = 0; c < 9; c++) {

                char val = board[r][c];

                if (val == '.') {
                    continue;
                }

                
                String row = val + " in row " + r;
                String col = val + " in col " + c;
                String box = val + " in box " + (r / 3) + "-" + (c / 3);

                
                if (!set.add(row) ||
                    !set.add(col) ||
                    !set.add(box)) {

                    return false;
                }
            }
        }

        return true;
    }
}