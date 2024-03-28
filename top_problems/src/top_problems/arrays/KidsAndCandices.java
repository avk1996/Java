package top_problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsAndCandices {

	public static void main(String[] args) {
		int[] candies = {12,1,12};
		int extraCandies = 10;
		kidsWithCandies(candies, extraCandies).stream().forEach(i->System.out.println(i));
	}
	private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
		
		List<Boolean> trueKids = new ArrayList<>(); 
		for (int i = 0; i < candies.length; i++) {
			int key = candies[i] + extraCandies;
			trueKids.add(isHighest(key, candies));
		}
		return trueKids;
	}
	private static Boolean isHighest(int key, int[] candies) {
		for (int i = 0; i < candies.length; i++) {
			if(candies[i] > key)
				return false;
		}
		return true;
	}
	

}
