package com.company.blocks;

import com.company.Transactions.Prescription;
import java.util.ArrayList;

/*
* The BlockChain class will receive a Prescription object and then genesisBlock (First Block)
* in order to start the blockChain. This will link all blocks made to previous blocks.
*/

public class BlockChain {

    private ArrayList<Block> blockChain = new ArrayList<Block>();
    private Prescription initialValues;
    private Block genesisBlock;//Genesis block (First Block)


    //CONSTRUCTOR
    public BlockChain(Prescription initialValues, Block genesisBlock) {
        this.initialValues = initialValues;
        this.genesisBlock = new Block(initialValues, 0);
    }


    //GETTERS
    public ArrayList<Block> getBlockChain() {
        return blockChain;
    }

    public Prescription getInitialValues() {
        return initialValues;
    }

    public Block getGenesisBlock() {
        return genesisBlock;
    }


    //SETTERS
    public void setBlockChain(ArrayList<Block> blockChain) {
        this.blockChain = blockChain;
    }

    public void setInitialValues(Prescription initialValues) {
        this.initialValues = initialValues;
    }

    public void setGenesisBlock(Block genesisBlock) {
        this.genesisBlock = genesisBlock;
    }
}
