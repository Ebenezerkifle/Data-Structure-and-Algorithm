class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> myStack=new Stack<Integer>();
        for(int i=0;i<tokens.length;i++){
            if( tokens[i].equals("+") ||tokens[i].equals("-") ||tokens[i].equals("*") ||tokens[i].equals("/")){
                int value1=myStack.pop();
                int value2=myStack.pop();
                myStack.push(operate(value2, value1, tokens[i]));
            }
            else{
                myStack.push(Integer.valueOf(tokens[i]));
            }
        }
        return myStack.pop();
        
    }
    public int operate(int value1, int value2, String operator){
        if(operator.equals("+")){
            return value1+value2;
        }
        else if(operator.equals("-")){
            return value1-value2;
        }
        else if(operator.equals("*")){
            return value1*value2;
        }
        else{
            return value1/value2;
        }
    }
}
