package com.springbackendLecture.Head03_OOP.example13;

public class AnonymousClassExample {
    public static void main(String[] args) {

        //익명클래스 사용
        EventListener listener = new EventListener() {
            @Override
            public void onEvent(String eventData) {
                System.out.println("이벤트 발생: " + eventData);
            }
        };

        EventListener listener1 = new EventListener() {
            @Override
            public void onEvent(String eventData) {
                System.out.println("이벤트 발생2: " + eventData);
            }
        };

        simulateEvent("USER_LOGIN", listener);
        simulateEvent("USER_LOGOUT", listener1);
    }
    public static void simulateEvent(String eventName, EventListener listener) {
        listener.onEvent(eventName);
    }
}
