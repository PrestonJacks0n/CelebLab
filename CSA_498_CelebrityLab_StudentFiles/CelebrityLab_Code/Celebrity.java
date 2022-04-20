

public class Celebrity {
    private String name;
    private String clue;

    public Celebrity() 
    {
    }

    public Celebrity(String name, String guess) {
        this.name = name.trim().toLowerCase();
        clue = guess;
    }
    public String getName() {
        return name;
    }

    public String getClue() {
        return clue;
    }

    public void setClue(String hint) {
        clue = hint;
    }
}
