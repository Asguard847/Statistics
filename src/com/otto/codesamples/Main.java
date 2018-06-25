package com.otto.codesamples;

import java.io.*;
import java.util.*;

public class Main {

    //Second version without array[]

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Integer> chet = new ArrayList<Integer>();
        ArrayList<Integer> nechet = new ArrayList<Integer>();

        Scanner sc = new Scanner(new File("C:\\Users\\Asguard\\IdeaProjects\\Statistics2\\input.txt"));
        sc.nextLine();

        while(sc.hasNextInt()){
            int i = sc.nextInt();

            if(i % 2 == 0){
                chet.add(i);
            }else{
                nechet.add(i);
            }
        }

        PrintWriter pw = new PrintWriter(new File("C:\\Users\\Asguard\\IdeaProjects\\Statistics2\\output.txt"));

        int c=0;
        while (c< nechet.size()){
            pw.print(nechet.get(c));
            pw.print(" ");
            c++;
        }
        pw.println();

        int d = 0;
        while(d<chet.size()){
            pw.print(chet.get(d));
            pw.print(" ");
            d++;
        }
        pw.println();

        if(chet.size() >= nechet.size()){
            pw.print("YES");
        }else{
            pw.print("NO");
        }
        pw.close();
    }
}
