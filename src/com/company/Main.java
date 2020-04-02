package com.company;

public class Main {

    public static void main(String[] args) {

        Product rice = new Product("Rice",4.00,"01", 20);
        Product bread = new Product("White Bread", 2.50, "02",15);
        Product orangeJuice = new Product("Orange Juice",1.50,"03",9);

        User user1;
        user1 = new User("John", "Johnson", "jj22@hotmail.com","jj22");
        if (user1.getUserAccount() == true){
            System.out.println("user 1 is Logged into user account");
        }else{
            System.out.println("user 1 is Using guest account");
        }

        User user2;
        user2 = new User("randy.andy@aol.com");
        user2.newAccountGuest("Andrew", "Ranson", "andyrandy");

        User user3;
        user2 = new User("dimbsunn");

        rice.setPrice(3.50);
        orangeJuice.setAmount(5);


    }
}