package com.creatio.crm.language.basics;

public class DataTypes {

	public static void main(String[] args) {
		//defining the degree using float datatype
	   float degree = 25.5f;
	   //printing the degree in celsius
       System.out.println("The temperature of the degree in a celsius is:" +degree + "°C");
       boolean order = true;
       System.out.println("customer has placed an order:" +order);
       String PhoneNumber = "123-456-7890";
       System.out.println("Person Phone's Number:" +PhoneNumber);
       float money = 1000.50f;
       System.out.println("Person Phone's Number:" +money);
       char blood = 'A';
       System.out.printf("Person Blood Type:%c%n",blood);
       String mail = "john.doe@example.com";
       System.out.printf("Person email address:%s%n",mail);
       char blood1 = 'A';
       System.out.printf("Person Blood Type:%c%n",blood1);
	}

}