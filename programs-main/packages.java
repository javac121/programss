import java.io.File;

public class CreatePackage {
    public static void main(String[] args) {
        String packageName = "com.example.mypackage";

        // Convert package name to directory path
        String packagePath = packageName.replace('.', File.separatorChar);

        // Create the package directory
        File packageDir = new File(packagePath);
        if (!packageDir.exists()) {
            boolean created = packageDir.mkdirs();
            if (created) {
                System.out.println("Package created successfully.");
            } else {
                System.out.println("Failed to create the package directory.");
            }
        } else {
            System.out.println("Package already exists.");
        }
    }
}
