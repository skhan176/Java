public class occ{
	public static void main(String[] args) {
		
		int arr[]=new int [26];
		int count;
		int max=0;
		int g=0;
		char[] ch={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v',
				'w','x','y','z'};
		String s1="hello";
		for(int i=0;i<ch.length;i++){
			count=0;
			for(int j=0;j<s1.length();j++){
				char ch1=s1.charAt(j);
				if(ch[i]==ch1)
					count++;
			}
			arr[i]=(int )count;
        }
        max=arr[0];
        for(int j=1;j<26;j++)
        {
            if(max<arr[j])
                {
                    max=arr[j];
                    g=j;
                }
        }
        System.out.println("Maximum Occurence is "+max+" of character "+ch[g]);
   } 

		
		
		}
	
	
