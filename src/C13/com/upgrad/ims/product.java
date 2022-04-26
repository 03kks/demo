package C13.com.upgrad.ims;

public class product {
    int id;
     String name;
    String category;
    float price;
    boolean active;


    //method
    public void printNameAndCategory(){
        System.out.println("Name is : " +name+
                " Category is "
                + category);

    }
    public  void  deactivate(){
        active= false;
    }
}
