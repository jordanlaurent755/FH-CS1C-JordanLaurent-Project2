package subsetsum;
import java.util.ArrayList;

public class SubsetSum
{
	
		public static ArrayList<Double> findSubset(ArrayList<Double> givenList, 
				double targetVal)
		   {
			ArrayList<ArrayList<Double>> masterList = 
					new ArrayList<ArrayList<Double>>();
			ArrayList<Double> winningList =new ArrayList<Double>();
			masterList.add(new ArrayList<Double>());
			int generationalIncrement = 1;
			ArrayList<Double> tempList;
			double winningSum = 0.0;
		    for(int j = 0; j < givenList.size(); j++)
		    {
		    	for(int k = 0; k < generationalIncrement; k++)
		    	{
		    		tempList =new ArrayList<Double>();
		    		if (k != 0) {
		    			for(int z = 0; z < masterList.get(k).size(); z++)
		    				tempList.add(masterList.get(k).get(z));
		    		}
		    		 
		    		tempList.add(givenList.get(j));
		    		if(targetVal==findSum(tempList))
		    			return tempList;
		    		if(winningSum < findSum(tempList))
		    		{
		    			winningList.clear();
		    			winningSum = findSum(tempList);
		    			for(int z = 0; z < tempList.size(); z++)
		    				winningList.add(tempList.get(z));
		    		}
		    		masterList.add(tempList);
		    		//System.out.println(masterList);
		    	}
		    	generationalIncrement *= 2;
		    	
		    }
		   
		return winningList;
		   }
	  private static double findSum(ArrayList<Double> sumList)
	   {
	      double returnDbl = 0;
	      for (int k = 0; k < sumList.size(); k++)
	      {
	         returnDbl += sumList.get(k);
	      }
	      return returnDbl;
	   }	
	}
