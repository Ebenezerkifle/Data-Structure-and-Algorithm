class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=')'){
               stack.push(s.charAt(i));
            }
            else{
               List<Character> charList=new ArrayList<Character>();
               while(stack.peek()!='('){
                   charList.add(stack.pop());
               }
               stack.pop();
               for(char element: charList){
                   stack.push(element);
               }
            }
        }
        
        StringBuilder builder=new StringBuilder();
        Stack<Character> stack2=new Stack<Character>();
        while(!stack.empty()){
            stack2.push(stack.pop());
        }
        while(!stack2.empty()){
            builder.append(stack2.pop());
        }
        return builder.toString();
    }
}
