package kata4.view;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kata4.model.*;

public class MailListReader{
    
    public List<Mail> read(String fileName) {
        BufferedReader br = null;
        List<Mail> mails = new ArrayList<Mail>();
        try {
            br = new BufferedReader(new FileReader(new File(fileName)));
            String linea;
            while ((linea = br.readLine()) != null) {
            if (!linea.contains("@")) continue;
            mails.add(new Mail(linea));
        }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return mails;
    }
}
