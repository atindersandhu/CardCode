/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author 991629194
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        
        Card atinderPalSingh = new Card("Spade", 7);
         System.out.println(atinderPalSingh.getSuit() + " " + atinderPalSingh.getValue());
    }
}
