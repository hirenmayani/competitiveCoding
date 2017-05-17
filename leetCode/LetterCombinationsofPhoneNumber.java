package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsofPhoneNumber {
	public static void main(String[] args) {
		System.out.println(letterCombinations("5678"));
	}

	public static List<String> letterCombinations(String digits) {
		List<String> ans = new ArrayList<>();
		int[] perDigitSize = new int[digits.length()];
		int[] currPerDigitSize = new int[digits.length()];
		int[] currIndexArray = new int[digits.length()];
		
		String[] charArr = new String[digits.length()];
		
		HashMap<String, String> map = new HashMap<>();
		map.put("2", "abc");
		map.put("3", "def");
		map.put("4", "ghi");
		map.put("5", "jkl");
		map.put("6", "mno");
		map.put("7", "pqrs");
		map.put("8", "tuv");
		map.put("9", "wxyz");
		
		int arraySize = 1;
		if(digits.contentEquals(""))
			return ans;
		perDigitSize[digits.length() -1] = 1;
		
		for (int i = digits.length() - 1; i >= 0; i--) {
			String currString = map.get(digits.charAt(i)+"");
			arraySize *= currString.length();
			charArr[i] = currString;
			if(i!= digits.length() - 1){
				perDigitSize[i] = perDigitSize[i+1]*currString.length(); 				
			}
		}
			
//		for (int i = 0; i < charArr.length; i++) {
//			System.out.println(charArr[i]);
//		}
		//		for (int i = 0; i < perDigitSize.length; i++) {
//			System.out.println(perDigitSize[i]);
//		}
		//System.out.println(arraySize);
		
		for (int i = 0; i < arraySize; i++) {
			StringBuilder currString = new StringBuilder();
			
//			printarr(currIndexArray, currPerDigitSize, perDigitSize);
			for (int j = 0; j < currPerDigitSize.length; j++) {
				currString.append(charArr[j].charAt(currIndexArray[j]));
				currPerDigitSize[j]++;
			}
			
			for (int j = 0; j < currPerDigitSize.length; j++) {
				if(currPerDigitSize[j] == perDigitSize[j] )
				{
					currIndexArray[j]++;
					currIndexArray[j]=currIndexArray[j]% charArr[j].length();
					currPerDigitSize[j] = 0;
				}
			}
			ans.add(currString.toString());
		}
		return ans;
 	}
	
	public static void printarr(int[] arr, int[] arr2, int[] arr3)
	{
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println(arr[i]+"-"+arr2[i]+"-"+arr3[i]);
			
		}
		System.out.println();
	}
}
