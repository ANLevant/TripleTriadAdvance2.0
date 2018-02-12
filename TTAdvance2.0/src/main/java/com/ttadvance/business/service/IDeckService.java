package com.ttadvance.business.service;

import com.ttadvance.business.dto.DeckDTO;

import java.io.IOException;

public interface IDeckService {

    DeckDTO findCard(Long deckId) throws IOException;
}
