package Daily_Problems;

import java.util.Stack;

public class reverse_substrings_between_each_pair_of_parantheses {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.charAt(i)==')'){
                StringBuilder res=new StringBuilder();
                while(st.peek()!='('){
                    res.append(st.pop());

                }
                
                st.pop();
                for(int j=0;j<res.length();j++){
                    st.push(res.charAt(j));
                }
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
        
        
        
    }
    
    
}
