package org.example;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("Factory method called ALARMMMMMMMMMMMMMMMMMMM");
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Class ClassicalMusic created");
    }

    public void doMyDestroy() {
        System.out.println("Class ClassicalMusic destroyed");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
