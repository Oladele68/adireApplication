package com.adire.shopping.constants;

public class AdireSQLQueries
{

    public static String PRODUCT_SQL_DESIGNERS = "SELECT p.ProductName, p.ProductLongDescription, p.ListPrice," +
            "b.BrandDescription , d.DesignerName, i.ImageName from Product as p, Brand as b, Designer as d, " +
            " Image as i where p.ImageCode = i.ImageCode and p.BrandCode = b.BrandCode, " +
            "d.DesignerCode = p.DesignerCode where p.DesignerCode = ?";

    public static String PRODUCT_SQL_BRAND = "SELECT p.ProductCode, p.ProductShortDesc, p.ProductLongDescription, " +
            "p.ListPrice, p.ImageCode, b.BrandDescription , d.DesignerName, i.ImageName from Product as p, " +
            "Brand as b, Designer as d, Image as i where p.ImageCode = i.ImageCode and p.BrandCode = b.BrandCode," +
            "d.DesignerCode = p.DesignerCode where p.BrandCode = ?";


    public static String SINGLE_PRODUCT_SQL = "SELECT ProductCode, ProductShortDesc, ProductLongDescription, ListPrice, ImageCode" +
            "BrandCode, DesignerCode FROM Product WHERE ProductCode = ?";


    public static String JDBC_CONNECTION = "jdbc:sqlserver://adire.database.windows.net:1433;" +
            "database=adireShoppingDatabase;user=adireAdmin@adire;password=P4ssw0rd;" +
            "encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";


}

