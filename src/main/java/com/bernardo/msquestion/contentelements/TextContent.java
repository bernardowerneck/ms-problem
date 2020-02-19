package com.bernardo.msquestion.contentelements;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TextContent extends ContentElement
{
	private String text;
	
	public TextContent() {
		super();
	}
	
	public TextContent(@JsonProperty("index") Integer index,
					   @JsonProperty("text") String text) {
		super(index);
		this.text = text;
	}

	//
	// Métodos de acesso
	// 
	public String getText() {
		return text;
	}

	public void setText(String content) {
		this.text = content;
	}
	
}
