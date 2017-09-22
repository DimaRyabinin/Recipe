package com.hfad.recipe;

/**
 * Created by spamlik on 22.09.17.
 */

public class FirstCourse {
    private String name;
    private String description;
    private int imageResourceId;

    public static final FirstCourse[] courses = {
            new FirstCourse("Щи", "Щи — разновидность заправочного супа, национальное русское блюдо.",
                    R.drawable.soupe),
            new FirstCourse("Борщ", "Суп со свёклой и другими овощами.",
                    R.drawable.borsch),
            new FirstCourse("Уха", "Суп из свежей рыбы.",
                    R.drawable.ear)
    };

    private FirstCourse(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
