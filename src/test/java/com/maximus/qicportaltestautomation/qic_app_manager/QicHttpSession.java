package com.maximus.qicportaltestautomation.qic_app_manager;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.LaxRedirectStrategy;

import java.io.IOException;

public class QicHttpSession {

    private CloseableHttpClient httpClient;
    private QicPortalProjectManager pm;

    public QicHttpSession(QicPortalProjectManager pm) {
        this.pm = pm;
        httpClient = HttpClients.custom().setRedirectStrategy(new LaxRedirectStrategy()).build();
    }

    public void closeHttpSession()  {
        if (httpClient != null) {
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
