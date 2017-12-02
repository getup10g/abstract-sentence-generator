package com.generator;

import java.util.ArrayList;

public class ConnectedSentence {
    private ArrayList<String> library = new ArrayList<String>();
    Sentence s = new Sentence();

    public ConnectedSentence(int j) {

        for (int i = 0; i < j; i++) {
            s.setSenteceParts();
            String sentence = s.getSubject() + " " + s.getVerb() + " " + s.getAdverbial();
            library.add(sentence);
        }
    }
    public void PrintSentences() {
        for (int i = 0; i < library.size(); i++) {
            System.out.println(library.get(i));
        }
        }

}
