package com.github.sebastianek12345.model;

public enum Color {

    WHITE(1), BLACK(2), o(0);

    private int value;

    Color(int n) {
        this.value = n;
    }

    @Override
    public String toString() {
        return name().substring(0,1) + "    ";
    }
}
