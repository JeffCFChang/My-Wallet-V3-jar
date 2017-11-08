package info.blockchain.wallet.shapeshift.data;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE,
    getterVisibility = JsonAutoDetect.Visibility.NONE,
    setterVisibility = JsonAutoDetect.Visibility.NONE,
    creatorVisibility = JsonAutoDetect.Visibility.NONE,
    isGetterVisibility = JsonAutoDetect.Visibility.NONE)
public class TradeStatusResponse {

    @JsonProperty("status")
    private String status;

    @JsonProperty("address")
    private String address;

    @JsonProperty("withdraw")
    private String withdraw;

    @JsonProperty("incomingCoin")
    private double incomingCoin;

    @JsonProperty("incomingType")
    private String incomingType;

    @JsonProperty("outgoingCoin")
    private double outgoingCoin;

    @JsonProperty("outgoingType")
    private String outgoingType;

    @JsonProperty("transaction")
    private String transaction;

    @JsonProperty("error")
    private String error;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(String withdraw) {
        this.withdraw = withdraw;
    }

    public double getIncomingCoin() {
        return incomingCoin;
    }

    public void setIncomingCoin(double incomingCoin) {
        this.incomingCoin = incomingCoin;
    }

    public String getIncomingType() {
        return incomingType;
    }

    public void setIncomingType(String incomingType) {
        this.incomingType = incomingType;
    }

    public double getOutgoingCoin() {
        return outgoingCoin;
    }

    public void setOutgoingCoin(double outgoingCoin) {
        this.outgoingCoin = outgoingCoin;
    }

    public String getOutgoingType() {
        return outgoingType;
    }

    public void setOutgoingType(String outgoingType) {
        this.outgoingType = outgoingType;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public static TradeStatusResponse fromJson(String json) throws IOException {
        return new ObjectMapper().readValue(json, TradeStatusResponse.class);
    }

    @JsonIgnore
    public String toJson() throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(this);
    }
}