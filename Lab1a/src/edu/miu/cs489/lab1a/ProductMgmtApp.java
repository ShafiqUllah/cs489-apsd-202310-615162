package edu.miu.cs489.lab1a;

import edu.miu.cs489.lab1a.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductMgmtApp {

    List<Product> allProductList = new ArrayList();

    public static void main(String[] args) {
        ProductMgmtApp app = new ProductMgmtApp();
        app.createProduct();
        app.printProducts();

    }

    public void createProduct(){
        Product p1 = new Product("3128874119", "Banana", "2023-01-24",
                "124","0.55");
        Product p2 = new Product("3128874119", "Banana", "2023-01-24",
                "124","0.55");
        Product p3 = new Product("3128874119", "Banana", "2023-01-24",
                "124","0.55");

        allProductList.add(p1);
        allProductList.add(p2);
        allProductList.add(p3);

//        System.out.println(allProductList);
    }

    public void printProducts(){
        printInJSON();
        printInXML();
        printInCSV();
    }

    public void printInJSON(){
        System.out.println("--------------------------------");
        System.out.println("Printed in JSON format");
        System.out.println("[");
        for (int i = 0; i < allProductList.size(); i++) {
            System.out.println("{\"productId\": "+ allProductList.get(i).getProductID()+
                    " \"name\":\""+allProductList.get(i).getName()+"\""+
                    " \"dateSupplied\":\""+allProductList.get(i).getDateSupplied()+"\""+
                    " \"quantityInStock\":\""+allProductList.get(i).getQuantityInStock()+"\""+
                    " \"unitPrice\":\""+allProductList.get(i).getUnitPrice()+"\" }");
        }
        System.out.println("]");
    }

    public void printInXML(){
        System.out.println("--------------------------------");
        System.out.println("Printed in XML format");
        System.out.println("<?xml version=\"1.0\"?>");
        System.out.println("<Products>");
        for (int i = 0; i < allProductList.size(); i++) {
            System.out.println("\t<productId>"+allProductList.get(i).getProductID()+"</productId>" +
                    " <name>"+allProductList.get(i).getName()+"</name>" +
                    " <dateSupplied>"+allProductList.get(i).getDateSupplied()+"</dateSupplied>" +
                    " <quantityInStock>"+allProductList.get(i).getQuantityInStock()+"</quantityInStock>" +
                    " <unitPrice>"+allProductList.get(i).getUnitPrice()+"</unitPrice>");
        }
        System.out.println("<\\Products>");
    }

    public void printInCSV(){
        System.out.println("--------------------------------");
        System.out.println("Printed in CSV format");

        for (int i = 0; i < allProductList.size(); i++) {
            System.out.println("" + allProductList.get(i).getProductID() +","+
                    allProductList.get(i).getName() +","+
                    allProductList.get(i).getDateSupplied() +","+
                    allProductList.get(i).getQuantityInStock() +","+
                    allProductList.get(i).getUnitPrice() );
        }
    }
}