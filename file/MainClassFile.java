package by.issoft.file;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Data
@Accessors(chain = true)

public class MainClassFile {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/main/resources/test1");
        String fileContent = new String(Files.readAllBytes(path));

        ObjectMapper mapper = new ObjectMapper();
        Group groupp = mapper.readValue(fileContent, Group.class);

        System.out.println(groupp.groupname);
        System.out.println(groupp.pupils);

    }


}
