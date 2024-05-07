
package pkg251_group_project;

public class Products {
    private String productName;
    private int productId;
    private int productPrice;
    private String productDescription;

    public Products(int productId, String productName, int productPrice, String productDescription) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
    }

    public int getproductId() {
        return productId;
    }

    public void setproductId(int productId) {
        this.productId = productId;
    }

    public String getproductName() {
        return productName;
    }

    public void setproductName(String productName) {
        this.productName = productName;
    }

    public int getproductPrice() {
        return productPrice;
    }
    
    public void setproductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getproductDescription() {
        return productDescription;
    }

    public void setproductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

}

