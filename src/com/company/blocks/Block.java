package com.company.blocks;

import com.company.Transactions.Prescription;
import java.util.Arrays;
import java.util.Objects;

/*
* The Block class will create a Block object using a given Prescription object and the hashcode
* from the previous block in the blockChain in order to create a unique hashcode.
*/
public class Block {
    private Prescription transactions;  //Change string to prescription/transaction
    private int blockHash;
    private int previousBlockHash;


    //CONSTRUCTOR
    public Block(Prescription transactions, int previousBlockHash) {
        this.transactions = transactions;
        this.previousBlockHash = previousBlockHash;
        this.blockHash = Arrays.hashCode(new int[] {Objects.hashCode(transactions), this.previousBlockHash});
    }


    //SETTERS
    public void setTransactions(Prescription transactions) {
        this.transactions = transactions;
    }

    public void setBlockHash(int blockHash) {
        this.blockHash = blockHash;
    }

    public void setpreviousBlockHash(int previousBlockHash) {
        this.previousBlockHash = previousBlockHash;
    }


    //GETTERS
    public Prescription getTransactions() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }

    public int getpreviousBlockHash() {
        return previousBlockHash;
    }


    @Override
    public String toString() {
        return "\nBlock {" +
                "transactions = " + transactions.toString() +//Arrays.toString(transactions) +
                ", \nblockHash=" + blockHash +
                ", \npreviousBlockHash=" + previousBlockHash +
                "\n}\n";

    }
}
