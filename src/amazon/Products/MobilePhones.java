package amazon.Products;

public class MobilePhones extends AbstractProduct {


    public MobilePhones(String ID, float price, String Title, String Description, String number) {
        super(ID, price, Title, Description);
    }

    public void call(String number){
        System.out.println("ringing... " + number);
    }
}
