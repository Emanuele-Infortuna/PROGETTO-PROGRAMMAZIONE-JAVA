package Impostazioni_Server;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger {
    private String path ;
    
    /**
     *
     */
    public FileLogger(){
        this.path = System.getProperty("user.dir") + File.separator+"log4j.properties";
    }

    /**
     *
     * @return
     */
    public boolean Scrivi(){
        try {
            FileWriter w = new FileWriter(new File(getPath()));
            w.write("log4j.rootLogger=INFO, stdout \n"+"log4j.appender.stdout=org.apache.log4j.ConsoleAppender \n"
                    +"log4j.appender.stdout.Target=System.out \n"+"log4j.appender.stdout.layout=org.apache.log4j.PatternLayout \n"+"log4j.appender.stdout.layout.ConversionPattern=%d{yy/MM/dd HH:mm:ss} %p %c{2}: %m%n \n");


           w.close();
           return true;
           
        } catch (IOException ex) {
           System.out.println("Impossibile scrivere il file"+ex);
        }
        
    return false;
    }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     *
     * @return
     */
    public boolean exists(){
    File log = new File(getPath());
    return log.exists();
    }    
}
