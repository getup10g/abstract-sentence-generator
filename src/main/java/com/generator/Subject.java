package com.generator;


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

import java.util.ArrayList;

public class Subject extends SentencePart {
	public Subject() {
		library.add("bicycle");
		library.add("Tom");
		library.add("he");
		library.add("Tom's mother");
		library.add("I");
		library.add("Paul");
		library.add("Peter");
		library.add("Frank");
		library.add("Tree");
		library.add("dog");
		library.add("Anna");
		library.add("Ant");
		library.add("woman");
		library.add("man");
		library.add("teacher");
		library.add("friend");
		library.add("people");
		library.add("they");
		library.add("guys");
		library.add("soldiers");
	}
}
