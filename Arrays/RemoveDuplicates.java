class RemoveDuplicates {
    public int removeDuplicates(int[] nums) { //two pointer solution.
        int j=0,i=1;
        while(i<nums.length){
            if(nums[i]!=nums[j]){
                //replaces all duplicates with following elements.
                nums[++j]=nums[i];
            }
            i++;
        }
        return j+1;
    }
}
