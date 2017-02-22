package eu.bittrade.libs.steem.api.wrapper.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author<a href="http://steemit.com/@dez1337">dez1337</a>
 */
public class AccountWitnessVoteOperation extends Operation {
    @JsonProperty("account")
    private String[] account;
    @JsonProperty("witness")
    private String[] witness;
    @JsonProperty("approve")
    private Boolean approve;

    public String[] getAccount() {
        return account;
    }

    public String[] getWitness() {
        return witness;
    }

    public Boolean getApprove() {
        return approve;
    }
}
