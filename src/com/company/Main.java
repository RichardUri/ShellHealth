package com.company;

import com.company.Transactions.Prescription;
import com.company.Transactions.SmartContract;
import com.company.blocks.Block;

import java.util.ArrayList;
import java.util.Scanner;


/*
* Authors:
* Richard Uriarte
* Amanda "Scout" Chacin-Livinalli
* Carolina Valenzuela
* James Lam
 */
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
        String patientName = null;
        String presName = null;
        String description = null;
        String expDate = null;
        String quantity = null;
        int prevBlockTracker = 0;
        int pointer = 0;


        System.out.println("Would you like to manually add a prescription? (y or n)");
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
            //As long as the pointer is not larger 15 code will run
            for(int row = pointer; row < patientTransactions.length; row++){
                for(int col = 0; col < patientTransactions[row].length; col++){
                    patientTransactions[row][col] = prescription;
                    SmartContract.set(patientTransactions, prescription, row, col);
                    SmartContract.get(patientTransactions);
                    //System.out.println("PATIENT INFO: " + patientTransactions[row][col]); //Test
                    break;
                }
                pointer++;
                break;
            }

            Block newBlock = new Block(prescription, blockChain.get(prevBlockTracker).getBlockHash());  //Creates Block
            blockChain.add(newBlock);   //Adds Block to Chain
            prevBlockTracker++;

            System.out.println("Would you like to add another prescription? (y or n)");
            userChoice = input.next();
        }


        //print out auto generated prescriptions after user says no.
        for(int i = blockChain.size(); i < 15; i++){
            prescription = new Prescription(prescription.randPatient(), prescription.randPres(),
                prescription.randDesc(), prescription.randExp(), prescription.randQty());

            transactions.add(prescription);

            for(int row = pointer; row < patientTransactions.length; row++){
                for(int col = 0; col < patientTransactions[row].length; col++){
                    patientTransactions[row][col] = prescription;
                    break;
                }
                pointer++;
                break;
            }

            Block newBlock = new Block(prescription, blockChain.get(prevBlockTracker).getBlockHash());  //Creates Block
            blockChain.add(newBlock);   //Adds Block to Chain
            prevBlockTracker++;
        }

        System.out.println("\nThe block chain is " + blockChain);
    }
}
