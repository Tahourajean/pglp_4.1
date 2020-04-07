/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq;

/**
 *
 * @author USER
 */
public class test {
    public static void main(String args[])
    {
        Personnel p;
        p = new Personnel.Builder("Simporé","Naimatou")
                .ajouterTelephone(new Telephone("75221521","0751548227" ,"72556688")).build();
        p.toString();
   
    }   
}
