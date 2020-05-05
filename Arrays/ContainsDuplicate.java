class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>(Arrays.stream(nums).mapToObj(e -> (int) e).collect(Collectors.toSet()));
        //System.out.println(set);
        if(set.size()!=nums.length)
            return true;
        else
            return false;
    }
}
