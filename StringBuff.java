public class StringBuff {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("shahbaz");
        System.out.println(sb); 
        sb.append(" Khan");
        System.out.println(sb);
        System.out.println(sb.indexOf("a"));
        String s = "shahbaz";
        System.out.println(s.indexOf('a'));
    }
}
