class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char[] c1=s.toCharArray();
        Arrays.sort(c1);
        char[] c2=t.toCharArray();
        Arrays.sort(c2);
        s=Arrays.toString(c1);
        t=Arrays.toString(c2);
        System.out.println(s+" "+t);
        return(s.equals(t));
    }
}
