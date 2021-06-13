package com.company.webservice.controller;

import com.company.webservice.models.Answer;
import com.company.webservice.models.Definition;
import com.company.webservice.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class ApplicationController {

    Random rand = new Random();

    private static List<Quote> quoteList = new ArrayList<>(Arrays.asList(
            new Quote(1, "Robert H. Schiuller", "Tough times never last but tough people do"),
            new Quote(2,"Harvey Specter","I could agree with you but then we’d both be wrong"),
            new Quote(3,"Amy Poehler","Change the world by being yourself"),
            new Quote(4, "Mark Twain","Never regret anything that made you smile"),
            new Quote(5,"Pablo Picasso","Everything you can imagine is real"),
            new Quote(6,"Leonardo da Vinci","Simplicity is the ultimate sophistication"),
            new Quote(7,"Walt Disney","Whatever you do, do it well"),
            new Quote(8,"Buddha","What we think, we become"),
            new Quote(9,"Eileen McDargh","Determine your priorities and focus on them"),
            new Quote(10,"Oprah Winfrey","Turn your wounds into wisdom")
    ));

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Quote getRandomQuote(){
        int randomQuoteIndex = rand.nextInt(quoteList.size());
        return quoteList.get(randomQuoteIndex);
    }

    private static List<Definition> definitionList = new ArrayList<>(Arrays.asList(
            new Definition(1, "intend", "have in mind as a purpose"),
            new Definition(2,"concern", "something that interests you because it is important"),
            new Definition(3,"scarce", "deficient in quantity or number compared with the demand"),
            new Definition(4,"theory", "a well-substantiated explanation of some aspect of the world"),
            new Definition(5,"earnest","characterized by a firm, humorless belief in one's opinions"),
            new Definition(6,"territory","the geographical area under the jurisdiction of a state"),
            new Definition(7,"scheme","an elaborate and systematic plan of action"),
            new Definition(8,"despair","a state in which all hope is lost or absent"),
            new Definition(9,"contempt","lack of respect accompanied by a feeling of intense dislike"),
            new Definition(10,"attribute","a quality belonging to or characteristic of an entity")
    ));

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Definition getRandomDefinition(){
        int randomDefinitionIndex = rand.nextInt(quoteList.size());
        return definitionList.get(randomDefinitionIndex);
    }

    private static  List<Answer> answerList = new ArrayList<>();
    private static int idCount = +1;

    private static List<String> answerString = new ArrayList<>(Arrays.asList(
            "for every action, there is an equal and opposite reaction",
            "Remains of a hobbit-sized human",
            "it is a dwarf planet",
            "The sperm whale",
            "Boxing Day",
            "The Arctic",
            "The Pacific Ocean",
            "Is the substance that nails made out of."


    ));

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Answer getMagic8Ball(@RequestBody Answer answer) {
        int randomAnswerIndex = rand.nextInt(answerString.size());
        String randAnswer = answerString.get(randomAnswerIndex);

        answer.setId(idCount++);
        answer.setAnswer(randAnswer);
        answerList.add(answer);

        return answer;
    }
}
