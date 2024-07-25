package TestProgramme;


import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

public class DataDrivenYml {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis =new FileInputStream("src/test/resources/data/test.yml");
//        Yaml yl = new Yaml();
//        Map<String, Map<String, String>> yamlMap = (Map<String, Map<String, String>>) yl.load(fis);
//        System.out.println(yamlMap.get("Name").get("ganesh"));


        Yaml yl = new Yaml();
        Map<String, Map<String, String>> yamlMap =yl.load(new FileInputStream("src/test/resources/data/test.yml"));
        System.out.println(yamlMap);


    }
}
