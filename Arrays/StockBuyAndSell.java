class StockBuyAndSell {
    public int maxProfit(int[] a) {
        int max=0;
        int n=a.length;
        for(int i=0,j=i+1;i<n && j<n;++i,++j){
            if(a[i]>a[j])
                continue;
            else{
                max-=a[i];
                max+=a[j];
            }
        }
        return max;
    }
}
