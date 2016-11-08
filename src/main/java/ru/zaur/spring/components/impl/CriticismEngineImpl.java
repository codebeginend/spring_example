package ru.zaur.spring.components.impl;

import ru.zaur.spring.components.interfaces.ICriticismEngine;

public class CriticismEngineImpl implements ICriticismEngine {
    public CriticismEngineImpl() {}
    public String getCriticism() {
        int i = (int) (Math.random() * criticismPool.length);
        return criticismPool[i];
    }
    private String[] criticismPool;
    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;
    }
}