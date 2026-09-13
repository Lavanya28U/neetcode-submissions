class Solution {
    public boolean isValid(String s) {
        char[] a=s.toCharArray();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<a.length;i++){
            if(a[i]=='('||a[i]=='['||a[i]=='{'){
                st.push(a[i]);
            }
            else{

                if (st.isEmpty()){
                    return false;
                }
                char top=st.peek();
                if(top=='(' && a[i]==')'||top=='[' && a[i]==']'||top=='{' && a[i]=='}'){
                    st.pop();
                }
                else{
                    return false;
                }
                
            }
        }
        return st.isEmpty();
    }
}
