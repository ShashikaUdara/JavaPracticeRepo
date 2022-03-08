import java.io.*;
import java.util.concurrent.TimeUnit;

public class Execute 
{
    public static void main(String[] args) throws Exception 
    {
        ProcessBuilder builder = new ProcessBuilder();
        
        builder.command("cmd.exe", "/c", "ping -n 3 google.com");
        TimeUnit.MINUTES.sleep(2);
        builder.command("cmd.exe", "/c", "javac Main.java");
        TimeUnit.MINUTES.sleep(2);
        builder.command("cmd.exe", "/c", "java Main");

        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            System.out.println(line);
        }
    }
}