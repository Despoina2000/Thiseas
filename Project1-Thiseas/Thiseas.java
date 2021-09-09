import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Thiseas{
	
	
	 try (FileReader reader = new FileReader("filename.txt");
             BufferedReader br = new BufferedReader(reader)) {

            // read line by line
            String line;
			int c = 0;
			int i=0;
			int j=0;
			
            while ((line = br.readLine()) != null) {
                c++;
				if(c==1){
					m= Integer.parseInt(line[0]);
					n= Integer.parseInt(line[1]);
					String A[m][n];
				}
				if(c==2){
					Ex= Integer.parseInt(line[0]);
					Ey= Integer.parseInt(line[1]);

				}
				if (c>=3){
					for(i=0;i<m;i++){
						A[i][j]=Integer.parseInt(line[i])
					}
					j++;	
				}
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
			
			
        }
	
	
}