package com.example.gpayments.repository;

import com.example.gpayments.db.CardRangeDataDB;
import com.example.gpayments.model.CardRangeData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.function.Predicate;


@Repository
public class CardRangeDataRepository {
    private List<CardRangeData> cardRangeDataList;
    private String primaryAccountNumber;
    private Logger logger = LoggerFactory.getLogger(CardRangeDataRepository.class);
    private Predicate<String> pannumber;
    private Map<String, List<CardRangeData>> cardRangeDataMap;
    private Map<String, List<CardRangeData>> insertCardRangeDataMap;
    private Map<String, List<CardRangeData>> data2;

    @Autowired
    private CardRangeData cardRangeData;


    public Map<String, List<CardRangeData>> getCardRangeDataMap(String primaryAccountNumber) {
        cardRangeDataMap = CardRangeDataDB.panAndCardRangeOfKeyValue(primaryAccountNumber, cardRangeData);
//        logger.info("card Repository"+CardRangeDataDB.panAndCardRangeOfKeyValue(primaryAccountNumber, cardRangeData));
        return cardRangeDataMap;
    }

    public Map<String, List<CardRangeData>> insertCardRangeDataMap(String primaryAccountNumber, CardRangeData cardRangeData) {
        insertCardRangeDataMap = CardRangeDataDB.panAndCardRangeOfKeyValue(primaryAccountNumber, cardRangeData);
        return cardRangeDataMap;
    }


    private Set<Map.Entry<String, List<CardRangeData>>> getAllCardrangeEntries(String primaryAccountNumber) {
        return getCardRangeDataMap(primaryAccountNumber).entrySet();
    }


    private List<CardRangeData> getCardRangeGetValues(String primaryAccountNumber) {
        return getAllCardrangeEntries(primaryAccountNumber)
                .stream()
                .filter(s -> s.getKey().equals(primaryAccountNumber))
                .map(Map.Entry::getValue)
                .reduce((s, v) -> s).get();
    }

    public List<CardRangeData> getCardRangeDataList(String primaryAccountNumber) {
       /* pannumber = s -> s.equals(primaryAccountNumber) ? true : false;
        if (pannumber.test(primaryAccountNumber) == true) {
        */
        cardRangeDataList = getCardRangeGetValues(primaryAccountNumber);
        logger.info("getRangeValues" + cardRangeDataList.toString());
        //  }
        return cardRangeDataList;
    }

    public List<CardRangeData> postCardRangeDataRecord(CardRangeData cardRangeData) {
        List<CardRangeData> data = getCardRangeDataIfPresent(cardRangeData);
        return data;
    }

    private List<CardRangeData> getCardRangeDataIfPresent(CardRangeData cardRangeData) {
        primaryAccountNumber = cardRangeData.getCardBINStartRange();
        logger.info(primaryAccountNumber);
        List<CardRangeData> data = Optional.of(getAllCardrangeEntries(primaryAccountNumber).contains(primaryAccountNumber))
                .map((k) -> {
                    if (k == false) {
                        data2 = insertCardRangeDataMap(primaryAccountNumber, cardRangeData);
                    }
                    return data2.get(primaryAccountNumber);
                })
                .orElseThrow(() -> new RuntimeException("not valid insertion"));
        return data2.get(primaryAccountNumber);
    }


}