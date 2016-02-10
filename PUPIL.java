
import javax.swing.JOptionPane;
import java.io.*;               // for general file handling
public class PUPIL
{
    // array of MEMBER objects

    // number of members calculated after reading file
    
    private TOPPUPIL toppupillist[];
    int Vtopmark;
    int VnoOfToppupil;


    // CLASSes to open, create, read/write, close files
    FILEREADCSV markFile; 
    // CLASSes to open, create, read/write, close files
    FILEWRITECSV resultsFile;        

    public PUPIL()  throws IOException
    {
        // create file handler objects
        markFile = new FILEREADCSV();

        resultsFile = new FILEWRITECSV();

        Vtopmark = 0;
        VnoOfToppupil = 49;

    }

    public void processToppupil()  throws IOException
    {
        ToppupilList();
        displayToppupil();
        countMARK();
    }

    private void ToppupilList() throws IOException
    {
        // First user message
        System.out.println("ScotFit Club: Membership BMI update/n");
        System.out.println("** Preparing to read data file.");

        // read file, fetch data as String array containing the rows
        String[] dataRows = markFile.readCSVtable();
        // calculate the number of member rows, skip headings
        VnoOfToppupil = dataRows.length - 1;

        // update user with number of rows with membership details
        System.out.println("** " + VnoOfToppupil + " rows read.\n\n");

        // prepare array for members
        toppupillist = new TOPPUPIL[VnoOfToppupil];
        // create member objects and copy data from source
        for  (int i = 0; i < VnoOfToppupil; i++) {
            toppupillist[i] = new TOPPUPIL();
            // adjust to skip headings
            toppupillist[i].readToppupil(dataRows[i+1]);
        }
    }

    public void displayToppupil() {
        // Heading for the display
        System.out.println("A listing of all applicants for the next year\n");
        // results
        for  (int i = 0; i < VnoOfToppupil; i++) {
            toppupillist[i].display();
        }
        // 2 blank line to separate this report from others.
        System.out.print("\n\n\n");
    }

    public void countMARK() throws IOException
    {
        // *prepare a String to write data to disc
        String fileContent = "";

        System.out.println("A report of members within ideal BMI\n");
         int Vpersonnumber = 0;
        // start the count
        int Vcount = 0;
        // loop for each item : member
        for (int i = 0; i < VnoOfToppupil; i++)
        {
            // decide if current item: member matches target: bmi
            if (toppupillist[i].getMARK() > Vtopmark)
            {
                // add 1 to count: for OK bmi
                Vtopmark = toppupillist[i].getMARK() ;
                // *display the details for the member
                Vpersonnumber = i;

                // *use new line to separate rows in csv file, after 1st line
                if (Vcount>1) 
                {
                    fileContent = fileContent.concat("\n");
                }
                // *join on next line of data for writing to file
                
            }
             fileContent = fileContent.concat(toppupillist[Vpersonnumber].write());
        }
        // display the final count: bmi
       
        System.out.println("\n Top mark is  : " + Vtopmark);
        System.out.println("which belongs to : " + Vpersonnumber);
        // A blank line to separate this report from others.
        System.out.println();

        // *send for writing to file as a string containing all data
        System.out.println("** Preparing to write data file.");
        resultsFile.writeCSVtable(fileContent);
        System.out.println("** File written and closed.");
    }

    public static void main(String[] args)  throws IOException
    {
        PUPIL myPupil = new PUPIL();
        myPupil.processToppupil();
    }
}

  
   
  
//public void findMaxData()  {
// choose position of first value
// int toppupil = 0;

// repeat for the REST of the array

//   for (int i=0; i<49; i++) {

//compare current value with best value
//if (dataList[i].getData() < dataList[maxDataPosition].getData()) {
// update the position of the best value
//    toppupil = mark;
//  }
//}
//}

//  public static void main(String[] args)  throws IOException
// {
//   PUPIL myPupil = new PUPIL();
//    myPupil.processMembers();
// }
//}

//}

//member=toppupil
//club=pupil
//bmi=mark
