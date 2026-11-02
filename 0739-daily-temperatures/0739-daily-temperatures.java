class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n= temp.length;
        int[] ans= new int[n];
        Stack<Integer> stk= new Stack<>();
        Arrays.fill(ans, -1);
        for(int i=0; i<n; i++){
            while(!stk.isEmpty() && temp[i]>temp[stk.peek()]){
                ans[stk.peek()]= i;
                stk.pop();
            }
            stk.push(i);
        }
        for(int i=0; i<n; i++){
            if(ans[i]==-1)
                ans[i]=0;
            else
                ans[i]-= i;
        }
        return ans;
    }
}