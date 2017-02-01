import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
public class WordCount {
	Map<String,Integer> phrase (String str){
		String punct=",./;:<>'\"{}[]!@#$%^&*()";
		Map<String,Integer> newMap = new HashMap<String,Integer>();
		for(int i=0,j=0;i<str.length();i=j+1){
			j=str.indexOf(" ",i);
			if(j<0)
				j=str.length();	
			String word=str.substring(i,j).toLowerCase();
			for(int k=0;k<word.length();k++){
				if(punct.contains(Character.toString(word.charAt(k)))){
					word=word.substring(0,k);
					break;
				}
			}
			if(word.length()<=0)
				continue;
			Integer value=newMap.get(word);
			if(value==null){
				newMap.put(word,1);
			}
			else{
				newMap.put(word,value+1);
			}
		}
	return newMap;
	}
}
