package Advanced.StreamsFilesDirectories;

import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";
        String outpath = System.getProperty("user.dir") + "\\otuput.txt";
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        //BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path + "wrtie-third-line.txt")));
        PrintWriter out = new PrintWriter(new FileWriter(outpath));

        String line = reader.readLine();

        int count = 0;
        while (!line.equals("null")) {
            count++;
            if (count % 3 == 0) {
                System.out.println(line);
            }

            line = reader.readLine();
        }
    }
}
