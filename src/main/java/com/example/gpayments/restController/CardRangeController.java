package com.example.gpayments.restController;

import com.example.gpayments.model.CardRangeData;
import com.example.gpayments.repository.CardRangeDataRepository;
import com.example.gpayments.service.CardRangeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class CardRangeController {

    @Autowired
    CardRangeDataRepository cardRangeDataRepository;

    @Autowired(required = true)
    CardRangeService cardRangeService;
    private Logger logger = LoggerFactory.getLogger(CardRangeDataRepository.class);


    @RequestMapping(method = RequestMethod.GET, path = "/getCardRangeWithPAN/{primaryAccountNumber}")
    public List<CardRangeData> getCardRangeDataList(@PathVariable("primaryAccountNumber") String primaryAccountNumber) {
        return cardRangeService.getCardRangeDataListofPAN(primaryAccountNumber);
    }


    @RequestMapping(method = RequestMethod.POST, path = "/insertCardRange", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String postCardRangeDataRecord(@RequestBody CardRangeData cardRangeData) {
        cardRangeData = cardRangeService.postCardRangeDataRecord(cardRangeData).stream().reduce((s, v) -> s).get();
        return  cardRangeData+ " has been Successfully " + HttpStatus.CREATED.getReasonPhrase();
    }


}
