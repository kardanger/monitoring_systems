package com.itmo.diplom.service;

public class DeckInfo {

    private String  nextLink;
    private String  prevLink;

    private String  link;
    private String  linkImage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String  name;

    private int id;

    public String getNextLink() {
        return nextLink;
    }

    public void setNextLink(String nextLink) {
        this.nextLink = nextLink;
    }

    public String getPrevLink() {
        return prevLink;
    }

    public void setPrevLink(String prevLink) {
        this.prevLink = prevLink;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
