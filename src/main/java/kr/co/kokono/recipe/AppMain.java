package kr.co.kokono.recipe;

import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class AppMain {

    private static final int PORT = 8090;

    public static void main(String[] args) throws Exception {
        String webappDirLocation = "src/main/webapp/";
        Tomcat tomcat = new Tomcat();

        tomcat.setPort(PORT);
        tomcat.getConnector();

        tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());

        tomcat.start();
        tomcat.getServer().await();
    }

}
