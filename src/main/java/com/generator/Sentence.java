package com.generator;

import java.util.Random;

public class Sentence {
    private String subject;
    private String verb;
    private String adverbial;
    Random generator = new Random();

    public String getAdverbial() {
        return adverbial;
    }

    public String getSubject() {
        return subject;
    }

    public String getVerb() {
        return this.verb;
    }

    public void setSenteceParts() {
        int i = generator.nextInt(3);
        if(i==0) {
            Adverbial adv = new Adverbial();
            this.adverbial = adv.generate();
        }if(i==1){
            AdverbialOfPlace adv = new AdverbialOfPlace();
            this.adverbial = adv.generate();
        }if(i==2){
            AdverbialOfTime adv = new AdverbialOfTime();
            this.adverbial = adv.generate();
        }if(i==3) {
            AdverbialOfManner adv = new AdverbialOfManner();
            this.adverbial = adv.generate();
        }
        Verb verbb = new Verb();
        verb = verbb.generate();
        Subject subjectt = new Subject();
        subject = subjectt.generate();
        }

    }



