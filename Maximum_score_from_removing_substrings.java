package Daily_Problems;

import java.util.Stack;

public class Maximum_score_from_removing_substrings {
    String str;
    public int maximumGain(String s, int x, int y) {
        str=s;
        String first=(x>y)?"ab":"ba";
        String second=(first.equals("ab"))?"ba":"ab";
        int ans1=maximum(first,Math.max(x,y));
        ans1=ans1+maximum(second,Math.min(x,y));
        return ans1;
        

    }
    public int maximum(String a,int res){
        int score=0;
        Stack<Character>st=new Stack<>();
        for(char ch:str.toCharArray()){
            if(!st.isEmpty()&&ch==a.charAt(1)&&st.peek()==a.charAt(0)){
                score=score+res;
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }
        str=sb.toString();


        return score;
    }
    
}
