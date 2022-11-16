package kata4.view;
import java.util.*;
import kata4.model.*;


public class MailHistogramBuilder{
    
    public Histogram<String> build(List<Mail> l) {
        Histogram<String> histogram = new Histogram<String>();
        for (Mail mail : l) {
            histogram.increment(mail.getDomain());
        }
        return histogram;
    }
}
