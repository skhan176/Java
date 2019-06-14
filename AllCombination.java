
 
public class ArraySorting {
	  public static void main(String[] args) {
		
		  sum();
	  }
	  public static void sum(){
		  int target=15;
		  int a[]={1,5,5,4,7};
		  for(int i=0;i<a.length;i++){
			  for(int j=i+1;j<a.length;j++){
				  for(int k=j+1;k<a.length;k++){
					  for(int l=k+1;l<a.length;l++){
						  if(a[i]+a[j]+a[k]+a[l]==target){
							 

						  System.out.print("\n"+a[i]+" "+a[j]+" "+a[k] 
                                  +" "+a[l]);
						  }
						  }
					  }
					  
				  }
			  }
		  }
			  
			  }
				  
		  
		  
		
		 
    
	  
	  
	  
