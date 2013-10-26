package unitTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

public class TestRunner {

	public static void main(String[] args) throws Exception{
		FileManager fm = new FileManager();
		ArrayList<String> files = new ArrayList<String>();
		fm.setFolder("../test");
		fm.setExtensionFilter("class");
		
		if (args.length > 0) {
			// Execute specific files
			for (int i = 0; i < args.length; i++) {
				if (fm.fileExists(args[i])) {
					files.add(args[i]); //Pending file validation
				}
			}

		} else {
			//Execute all files that exist in the ./test folder
			files = fm.getFiles();
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
    
    private String getFileExtension(String fileName) {
        int i = fileName.lastIndexOf('.');
        return i > 0 ? fileName.substring(0, i-1) : "";
    }
}
