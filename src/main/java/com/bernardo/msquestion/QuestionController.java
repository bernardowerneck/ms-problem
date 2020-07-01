package com.bernardo.msquestion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bernardo.msquestion.contentelements.ChoicesContent;
import com.bernardo.msquestion.contentelements.ContentElement;
import com.bernardo.msquestion.contentelements.TextContent;

@RestController
//@RequestMapping(value="/question")
public class QuestionController 
{
//	@RequestMapping(value = "/question", method = RequestMethod.GET)
//	@CrossOrigin
//	public Question questionSupplier()
//	{
//		List<String> topics = new ArrayList<String>();
//		List<String> keywords = new ArrayList<String>();
//		List<ContentElement> contents = new ArrayList<ContentElement>();
//		List<String> options = new ArrayList<String>();
//		
//		topics.add("logaritmo");
//		topics.add("progressao aritmetica");
//		
//		keywords.add("vestibular");
//		keywords.add("uerj");
//		
//		options.add("uala");
//		options.add("oioioi");
//		options.add("AAAAAAA");
//		options.add("testeteste");
//
//		contents.add(new TextContent(0, "Uaba lubba dub dub?"));
//		contents.add(new ChoicesContent((String []) options.toArray(), 1));
//		
//		Problem question = new Problem(Subject.MATEMATICA, topics, "felipeferreira123", keywords, contents);
//		
//		return question;
		
//		return null;
		
//	}
	
	@RequestMapping(value="/question", method = RequestMethod.POST, consumes = "application/json")
	@CrossOrigin
	public String questionReceiver(
			@RequestBody Problem problem
			)
	{
		for(ContentElement content : problem.getContents())
		{
			if(content instanceof TextContent)
				System.out.println(((TextContent) content).getText());
			else if(content instanceof ChoicesContent)
				System.out.println(((ChoicesContent) content).getChoices());
		}
		
		return "oioioi";
	}
	
	@RequestMapping("/question-list")
	@CrossOrigin
	public List<MockQuestion> questionListSupplier()
	{
		List<MockQuestion> questionList = new ArrayList<MockQuestion>();
		
		questionList.add(new MockQuestion("oioioi", "oi", 0));
		questionList.add(new MockQuestion("schrubles", "fribbles", 1));
		questionList.add(new MockQuestion("bom dia", "boa noite", 2));
		questionList.add(new MockQuestion("uala", "alau", 3));
		questionList.add(new MockQuestion("aaaaaa", "bbbbbb", 4));
		
		return questionList;
	}
	
}
