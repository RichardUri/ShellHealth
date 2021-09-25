package com.company;

import com.company.blocks.Block;

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
    }
}
