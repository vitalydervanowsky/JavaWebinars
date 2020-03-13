package by.dzrvnsk;

public class Webinar1 {
    public static void main(String[] args) {
        String s = "asd?hjk#kljgdlg? dfgkj #fd?fgd #";
        System.out.println(s);
        s = s.replaceAll("#", "");
        s = s.replaceAll("\\?", "HELLO");
        System.out.println(s);
    }
}
