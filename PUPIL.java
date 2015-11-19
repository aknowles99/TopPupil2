
import javax.swing.JOptionPane;
import java.io.*;               // for general file handling
public class PUPIL
{
    // array of MEMBER objects
    private MEMBER memberList[];
    // number of members calculated after reading file
    int noOfMembers;
    private String fName;
    private String sName;
    private char mark;

    // CLASSes to open, create, read/write, close files
    FILEREADCSV markFile;        // to read file from storage

    public PUPIL()  throws IOException
    {
        // create file handler objects
        markFile = new FILEREADCSV();

        fName = "";
        sName = "";

        mark = 0;
    }

    public void readMemberDetails(String dataItems)
    {
        // unpack string of row data into fields
        String[] rowItems = dataItems.split(",");
        // store each data item as instance property
        fName = rowItems[0];
        sName = rowItems[1];

        mark = rowItems[2];

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
        memberData = memberData.concat(mark);
        return memberData;
    }

    public void setUpDataList()  {
        // loop for each item in the array
        for (int i=0; i<20; i++) {
            //create a new DATA object and store in next array position
            dataList[i] = new DATA();
        }
    }
    // top level algorithm
    public void processMembers()  throws IOException
    {
        setUpMemberList();
        displayMembers();
        countOKbmi();
    }

    private void setUpMemberList() throws IOException
    {
        // First user message
        System.out.println("ScotFit Club: Membership BMI update/n");
        System.out.println("** Preparing to read data file.");

        // read file, fetch data as String array containing the rows
        String[] dataRows = bmiFile.readCSVtable();
        // calculate the number of member rows, skip headings
        noOfMembers = dataRows.length - 1;

        // update user with number of rows with membership details
        System.out.println("** " + noOfMembers + " rows read.\n\n");

        // prepare array for members
        memberList = new MEMBER[noOfMembers];
        // create member objects and copy data from source
        for  (int i = 0; i < noOfMembers; i++) {
            memberList[i] = new MEMBER();
            // adjust to skip headings
            memberList[i].readMemberDetails(dataRows[i+1]);
        }
    }

    public void displayMembers() {
        // Heading for the display
        System.out.println("A listing of all applicants for the next year\n");
        // results
        for  (int i = 0; i < noOfMembers; i++) {
            memberList[i].displayDetails();
        }
        // 2 blank line to separate this report from others.
        System.out.print("\n\n\n");
    }
    // standard algorithm to find largest value, tracking POSITION of value
    public void findMaxData()  {
        // choose position of first value
        int maxDataPosition = 0;

        // repeat for the REST of the array
     
           for (int i=1; i<20; i++) {

            //compare current value with best value
            if (dataList[i].getData() < dataList[maxDataPosition].getData()) {
                // update the position of the best value
                maxDataPosition = i;
            }
        }
    }

        public static void main(String[] args)  throws IOException
        {
            PUPIL myPupil = new PUPIL();
            myPupil.processMembers();
        }
    }

    // populate the array with DATA objects
 //   public void setUpDataList()  {
        // loop for each item in the array
   //     for (int i=0; i<20; i++) {
            //create a new DATA object and store in next array position
    //        dataList[i] = new DATA();
   //     }
   // }

    //display results: position and the best (max) value
   // System.out.print("Position is:" + minDataPosition + " , Value is:");
  //  dataList[minDataPosition].displayData();
  //  System.out.println();
//}

//}

