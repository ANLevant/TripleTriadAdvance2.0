package com.ttadvance.business.service.impl;

import com.ttadvance.business.dto.DeckDTO;
import com.ttadvance.business.mappers.EntityToDTOMapper;
import com.ttadvance.business.service.IDeckService;
import com.ttadvance.persistence.dao.DeckDAO;
import com.ttadvance.persistence.model.Deck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DeckServiceImpl implements IDeckService {

    @Autowired
    private DeckDAO deckDao;

    @Override
    public DeckDTO findCard(Long deckId) throws IOException {
        Deck deck = deckDao.findOne(deckId);
        return new EntityToDTOMapper<Deck, DeckDTO>().map(deck, DeckDTO.class);
    }
}
