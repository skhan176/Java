public  class Sum{
	public static void main(String[] args) {
		sum();
		}
	 public static void sum(){
	  int a[]={3,21,5,10,5};
	  int max=a[0];
	  int min=a[0];
	  int sum=0;
	  for(int i=0;i<a.length;i++){
		  if(a[i]>max ){
			  max=a[i];
		  }
		  else if(a[i]<min)	 { 
			 
			  min=a[i];
		   }
	  
	 sum=sum+a[i];
	 
	  
	   
  }
	  System.out.println(sum-min-max);
	 }
}
	 
		
		
		
				
			
						
					
		
				
