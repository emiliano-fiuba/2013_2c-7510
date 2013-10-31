package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

public class TestRunner extends Test {

	public static void main(String[] args) throws Exception {
		FileManager fileManager = new FileManager();
		ArrayList<String> files = new ArrayList<String>();
		
		fileManager.setFolder("src/test");
		fileManager.setExtensionFilter("class");

		if (args.length > 0) {
			// Execute specific files
			for (int i = 0; i < args.length; i++) {
				if (fileManager.fileExists(args[i])) {
					files.add(args[i]); //Pending file validation
				}
			}

		} else {
			//Execute all files that exist in the ./test folder
			files = fileManager.getFiles();
		}

		// Execute all files
		for (String file : files) {
			execute(file);
		}
	}
	
    private static void execute(String command) throws IOException
    {
        Process tr = Runtime.getRuntime().exec(command);
        Writer wr = new OutputStreamWriter( tr.getOutputStream() );
        BufferedReader rd = new BufferedReader( new InputStreamReader( tr.getInputStream() ) );
        wr.flush();

        String s = rd.readLine();
        System.out.println( s );
    }
    
    private String getFileExtension(String fileName)
    {
        int i = fileName.lastIndexOf('.');
        return i > 0 ? fileName.substring(0, i-1) : "";
    }
    
}
