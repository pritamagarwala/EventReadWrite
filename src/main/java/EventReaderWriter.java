import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class EventReaderWriter {
    public static void main(String[] args) throws IOException {

        Pattern pattern = Pattern.compile(",");
        String csvFile=args[0];

        try {
            BufferedReader in = new BufferedReader(new FileReader(csvFile));
            List<FloorAccessEvent> events = in
                    .lines()
                    .skip(1)
                    .map(line -> {
                        String[] x = pattern.split(line);
                        return new FloorAccessEvent(Long.parseLong(x[0]),
                                x[1],
                                Integer.parseInt(x[2]),
                                (x[3]));
                    })
                    .collect(Collectors.toList());
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(new File(args[1]), events);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}