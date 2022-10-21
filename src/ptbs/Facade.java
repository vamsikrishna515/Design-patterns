package ptbs;

import domain.Trading;
import domain.Product;
import domain.NodeVisitor;
import domain.Person;
import domain.Buyer;
import domain.VisitableItem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Date;


public class Facade implements VisitableItem {

    private Integer userType = null;
    private Product selectedProduct = null;
    private Integer theSelectedProduct = null;
    private ProductList productList = new ProductList();
    private Person currentUser = null;
    private DataManager dataManager = null;

    Scanner sc= new Scanner(System.in); //System.in is a standard input stream
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Facade() {
        dataManager = new DataManager();
        createProductList();
    }


    ProductList getProducts() {
        return productList;
    }

    public  void login(String name, String password) throws Exception {
       
        System.out.println("Implementation using Facade Pattern");
    }

    void addTrading(Product product, Trading trading) {

    }

    void gradeOffering(Offering offering) {

    }

    void submitOffering(Offering offering) {

    }

    void reportOffering(Offering offering) {

    }

    void displayMenu() {
        
    }

    int selectProductLevel() {

    }

    private Person createUser(String name) throws Exception {
       
    }

    private void createProductList() {
        
    }

    void attachProductToUser(Person person) throws Exception {
        
    }

    Product selectProduct() {
        System.out.println("Implementation using Iterator Pattern");
        }

       
    }

    void productOperation() {
       
    }

    void showProductMenuCreated() {
        
    }

    void remind() {
        
    }

    @Override
    public void accept(NodeVisitor visitor) {
        System.out.println("Implementation using Iterator Pattern");
    
    }
}


class Offering{ }