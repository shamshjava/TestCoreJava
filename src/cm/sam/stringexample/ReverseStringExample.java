package cm.sam.stringexample;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReverseStringExample {

	public static void main(String[] args) {
		String  str = "Mohammad Shamshir Ayaan";
		System.out.println(str);
		/*char n[] = str.toCharArray();
		for(int i=str.length()-1;i>=0;i--) {
			n[i]= str.charAt(i);
			System.out.print(n[i]);
		}*/
		//Reverse of given String
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		//Counts word in given string
		List<String> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(str, " ");
		int count = 0;
		while(st.hasMoreTokens()) {
			count++;
			list.add(st.nextToken());
		}
		System.out.println("No. of words="+count);
		for(int i =list.size()-1;i>=0;i--) {
			System.out.print(list.get(i)+" ");
		}
	}
	//Reverse of given String

}
