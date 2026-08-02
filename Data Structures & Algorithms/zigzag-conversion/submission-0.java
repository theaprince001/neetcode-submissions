class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        if(numRows == 1 || n <= numRows)return s;
        char[] result = new char[n];
        int cycleStep = 2 * numRows - 2;
        int count = 0;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleStep) {
                result[count++] = s.charAt(j + i);
                
                if (i != 0 && i != numRows - 1) {
                    int diagonalIndex = j + cycleStep - i;
                    if (diagonalIndex < n) {
                        result[count++] = s.charAt(diagonalIndex);
                    }
                }
            }
        }

        return new String(result);
    }
}