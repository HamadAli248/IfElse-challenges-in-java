package com.hamad;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

//    Challenge 1:
//    Create a variable called password.
//    Check how many letters are in the password,
//    if there are less than 8 log to the console that the password is too short. Otherwise log the password to the console.
//    -----------------------------------------------------------------------------------------------------------------


public class Main {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        String Password = "";

        System.out.println("Please type your password(Can not be less than 8 characters: ");
        Password = Scanner.next();
        while(Password.length() < 8) {
            System.out.println("Your Password is too Short Please type your password(Can not be less than 8 characters: ");
            Password = Scanner.next();
        }
        {
            System.out.println(Password);
        }


    }
}


//    --------------------------------------------------------------------------------------------------------------------
//
//    Challenge 2:
//    Create a variable called num.
//    Check if the variable is divisible by 3 or 5.
//    If it is log “This number is divisible by 3 or 5” to the console.
//    Otherwise log “This number is not divisible by 3 or 5”.
//    -----------------------------------------------------------------------------------------------------------------


public class Main {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.println("Number: ");
        int Number = Scanner.nextInt();

        if (Number % 5 == 0 || Number % 3 == 0) {
            System.out.println("This number is divisible by 3 or 5");
        } else {
            System.out.println("This number is not divisible by 3 or 5");

        }
    }
}





//    ---------------------------------------------------------------------------------------------------------------
//
//    Challenge 3:
//    Create a variable called num.
//    If num is divisible by 3 log “fizz” to the console,
//     if it’s divisible by 5 log “buzz” to the console,
//      if it’s divisible by both 3 and 5 log “fizz buzz” to the console. Otherwise log num to the console.
//    ----------------------------------------------------------------------------------------------------------------



public class Main {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.println("Number: ");
        int Number = Scanner.nextInt();

        if (Number % 5 == 0 && Number % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (Number % 5 == 0) {
            System.out.println("Fizz");
        } else if (Number % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(Number);
        }
    }
}



//    -------------------------------------------------------------------------------------------------------------------
//    Challenge 4:
//    Create a variable called num. Check if the number is a palindrome
//     (looks the same forward as it does backwards e.g. 1001 or 20202).
//    -------------------------------------------------------------------------------------------------------------------


class Main {
    public static void main(String args[]) {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }
}





//    ---------------------------------------------------------------------------------------------------------------------
//    Challenge 5:
//    Create a variable called time, a variable called placeOfWork and a variable called townOfHome.Create an
//    if statement that logs to the console where someone is at times of the day. E.g. if the time is 7 I’m at home,
//    at 8 I’m commuting, at 9 I’m at work.
//    -------------------------------------------------------------------------------------------------------------------


public class Main {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        int whereAmI = 0;

        System.out.println("What time is it?");
        whereAmI = Scanner.nextInt();

        if (whereAmI >= 700 && whereAmI < 800) {
            System.out.println("I am at home");
        }else if (whereAmI >= 800 && whereAmI < 900  ){
            System.out.println("I’m commuting");
        }else if(whereAmI >=900){
            System.out.println("I am at work");
        }
    }
}





//    -------------------------------------------------------------------------------------------------------------------
//    Challenge 6:
//    Take the string
//      “jrfndklhgfndjkjlkgperfijfhdknsadcvjhiiohjfkledsopiuhgtyujwsdxcvhgfdjhiopiwquhejkdsoiufghedjwshi”.
//    Find the index of the last vowel in the string.
//    -------------------------------------------------------------------------------------------------------------------

public class Main {

    public static void main(String[] args) {

        String myString="jrfndklhgfndjkjlkgperfijfhdknsadcvjhiiohjfkledsopiuhgtyujwsdxcvhgfdjhiopiwquhejkdsoiufghedjwshi";
        String reversedLongString= myString.reverse();
        int lastVowelIndex = 0;
        int numberofVowel = 0;

        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(myString);

        // reverse StringBuilder input1
        input1 = input1.reverse();

        // print reversed String
        System.out.println(input1);

        for(i  0; i < reversedLongString.length; i++)
            if ( reversedLongString[i]=="a" || reversedLongString[i]=="e" ||
                    reversedLongString[i]=="i" || reversedLongString[i]=="o"||
                    reversedLongString[i]=="u" )

            {
                int  numberofVowel = i;
                lastVowelIndex = longString.length - numberofVowel;
                console.log(lastVowelIndex);
                console.log(longString.length);
                break;
            }

    }
}


