package domain;

public class Buyer extends Person {
    public Buyer(String name) {
        
    }

    @Override
    public ProductMenu createProductMenu(int productType) {
        
        
    }


    @Override
    public void showProductMenu() {
        System.out.println("-------Bridge Pattern---------");

        productMenu.showMenuButtons();
        productMenu.showViewButtons();
        productMenu.showRadioButtons();
        productMenu.showComboBoxes();
        productMenu.showLabel();
    }
}
