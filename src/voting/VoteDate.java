
package voting;
import java.util.Date;

	import java.text.DecimalFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date;

/**
 *
 * @author mkost
 */
public class VoteDate {
    
 public void remnderTime(String currentDate){
 
 
 	try {
				String date2 = "2019/12/20";
				String time1 = "11:00 AM";
				//String date2 = "12/20/2019";
                                String date1= currentDate;
				String time2 = "12:15 AM";
	 
				String format = "yyy/MM/dd hh:mm a";
	 
				SimpleDateFormat sdf = new SimpleDateFormat(format);
	 
				Date dateObj1 = sdf.parse(date1 + " " + time1);
				Date dateObj2 = sdf.parse(date2 + " " + time2);
				System.out.println(dateObj1);
				System.out.println(dateObj2 + "\n");
	 
				DecimalFormat crunchifyFormatter = new DecimalFormat("###,###");
	 
				// getTime() returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object
				long diff = dateObj2.getTime() - dateObj1.getTime();
	 
				int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
				System.out.println("difference between days: " + diffDays);
	 
				int diffhours = (int) (diff / (60 * 60 * 1000));
				System.out.println("difference between hours: " + crunchifyFormatter.format(diffhours));
	 
				int diffmin = (int) (diff / (60 * 1000));
				System.out.println("difference between minutues: " + crunchifyFormatter.format(diffmin));
	 
				int diffsec = (int) (diff / (1000));
				System.out.println("difference between seconds: " + crunchifyFormatter.format(diffsec));
	 
				System.out.println("difference between milliseconds: " + crunchifyFormatter.format(diff));
	 
			} catch (Exception e) {
				e.printStackTrace();
			}
 }
    
}
