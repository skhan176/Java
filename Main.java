public class Main {
	public static void main(String[] args) {
		count();
		
	}
	
	public static String count(){
	int count=0;
	char c='e';
	String s1="queeens college";
	for(int i=0;i<s1.length();i++){
		char k=s1.charAt(i);
		if(c==k){
			count++;
		}
	}
	System.out.println(count);
	return s1;
	
	}

		
	}
		
		
