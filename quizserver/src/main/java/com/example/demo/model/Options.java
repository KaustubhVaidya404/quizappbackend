package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "options")
public class Options {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int questionid;
	private String optiontext;
	
	public Options() {}
	
	public Options(int id, int questionid, String optiontext) {
		super();
		this.id = id;
		this.questionid = questionid;
		this.optiontext = optiontext;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuestionid() {
		return questionid;
	}

	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}

	public String getOptiontext() {
		return optiontext;
	}

	public void setOptiontext(String optiontext) {
		this.optiontext = optiontext;
	}
	
	
}
