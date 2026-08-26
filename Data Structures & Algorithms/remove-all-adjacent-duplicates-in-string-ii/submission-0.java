class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> charStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (!charStack.isEmpty() && charStack.peek() == currentChar) {
                charStack.push(currentChar);
                countStack.push(countStack.peek() + 1);
                } else {
                    charStack.push(currentChar);
                countStack.push(1); 
                }
                if (countStack.peek() == k) {
                for (int j = 0; j < k; j++) {
                    charStack.pop();
                    countStack.pop();
                }
            }
        }
        StringBuilder st = new StringBuilder();
        for (char c : charStack) {
            st.append(c);
        }
        
        return st.toString();
    }
}