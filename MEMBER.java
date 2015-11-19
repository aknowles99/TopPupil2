
import javax.swing.JOptionPane;    

public class MEMBER
{
    private String fName;
    private String sName;
    private float mark;
    FILEREADCSV markFile;
      private float topmark;
    
   

    public MEMBER()
    {
        // initialise instance variables
        fName = "";
        sName = "";
        mark = 0.0f;
        topmark =0.0f;
         markFile = new FILEREADCSV();
        
      
 
    }

    // file handling store details from file
    public void readMemberDetails(String dataItems)
    {
           //String[] dataRows = markFile.readCSVtable();
        // unpack string of row data into fields
        String[] rowItems = dataItems.split(",");
        // store each data item as instance property
        fName = rowItems[0];
        sName = rowItems[1];
        mark = Float.parseFloat(rowItems[2]);
      
      
      
        //calculate ans store the bmi, adjust cm to m
     
    }
    
   // public void findmaxdata()
   // {
           //for (int i=1; i<50; i++) {

            //compare current value with best value
           // if () {
                // update the position of the best value
                //topmark = ;
           // }
      //  }
        
   // }



    public float getTOPMARK() 
    {
        return topmark;
    }

    public void displayDetails()
    {
        // output basic details
        System.out.print("Member: " + fName + " " + sName);
        System.out.print(",  BMI is ");
        System.out.printf("%.2f", topmark);
        System.out.println();
    }

}



//public class ALGORITHM  {
    // declare an array which can store DATA objects
   // private DATA[] dataList;

    // constructor
    ///public ALGORITHM()  {
        // set the size of the array
        //dataList = new DATA[20];
   // }

    // populate the array with DATA objects
   // public void setUpDataList()  {
        // loop for each item in the array
       // for (int i=0; i<20; i++) {
            //create a new DATA object and store in next array position
            //dataList[i] = new DATA();
       // }
   // }
//}
