package com.company.Transactions;
//Implementation of "smart contract"-based idea
//Stores individual patients' transactions into unique accessible "ledgers"
//Ledgers work as "public"-accessible for prototype purposes
//Further work: generating keys for "private" ledger access

public class SmartContract {

//Contract Set
public static void set(Prescription[][] a, Prescription x, int row, int col)
{
    a[row][col] = x;
}
        
//Contract Get 
public static Prescription[][] get(Prescription[][] a)
{
    return a;
}

}      

        
