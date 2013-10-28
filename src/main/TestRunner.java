package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

public class TestRunner {

	public static void main(String[] args) throws Exception{
		FileManager fileManager = new FileManager();
		ArrayList<String> files = new ArrayList<String>();
		
		fileManager.setFolder("../../bin/test/");
		fileManager.setExtensionFilter("class");
		
		if (args.length > 0) {
			// Execute specific files
			for (int i = 0; i < args.length; i++) {
				if (fileManager.fileExists(args[i])) {
					files.add(args[i]);
				}
			}

		} else {
			//Execute all files that exist in the ./test folder
			files = fileManager.getFiles();
		}

		// Execute files
		for (String file : files) {
			execute(buildExecuteCommand(file));
		}
	}
	
    private static void execute(String command) throws IOException {
        Process proc = Runtime.getRuntime().exec(command);
        Writer wr = new OutputStreamWriter(proc.getOutputStream());
        BufferedReader rd = new BufferedReader(new InputStreamReader(proc.getInputStream()));
        wr.flush();

        String s = rd.readLine();
        System.out.println(s);
    }
    
    private static String buildExecuteCommand(String fileName) {
    	return "java " + fileName;
    }
}
