package com.bernardo.msquestion.contentelements;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChoicesContent extends ContentElement
{
	private String[] choices;
	
	public ChoicesContent(@JsonProperty("choices") String[] choices,
						  @JsonProperty("index") Integer index)
	{
		super(index);
		this.choices = choices;
	}
	
	public ChoicesContent() 
	{
		super();
	}
	
	//
	// Métodos de acesso
	//
	public String[] getChoices() {
		return choices;
	}
	
	public void setChoices(String[] choices) {
		this.choices = choices;
	}
	
}
