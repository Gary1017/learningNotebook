import java.util.*;
import javax.annotation.processing.FilerException;
import java.lang.String;
import java.io.*;
import java.lang.Character;

public class main{
    public static void main(String [] args){
        // 5.1
        // System.out.println("Enter an integer number: ");
        // try(Scanner scan = new Scanner(System.in)){
        //     int input = 0;
        //     input = scan.nextInt();
        //     System.out.println("Your input is " + input);
        // }catch(InputMismatchException e){
        //     System.out.println("The input should be an integer.");
        // }

        // //5.2
        // Scanner scan = new Scanner(System.in);
        // int input = 0;
        // int sum = 0;
        // do{
        //     try{
        //         System.out.println("Entern an integer number: ");
        //         input = scan.nextInt();
        //         System.out.println("Your input is " + input);
        //         sum += input;
        //     }
        //     catch(InputMismatchException e){
        //         System.out.println("The input should be an integer.");
        //         String garbage = scan.nextInt(); // use an string var to recieve garbage value and make the cursor move to next 
        //     }
        // }while(input != 0);
        // System.out.println("The Sumation equals to " + sum);

        // // //5.3
        // try{
        //     InputStreamReader sReader = new InputStreamReader(System.in);
        //     BufferedReader bReader = new BufferedReader(sReader);

        //     System.out.println("Entern an integer number: ");
        //     char input = (char)bReader.read(); // read will always return an integer from ascll table
        //     System.out.println("input is " + input);
        // }
        // catch(InputMismatchException e){
        //     System.out.println("Not an integer!");
        // }
        // catch(IOException e){
        //     System.out.println("IOexception!");
        // }

        // //5.4
        // InputStreamReader sReader = new InputStreamReader(System.in);
        // BufferedReader bReader = new BufferedReader(sReader);
        // int input = 0;
        // int sum = 0;
        // do{
        //     System.out.println("Enter an integer number:");
        //     try{
        //         input = Integer.parseInt(bReader.readLine());
        //         System.out.println("Your input is " + input);
        //         sum = sum + input;
        //     }
        //     catch(IOException e){
        //         System.out.println("Invalid input");
        //     }
        //     catch(NumberFormatException e){
        //         System.out.println("Incorrect number format");
        //     }   
        // }while(input != 0);
        // System.out.println("The sumation is " + sum);
        
        // //5.5
        // try(BufferedReader bReader = new BufferedReader(new FileReader("input.txt"))){
        //     String line = bReader.readLine();
        //     while(line != null){
        //         try(FileWriter fWriter = new FileWriter("output.txt")){
        //             fWriter.write(line.toUpperCase() + "\r\n");
        //             line = bReader.readLine();
        //         }
        //         catch(IOException ioW){
        //             System.out.println("Write FIle Erro");
        //             ioW.printStackTrace();
        //         }
        //     }
        // }catch(IOException ioR){
        //     System.out.println("Io exception!");
        // }

        //test .readLine() return type
        try{
            System.out.println("get input");
            InputStreamReader iR = new InputStreamReader(System.in);
            BufferedReader bReader = new BufferedReader(iR);
            String line = bReader.readLine();
            System.out.println(line);
        }
        catch(IOException i){
            System.out.println("IO Exception");
        }
        catch(NumberFormatException num){
            System.out.println("NumFormat Exception");
        }

    }
}
