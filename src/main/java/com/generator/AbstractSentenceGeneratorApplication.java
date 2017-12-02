package com.generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractSentenceGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbstractSentenceGeneratorApplication.class, args);
		ConnectedSentence conectedSentence = new ConnectedSentence(20);
		conectedSentence.PrintSentences();

	}


}
