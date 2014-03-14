package file_sorter;

import java.util.ArrayList;

import file_sorter.Category;
import default_loader.Loader;

public class Sorter {
	ArrayList<Category> cats;
	
	public Sorter(String category_definitions){
		System.out.println("Loading categories"); 	
		Loader ld = new Loader();
		ld.loadFile(category_definitions);
		ArrayList<ArrayList<String>> category_info_names = new ArrayList<ArrayList<String>>();
		category_info_names = ld.getNames();
		int categories = category_info_names.get(0).size()/3;
		
		cats = new ArrayList<Category>();
		for(int ii = 1; ii <= categories; ii++){
			String name = ld.get0dParameter("c"+ii+"_name");
			String lang = ld.get0dParameter("c"+ii+"_language");
			ArrayList<String> name_contains = ld.get1dParameter("c" + ii + "_name_contains");
			ArrayList<String> file_contains = ld.get1dParameter("c" + ii + "_file_contains");
			String smart = ld.get0dParameter("c"+ii+"_smart");
			cats.add(new Category(name, lang, name_contains, file_contains, smart));
		}
		System.out.println("Done");
	}
}
