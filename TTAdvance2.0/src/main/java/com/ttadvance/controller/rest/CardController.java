package com.ttadvance.controller.rest;

import com.ttadvance.business.dto.CardDTO;
import com.ttadvance.business.service.ICardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(path="/Card")
public class CardController {

    @Autowired
    private ICardService cardService;

    @RequestMapping(path = "/{cardId}", method = {RequestMethod.GET})
    public CardDTO getDeck(@PathVariable Long cardId) throws IOException {
        return cardService.findCard(cardId);
    }
}
