package ru;

/**
 * Author xy6er
 * Date 14.08.15
 */
public class SomeBean {

    private Integer id;
    private String title;
    private SomeBean[] subs;

    public SomeBean[] getSubs() {
        return subs;
    }

    public void setSubs(SomeBean[] subs) {
        this.subs = subs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
