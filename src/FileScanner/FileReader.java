package FileScanner;
import java.io.*;
public class FileReader implements Reader {
    File file = new File("");

    public String read() throws IOException {
        BufferedReader br = new BufferedReader(new java.io.FileReader(file));
        String str;
        return str=br.readLine();
    }

    FileReader(File file){
    this.file=file;
    }

}
