import java.util.Scanner;

public class RPS2 {

    public static String Input(){  //Method for taking input line
        Scanner keyboard = new Scanner(System.in);  //Initializes scanner
        String input = keyboard.nextLine();  //Takes line of input
        keyboard.close();
        return input;  //returns value
    }
    //Method that finds and replaces certain parts of the string in order to "simplify it"
    public static String func(String str){
        //The following variables store all possible scenarios in a valid string
        //Their individual simplifications are detailed in the comment
        String a = "(R&S)";  //R
        String b = "(R&P)";  //P
        String c = "(R&R)";  //R
        String d = "(S&R)";  //R
        String e = "(S&P)";  //S
        String f = "(S&S)";  //S
        String g = "(P&R)";  //P
        String h = "(P&S)";  //S
        String i = "(P&P)";  //P
        //The following if statements search the string for the above scenarios, and replaces those parts
        //of the string with their simplifications if those scenarios were found
        if (str.contains(a)){
            return str.replace(a, "R");
        } else if (str.contains(b)){
            return str.replace(b, "P");
        } else if (str.contains(c)){
            return str.replace(c, "R");
        } else if (str.contains(d)){
            return str.replace(d, "R");
        } else if (str.contains(e)){
            return str.replace(e, "S");
        } else if (str.contains(f)){
            return str.replace(f, "S");
        } else if (str.contains(g)){
            return str.replace(g, "P");
        } else if (str.contains(h)){
            return str.replace(h, "S");
        } else if (str.contains(i)){
            return str.replace(i, "P");
        } else{
            return str;  //If no simplifications were possible, return the original input string
        }
    }

    public static void main(String[] args){
        String string = Input();  //Takes line of string input using our method
        //Loop continues until string is in the most simplified possible form
        //Loop condition checks whether current string is different since last function call on the string
        while (!string.equals(func(string))) {
            //replace the value of the string into its more "simplified" version from the function call
            string = func(string);
        }
        //Assuming that the initial string was valid, this should be the simplified answer
        System.out.println(string);
    }
}

//Note: For sake of individual code and completeness
// I kept the same comments for both codes despite their similarity