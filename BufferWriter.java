package info.FileIo;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class BufferWriter
{
public static void main(String[] args) throws IOException{
	BufferedWriter br=new BufferedWriter(new FileWriter("hema.txt"));
	br.write("aaaa");
	br.newLine();
	br.write("bbbb");
	br.newLine();
	br.write("cccc");
	br.flush();
	br.close();
	System.out.println("success");
	BufferedWriter br1=new BufferedWriter(new FileWriter("divya1.txt"));
	br1.write("dddd");
	br1.newLine();
	br1.write("eeee");
	br1.newLine();
	br1.write("ffff");
	br1.flush();
	br1.close();
	System.out.println("sucess");
	
	
	
	
}
}