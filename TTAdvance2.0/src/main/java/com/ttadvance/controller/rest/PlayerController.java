package com.ttadvance.controller.rest;

import com.ttadvance.business.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;

public class PlayerController {

    @Autowired
    private IPlayerService playerService;
}

