package enums;

/**
 * Created by Alex on 20.02.2017.
 */
public class PolicyUtil {

    public static void issuePolicy (Products product){
        System.out.println("Issue a " + product.getProductName());
    }
}
