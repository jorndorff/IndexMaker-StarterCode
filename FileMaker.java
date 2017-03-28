import java.io.*;

/**
 * Wrapper object for accessing a file.
 */
public class FileMaker
{
	private BufferedReader inputFile;
	private int next;
	
	/**
	 * Creates a new FileMaker object wrapping the given file.
	 */
	public FileMaker(String filename)
	{
		try
		{
			inputFile = new BufferedReader(new FileReader(filename), 1024);
		}
		catch(IOException e)
		{
			System.out.println("Error! File does not exist.");
			System.exit(1);
		}
		next = read();
	}
	
	// No javadoc because this method is private.
	private int read() 
	{
		
		int x = 0;
		try
		{
			x = inputFile.read();
		}
		catch(IOException ioe)
		{
			System.out.println("Problem reading file.");
		}
		return x;
	}
	
	/**
	 * Returns the next character from the file.
	 * precondition: There is another character to be read.
	 * @return The character that was read.
	 */
	public char readChar()
	{
		int temp = next;
		next = read();
		return (char) temp;
	}
	
	/**
	 * Tells whether there is another character to be read from the file.
	 * @return Whether another character exists.
	 */
	public boolean hasNext()
	{
		return next != -1;
	}
	
	/**
	 * Writes the given text string to the specified file. If the output file does not exists,
	 * it is created for you.
	 */
	public static void writeFile(String text, String filename)
	{
		PrintWriter outputFile;
		
		try
		{
			outputFile =
               new PrintWriter(new FileWriter(filename));
          outputFile.println(text);
          outputFile.close();
  	}
  	catch(IOException e)
		{
			System.out.println("Error creating file");
			System.exit(1);
		}
	
	}
  
}
