package com.ttadvance.business.service;

import com.ttadvance.business.dto.CardDTO;

import java.io.IOException;

public interface ICardService {

    CardDTO findCard(Long cardId) throws IOException;

}
