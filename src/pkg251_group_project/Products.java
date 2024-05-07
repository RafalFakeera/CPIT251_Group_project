/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg251_group_project;

/**
 *
 * @author alhas
 */
import java.util.List;

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

    public void setproductId(int id) {
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

