package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "questions")
public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String question;
	private int correctoptionid;
	
	public Questions() {}
	
	public Questions(int id, String question, int correctoptionid) {
		super();
		this.id = id;
		this.question = question;
		this.correctoptionid = correctoptionid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getCorrectoptionid() {
		return correctoptionid;
	}

	public void setCorrectoptionid(int correctoptionid) {
		this.correctoptionid = correctoptionid;
	}
	
		
}
