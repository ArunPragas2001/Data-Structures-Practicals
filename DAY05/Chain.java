class Chain implements LinearList
{
		//declaring the variables
		private ChainNode firstNode;
		private int size;
		
		
		public Chain( ChainNode firstNode, int size)
		{
		  this.firstNode=firstNode;
		  this.size=size;
		
		
		}
		
		
		public boolean isEmpty()
		{
		
		   return size==0;
		
		}
		
		public int size()
		{
			
			return size;
			
		}
		
		public Object get(int index)
		{
			
			ChainNode p=firstNode;
			   for(int i=0; i<index; i++)
				   p=p.next;
			   return p.element;
			
			
			
		}

   
   
   




}