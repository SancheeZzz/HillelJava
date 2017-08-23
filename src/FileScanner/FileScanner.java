package FileScanner;
import java.io.*;

public class FileScanner implements MyScanner {
    File file;

    public int scan(String word) {
        int found = 0;
        try {

            for (File files : file.listFiles()) {
                if (!(files.isDirectory())) {
                    BufferedReader br = new BufferedReader(new java.io.FileReader(files.getAbsolutePath()));
                String s;
                while ((s = br.readLine()) != null) {
                    if (s.contains(word)) {
                        found++;
                    }
                }
            }
        }
        }catch (Exception e) {
            e.printStackTrace();
        }
            return found;
        }


    FileScanner(File file ){
        this.file=file;
    }
}
