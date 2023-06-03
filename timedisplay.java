import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;   
public class timedisplay {    
  public static void main(String[] args) {    
 DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:SS");
 LocalDateTime now = LocalDateTime.now();
 System.out.println(time.format(now));
  }    
}    