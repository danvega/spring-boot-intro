package com.therealdanvega;

import org.springframework.stereotype.Component;

public class DataSource {

    private String server;
    private int port;

    public DataSource(){

    }

    public DataSource(String server, int port) {
        this.server = server;
        this.port = port;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "server='" + server + '\'' +
                ", port=" + port +
                '}';
    }
}
