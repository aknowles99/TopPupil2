

import javax.swing.JOptionPane;    

public class TOPPUPIL
{
   
   private String fName;
    private String sName;
    private int mark;
    public TOPPUPIL()
    {
        // initialise instance variables
          fName = "";
        sName = "";

        mark = 0;
    }

    // file handling store details from file
    public void readToppupilDetails(String dataItems)
    {
        String[] rowItems = dataItems.split(",");
        // store each data item as instance property
        fName = rowItems[0];
        sName = rowItems[1];

        mark = Integer.parseInt(rowItems[2]);
    }

    public String writeDetails()
    {
        // join up data into a string to output as a row
        // use "," to separate csv columns
        String memberData = "";
        memberData = memberData.concat(fName);
        memberData = memberData.concat(",");
        memberData = memberData.concat(sName);
        memberData = memberData.concat(",");
        memberData = memberData.concat(Float.toString(mark));
        return memberData;
    }

    public float getMARK() 
    {
        return mark;
    }

    public void displayDetails()
    {
        // output basic details
        System.out.print("Member: " + fName + " " + sName);
        System.out.print(",  BMI is ");
        System.out.printf("%.2f", bmi);
        System.out.println();
    }

}
