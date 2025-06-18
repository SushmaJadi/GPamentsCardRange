package com.example.gpayments.db;

import com.example.gpayments.model.CardRangeData;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class CardRangeDataDB {
    private static Map<String, List<CardRangeData>> cardRangeDataAssociatedPAN = new HashMap<>();

    public static Map<String, List<CardRangeData>> panAndCardRangeOfKeyValue(String primaryAccountNumer, CardRangeData data) {
        cardRangeDataAssociatedPAN = new HashMap<>();
        cardRangeDataAssociatedPAN.put("4000000000000001", List.of(new CardRangeData("4000000000000001", "4000000000000099", "A", "2.1.0", "https://secure4.arcot.com/content-server/api/tds2/txn/browser/v1/tds-method", "2.1.0", Arrays.asList("0", "1"))));
        cardRangeDataAssociatedPAN.put("4000000000000100", List.of(new CardRangeData("4000000000000100", "4000000000000199", "A", "2.1.0", "https://secure4.arcot.com/content-server/api/tds2/txn/browser/v1/tds-method", "2.1.0", Arrays.asList("0", "1"))));
        cardRangeDataAssociatedPAN.put("4000000000000200", List.of(new CardRangeData("4000000000000200", "4000000000000299", "A", "2.1.0", "https://secure4.arcot.com/content-server/api/tds2/txn/browser/v1/tds-method", "2.1.0", Arrays.asList("0", "1"))));
        cardRangeDataAssociatedPAN.put("4000000000000300", List.of(new CardRangeData("4000000000000300", "4000000000000399", "A", "2.1.0", "https://secure4.arcot.com/content-server/api/tds2/txn/browser/v1/tds-method", "2.1.0", Arrays.asList("0", "1"))));
        cardRangeDataAssociatedPAN.put("4000000000000400", List.of(new CardRangeData("4000000000000400", "4000000000000499", "A", "2.1.0", "https://secure4.arcot.com/content-server/api/tds2/txn/browser/v1/tds-method", "2.1.0", Arrays.asList("0", "1"))));
        cardRangeDataAssociatedPAN.put("4000000000000500", List.of(new CardRangeData("4000000000000500", "4000000000000599", "A", "2.1.0", "https://secure4.arcot.com/content-server/api/tds2/txn/browser/v1/tds-method", "2.1.0", Arrays.asList("0", "1"))));
        cardRangeDataAssociatedPAN.put("4000000000000600", List.of(new CardRangeData("4000000000000600", "4000000000000699", "A", "2.1.0", "https://secure4.arcot.com/content-server/api/tds2/txn/browser/v1/tds-method", "2.1.0", Arrays.asList("0", "1"))));
        cardRangeDataAssociatedPAN.put("4000000000001001", List.of(new CardRangeData("4000000000001001", "4000000000001099", "A", "2.1.0", "https://geoissuer.cardinalcommerce.com/DeviceFingerprintWeb/V2/Browser/RenderMethodURL", "2.1.0", Arrays.asList("0", "1"))));
        cardRangeDataAssociatedPAN.put("4000000000001100", List.of(new CardRangeData("4000000000001100", "4000000000001199", "A", "2.1.0", "https://geoissuer.cardinalcommerce.com/DeviceFingerprintWeb/V2/Browser/RenderMethodURL", "2.1.0", Arrays.asList("0", "1"))));
        cardRangeDataAssociatedPAN.put("4000000000001200", List.of(new CardRangeData("4000000000001200", "4000000000001299", "A", "2.1.0", "https://geoissuer.cardinalcommerce.com/DeviceFingerprintWeb/V2/Browser/RenderMethodURL", "2.1.0", Arrays.asList("0", "1"))));
        cardRangeDataAssociatedPAN.put("4000000000001300", List.of(new CardRangeData("4000000000001300", "4000000000001399", "A", "2.1.0", "https://geoissuer.cardinalcommerce.com/DeviceFingerprintWeb/V2/Browser/RenderMethodURL", "2.1.0", Arrays.asList("0", "1"))));
        cardRangeDataAssociatedPAN.put("4000000000001400", List.of(new CardRangeData("4000000000001400", "4000000000001499", "A", "2.1.0", "https://geoissuer.cardinalcommerce.com/DeviceFingerprintWeb/V2/Browser/RenderMethodURL", "2.1.0", Arrays.asList("0", "1"))));
        cardRangeDataAssociatedPAN.put("4000000000001500", List.of(new CardRangeData("4000000000001500", "4000000000001599", "A", "2.1.0", "https://geoissuer.cardinalcommerce.com/DeviceFingerprintWeb/V2/Browser/RenderMethodURL", "2.1.0", Arrays.asList("0", "1"))));
        cardRangeDataAssociatedPAN.put("4000000000001600", List.of(new CardRangeData("4000000000001600", "4000000000001699", "A", "2.1.0", "https://geoissuer.cardinalcommerce.com/DeviceFingerprintWeb/V2/Browser/RenderMethodURL", "2.1.0", Arrays.asList("0", "1"))));

        cardRangeDataAssociatedPAN.put("4000000000002100", List.of(new CardRangeData("4000000000002001", "4000000000002099", "A", "2.1.0", "2.1.0", Arrays.asList("0", "1"))));
        cardRangeDataAssociatedPAN.put("4000000000002200", List.of(new CardRangeData("4000000000002100", "4000000000002199", "A", "2.1.0", "2.1.0", Arrays.asList("0", "1"))));
        cardRangeDataAssociatedPAN.put("4000000000002300", List.of(new CardRangeData("4000000000002200", "4000000000002299", "A", "2.1.0", "2.1.0", Arrays.asList("0", "1"))));
        cardRangeDataAssociatedPAN.put("4000000000002400", List.of(new CardRangeData("4000000000002300", "4000000000002399", "A", "2.1.0", "2.1.0", Arrays.asList("0", "1"))));
        cardRangeDataAssociatedPAN.put("4000000000002500", List.of(new CardRangeData("4000000000002400", "4000000000002499", "A", "2.1.0", "2.1.0", Arrays.asList("0", "1"))));
        cardRangeDataAssociatedPAN.put("4000000000002400", List.of(new CardRangeData("4000000000002500", "4000000000002599", "A", "2.1.0", "2.1.0", Arrays.asList("0", "1"))));
        cardRangeDataAssociatedPAN.put("4000000000002600", List.of(new CardRangeData("4000000000002600", "4000000000002699", "A", "2.1.0", "2.1.0", Arrays.asList("0", "1"))));

        if (!cardRangeDataAssociatedPAN.containsKey(primaryAccountNumer)) {
            InsertRecordIfPresent(primaryAccountNumer, data);
        }
        return cardRangeDataAssociatedPAN;
    }

    private static Map<String, List<CardRangeData>> InsertRecordIfPresent(String primaryAccountNumer, CardRangeData data) {
        cardRangeDataAssociatedPAN = Optional.ofNullable(cardRangeDataAssociatedPAN)
                .map((m) -> {
                    if (!m.containsKey(primaryAccountNumer)) {
                        m.put(primaryAccountNumer, List.of(data));
                    }
                    return m;
                }).get();
        return cardRangeDataAssociatedPAN;
    }


}
