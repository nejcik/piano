package sample;

import javafx.scene.media.AudioClip;
import java.util.HashMap;
import java.util.Map;

public class Key {

    AudioClip note;
    Map<Integer,AudioClip> notesInt = new HashMap<Integer,AudioClip>();
   //Map<String,Integer> keyMap = new HashMap<String,Integer>();


    public Map<Integer, AudioClip> getNote() {
        return notesInt;
    }

    public Key() {
        for(int i=1;i<=24;i++) {

            note = new AudioClip(getClass().getResource( i + "N.wav").toString());
            notesInt.put(i,note);

        }
    }



    public void playNote(int idx){
        AudioClip n=notesInt.get(idx);
        n.play();
        //System.out.println(n.toString());
        //notes.get(idx).play();

    }
}


//testy: jak dziala odtwarzanie, wczytywanie, mapa