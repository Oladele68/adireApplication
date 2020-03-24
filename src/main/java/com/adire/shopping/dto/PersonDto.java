package com.adire.shopping.dto;

public class PersonDto
{
    private String Name;
    private String LastName;
    private String Email;
    private String Phone;


    PersonDto()
    {
        String nameIn = "";
        String lastNameIn = "";
        String emailIn = "";
        String phoneIn = "";

        this.Name = nameIn;
        this.LastName = lastNameIn;
        this.Email = emailIn;
        this.Phone = phoneIn;

    }


    PersonDto(String nameIn, String lastNameIn, String email, String phoneIn)
    {
        Name = nameIn;
        LastName = lastNameIn;
        Email = email;
        Phone = phoneIn;

    }

    public void setName(String nameIn)
    {
        Name = nameIn;
    }

    public String getName()
    {
        return Name;
    }
    public void setLastName(String nameIn)
    {
        LastName = nameIn;
    }

    public String getLastName()
    {
        return LastName;
    }
    public void setEmail(String email)
    {
        Email = email;
    }

    public String getEmail()
    {
        return Email;
    }
    public void setPhone(String phone)
    {
        Phone = phone;
    }

    public String getPhone()
    {
        return Phone;
    }

}
