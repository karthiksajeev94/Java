package main;

import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {

		System.out.println(isAnagram("rat","car"));
	}
	
	public static boolean isAnagram(String s, String t) {
		
		if (s.length()!=t.length()) {
			return false;
		}
		
		int[] arr=new int[26];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'a']++;
			arr[t.charAt(i)-'a']--;
		}
		for(int i:arr) {
			if (i!=0) {
				return false;
			}
		}

		return true;
	}
	
	public static boolean isAnagram3(String s, String t) {
		
		if (s.length()!=t.length()) {
			return false;
		}
		
		HashMap<Character,Integer> mapS=new HashMap<Character,Integer>();
		HashMap<Character,Integer> mapT=new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++) {
			char cS=s.charAt(i);
			mapS.put(cS, mapS.getOrDefault(cS, 0)+1);
			char cT=t.charAt(i);
			mapT.put(cT, mapT.getOrDefault(cT, 0)+1);
		}
		
//		HashMap<Character,Integer> mapS=new HashMap<Character,Integer>();
//		HashMap<Character,Integer> mapT=new HashMap<Character,Integer>();
//		
//		mapS=convertToMap(s);
//		mapT=convertToMap(t);

		return mapS.equals(mapT);
	}
	
	public static HashMap<Character,Integer> convertToMap(String s) {
		
		HashMap<Character,Integer> mapS=new HashMap<Character,Integer>();
		
	
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			mapS.put(c, mapS.getOrDefault(c, 0)+1);		
		}
		
		return mapS; 
		
	}

	public static boolean isAnagram2(String s, String t) {
		
		if (s.length()!=t.length()) {
			return false;
		}
		
		String temp=t;

		for(int i=0; i<s.length(); i++) {
			
			char c=s.charAt(i);
			int index=temp.indexOf(c);
			System.out.println(index);
			
			if(index!=-1) {
				String temp2=temp.substring(0,index)+temp.substring(index+1);
				System.out.println(temp2);
				temp=temp2;
			}
			else {
				return false;
			}
			
		}
		return true;
		
	}
	
}
