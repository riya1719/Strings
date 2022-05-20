package package1;
import java.util.*;


public class URL {
	public static void main(String[] args) 
	{
		ArrayList  UrlList = new ArrayList <String>();

		String string = "aerURL= http:sfusafkasf?asdadfkjadlfaliralcnaURL=http.adfafasjf?D"
				+ "HFLDIFJLdfURLhttp.grscomgfh?,zdnf,df";

		int  StartIndex =0;
		
		
		 while ( string.indexOf("http", StartIndex ) != -1)
		{
			StartIndex = string.indexOf("http", StartIndex );
			System.out.println(StartIndex);
			
			
			int EndIndex = string.indexOf('?' , StartIndex); 
			System.out.println(EndIndex);
			
			String NewString = string.substring(StartIndex,EndIndex);
			
			UrlList.add(NewString);
			

			System.out.println(string.substring(StartIndex,EndIndex));
			
			StartIndex = EndIndex + 1;
		}
		 
		 System.out.println(UrlList);
		 
		 for (int i = 0; i < UrlList.size(); i++)
			 System.out.println( UrlList.get(i));
	
	
		
}
}

/*
 * 
		
 */
