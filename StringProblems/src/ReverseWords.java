import java.util.Arrays;


public class ReverseWords {
	public static void main(String[] args) {
		String letters[] = new String[10];
		String s = "a good   example";
		int j = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) ==  ' '){
                System.out.println(j+". "+s.charAt(i));
                ++j;
            }
            else{
                System.out.println(j+" - "+s.charAt(i));
                letters[j] = letters[j] + s.charAt(i);
            }
        }
        String s1 = "";
        for(int i=0;i<letters.length;i++){
            System.out.println(letters[i]+" ");
            s1 = s1 + letters[i];
        }
        String[] s2 = s1.split("null");
        System.out.println(Arrays.toString(s2));
        s1 = "";
        for(int i=s2.length-1;i>0;i--) {
        	s1 = s1+s2[i]+" ";
        }
        System.out.println(s1.trim());
        
        		
	}
	public String reverseWords(String s) {
        String letters[] = s.split("\\s+");
        String returnStr = "";
        for(int i=letters.length-1;i>=0;i--){
            System.out.println(letters[i]+" ");
            returnStr = returnStr + letters[i] + " ";
        }        
        returnStr = returnStr.trim();
        
        return returnStr;
    }
}
