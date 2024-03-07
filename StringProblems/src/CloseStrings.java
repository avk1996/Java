import java.util.Arrays;

//Find the minimum distance between the given two words

public class CloseStrings {

	public static void main(String[] args) {
		String word1 = "abc";
		String word2 = "bca";
		closeStrings(word1, word2);
		System.out.println("w1: " + word1 + " w2: " + word2);
		word1.toCharArray();
		
	}

	public static boolean closeStrings(String word1, String word2) {
		int l1 = word1.length();
        int l2 = word2.length();
       

        for(int j=0;j<l1;j++){

            char[] w1 = word1.toCharArray(); 
            
            System.out.println(j + " " + Arrays.toString(w1));
            
            if(j<l1-1){
                // 1. swap 
                char temp = w1[j];
                w1[j] = w1[j+1];
                w1[j+1] = temp;
                System.out.println(j + " " + Arrays.toString(w1));
            }
        
            /// logical error start
            // 3. replace a's by b's and b's by a's.
           for(int i=0;i<l1;i++){
                if(w1[i] == 'b'){
                    w1[i] = 'a';
                    if(w1[i] == 'a')
                        break;
                }
            }
           
            for(int i=0;i<l1;i++){
                if(w1[i] == 'a')
                    w1[i] = 'b';
            }

            /// logical error end
            System.out.println(j + " " + Arrays.toString(w1));

            // 2. create new string
            String str = "";
            for(int i=0;i<l1;i++){
                str = str + w1[i];
            }   
            System.out.println(str);
            if(str == word2)
                return true;
        }
        return false;

	}
}
