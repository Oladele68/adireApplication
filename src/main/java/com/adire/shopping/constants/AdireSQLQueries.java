package com.adire.shopping.constants;

public class AdireSQLQueries
{
    public static String JDBC_CONNECTION = "jdbc:sqlserver://adire.database.windows.net:1433;" +
            "database=adiredb;user=adireAdmin@adire;password=P4ssw0rd;";

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

    public static  String  ALL_CUSTOMER_ORDERS_SQL = "select o.OrderID, c.CustomerID, c.FirstName, c.LastName, o.StoreID, o.DeliveryDate," +
            "o.TotalAmount, c.Street, c.City, c.State, c.ZipCode, c.Phone, c.Email, os.OrderStatusDescription from Orders as o, OrderStatus as os, Customer as c , OrderItems as oi where  " +
            "o.OrderStatusID = os.OrderStatusID and o.OrderID = oi.OrderID and o.customerID = ?";



}

