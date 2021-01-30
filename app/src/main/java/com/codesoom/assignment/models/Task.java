package com.codesoom.assignment.models;

/**
 * id와 할 일을 저장합니다.
 */

public class Task {
    private Long id;
    private  String title;

    public Task(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return "Task - title : " + title;
    }

}
