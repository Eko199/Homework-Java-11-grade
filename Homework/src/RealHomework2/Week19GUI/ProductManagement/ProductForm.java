package RealHomework2.Week19GUI.ProductManagement;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductForm extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton addToListButton;
    private JButton averagePriceButton;
    private JButton showProductsButton;
    private JButton sortProductsButton;
    private JList list;
    private JPanel mainPanel;
    private JPanel productDetails;
    private ListOfProducts listOfProducts;

    public ProductForm() {
        super("Product Form");
        setContentPane(mainPanel);
        listOfProducts = new ListOfProducts();

        addToListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Product p = new Product(listOfProducts.toArray().length,
                            textField1.getText(), Double.parseDouble(textField2.getText()));
                    listOfProducts.addProduct(p);
                    textField1.setText("");
                    textField2.setText("");
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(addToListButton, "Please enter valid product details.");
                }
            }
        });

        sortProductsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listOfProducts.sortByPrice();
            }
        });

        showProductsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.setListData(listOfProducts.toArray());
            }
        });

        averagePriceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!Double.isNaN(listOfProducts.averagePrice()))
                    list.setListData(new Double[] {listOfProducts.averagePrice()});
                else
                    JOptionPane.showMessageDialog(averagePriceButton, "No products have been entered.");
            }
        });
    }

    public static void main(String[] args) {
        ProductForm productForm = new ProductForm();
        productForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        productForm.setSize( 400, 300 );
        productForm.setVisible(true);
    }
}
