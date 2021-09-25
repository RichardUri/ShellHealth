package com.company.blocks;

import java.util.ArrayList;
import java.util.Arrays;

public class BlockChain {

    //Contains all blocks
    private ArrayList<Block> blockChain = new ArrayList<Block>();
    private String[] initialValues;// = {"Prescription", "Test"};//Change to match perscription / transaction
    private Block genesisBlock;// = new Block(initialValues, 0);//Genesis block

    //CONSTRUCTOR
    public BlockChain(String[] initialValues, Block genesisBlock) {
        //this.blockChain = blockChain;
        this.initialValues = initialValues; //Set manually or have user set?
        this.genesisBlock = new Block(initialValues, 0);
    }


    //Adding a Block to the BlockChain. Helper method? Use recursively?
    public void addBlockToChain(Block blockToAdd){
        blockChain.add(blockToAdd);
    }


    //GETTERS
    public ArrayList<Block> getBlockChain() {
        return blockChain;
    }

    public String[] getInitialValues() {
        return initialValues;
    }

    public Block getGenesisBlock() {
        return genesisBlock;
    }


    //SETTERS
    public void setBlockChain(ArrayList<Block> blockChain) {
        this.blockChain = blockChain;
    }

    public void setInitialValues(String[] initialValues) {
        this.initialValues = initialValues;
    }

    public void setGenesisBlock(Block genesisBlock) {
        this.genesisBlock = genesisBlock;
    }
}
