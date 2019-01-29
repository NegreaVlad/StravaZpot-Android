package com.sweetzpot.stravazpot.authenticaton.request;

import com.sweetzpot.stravazpot.authenticaton.api.AuthenticationAPI;
import com.sweetzpot.stravazpot.authenticaton.rest.AuthenticationRest;

import retrofit2.Call;

public class DeauthorizationRequest {

    private final AuthenticationRest restService;
    private final AuthenticationAPI api;
    private final String accessToken;

    public DeauthorizationRequest(AuthenticationRest restService, AuthenticationAPI api, String accessToken) {
        this.restService = restService;
        this.api = api;
        this.accessToken = accessToken;
    }

    public Void execute() {
        Call<Void> call = restService.deauthorize(accessToken);
        return api.execute(call);
    }
}
