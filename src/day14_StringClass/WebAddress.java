package day14_StringClass;

public class WebAddress {

    public static void main(String[] args) {
        String website = "WWW.cybertek.Gov";
        website = website.toLowerCase();
        boolean validEnding=website.endsWith(".com")|| website.endsWith(".edu")|| website.endsWith(".gov");
        if (website.startsWith("www.")&& validEnding) {
            System.out.println("Valid addres");
        }else{
            System.out.println("Invalid Adress");
        }
    }
}
