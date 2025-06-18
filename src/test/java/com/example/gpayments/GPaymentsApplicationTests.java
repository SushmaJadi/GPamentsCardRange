package com.example.gpayments;

import com.example.gpayments.db.CardRangeDataDB;
import com.example.gpayments.model.CardRangeData;
import com.example.gpayments.repository.CardRangeDataRepository;
import com.example.gpayments.restController.CardRangeController;
import com.example.gpayments.service.CardRangeService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class GPaymentsApplicationTests {

    @InjectMocks
    CardRangeDataRepository cardRangeDataRepository;
    @Mock
    CardRangeDataRepository cardRangeDataRepositorymock;
    @Mock
    CardRangeData cardRangeData;
    @InjectMocks
    CardRangeDataRepository cardRangeServiceInjeck;
    @Mock
    CardRangeService cardRangeService;
    @InjectMocks
    CardRangeController cardRangeController;

    @Test
    void contextLoads() {

        String startRange = "4000000000000100";

        Mockito.when(cardRangeDataRepositorymock.getCardRangeDataMap(startRange)).thenReturn(CardRangeDataDB.panAndCardRangeOfKeyValue(startRange, cardRangeData));
        Mockito.when(cardRangeDataRepositorymock.getCardRangeDataList(startRange)).thenReturn(cardRangeDataRepository.getCardRangeDataMap(startRange).get(startRange));
        Mockito.when(cardRangeController.getCardRangeDataList(startRange)).thenReturn(cardRangeDataRepository.getCardRangeDataList(startRange));

    }

    @Test
    void postCardRange() {

        String startRange = "4000000000000020";
        String endRange = "4000000000000024";
        String url = "test/url";
        List<String> s = List.of("1", "2");

        cardRangeData = new CardRangeData();
        cardRangeData.setCardBINStartRange(startRange);
        cardRangeData.setCardBINEndRange(endRange);
        cardRangeData.setThreeDSMessageUrl(url);

        Mockito.when(cardRangeDataRepositorymock.getCardRangeDataMap(cardRangeData.getCardBINStartRange())).thenReturn(CardRangeDataDB.panAndCardRangeOfKeyValue(cardRangeData.getCardBINStartRange(), cardRangeData));
        Mockito.when(cardRangeDataRepositorymock.postCardRangeDataRecord(cardRangeData)).thenReturn(CardRangeDataDB.panAndCardRangeOfKeyValue(startRange, cardRangeData).values().stream().reduce((s5, v) -> s5).get());
        Mockito.when(cardRangeService.postCardRangeDataRecord(cardRangeData)).thenReturn(cardRangeDataRepository.postCardRangeDataRecord(cardRangeData));
        Mockito.when(cardRangeController.postCardRangeDataRecord(cardRangeData)).thenReturn(cardRangeServiceInjeck.postCardRangeDataRecord(cardRangeData).stream().toString());
    }
}



