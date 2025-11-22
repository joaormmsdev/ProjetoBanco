public class AFuncaoStringpp {
    public static void main(String[] args) throws Exception {
        String original = "abcde FGHIJ ABC abc DEFG  ";
        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String s3 = original.trim();
        String s4 = original.substring(2);
        String s5 = original.substring(2,9);
        String s6 = original.replace('a', 'x');
   
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    
    }
}
