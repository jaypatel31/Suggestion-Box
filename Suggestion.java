import java.util.Scanner;
public class Suggestion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		System.out.print("Enter any String: ");
		String word = scan.nextLine();
		scan.close();
		int len = word.length();
		//TOTAL WORDS IN THE DICTIONARY TOBE UPDATED HERE
		String totalwords[] = {"smart","smarty","smartness","println","printf","hello","bye"};
		String suggestion[] = new String[10];
		int u=0,index=0;
		for(int i=0;i<totalwords.length;i++) {
			int k =0;
			char arr[] = totalwords[i].toCharArray();
			index=0;
			for(int o =0;o<len;o++) {
				for(int j =index;j<arr.length;j++) {
					if(arr[j]==word.charAt(o)) {
						k++;
						index = j;
						break;
					}
				}	
			}		
			if(k>=len) {
				suggestion[u++] = totalwords[i];
			}
		}
		if(u>=1) {
		System.out.println("Suggestion : ");
			for(int t=0;t<u;t++) {
				System.out.println(suggestion[t]);
			}
		}
		else {
			System.out.println("\nNo Suggestion Found.");
		}
	}
}
