class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s=s.trim();
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        System.out.println(s);
        for(int i=0,j=s.length()-1;i<=j;++i,--j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
        }
        return true;
    }
}
