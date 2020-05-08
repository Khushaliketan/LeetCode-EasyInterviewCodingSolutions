class MoveZeros {
    public void moveZeroes(int[] a) {
        int n=a.length;
        for(int i=0,j=n-1;i<j;++i){
            if(a[i]==0){
                for(int k=i;k<j;++k){
                    a[k]=a[k+1];
                }
                a[j]=0;
                --j;
                --i;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
