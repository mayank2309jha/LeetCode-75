class Solution {
    public int[] func(int[] a,int l, int r){
        int[] ans = new int[3];
        //ans[0] = profit
        //ans[1] = min
        //ans[2] = max
        if(l > r) return ans;
        if(l == r){
            ans[1] = a[l];
            ans[2] = a[l];
            return ans;
        }
        if(r == l+1){
            int p = Math.max(0, a[r]-a[l]);
            ans[0] = p;
            if(a[l] <= a[r]){
                ans[1] = a[l];
                ans[2] = a[r];
            }
            else{
                ans[1] = a[r];
                ans[2] = a[l];
            }
            return ans;
        }
        int mid = l + (r-l)/2;
        int[] leftAns = func(a,l,mid);
        int[] rightAns = func(a, mid+1,r);
        int profitAcross = Math.max(0, rightAns[2] - leftAns[1]);
        int profit = Math.max(leftAns[0], Math.max(rightAns[0], profitAcross));
        int min = Math.min(leftAns[1], rightAns[1]);
        int max = Math.max(leftAns[2], rightAns[2]);
        ans[0] = profit;
        ans[1] = min;
        ans[2] = max;
        return ans;
    }
    public int maxProfit(int[] prices) {
        return func(prices, 0, prices.length-1)[0];
    }
}
