package kata4.main;
import kata4.model.*;
import kata4.view.*;

import java.util.*;


public class Kata4 {


   private static String filename = "email.txt";
   private static List<Mail> mailList = new ArrayList<Mail>();
   private static Histogram<String> histogram = new Histogram<String>();
   private static HistogramDisplay histoDisplay;
    
    public static void main(String[] args) {
        execute();
    }
    private static void execute() {
        input();
        process();
        output();
    }
    private static void input() {
        mailList = MailListReader.read(filename);
    }
    private static void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }

    private static void output() {
        new HistogramDisplay(histogram).execute();
    }
    
}
