package com.helper_Addactin;

public class File_Reader_Manager {
	
	// Private Constructor
	private File_Reader_Manager() {
		// To restrict object creation in another class
	}
	
	// Static Method
	public static File_Reader_Manager getInstanceFRM() {
		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;
	}
	
	// Non-Static Method
	public Configuration_Reader getInstanceCR() throws Throwable {
		Configuration_Reader cr = new Configuration_Reader();
		return cr;
	}

}
