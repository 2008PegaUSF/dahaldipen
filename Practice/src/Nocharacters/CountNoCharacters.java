package Nocharacters;

public class CountNoCharacters {

	public static void main(String[] args) {
	
		int count = 0;    
       //Counts each character except space    
        for(int i = 0; i < args.length; i++) {    
           if(args[i].charAt(i) != ' ')    
                count++;    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in a string: " + count);    
	}

}
