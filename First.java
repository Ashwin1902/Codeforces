import java.util.HashSet;

public class First {
    public static void main(String[] args) {
       // System.out.println("hello world");
        lastNonEmptyString("aabcbbca");
    }
    public static String lastNonEmptyString(String s) {
        StringBuilder str=new StringBuilder(s);
        StringBuilder res=new StringBuilder(s);
        while(!str.isEmpty()){
            HashSet<Character> h=new HashSet<>();
            res=new StringBuilder(str.toString());
            for(int i=0;i<str.length();i++){
                char x=str.charAt(i);
                if(!h.contains(x)){
                    h.add(x);
                    str.deleteCharAt(i);
                    System.out.println(str);
                }
            }

        }
        return res.toString();
    }
}
