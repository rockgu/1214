//*****************************************************************    
//This class have function to add element in the array. It has function to find the value in array.It has fuuction to remove value from the array.
//It has function to change the order of the array. It has fuction to print the array. It has function to remove Every Other Element.
//It has function to find Largest Common Element in the array.
//******************************************************************
import java.util.Random;
public class MyArray
{
	private int[] array;

	private int currentIndex = 0;

	public  MyArray(int maxSize)	
	{ 
		array = new int[maxSize];


	}

	public void addElement(int elem)
	{
        if(currentIndex >= array.length) 
        {
        	System.out.println("error");
        }
        else if(currentIndex <array.length)
        {         	
             array[currentIndex]=elem;
             currentIndex++;
	    }
    } 
    public int find(int elem)
    {
    	for(int i=0; i <array.length;i++)
    	{
           if (array[i]== elem)
           {
           	 return i;
           }
    	}
    	return -1;
    }
    public boolean remove(int elem)
    {
        for (int i = 0 ; i<array.length;i++)
        {
        	if ( array[i] == elem)
        	{
                for (int j = i; j < array.length-1;j++)
                { 
                	array[j]=array[j+1];
	
                }
                currentIndex--;
                return true;


        	}
        }
        return false;

    }  
   public void shuffle()
    {
         Random ran = new Random();
         
         int temp = 0 ; 
         for (int i= 0 ; i<currentIndex;i++ )
         {
           int index = ran.nextInt(currentIndex);
           temp = array[i];
           array[i]=array[index];
           array[index]=temp;
         }

    }
    public void print()
    {
    	for(int i = 0; i<currentIndex;i++)
    	{
            System.out.print(array[i]);

    	}

    }
    public void reverse()
    {
    	for(int i = 0; i<currentIndex/2;i++)
    	{
    		
            int temp = 0;
            temp=array[i];
            array[i] = array[currentIndex-1-i];
            array[currentIndex-1-i] = temp;

    	}
    }
    public void removeEveryOtherElement()
    {
    	int index = 0;
    	int tempCurrentIndex = currentIndex;
    	currentIndex++;
    	int[ ] array1 = new int [array.length];

    	 for(int i = 0; i<=tempCurrentIndex;i+=2)
    	 {
    	 
    	 	array1[index] = array[i];
    	 	
    	 	index++;
    	 	currentIndex--;
    	 	
    	 }
    	//System.out.print(tempCurrentIndex+"ddddddd");
    	/* if (tempCurrentIndex % 2==1)
    	 	{
              array1[index] = array[tempCurrentIndex];
    	 	}*/
    	
    	 	array= array1;
    	 
    	 

    }
    public void repeat(int n)
    {
    	 int tempCurrentIndex = currentIndex;
         currentIndex = currentIndex*n;
         int[] arr = new int[currentIndex];
         int z = 0 ;
         for(int i = 0; i<n;i++)
         {
              for (int j = 0; j<tempCurrentIndex;j++)
              {
                   arr[z]=array[j];
                   z++;
              }
         }
         array=arr;
       
    }
    
    
    public int findLargestCommonElement(int[] otherArray)
    {
    	int []array1;
    	int z=0;
    	if (currentIndex+1>=otherArray.length)
    	{
    	   array1 = new int[currentIndex];
    	}
    	else
    	{
           array1 = new int[otherArray.length];
    	}


        int w = 0;
       	for (int j = 0 ; j<currentIndex;j++)
       	{	
       		for(int i = 0; i <otherArray.length;i++ )
	       		if (otherArray[i]==array[j])
	       		{
	       			
	                 array1[z]=array[j];
	                 z++;
	                 w++;
	       		}
        }
       int number= array1[0];
       for(int i = 1; i<array1.length;i++)
       {
       	 
       	  if(number<array1[i])
       	  {
       	  	number = array1[i];

       	  }
       	 
       }
       if (w == 0)
       {
       	return Integer.MIN_VALUE;
       }
       else
       {
        return number;
       }
       

       

    }
    

     
    



}