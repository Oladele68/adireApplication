package com.adire.shopping.entities;

public class Designer
{
	//
	private int DesignerID;
	private String DesignerName;
	private String DesignerType;
	
	//
	public int OrderAndStyleID;
	public int ProductID;
	
	
	// 
	Product p;
	
	//
	Designer()
	{
		int designerid = 0;
		String name = "";
		String type = "";
		
		DesignerID = designerid;
		DesignerName = name;
		DesignerType = type;
		ProductID = p.getProductID();
	}
	
	Designer (int id, String name, String type)
	{
		DesignerID = id;
		DesignerName = name;
		DesignerType = type;
		ProductID = p.getProductID();
		
	}


	public int getDesignerID() {
		return DesignerID;
	}


	public void setDesignerID(int designerID) {
		DesignerID = designerID;
	}


	public String getDesignerName() {
		return DesignerName;
	}


	public void setDesignerName(String designerName) {
		DesignerName = designerName;
	}


	public String getDesignerType() {
		return DesignerType;
	}


	public void setDesignerType(String designerType) {
		DesignerType = designerType;
	}

}
