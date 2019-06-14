public class ArraySorting {
	  public static void main(String[] args) {
		  int a[]	={4,64,2};
		  int element=90;
		  int pos=1;
		  for(int i=a.length;i<pos-1;i--){
			  a[i]=a[i-1];
			  
		  }
		  a[pos-1]=element;
		  for(int i=0;i<a.length;i++){
			  System.out.println(a[i]);
		  }
	}
	  }    
    
     
    
       

