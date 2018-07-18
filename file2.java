package info.FileIo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class file2 {

	public static void main(String[] args) throws FileIOException, IOException{
		// TODO Auto-generated method stub
        PrintWriter pw=new PrintWriter(new PrintWriter("Thanvi.txt"));
        BufferedReader br=new BufferedReader(new FileReader("hema.txt"));
        BufferedReader br1=new BufferedReader(new FileReader("divya1.txt"));
        String line1=br.readLine();
        String line2=br1.readLine();
        while(line1!=null){
        	if(line1!=null){
        		pw.println(line1);
        		line1=br.readLine();
        	}
        }
        br.close();
        	while(line2!=null){
        		if(line2!=null){
        			pw.println(line2);
        			line2=br1.readLine();
        		}
        }
        		pw.flush();
        		pw.close();
        		br1.close();
        		System.out.println("success");
        	       
	}
}
