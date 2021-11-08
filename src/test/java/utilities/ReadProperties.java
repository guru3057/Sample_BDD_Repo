package utilities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class ReadProperties {
    public static ReadProperties READPROPERTIES=null;
    private Properties properties;
    private ReadProperties(){
        try {
            this.properties = new Properties();
            this.properties.load(new FileReader(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"testdata"+File.separator+"config.properties"));
        }catch(Exception e){}
    }
    public static Properties getProperties(){
        if(READPROPERTIES==null){
            READPROPERTIES= new ReadProperties();
        }
        return READPROPERTIES.properties;
    }
}
