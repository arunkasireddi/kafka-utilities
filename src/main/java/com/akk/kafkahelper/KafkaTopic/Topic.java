package com.akk.kafkahelper.KafkaTopic;

public class Topic {
    private String name;
    private String key;

    public Topic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "name='" + name + '\'' +
                ", key='" + key + '\'' +
                '}';
    }
}
