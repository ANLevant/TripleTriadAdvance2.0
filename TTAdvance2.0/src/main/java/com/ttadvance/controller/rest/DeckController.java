package com.ttadvance.controller.rest;

import com.ttadvance.business.dto.DeckDTO;
import com.ttadvance.business.service.IDeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(path="/Deck")
public class DeckController {

    @Autowired
    private IDeckService deckService;

    @RequestMapping(path = "/{deckId}", method = {RequestMethod.GET})
    public DeckDTO getDeck(@PathVariable Long deckId) throws IOException {
        return deckService.findCard(deckId);
    }

}
