package com.generator;

import java.util.ArrayList;

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
public class AdverbialOfPlace extends Adverbial{
	public AdverbialOfPlace() {
		library.add("morning");
		library.add("sideways");
		library.add("night");
		library.add("do");
		library.add("improperly");
		library.add("in Polish");
		library.add("with your lord");
		library.add("improperly");
		library.add("deathly");
		library.add("thought");
		library.add("deathly");
		library.add("very");
		library.add("high");
		library.add("to school");
		library.add("stuttering");
		library.add("silence");
		library.add("with smile");
		library.add("pale as snow");
		library.add("stupid like a donkey");
		library.add("cry like a beaver");
	}
}
