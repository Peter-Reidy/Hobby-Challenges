package stringEdit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringEdit {
	
	private String myWord;
	private String minusLetter;
	private char word[];
	private char letter[];
	private String result = "";
	
	
	
	public StringEdit()throws IOException{
		
		BufferedReader check = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter word you wish to edit: ");
		myWord = check.readLine();
		
		
		System.out.println("Your Word is: " + myWord);
		System.out.println("Please enter the characters you wish removed: ");
		minusLetter = check.readLine();
		System.out.println("Your Letter(s) is(are): " + minusLetter);
		
		secondEditMethod();
	}

	
	
	public void secondEditMethod(){
		
		this.word = myWord.toCharArray();
		this.letter = minusLetter.toCharArray();
		int i = 0;
		
		while( i < word.length){
			
			for(char a : letter){
				
				if(a == word[i]){
					i++;
				} else{
					result = result + word[i];
					i++;
				}
				
			}
			
		
			
		}
		
		System.out.println("Your resulting String is: " + result);
		
		
	}
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		new StringEdit();
	}

}
