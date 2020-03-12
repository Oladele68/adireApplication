package com.adire.shopping.constants;

public class AdireSQLQueries {

    public static String PRODUCT_SQL_DESIGNERS = "SELECT p.ProductName, p.ProductDescription, p.ListPrice, p.ModelYear, " +
            "b.BrandDescription , d.DesignerName, i.ImageName from Product as p, Brand as b, Designer as d, " +
            " Image as i where p.ImageID = i.ImageID and p.BrandID = b.BrandID " +
            "d.DesignerID = p.DesignerID where p.DesignerCode = ?";
}

