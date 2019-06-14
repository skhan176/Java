
 
public class  Second_Largest {
	  public static void main(String[] args) {
		  int a[]={6,53,27,86,7};
		  int max=a[0];
		  int sec_max=a[0];
		  sum(a, sec_max, sec_max);
		  
		  }
	  
	  public static void sum(int a[],int max,int sec_max){
		
		for(int i=1;i<a.length;i++){
			if(a[i]>max){
				sec_max=max;
				max=a[i];
			}
				else if(max>a[i]&& sec_max<a[i])	{
			sec_max=a[i];
				
		}
		
				
				}

		System.out.println("The second largest elements is:"+sec_max);
		
				
				
						
					}
		
				}
	  

				  
	   
		  
			  
			  
				  
		  
		  
		
		 
    
	  
	  
	  
