import java.util.Scanner;

public class Celebrity {
    private String name;
    private String hint;

    public Celebrity() 
    {
    }

    public Celebrity(String name) {
        this.name = name.trim().toLowerCase();
    }
    public String getName() {
        return name;
    }

    public String getHint() {
        return hint;
    }
}
