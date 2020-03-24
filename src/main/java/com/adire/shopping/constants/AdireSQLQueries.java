package com.adire.shopping.constants;

public class AdireSQLQueries
{
    // Connection
    public static String JDBC_CONNECTION = "jdbc:sqlserver://adire.database.windows.net:1433;" +
            "database=adiredb;user=adireAdmin@adire;password=P4ssw0rd;";

    /* Product Queries
        Possible Queries against Product
     */

    public static String PRODUCT_SQL_DESIGNERS = "SELECT p.ProductCode, p.ProductShortDesc, p.ProductLongDescription," +
            "p.ListPrice,b.BrandDescription , d.DesignerDescription, i.ImageDescription from Product as p, Brand as b," +
            "Designer as d,Image as i where p.ImageCode = i.ImageCode and p.BrandCode = b.BrandCode and  " +
            "d.DesignerCode = p.DesignerCode and p.DesignerCode = ?";

    public static String PRODUCT_SQL_BRAND = "SELECT p.ProductCode, p.ProductShortDesc, p.ProductLongDescription, " +
            "p.ListPrice, p.ImageCode, b.BrandDescription , d.DesignerDescription, i.ImageDescription from Product as p, " +
            "Brand as b, Designer as d, Image as i where p.ImageCode = i.ImageCode and p.BrandCode = b.BrandCode and " +
            "d.DesignerCode = p.DesignerCode and p.BrandCode = ?";


    public static String SINGLE_PRODUCT_SQL = "SELECT p.ProductCode, p.ProductShortDesc, p.ProductLongDescription, p.ListPrice," +
            "p.ListPrice, p.ImageCode, b.BrandDescription , d.DesignerDescription, i.ImageDescription from Product as p, " +
            "Brand as b, Designer as d, Image as i where p.ImageCode = i.ImageCode and p.BrandCode = b.BrandCode and " +
            "d.DesignerCode = p.DesignerCode and p.ProductCode = ?";

    /*   Customer Queries
    *    Possible Queries against Customer orders
    * */

    // Return a specific customer base on its ID
    public static String SINGLE_CUSTOMER_SQL = " SELECT c.FirstName, c.LastName, c.Street,c.City, c.State, c.ZipCode, " +
            "c.Phone, c.Email FROM Customer as c WHERE c.CustomerID = ?";

    // Return All Customers
    public static String All_CUSTOMERS_SQL = "SELECT c.FirstName, c.LastName, c.Street,c.City, c.State, c.ZipCode," +
        "c.Phone, c.Email FROM Customer ";

    // Return a specific customer's order base on its ID
    public static String SINGLE_CUSTOMER_ORDER = " select c.FirstName, c.LastName, p.ProductCode, " +
            "p.ProductLongDescription, o.OrderDate FROM Customer As c, Product As P,[Order] as o" +
            "WHERE c.CustomerID = ?";

    // Return All Customers & their orders
    public static  String  ALL_CUSTOMERS_ORDER_SQL = " select c.FirstName, c.LastName, p.ProductCode, " +
        "p.ProductLongDescription, o.OrderDate FROM Customer As c, Product As P,[Order] as o  " ;

    // Return A Single Customer based on Brand
    public static  String SINGLE_CUSTOMER_ORDER_BRAND_SQL = "select c.FirstName, c.LastName, p.ProductCode," +
            "p.ProductLongDescription, o.OrderDate, b.BrandDescription FROM Customer As c, Product As P,[Order] as o," +
            " brand as b WHERE c.CustomerID = o.CustomerID AND o.ProductID = p.ProductID And p.BrandCode = b.BrandCode " +
            " AND b.BrandID = ? AND c.CustomerID = ?";

    //Return All Customers' Order based on Brand
    public static  String All_CUSTOMERS_ORDER_BRAND_SQL = "select c.FirstName, c.LastName, p.ProductCode," +
            "p.ProductLongDescription, o.OrderDate, b.BrandDescription FROM Customer As c, Product As P,[Order] as o," +
            " brand as b WHERE c.CustomerID = o.CustomerID AND o.ProductID = p.ProductID And p.BrandCode = b.BrandCode " +
            " AND b.BrandID = ?";

    // Return A Single Customer's Order based on Designer
    public static  String SINGLE_CUSTOMER_ORDER_DESIGN_SQL = "select c.FirstName, c.LastName, p.ProductCode," +
            "p.ProductLongDescription, o.OrderDate, b.BrandDescription, d.DesignerDescription FROM Customer As c," +
            "Product As P,[Order] as o, brand as b, Design as d WHERE c.CustomerID = o.CustomerID AND " +
            "o.ProductID = p.ProductID And p.BrandCode = b.BrandCode AND d.DesignerID = ? AND c.CustomerID = ?";

    //Return All Customers' Order based on Designer
    public static  String ALL_CUSTOMERS_ORDER_DESIGNER_SQL = "select c.FirstName, c.LastName, p.ProductCode,p.ProductLongDescription," +
        "o.OrderDate, b.BrandDescription, d.DesignerDescription FROM Customer As c, Product As P,[Order] " +
            "as o,brand as b, designer as d WHERE c.CustomerID = o.CustomerID AND o.ProductID = p.ProductID " +
            "And p.BrandCode = b.BrandCode AND p.DesignerCode = d.DesignerCode";



}

