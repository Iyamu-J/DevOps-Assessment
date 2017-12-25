import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author IYAMU A JOSHUA
 */
public class StartApp {

    public static void main(String[] args) {
        StartApp sa = new StartApp();
        System.out.println(sa.executeCommand());
    }

    // Method checks for the OS type and uses the appropriate command
    public String executeCommand() {
        // Check for OS type
        String os = System.getProperty("os.name").toLowerCase();
        String command;
        if (os.startsWith("win")) {
            command = runApp("docker-compose up");
        } else if (os.startsWith("mac")) {
            command = runApp("docker-compose up");
        } else if (os.startsWith("lin")) {
            command = runApp("sudo docker-compose up");
        } else {
            command = "OS not supported";
        }
        return command;
    }

    // Method takes the command and writes it on the terminal or command-line
    public String runApp(String command) {

        StringBuffer output = new StringBuffer();

        try {
            Process process = Runtime.getRuntime().exec(command);
            process.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = "";
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
            }
        } catch (IOException | InterruptedException e) {
            System.err.println(e);
            System.err.println("Please ensure you've met the requirements specified in the readme.md");
            System.exit(-1);
        }
        return output.toString();
    }
}
