package com.phinacio.langchain.demo.service;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface Assistant {

    @SystemMessage("You are a polite assistant")
    String chat(String userMessage);
}