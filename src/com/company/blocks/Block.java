package com.company.blocks;

import com.company.Transactions.Prescription;
import java.util.Arrays;
import java.util.Objects;

/*
* Insert Desc
*/
public class Block {
    private Prescription transactions;  //Change string to prescription/transaction
    private int blockHash;
    private int previousBlockHash;


    //CONSTRUCTOR
    //Change string to take Perscription. Objects.hashCode NOT Arrays.hashCode
    public Block(Prescription transactions, int previousBlockHash) {
        this.transactions = transactions;
        this.previousBlockHash = previousBlockHash;
        this.blockHash = Arrays.hashCode(new int[] {Objects.hashCode(transactions), this.previousBlockHash});
    }


    //Setters
    public void setTransactions(Prescription transactions) {
        this.transactions = transactions;
    }

    public void setBlockHash(int blockHash) {
        this.blockHash = blockHash;
    }

    public void setpreviousBlockHash(int previousBlockHash) {
        this.previousBlockHash = previousBlockHash;
    }


    //Getters
    public Prescription getTransactions() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }

    public int getpreviousBlockHash() {
        return previousBlockHash;
    }


    //Will need to change
    @Override
    public String toString() {
        return "\nBlock {" +
                "transactions = " + transactions.toString() +//Arrays.toString(transactions) +
                ", \nblockHash=" + blockHash +
                ", \npreviousBlockHash=" + previousBlockHash +
                "\n}\n";

    }
}
