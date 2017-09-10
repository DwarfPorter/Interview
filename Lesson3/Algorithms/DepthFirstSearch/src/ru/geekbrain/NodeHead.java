package ru.geekbrain;

public class NodeHead {
    private String name;
    private int id;

    public NodeHead(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getId() {
        return id;
    }
}
