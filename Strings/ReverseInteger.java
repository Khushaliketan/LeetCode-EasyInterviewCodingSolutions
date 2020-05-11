import java.util.Scanner;
class ReverseInteger {
    public int reverse(int x) {
        StringBuilder s=new StringBuilder(Integer.toString(x));
        if(s.length()==1)
            return(Integer.parseInt(s.toString()));
        if(s.charAt(0)=='-'){
            s.deleteCharAt(0);
            s.append("-");
            if(s.charAt(s.length()-1)=='0'){
                s.deleteCharAt(s.length()-1);
            }
        }
        s.reverse();
        //System.out.println(s);
        if(s.charAt(0)=='0')
            s.deleteCharAt(0);
        
        try{
            return(Integer.parseInt(s.toString()));
        }
        catch(Exception e){
        return 0;
        }
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      System.out.println(reverse(x));
    }
}
