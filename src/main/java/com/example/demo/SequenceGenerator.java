package com.example.demo;

public class SequenceGenerator {
    private String prefix;
    private String sufix;
    private int initial;
    private int count;

    public SequenceGenerator() {
    }

    public SequenceGenerator(String prefix, String sufix, int initial) {
        this.prefix = prefix;
        this.sufix = sufix;
        this.initial = initial;
    }

    public synchronized String getSequence() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(prefix);
        stringBuffer.append(initial + count++);
        stringBuffer.append(sufix);
        return stringBuffer.toString();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getInitial() {
        return initial;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public String getSuffix() {
        return sufix;
    }

    public void setSuffix(String suffix) {
        this.sufix = suffix;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
