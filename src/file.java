import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class file {
    public static void main(String[] args) {
        String basePath = "C:\\Users\\breje\\IdeaProjects\\java1\\src\\Patterns";
        createFiles(basePath);
    }

    public static void createFiles(String basePath) {
        File directory = new File(basePath);
        if (!directory.exists()) {
            directory.mkdirs(); // Create directories if they don't exist
        }

        for (int i = 4; i <= 20; i++) {
            String fileName = "Pattern_" + i + ".java";
            File file = new File(basePath, fileName);
            try {
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getAbsolutePath());
                    // Write some initial content to the file
                    PrintWriter writer = new PrintWriter(file);
                    writer.println("public class " + fileName.replace(".java", "") + " {");
                    writer.println("\tpublic static void main(String[] args) {");
                    writer.println("\t\t// Your code here");
                    writer.println("\t}");
                    writer.println("}");
                    writer.close();
                } else {
                    System.out.println("File already exists: " + file.getAbsolutePath());
                }
            } catch (IOException e) {
                System.err.println("Error creating file: " + e.getMessage());
            }
        }
    }
}
