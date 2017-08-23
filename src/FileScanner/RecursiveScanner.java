//package FileScanner;
//
//import java.io.*;
//
//public class RecursiveScanner implements MyScanner {
//    File directory;
//
//    public RecursiveScanner(File directory) throws IOException {
//        this.directory = directory;
//    }
//
//    int found;
//
//
//
//    @Override
//    public int scan(String word) {
//        try{
//            FileScanner scanner = new FileScanner(directory);
//            found +=scanner.scan(word);
//            for (File entry : directory.listFiles()) {
//                if (entry.isDirectory()) {
//                    String path = entry.getAbsolutePath();
//                    FileScanner recScanner = new FileScanner(new java.io.File(path));
//                    found +=recScanner.scan(word);
//                }
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return found;
//    }
//}
//
