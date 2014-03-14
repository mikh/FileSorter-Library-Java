package file_sorter;

import java.util.ArrayList;

public class Category {
	public String name;
	public String language;
	public ArrayList<String> name_contains = new ArrayList<String>();
	public ArrayList<String> file_contains = new ArrayList<String>();
	public boolean smart;
	
	public Category(String name, String language, ArrayList<String> name_contains, ArrayList<String> file_contains, String smart){
		this.name = name;
		this.language = language;
		this.name_contains = name_contains;
		this.file_contains = file_contains;
		if(smart.equals("true"))
			this.smart = true;
		else
			this.smart = false;
	}
	
}
