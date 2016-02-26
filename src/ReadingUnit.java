import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingUnit {
    private String textFile;

    public ReadingUnit(String fileName){
        this.textFile = fileName;
    }

    public String read() {
        String text = "";
        String currentLine;

        try {
            BufferedReader file = new BufferedReader(new FileReader(this.textFile));


            while ((currentLine = file.readLine()) != null) {
                text += currentLine +"\n";
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }


}