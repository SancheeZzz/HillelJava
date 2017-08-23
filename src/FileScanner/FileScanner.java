package FileScanner;
import java.io.*;public class FileScanner implements MyScanner {
    String path;


    public FileScanner(String path) throws IOException {
        this.path = path;
    }
    BufferedReader br = new BufferedReader(new java.io.FileReader(path));

    public int scan(String word, String path) {
        int found = 0;
        try {
            File file=new File(path);
            for (File files : file.listFiles()) {
            if ((!files.isDirectory())) {
                String s;
                while ((s = br.readLine()) != null) {
                    if (s.contains(word)) {
                        found++;
                    }
                }
            }if (files.isDirectory()){
                scan(path, word);
            }            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return found;
    }
}
