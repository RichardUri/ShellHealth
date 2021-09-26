package com.company;

import com.company.Transactions.Prescription;
import com.company.blocks.Block;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    //Cleanup Main. Move blockchain code to its own file.
    public static void main(String[] args) {
        //Changing anything in list1 will change the hashcode entirely.
        String [] list1 = {"Scout", "Rich", "James", "Caro"};

        int hash1 = Arrays.hashCode(list1);
        System.out.println("Hash 1 = " + hash1  );

        //This arraylist will hold all the blocks.
        ArrayList<Block> blockChain = new ArrayList<Block>();

        //Block 1
        String[] initialValues = {"Test", "Prescription"};
        Block genesisBlock = new Block(initialValues, 0);//Genesis block
        blockChain.add(genesisBlock);
        System.out.println("First block is " + genesisBlock.toString());
        System.out.println("The block chain is " + blockChain.toString());


        //testing
        String patientName = ""; //might remove
        String presName = "";
        String description = "";
        String expDate = "";
        String quantity = "";

        Prescription prescription = new Prescription();

        Scanner input = new Scanner(System.in);

        String iData;
        String yOrN;

        int num = 0;
        System.out.println("Do you want to add a prescription? (y or n)");
        yOrN = input.next();

        while(yOrN.equalsIgnoreCase("y")) {

            prescription = new Prescription(patientName, presName,description, expDate, quantity);

            for (int i = 0; i <= 4; i++) {

                switch (i) {
                    case 0:
                        System.out.println("Patient Name: ");
                        patientName = input.next();
                        break;
                    case 1:
                        System.out.println("Prescription Name:");
                        presName = input.next();
                        break;
                    case 2:
                        System.out.println("Description: ");
                        input.nextLine(); //buffer to not consume desc
                        description = input.nextLine();

                        break;
                    case 3:
                        System.out.println("Expiration Date: ");
                        expDate = input.next();
                        break;
                    case 4:
                        System.out.println("Quantity: ");
                        quantity = input.next();
                        break;
                    default:
                        break;
            }
        //make an array of objects to y array[0] = caro array
        }
            prescription = new Prescription(patientName, presName,
                description, expDate, quantity);

            System.out.println("Do you want to add another prescription? (y or n)");
            yOrN = input.next();
    }


        System.out.println(prescription.toString());
        System.out.println(prescription.hashCode());


//        Prescription prescription = new Prescription("Scout", "Adderal",
//            "Take 1 daily.", "12/16/2021", 30);
//        System.out.println(prescription.toString());



    }
}
