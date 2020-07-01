package com.bernardo.msquestion;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MockQuestion 
{
	private String title;
	private String content;
	private int index;
	
	public MockQuestion() {}
	
	public MockQuestion(@JsonProperty("title") String title,
						@JsonProperty("content") String content,
						@JsonProperty("index") int index)
	{
		this.title = title;
		this.content = content;
		this.index = index;
	}
	
	//
	// Métodos de acesso
	//
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
