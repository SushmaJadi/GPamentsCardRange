package com.example.gpayments;

import com.example.gpayments.db.CardRangeDataDB;
import com.example.gpayments.model.CardRangeData;
import com.example.gpayments.repository.CardRangeDataRepository;
import com.example.gpayments.restController.CardRangeController;
import com.example.gpayments.service.CardRangeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class GPaymentsApplicationTests {

	@InjectMocks
	CardRangeDataRepository cardRangeDataRepository;
	@Mock
	CardRangeDataRepository cardRangeDataRepositorymock;
	@Mock
	CardRangeData cardRangeData;
	@InjectMocks
	CardRangeData cardRangeData2;
	@InjectMocks
	CardRangeData cardRangeDataExpected;
	@Mock
	CardRangeService cardRangeService;
	@InjectMocks
	CardRangeService cardRangeServiceinjeck;
	@Mock
	CardRangeController cardRangeController;
	@InjectMocks
	CardRangeDataDB cardRangeDataDB;
	@Test
	void contextLoads() {

		String startRange = "4000000000000100";

		Mockito.when(cardRangeDataRepositorymock.getCardRangeDataList(startRange)).thenReturn(cardRangeDataRepository.getCardRangeDataMap(startRange).get(startRange));
		Mockito.when(cardRangeService.getCardRangeDataListofPAN(startRange)).thenReturn(cardRangeDataRepository.getCardRangeDataList(startRange));
		List<CardRangeData> dataList = cardRangeServiceinjeck.getCardRangeDataListofPAN(startRange);
		cardRangeData = dataList.stream().reduce((s1,v)->s1).get();
		cardRangeDataExpected =Optional.ofNullable(cardRangeDataExpected).map(c->{
			c.setCardBINStartRange("4000000000000100");
			c.setCardBINEndRange("4000000000000199");
			c.setActionInd("A");
			c.setAcsStartProtocolVersion("2.1.0");
			c.setThreeDSMessageUrl("https://secure4.arcot.com/content-server/api/tds2/txn/browser/v1/tds-method");
			c.setAcsEndProtocolVersion("2.1.0");
			c.setAcsInfoInd(List.of("0","1"));
			return c;
		}).get();
		System.out.println(cardRangeData+".."+cardRangeDataExpected.toString());
		Assertions.assertEquals(cardRangeDataExpected
				,cardRangeData);
	}
	@Test
	void postCardRange() {

		String startRange = "4000000000000020";
		String endRange = "4000000000000024";
		String url = "test/url";
		List<String> s = List.of("1","2");

		cardRangeData2	= new CardRangeData();


		 cardRangeData2 = Optional.ofNullable(cardRangeData).map(cardRangeData -> {
			cardRangeData.setCardBINStartRange(startRange);
			cardRangeData.setCardBINEndRange(endRange);
			cardRangeData.setThreeDSMessageUrl(url);
			return cardRangeData;
		}).get();

		List<CardRangeData> cardRangeDataList = new ArrayList<>();

		Mockito.when(cardRangeDataRepositorymock.postCardRangeDataRecord(cardRangeData2)).thenReturn(CardRangeDataDB.panAndCardRangeOfKeyValue(startRange,cardRangeData2).values().stream().reduce((s5,v)->s5).get());

		cardRangeDataList = cardRangeServiceinjeck.postCardRangeDataRecord(cardRangeData2);

		CardRangeData rangeData =cardRangeDataList.stream().reduce((s3,v)->s3).get();

		assert ( cardRangeData2.getCardBINStartRange()).equals(rangeData.getCardBINStartRange());

	}


}
