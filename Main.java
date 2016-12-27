/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc241hw09;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author Cesar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        String source = "";
        String search = "";
        Scanner kb = new Scanner(System.in);
        HashMap<String, String> database = new HashMap<>();
        Hashtable<String, String> test = new Hashtable<>();

        System.out.println("Enter the file name:");
        source = kb.nextLine();
        File f = new File(source);
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {

//            sc.useDelimiter(" ");
//            String value = "";
//            for (int i = 1; i < 11; i++) {
//                String z = sc.next();
//                value += z + " ";
//            }
//            value = value.trim();
            database.put(sc.next(), sc.nextLine().trim());
        }
        System.out.println("Enter a key value:");
        search = kb.nextLine();
        if (database.containsKey(search)) {
            System.out.println("Value: " + database.get(search));
        } else {
            System.out.println("No value found");
        }
    }

}
