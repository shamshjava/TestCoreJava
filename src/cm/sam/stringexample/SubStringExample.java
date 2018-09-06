package cm.sam.stringexample;

public class SubStringExample {

	public static void main(String[] args) {
		int num[] = {5,4,7,6,9,2};
		int k = 0;
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				if(k<num.length-1) {
					//if(num[i]!=num[j-1] && num[j]!=num[i]) {
						System.out.println("("+num[i]+","+num[k+1]+")=("+num[i]+","+num[k+j]+")");
						/*if((num[i]+num[j]) == (num[j]+num[j+1])){
							//System.out.println("("+num[i]+","+num[j]+")=("+num[j]+","+num[j+1]+")");
							
						}*/
					//}
				}
			}
			k++;
			System.out.println("Hi Alam");
		}

	}

}
