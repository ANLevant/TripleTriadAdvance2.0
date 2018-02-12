package com.ttadvance.business.service.impl;

import com.ttadvance.business.dto.CardDTO;
import com.ttadvance.business.dto.DeckDTO;
import com.ttadvance.business.mappers.EntityToDTOMapper;
import com.ttadvance.persistence.dao.CardDAO;
import com.ttadvance.persistence.model.Card;
import com.ttadvance.persistence.model.Deck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttadvance.business.service.ICardService;

import java.io.IOException;

@Service
public class CardServiceImpl implements ICardService {

    @Autowired
    private CardDAO cardDao;

    @Override
    public CardDTO findCard(Long cardId) throws IOException {
        Card card = cardDao.findOne(cardId);
        return new EntityToDTOMapper<Card, CardDTO>().map(card, CardDTO.class);
    }
}
