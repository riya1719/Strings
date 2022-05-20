package package3;

public class Unboxing {
	
    static boolean isPalindrome(String str)
    {
 
     
        int i = 0, j = str.length() - 1;
 
        while (i < j) {
 
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            i++;
            j--;
        }
 
        return true;
    }

    public static void main(String[] args)
    {
    	// str is string object
        String str = "geeks";
 
        //Convert the string to lowercase
        str = str.toLowerCase();
        if (isPalindrome(str))
 
        	
            // Checking if  It is a palindrome or not
            System.out.print("Yes");
        else
 
            System.out.print("No");
    }
}