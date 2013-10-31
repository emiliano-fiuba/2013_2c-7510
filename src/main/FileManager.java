package main;
import java.io.File;
import java.util.ArrayList;

public class FileManager {
	private String directory = "test";
	private String extensionFilter = "java";
	
	public FileManager() {
	}
	
	public void setFolder(String directory) {
		this.directory = directory;
	}

	public void setExtensionFilter(String extensionFilter) {
		this.extensionFilter = extensionFilter;
	}
	
	public ArrayList<String> getFiles() throws Exception {
        File folder = new File(directory);
        return getFilesInFolder(folder);
	}

	public boolean fileExists(String fileName) {
		File file = new File(fileName);
		return file.exists();
	}
	
	private ArrayList<String> getFilesInFolder(File folder) throws Exception {
		if ( ! folder.isDirectory() ) {
			throw new Exception(folder.getName());
		}
		
		ArrayList<String> files = new ArrayList<String>();
        File[] listOfFiles = folder.listFiles();
        
        for (File file : listOfFiles) {
        	if (validFile(file)) {
            	files.add(file.getName());
            }
        }
		
        return files;
	}
	
    private boolean validFile(File file) {
    	return file.isFile() && validExtension(file.getName());
    }
    
    private boolean validExtension(String fileName) {
    	return getFileExtension(fileName) == extensionFilter;
    }

    private String getFileExtension(String fileName) {
        int i = fileName.lastIndexOf('.');
        return i > 0 ? fileName.substring(i + 1) : "";
    }
}
