
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class GameQUIZ {
    static String Question [] ={"how old is Nigeria","what is capital of Abuja","what is your name","where you are from","what is the name of your pesident","what is the course your taking","when is the semester ending","what is your ca score","what is the size of your shoe","who is your freind"};
    static String answer [] ={"57","FCT","Aisha","Nassarawa","General Muhammad Buhari","Java2","12thapril","30","40","Maryam"};
    static Random myRandom = new Random();
    static Scanner myInput = new Scanner (System.in);
    static int userchoice;
    private static String answ;

    public static void main(String[] args){
        System.out.println("select a number betweeb 0-9");
        userchoice= myInput.nextInt();
        if(userchoice >0)
        {
            System.out.println(Question[userchoice]);
            answer = myInput.next();
            
        }
        if (answer.equals(answer[userchoice]))
        {
            System.out.println("1 Mark");
        }
        else
        {
            System.out.println("Incorrect");
        }
    }
}
        
            
            
            
            
            
        }
    }
}

