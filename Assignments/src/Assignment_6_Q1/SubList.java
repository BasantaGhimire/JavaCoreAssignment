package Assignment_6_Q1;

import java.util.ArrayList;
import java.util.List;

public class SubList {

	public static void main(String array[]) {
		// TODO Auto-generated method stub
		ArrayList<String> name = new ArrayList<String>();

	     //Addition of elements in ArrayList
		name.add("Steve");
		name.add("Justin");
		name.add("Ajeet");
		name.add("John");
		name.add("Arnold");
		name.add("Chaitanya");

	    //print ArrayList Content
		System.out.println("Original ArrayList Content: "+name);

	     //Sublist from ArrayList
	     ArrayList<String> arrayList = new ArrayList<String>(name.subList(1,4));
	     System.out.println("SubList stored in ArrayList: "+arrayList);
	  }
	}


