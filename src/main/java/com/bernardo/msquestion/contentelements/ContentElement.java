package com.bernardo.msquestion.contentelements;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
		  use = JsonTypeInfo.Id.NAME, 
		  include = JsonTypeInfo.As.PROPERTY, 
		  property = "type")
		@JsonSubTypes({ 
		  @Type(value = TextContent.class, name = "text"),
		  @Type(value = ChoicesContent.class, name = "choices")
		})
public abstract class ContentElement 
{
	private Integer index;

	public ContentElement(@JsonProperty("index") Integer index) 
	{
		this.setIndex(index);
	}
	
	public ContentElement() {}

	//
	// Métodos de acesso
	//
	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}
	
}
