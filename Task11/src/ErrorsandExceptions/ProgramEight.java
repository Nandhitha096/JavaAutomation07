package ErrorsandExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/* Q8 : Implement exception handling in a Java program that reads data from a file. 
 If the file does not exist, throw a "FileNotFoundException" and display an 
 error message to the user.
 */
public class ProgramEight {

	public static void main(String[] args) throws FileNotFoundException  {
		
		//Specifying the location of file
		
		File file= new File("C:\\Users\\91893\\OneDrive\\Documents\\FileExceptionDemo.");
		
		//Handling Exception to check if file exists or not
		try {
			
			//Load file
			
		    FileReader fr = new FileReader(file);
		    
		}catch (FileNotFoundException e)
		{
			System.out.println("File does not exist");
		}
		
	}

}
