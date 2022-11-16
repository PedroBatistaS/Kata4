package kata4.main;
import kata4.model.*;
import kata4.view.*;

import java.util.*;


public class Kata4 {


    public static void main(String[] args) {
        
        String fileName = "C:\\Users\\Pedro\\Desktop\\PRÁCTICAS IS2\\Kata4\\email.txt";
        List<Mail> mailList = new MailListReader().read(fileName);
        Histogram<String> histogram = new MailHistogramBuilder().build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}
