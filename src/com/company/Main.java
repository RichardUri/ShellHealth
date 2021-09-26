package com.company;

import com.company.Transactions.Prescription;
import com.company.blocks.Block;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Prescription prescription = new Prescription();
        ArrayList<Block> blockChain = new ArrayList<Block>();
        ArrayList<Prescription> transactions = new ArrayList<Prescription>();
        Prescription[][] patientTransactions = new Prescription[10][10];

        //Genesis Block Code
        Block genesisBlock = new Block(prescription, 0);//First block
        blockChain.add(genesisBlock);

        String userChoice;
        //Set Placeholder strings inside the prescription vars? or keep as null?
        String patientName = null;
        String presName = null;
        String description = null;
        String expDate = null;
        String quantity = null;
        int prevBlockTracker = 0;
        int pointer = 0;


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
            transactions.add(prescription); //Contains arrayList of transactions.

            //Code to insert User prescription in first Column of each row.
            //Potentially turn into a method using POINTER as a param.
            //As long as the pointer is not larger 15 code will run
            for(int row = pointer; row < patientTransactions.length; row++){
                for(int col = 0; col < patientTransactions[row].length; col++){
                    patientTransactions[row][col] = prescription;
                    //System.out.println("PATIENT INFO: " + patientTransactions[row][col]); //Test
                    break;
                }
                pointer++;
                break;
            }

            Block newBlock = new Block(prescription, blockChain.get(prevBlockTracker).hashCode());  //Creates Block
            blockChain.add(newBlock);   //Adds Block to Chain
            prevBlockTracker++;         //PREVBLOCK TRACKER NOT WORKING AS INTENDED. FIGURE OUT WHY HASHCODE IS GNOT WORKING.

            System.out.println("Do you want to add another prescription? (y or n)");
            userChoice = input.next();
        }//Create automated presciptions upon user saying no

        System.out.println(prescription + "\n");
        System.out.println("The block chain is " + blockChain);
    }
}
