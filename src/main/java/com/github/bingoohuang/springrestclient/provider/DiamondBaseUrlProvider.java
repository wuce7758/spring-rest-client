package com.github.bingoohuang.springrestclient.provider;

import org.n3r.diamond.client.Miner;
import org.springframework.stereotype.Component;

@Component
public class DiamondBaseUrlProvider implements BaseUrlProvider {
    @Override
    public String getBaseUrl(Class<?> apiClass) {
        return new Miner().getMiner("api", "base.urls").getString(apiClass.getSimpleName());
    }
}
