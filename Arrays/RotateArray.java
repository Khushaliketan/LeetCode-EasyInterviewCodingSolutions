class RotateArray {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] a=new int[n];
        if(k>n)
            k%=n;
        for(int i=0;i<n;++i){
            a[i]=nums[(i+n-k)%n];
        }
        //System.out.println(Arrays.toString(a));
        System.arraycopy(a,0,nums,0,n);
    }
}
