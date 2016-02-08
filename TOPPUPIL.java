
import javax.swing.JOptionPane;    
public class TOPPUPIL
{
 private int mark;
    private String sName;
    private String fName;
    
   // private int mark;
    private String memberData;
    public TOPPUPIL()
    {
        // initialise instance variables
        sName = "";
        fName = "";
        mark = 0;
      memberData = "";
    }

    // file handling store details from file
    public void readToppupil(String dataItems)
    {
        String[] rowItems = dataItems.split(",");
        // store each data item as instance property
        sName = rowItems[0];
        fName = rowItems[1];

        mark = Integer.parseInt(rowItems[2]);
    }
 public int getMARK() 
    {
        return mark;
    }
    public String write()
    {
        // join up data into a string to output as a row
        // use "," to separate csv columns
        
        memberData = memberData.concat(fName);
        memberData = memberData.concat(",");
        memberData = memberData.concat(sName);
        memberData = memberData.concat(",");
        memberData = memberData.concat(Float.toString(mark));
        return memberData;
    }

   

    public void display()
    {
        // output basic details
        System.out.print("Member: " + fName + " " + sName);
        System.out.print(",  mark is " + mark);
       
        System.out.println();
    }

}
