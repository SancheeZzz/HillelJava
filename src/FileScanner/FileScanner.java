package FileScanner;
import java.io.*;

public class FileScanner implements MyScanner {
    File file;

    public int scan(String word) {
        int found = 0;
        try {
            if ((file.isDirectory())) {
            for (File files : file.listFiles()) {
                BufferedReader br = new BufferedReader(new java.io.FileReader(files));
                String s;
                while ((s = br.readLine()) != null) {
                    if (s.contains(word)) {
                        found++;
                    }
                }
            }
        }
        }catch (Exception e) {
            System.out.println(e.getStackTrace().toString());
        }
            return found;
        }


    FileScanner(File file ){
        this.file=file;
    }
}
