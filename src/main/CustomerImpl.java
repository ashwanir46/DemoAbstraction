package main;

import data.Customer;

public class CustomerImpl {
    public static void main(String[] args) {
        //creating object for parameterized constructor
        Customer object1 = new Customer("Ashwani", 85647123, "ashwanir41@gmail.com", "Dhampur", true);
        //creating object for non-parameterized constructor
        Customer object2 = new Customer();
        //display Attribute value

        System.out.println("Print attribute value for the object1 parameterized constructor \n ");
        object1.displayCustomer();

        System.out.println("Print attribute value for the object2 non-parameterized constructor \n ");
        object2.displayCustomer();

        System.out.println("Print attribute value for the getter and getter method \n");
        object2.setName("tom");
        System.out.println("object2.getName() = " + object2.getName());
        object2.setPhoneNumber(875324163);
        System.out.println("object2.getPhoneNumber() = " + object2.getPhoneNumber());
        object2.setEmailId("tom123@gmail.com");
        System.out.println("object2.getEmailId() = " + object2.getEmailId());
        object2.setAddress("India");
        System.out.println("object2.getAddress() = " + object2.getAddress());
        object2.setPremiumMember(false);
        System.out.println("object2.isPremiumMember() = " + object2.isPremiumMember());

        System.out.println("Print change there reference object1 will display the value of object2 and object 2 will display the value of object1\n");
        // using swapping the object of the class
        Customer tempObject = new Customer();
        tempObject = object1;
        object1 = object2;
        object1.displayCustomer();
        object2 = tempObject;
        System.out.println();
        object2.displayCustomer();
    }

}
