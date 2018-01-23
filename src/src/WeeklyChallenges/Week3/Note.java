package WeeklyChallenges.Week3;

public class Note {
    String name;
    int semitone;

    public Note(String name,int semitone){
        this.name = name;
        this.semitone = semitone;
    }

    @Override
    public String toString() {
        return "\""+name+"\"";
    }
}
