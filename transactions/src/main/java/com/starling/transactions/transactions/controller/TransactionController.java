package com.starling.transactions.transactions.controller;

import com.starling.transactions.transactions.entity.Accounts;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {

    @GetMapping("/accounts")
    public String getAccounts() {
        return "{\n" +
                "  \"accounts\": [\n" +
                "    {\n" +
                "      \"accountUid\": \"bbccbbcc-bbcc-bbcc-bbcc-bbccbbccbbcc\",\n" +
                "      \"accountType\": \"PRIMARY\",\n" +
                "      \"defaultCategory\": \"ccddccdd-ccdd-ccdd-ccdd-ccddccddccdd\",\n" +
                "      \"currency\": \"GBP\",\n" +
                "      \"createdAt\": \"2021-10-30T20:10:03.026Z\",\n" +
                "      \"name\": \"Personal\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }

    @GetMapping("/transactions")
    public String getTransactions() {
        return "{ \"feedItems\": [ { \"feedItemUid\": \"11221122-1122-1122-1122-112211221122\", \"categoryUid\": \"ccddccdd-ccdd-ccdd-ccdd-ccddccddccdd\", \"amount\": { \"currency\": \"GBP\", \"minorUnits\": 123456 }, \"sourceAmount\": { \"currency\": \"GBP\", \"minorUnits\": 123456 }, \"direction\": \"IN\", \"updatedAt\": \"2021-10-30T22:45:43.122Z\", \"transactionTime\": \"2021-10-30T22:45:43.122Z\", \"settlementTime\": \"2021-10-30T22:45:43.122Z\", \"retryAllocationUntilTime\": \"2021-10-30T22:45:43.122Z\", \"source\": \"MASTER_CARD\", \"sourceSubType\": \"CONTACTLESS\", \"status\": \"PENDING\", \"transactingApplicationUserUid\": \"aaaaaaaa-aaaa-4aaa-aaaa-aaaaaaaaaaaa\", \"counterPartyType\": \"MERCHANT\", \"counterPartyUid\": \"68e16af4-c2c3-413b-bf93-1056b90097fa\", \"counterPartyName\":\"Tesco\",\"counterPartySubEntityUid\":\"35d46207-d90e-483c-a40a-128cc4da4bee\",\"counterPartySubEntityName\":\"Tesco Southampton\",\"counterPartySubEntityIdentifier\":\"608371\",\"counterPartySubEntitySubIdentifier\":\"01234567\",\"exchangeRate\":0,\"totalFees\":0,\"totalFeeAmount\":{\"currency\":\"GBP\",\"minorUnits\": 123456}, \"reference\": \"TESCO-STORES-6148 SOUTHAMPTON GBR\", \"country\": \"GB\", \"spendingCategory\": \"GROCERIES\", \"userNote\": \"Tax deductable, submit me to payroll\", \"roundUp\": { \"goalCategoryUid\": \"68e16af4-c2c3-413b-bf93-1056b90097fa\", \"amount\": { \"currency\": \"GBP\", \"minorUnits\": 123456 } }, \"hasAttachment\": true, \"hasReceipt\": true}]}";
    }

    @PutMapping("/save")
    public ResponseEntity<String> saveSavingGoal(String request){

        return ResponseEntity.ok("");
    }

    @GetMapping
    public String getSavingsGoal() {
      return "{\n" +
              "  \"savingsGoalList\": [\n" +
              "    {\n" +
              "      \"savingsGoalUid\": \"77887788-7788-7788-7788-778877887788\",\n" +
              "      \"name\": \"Trip to Paris\",\n" +
              "      \"target\": {\n" +
              "        \"currency\": \"GBP\",\n" +
              "        \"minorUnits\": 123456\n" +
              "      },\n" +
              "      \"totalSaved\": {\n" +
              "        \"currency\": \"GBP\",\n" +
              "        \"minorUnits\": 123456\n" +
              "      },\n" +
              "      \"savedPercentage\": 100\n" +
              "    }\n" +
              "  ]\n" +
              "}";
    }
}
