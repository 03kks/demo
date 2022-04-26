package C13.com.upgrad.ims;

public class myApp {
    public static void main(String[] args) {

        product maggi = new product();
        maggi.id=1;
        maggi.category="food";
        maggi.name="maggi";
        maggi.active=true;

        maggi.printNameAndCategory();

    }
}
