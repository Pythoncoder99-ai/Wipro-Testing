package Day13;

public class StringOperations {
	
	
	public static void main(String[] args) {
		StringBuilder str1=new StringBuilder();
		String str11="apple";
		System.out.println(str1.append(str11));
		int len=str11.length();
		System.out.println("Length is: "+len);
		for(int i=0;i<len;i++) {
			if(i%2==0) {
				str1.setCharAt(i, '#');
			}
		}
		System.out.println("Odd replaced: "+str1);
		
		StringBuilder Dup = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (Dup.indexOf(String.valueOf(c)) == -1) {
                Dup.append(c);
            }
            
        }
        System.out.println("Removed duplicate String: "+Dup.toString());
        
	}
}
