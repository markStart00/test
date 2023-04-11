package org.example;

public class One {

    private final String NAME = "ComputerX1";
    private int id;

    public One (int id) {
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {

        if (id < 0 || id > 100) throw new IllegalArgumentException("id must be between 0 and 100");
        else this.id = id;

    }



}
