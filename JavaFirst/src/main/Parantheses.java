package main;

import java.util.ArrayList;
import java.util.Stack;

public class Parantheses {

	public static void main(String[] args) {

		String s="([)]";
		System.out.println(isValid(s));
		
	}
	
	public static boolean isValid(String s) {
		
		ArrayList<Character> arr=new ArrayList<Character>();

		for (int i=0;i<s.length();i++) {
			char c=s.charAt(i);			
			if(c=='(' || c=='{' || c=='[') {
				arr.add(c);
			}
			else {
				if (arr.size()==0) {
					return false;
				}
				int lastIndex=arr.size()-1;
				char lastChar=arr.get(lastIndex);
				if((c==')' && lastChar!='(') || (c=='}' && lastChar!='{') || (c==']' && lastChar!='[')) {
					return false;
				}
				else {
					arr.remove(lastIndex);
				}
			}
		}
		if (arr.size()==0) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
