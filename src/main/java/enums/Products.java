package enums;

/**
 * Created by Alex on 20.02.2017.
 */
public enum Products {

    PCG_AUTO ("PCD Auto"),
    PCG_HOME ("PCD Home"),
    PCG_FLOOD ("PCD Flood");

    String productName;

    Products (String productName){
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
}
