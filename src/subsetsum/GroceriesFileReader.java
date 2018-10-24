package subsetsum;

import java.io.*;
import java.util.ArrayList;
public class GroceriesFileReader
{
	
	public GroceriesFileReader()
	{
		
	}
	public ArrayList<Double> readFile(String filePath)
	{
		ArrayList<Double> returnList = new ArrayList<Double>();
		StringBuffer storageStr;
		BufferedReader reader;
		
		File file = new File("resources/groceries.txt");
		try {
		reader = new BufferedReader(new FileReader(file)); 
		}
		catch(Exception e) {return returnList;}
	    String thisLine; 
	    try {
		  while ((thisLine = reader.readLine()) != null) 
		  {
			  storageStr = new StringBuffer();
			  for(int k = 0; k < thisLine.length(); k++)
			  {
				  if(Character.isDigit(thisLine.charAt(k)) || thisLine.charAt(k) == '.')
				  {
					  storageStr.append(thisLine.charAt(k));
				  }
			  }
			  returnList.add(Double.parseDouble(storageStr.toString()));
			  
		  }
	    }
	    catch(IOException i){}
		  return returnList;  
	}
}
