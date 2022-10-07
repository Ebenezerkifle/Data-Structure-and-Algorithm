class Solution {
    public boolean isValid(String s) {
       boolean isValid=false;
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
          if(stack.empty()){
              if(s.charAt(i)==')' || s.charAt(i)==']'|| s.charAt(i)=='}'){
                 isValid=false;
                 break; 
              }
              else{
                  stack.push(s.charAt(i));
              }    
          }
          else if(!stack.empty()){
              if(stack.peek()=='(' && s.charAt(i)==')'){
                  stack.pop();
              }
              else if(stack.peek()=='[' && s.charAt(i)==']'){
                  stack.pop();
              }
              else if(stack.peek()=='{' && s.charAt(i)=='}'){
                  stack.pop();
              }
                  
              else if(s.charAt(i)=='(' || s.charAt(i)=='['|| s.charAt(i)=='{'){
                 stack.push(s.charAt(i));
              }
              else{
                  isValid=false;
                  break;
              }  
           } 
          if(s.length()==i+1){
            if(stack.empty()){
                isValid=true;
            }
            else{
                isValid=false;
            }
          }
        }
        
        return isValid;
    }
}
