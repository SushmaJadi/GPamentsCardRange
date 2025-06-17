package com.example.gpayments.configure;

import com.example.gpayments.model.CardRangeData;
import com.example.gpayments.repository.CardRangeDataRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Configuration
public class CardRangeThreeDSMethodURLConfiguration {
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private CardRangeDataRepository cardRangeDataRepository;
    private CardRangeData cardRangeData;
    private String primaryAccountNumber;

    public ObjectMapper getLogCardRangeThreeDSMethodURL() throws IOException {
        cardRangeData = new CardRangeData();
        cardRangeData.setCardBINStartRange("400000");
        cardRangeData.setCardBINEndRange("400099");
        cardRangeData.setThreeDSMessageUrl("www.insert/ThreeDSMessageUrl");
        List<CardRangeData> cardRangeDataList = cardRangeDataRepository.postCardRangeDataRecord(cardRangeData);
        objectMapper.writeValue(new File("C:/Users/sushm/Downloads/Projects/outline/demo/recordInsertionInCardRangeList.json"), cardRangeDataList);
        return objectMapper;
    }

    public void logCardRange() throws IOException {
        Logger logger = LoggerFactory.getLogger(CardRangeThreeDSMethodURLConfiguration.class);
        logger.info(getLogCardRangeThreeDSMethodURL().writeValueAsString(cardRangeDataRepository.getClass()));
    }


}
