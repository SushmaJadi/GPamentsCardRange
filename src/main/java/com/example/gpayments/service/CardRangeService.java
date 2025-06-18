package com.example.gpayments.service;
import com.example.gpayments.model.CardRangeData;
import com.example.gpayments.repository.CardRangeDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardRangeService {
    private List<CardRangeData> cardRangeDataList;
    @Autowired
    CardRangeDataRepository cardRangeDataRepository;
    @Autowired
    CardRangeData cardRangeData;
    private Logger logger = LoggerFactory.getLogger(CardRangeService.class);

    public List<CardRangeData> getCardRangeDataListofPAN(String primaryAccountNumber) {
        cardRangeDataList = cardRangeDataRepository.getCardRangeDataList(primaryAccountNumber);
        logger.info("serviceClass" + cardRangeDataList.toString());
        return cardRangeDataList;
    }

    public List<CardRangeData> postCardRangeDataRecord(CardRangeData cardRangeData) {
        return cardRangeDataRepository.postCardRangeDataRecord(getCardRangeDataMapping(cardRangeData));
    }

    private CardRangeData getCardRangeDataMapping(CardRangeData cardRangeData) {
        this.cardRangeData
                .setCardBINStartRange(Optional.ofNullable(cardRangeData)
                        .map(CardRangeData::getCardBINStartRange)
                        .orElseThrow(() -> new IllegalArgumentException("not valid input")));
        this.cardRangeData
                .setCardBINEndRange(Optional.ofNullable(cardRangeData)
                        .map(CardRangeData::getCardBINEndRange)
                        .orElseThrow(() -> new IllegalArgumentException("not valid input")));
        this.cardRangeData
                .setActionInd(Optional.ofNullable(cardRangeData)
                        .map(CardRangeData::getActionInd)
                        .orElse(null));
        this.cardRangeData
                .setThreeDSMessageUrl(Optional.ofNullable(cardRangeData)
                        .map(CardRangeData::getThreeDSMessageUrl)
                        .orElseThrow(() -> new IllegalArgumentException("not valid input")));
        this.cardRangeData
                .setAcsEndProtocolVersion(Optional.ofNullable(cardRangeData)
                        .map(CardRangeData::getAcsEndProtocolVersion)
                        .orElse(null));
        this.cardRangeData
                .setAcsStartProtocolVersion(Optional.ofNullable(cardRangeData)
                        .map(CardRangeData::getAcsStartProtocolVersion)
                        .orElse(null));
        this.cardRangeData
                .setAcsInfoInd(Optional.ofNullable(cardRangeData)
                        .map(CardRangeData::getAcsInfoInd)
                        .orElse(null));

        return this.cardRangeData;
    }
}
