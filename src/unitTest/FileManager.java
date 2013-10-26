package unitTest;
import java.io.File;
import java.util.ArrayList;

public class FileManager {
	private final String JAVA_FILE_EXTENSION = "java";
	private final String JAVA_FILE_CLASS_EXTENSION = "class";
	private String directory = "test";
	
	public FileManager()
	{
	}
	
	public void setFolder(String directory)
	{
		this.directory = directory;
	}
	
	public ArrayList<String> getJavaFiles() throws Exception
	{
        File folder = new File(directory);
        return getFiles(folder);
	}
	
	private ArrayList<String> getFiles(File folder) throws Exception
	{
		if ( ! folder.isDirectory() ) {
			throw new Exception(folder.getName());
		}
		
		ArrayList<String> files = new ArrayList<String>();
        File[] listOfFiles = folder.listFiles();
        
        for (File file : listOfFiles) {
            if (validJavaFile(file)) {
            	files.add(file.getName());
            }
        }
		
        return files;
	}
	
    private boolean validJavaFile(File file)
    {
    	return file.isFile() && validExtension(file.getName());
    }
    
    private boolean validExtension(String fileName)
    {
    	return getFileExtension(fileName) == JAVA_FILE_EXTENSION;
    }

    private String getFileExtension(String fileName)
    {
        int i = fileName.lastIndexOf('.');
        return i > 0 ? fileName.substring(i + 1) : "";
    }

}
