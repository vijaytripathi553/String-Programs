import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HowToConvertStringArrayToSet {
public static void main(String[] args) {
	//Q.  How to convert a StringArray to Set ?
	
	//Ans. 
	//In oder to convert STring Array into Set , first we need to convert String Array into list. And from that list we will able to convert this into list.
	// Directly, from String Array to Set is not possible . So first we need to convert this into a list and then from list we can convert into set.
	
	//1. Creating one String Array of type String
	String s1[]= {"Ram","Shyam","Raghav","Ram"};
	
	//2.Converting String Array to list
	List<String> list=Arrays.asList(s1);
	System.out.println("List Size is:"+list.size());
	
	//3. Now, from this list we can convert to the set
	
	Set<String> set=new HashSet<String>(list);
	System.out.println("Set size is:"+set.size());
	
	
	
	
}
}
