import java.io.*;

class Main {
    public static void main(String[] args) {
        final String PATH = System.getenv("CREDENTIAL_PATH");
        System.out.println(PATH == null ? "Path not set" : PATH);
    }
}
