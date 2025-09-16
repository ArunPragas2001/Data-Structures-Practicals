class Array{
	public static void main(String[]args){
		
		int[] array={1,2,3,4,5,6,7,8,9,10};
		
		int sum=0;
		
		for(int i=0; i<9; i++){
			
		  System.out.println( array[i]);	
		  sum=sum+array[i];

		}
		
		
		int max=0;
		int min=0;

		for(int j=0; j<9; j++){
			
			
			
			
			if (array[j]>array[j+1])
			{
				max=array[j];
				
			}
			else
			{
				max=array[j+1];
				
			}
			
		
		
		
	}
	      
		  
		  for(int k=0; k<9; k++){
			
			
			
			
			if (array[k]<array[k+1])
			{
				min=array[k];
				
			}
			else
			{
				min=array[k+1];
				
			}
			
		
		
		
	}
	
	
	
	
	   System.out.println("Max is:"+max);
	   
	   System.out.println("Min is:"+min);
	   
	   System.out.println("Sum is :"+sum);
}

}