package ru.yandex.praktikum.exception;

public class ManagerSaveException extends RuntimeException {
    public ManagerSaveException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
