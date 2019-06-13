public class RemoveElement {
	  public static void main(String[] args) {
		  int a[]={5,0,2,6,5,2};
		  int n=a.length;
        int elements=5;
	for(int i=0;i<n;i++){
		if(elements==a[i]){
			for(int k=i;k<n-1;k++){
				a[k]=a[k+1];
				
			}
		
		
	}
	  }
	for(int i=0;i<a.length-1;i++)	{
		System.out.println(a[i]);
	}
		
	}
	  }    
    
     
    
       
