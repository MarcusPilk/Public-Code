package WeeklyChallenges.Week3;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week3Methods {
    private static ArrayList<Note> noteArrayList = new ArrayList<>();
    private static List<String> notes = new ArrayList<>(Arrays.asList(
            "C","C#","D","D#","E","F", "F#","G","G#","A","A#","B"
    ));
    private static List<Integer> scale = new ArrayList<Integer>(Arrays.asList(
            0, 2, 4, 5, 7, 9, 11
    ));
    private static List<String> doremi = new ArrayList<>(Arrays.asList(
            "Do","Re","Mi","Fa","So","La","Ti"
    ));


    public static void main(String[] args) {
        createNotes();
        doStuff(noteArrayList.get(0), "Mi");

    }

    private static void doStuff(Note note, String str){
        ArrayList al = createSubScale(note);
        System.out.println(al.get(0) + " -> " + al.get(getIndex(str)));
    }

    private static void createNotes(){
        for (int i = 0; i < 12; i++) {
            noteArrayList.add(new Note(notes.get(i), i+1));
        }
        System.out.println(noteArrayList.toString());
    }

    private static ArrayList<Note> createSubScale(Note note){
        int start = note.semitone;
        ArrayList<Note> subScale = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            subScale.add(noteArrayList.get((((start + scale.get(i))-1)%12)));
        }
        return subScale;
    }

    private static int getIndex(String str){
        return doremi.indexOf(str);
    }


}
