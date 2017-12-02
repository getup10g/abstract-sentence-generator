package com.generator;


import java.util.ArrayList;
import java.util.Random;

/*

Trzeba zrobić:
klasę SentencePart (część zdania)
dziedziczące z niej klasy Podmiot, Orzeczenie, Okolicznik (znajdź angielskie nazwy pls)
Z Okolicznika będą dziedziczyły OkolicznikCzasu, OkolicznikMiejsca, OkolicznikSposobu
Klasa SentencePart będzie posiadała metodę "generate", która będzie proponowała jakiś wylosowany wyraz
wyrazy będą losowane z wbudowanej w klasę tablicy
z predefiniowanymi wyrazami (np. 20)
Do tego wszystkiego będzie klasa Sentence
która będzie się składała z pól: podmiot, orzeczenie, okolicznik
rodzaj okolicznika będzie losowany - raz będzie to okolicznik sposobu, raz miejsca itd
Plus klasa reprezentująca wiersz.
Zaproponuj jej nazwę
Wiersz będzie się składał ze zdań
A główny program będzie generował taki wiersz - parametrem będzie liczba zdań.

 */
public class SentencePart {
    protected ArrayList<String> library = new ArrayList<String>();
    Random generator = new Random();

    public String generate(){
        return library.get((generator.nextInt(19)));
    }
}
