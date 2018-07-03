package Stringpal;
import java.io.*;


public class Stringpal {
	
	private String checkWord;
	private char ca[];
	
	
	public Stringpal() throws IOException{
		
		BufferedReader check = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter word for Palindrome check: ");
		checkWord = check.readLine().toLowerCase();
		
		palCheck();
	
	}
	
	
	public void palCheck(){
		
		this.ca = checkWord.toCharArray();
		int i = 0;
		int l = checkWord.length() - 1;
		
		while(i <= (checkWord.length()/2)){
			
			if(ca[i] != ca[l]){
				System.out.println(checkWord +" is NOT a palindrome: ");
				i = i + checkWord.length();
			}else if(ca[i] == ca[l] && i < (checkWord.length()/2)){
				i++;
				l--;
			}else if(ca[i] == ca[l]){
				System.out.println(checkWord +" IS a palindrome: ");
				i++;
				l--;
			}
			
		}	
			
	}
		
		
	

	public static void main(String[] args)  throws IOException{

		new Stringpal();
	}

}
