package com.company;

import com.company.Transactions.Prescription;
import com.company.blocks.Block;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //Cleanup Main. Move blockchain code to its own file.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Prescription prescription = new Prescription();
        ArrayList<Block> blockChain = new ArrayList<Block>();

        //String iData;
        String userChoice;
        //Set Placeholder strings inside the prescription vars? or keep as null?
        String patientName = null; //might remove
        String presName = null;
        String description = null;
        String expDate = null;
        String quantity = null;
        int prevBlockTracker = 0;

        //Genesis Block Code
        Block genesisBlock = new Block(prescription, 0);//First block
        blockChain.add(genesisBlock);
//        System.out.println("First block is " + genesisBlock);

        System.out.println("Do you want to manually add a prescription? (y or n)");
        userChoice = input.next();

        while(userChoice.equalsIgnoreCase("y")) {
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
            }

            prescription = new Prescription(patientName, presName, description, expDate, quantity);
            Block newBlock = new Block(prescription, blockChain.get(prevBlockTracker).hashCode());  //Creates Block
            blockChain.add(newBlock);   //Adds Block to Chain

            System.out.println("Do you want to add another prescription? (y or n)");
            userChoice = input.next();
        }//Create automated presciptions upon user saying no

        System.out.println(prescription + "\n");
        System.out.println("The block chain is " + blockChain);
    }
}
