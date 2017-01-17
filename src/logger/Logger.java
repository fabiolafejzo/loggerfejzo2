package logger;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Fejzo
 */
public class Logger {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        FileWriter file;
        boolean continua = true;
        int riga = 1;

        //Formattazione data
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        try{
            file = new FileWriter("Logger.txt");
            while (continua) {
                System.out.println("Continui si o no ? ");
                String risposta = sc.nextLine();
                if (risposta.equalsIgnoreCase("no")) {
                file.close();
                  break;
               
            }
                if (risposta.equalsIgnoreCase("si")) {
                
                System.out.print("Riga " + riga + ": ");
                String testo = sc.nextLine();
                    Date date = new Date();

                    file.write("[" + dateFormat.format(date) + "] " + testo + "\r");
                    riga++;
            }
                
                else 
                    System.out.println("scrivere si o no: "); {   
               

            } 
            }
        }
        catch(IOException ex){
            System.out.println("Errore: " + ex.getMessage());
        }

    }
    
}
