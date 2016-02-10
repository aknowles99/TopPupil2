
import javax.swing.JOptionPane;    
public class TOPPUPIL
{
 private int Vmark;
    private String VsName;
    private String VfName;
    
   // private int mark;
    private String VmemberData;
    public TOPPUPIL()
    {
        // initialise instance variables
        VsName = "";
        VfName = "";
        Vmark = 0;
      VmemberData = "";
    }

    // file handling store details from file
    public void readToppupil(String dataItems)
    {
        String[] rowItems = dataItems.split(",");
        // store each data item as instance property
        VsName = rowItems[0];
        VfName = rowItems[1];

        Vmark = Integer.parseInt(rowItems[2]);
    }
 public int getMARK() 
    {
        return Vmark;
    }
    public String write()
    {
        // join up data into a string to output as a row
        // use "," to separate csv columns
        
        VmemberData = VmemberData.concat(VfName);
        VmemberData = VmemberData.concat(",");
        VmemberData = VmemberData.concat(VsName);
        VmemberData = VmemberData.concat(",");
        VmemberData = VmemberData.concat(Float.toString(Vmark));
        return VmemberData;
    }

   

    public void display()
    {
        // output basic details
        System.out.print("Member: " + VfName + " " + VsName);
        System.out.print(",  mark is " + Vmark);
       
        System.out.println();
    }

}
