package com.company.blocks;

import java.util.Arrays;

public class Block {
    private String[] transactions;
    private int blockHash;
    private int previousBlockHash;


    //Constructor
    public Block(String[] transactions, int previousBlockHash) {
        //super();
        this.transactions = transactions;
        this.previousBlockHash = previousBlockHash;
        this.blockHash = Arrays.hashCode(new int[] {Arrays.hashCode(transactions), this.previousBlockHash});
    }

    //Setters
    public void setTransactions(String[] transactions) {
        this.transactions = transactions;
    }

    public void setBlockHash(int blockHash) {
        this.blockHash = blockHash;
    }

    public void setpreviousBlockHash(int previousBlockHash) {
        this.previousBlockHash = previousBlockHash;
    }

    //Getters
    public String[] getTransactions() {
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
        return "Block{" +
                "transactions=" + Arrays.toString(transactions) +
                ", blockHash=" + blockHash +
                ", previousBlockHash=" + previousBlockHash +
                "}\n";

    }
}
