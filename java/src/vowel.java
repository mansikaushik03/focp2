import java.util.Scanner;

public class vowel {



    

  public static void main(String[] args)

    { String ch;

        Scanner in = new Scanner(System.in);

        System.out.print("Input an alphabet: ");

        String input = in.nextLine();

       if((ch == "a") || (ch == "e")|| (ch == "i") || (ch == "o") || (ch == "u") || ((ch == "A") || (ch == "I") || (ch == "E") || (ch == "O") || (ch == "U"))

{System.out.print("Input letter is vowel");}

       

        else if (input.length() > 1)

        {

            System.out.println("Error. Not a single character.");

        }

        else

        {

            System.out.println("Input letter is Consonant");

        }

    }

    }