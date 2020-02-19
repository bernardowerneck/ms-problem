package com.bernardo.msquestion;

import java.util.List;

import com.bernardo.msquestion.contentelements.ContentElement;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Problem {
	private Subject subject;
	private List<String> topics;
	private List<String> keywords;
	private List<ContentElement> contents;
	
	public Problem(@JsonProperty("topics") List<String> topics,
					@JsonProperty("subject") Subject subject,
					@JsonProperty("keywords") List<String> keywords, 
					@JsonProperty("contents") List<ContentElement> contents)
	{
		this.subject = subject;
		this.topics = topics;
		this.keywords =  keywords;
		this.contents = contents;
	}
	
	public Problem() {}

	//
	// Métodos de acesso
	//
	public List<ContentElement> getContents() {
		return contents;
	}

	public void setContents(List<ContentElement> contents) {
		this.contents = contents;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}
	
}
