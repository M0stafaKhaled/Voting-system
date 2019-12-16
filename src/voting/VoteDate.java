
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
   private String startaVotingDate ;
    private String EndOfVotingDate;

    public String getStartaVotingDate() {
        return startaVotingDate;
    }

    public String getEndOfVotingDate() {
        return EndOfVotingDate;
    }

    public void setStartaVotingDate(String startaVotingDate) {
        this.startaVotingDate = startaVotingDate;
    }

    public void setEndOfVotingDate(String EndOfVotingDate) {
        this.EndOfVotingDate = EndOfVotingDate;
    }
    
    
    public String getCurrenDate(){
    SimpleDateFormat  l = new SimpleDateFormat("yyy/MM/dd");
    Date d = new Date();
    String currentDate = l.format(d);
    return currentDate;
    }
    
    
 public void remnderTime(){
 
 	try {
				String date2 = "2019/12/20";
				String time1 = "11:00 AM";
				//String date2 = "12/20/2019";
                                String date1=getCurrenDate();
				String time2 = "12:15 AM";
	 
				String format = "yyy/MM/dd hh:mm a";
	 
				SimpleDateFormat sdf = new SimpleDateFormat(format);
	 
				Date dateObj1 = sdf.parse(date1 + " " + time1);
				Date dateObj2 = sdf.parse(date2 + " " + time2);
				//System.out.println(dateObj1);
				//System.out.println(dateObj2 + "\n");
	 
				DecimalFormat crunchifyFormatter = new DecimalFormat("###,###");
	 
				
				long diff = dateObj2.getTime() - dateObj1.getTime();
	 
				int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
				System.out.println("Remainder days: " + diffDays);
	 
				int diffhours = (int) (diff / (60 * 60 * 1000));
				System.out.println("Remainder hours: " + crunchifyFormatter.format(diffhours));
                                
				int diffmin = (int) (diff / (60 * 1000));
				System.out.println("Remainder minutues: " + crunchifyFormatter.format(diffmin));
	 
				int diffsec = (int) (diff / (1000));
				System.out.println("Remainder seconds: " + crunchifyFormatter.format(diffsec));
                                System.out.println("");
	 
	 
			} catch (Exception e) {
				e.printStackTrace();
			}
 }
    
}
