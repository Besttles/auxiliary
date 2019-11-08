package com.auxiliary.designer.group;import java.util.ArrayList;import java.util.Arrays;import java.util.List;public class Brunch implements Node , IBrunch{    private String name;    private int score;    private List<Node> underling = new ArrayList<>();    public Brunch(String name, int score) {        this.name = name;        this.score = score;    }    @Override    public String getInfo() {        return this.name + this.score;    }    @Override    public void addUnderling(Node ... node) {        List<Node> nodes = Arrays.asList(node);        nodes.forEach( node1 -> this.underling.add(node1));    }    @Override    public List<Node> getUL() {        return this.underling;    }}