
import javax.swing.JOptionPane;
import java.io.*;               // for general file handling
public class PUPIL
{
    // array of MEMBER objects

    // number of members calculated after reading file

    private String fName;
    private String sName;
    private int mark;

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
        memberData = memberData.concat(Integer.toString(mark));
        return memberData;
    }

  
    public void findMaxData()  {
        // choose position of first value
        int toppupil = 0;

        // repeat for the REST of the array

        for (int i=0; i<49; i++) {

            //compare current value with best value
            //if (dataList[i].getData() < dataList[maxDataPosition].getData()) {
                // update the position of the best value
            //    toppupil = mark;
            }
        }
    }

  //  public static void main(String[] args)  throws IOException
   // {
     //   PUPIL myPupil = new PUPIL();
    //    myPupil.processMembers();
   // }
//}


//}

