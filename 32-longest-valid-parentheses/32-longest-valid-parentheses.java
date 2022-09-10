class Solution {
    public int longestValidParentheses(String s) {
        
        if(s.length() < 1)
            return 0;
        
        Stack<Integer> myStack = new Stack<Integer>();
        
        myStack.push(-1);
        int maxLength = 0;
        int length = 0;
        
        for(int i = 0; i < s.length(); ++i)
        {
            if(s.charAt(i) == '(')
            {
                myStack.push(i);
            }
            if(s.charAt(i) == ')')
            {
                myStack.pop();
                
                if(myStack.size() > 0)
                {
                    length = i - myStack.peek();
                    
                    if(length > maxLength)
                        maxLength = length;
                }
                else
                {
                    myStack.push(i);
                }
            }
        }
        
        return maxLength;
    }
}