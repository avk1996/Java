
public class LongestPrefix {

	public static void main(String[] args) {
		String[] string = {"flower","flight","flow"};
		System.out.println("Shortest Length: "+shortestString(string));
	}
    public static int shortestString(String[] string){
        //length of each string
        int n = string.length;
        int[] strIndv = new int[n];

        for(int i=0;i<n;i++)
            strIndv[i] = string[i].length();
        
        int min = strIndv[0];
        for(int i=0;i<n;i++)
            if(strIndv[i] <= min)
               min = strIndv[i]; 

        return min;
    }

}
