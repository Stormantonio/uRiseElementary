package com.company.Lesson14;

import com.sun.org.apache.regexp.internal.RE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Anton on 22.11.2016.
 */
public class ResumeStorage implements Storage {
    private final int storageMaxLength = 10000;
    private Resume[] storage = new Resume[storageMaxLength];
    private int size = 0;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void save(Resume r) {
        if (isFull()) {
            System.out.println("Хранилище резюме переполнено!!!");
            return;
        }
        if (find(r.getUuid()) != -1) {
            System.out.println("Извините, такое " + r + " резюме уже есть!!!");
            return;
        }
        storage[size] = r;
        size++;
    }

    @Override
    public void delete(String uuid) {
        if (isNull())
            return;
        int findIndex = find(uuid);
        if (findIndex != -1) {
            storage[findIndex] = storage[size - 1];
            size--;
            return;
        }
        System.out.println("Такого " + uuid + " резюме нет!!!");
    }

    @Override
    public Resume get(String uuid) {
        if (isNull())
            return new Resume("");
        int findIndex = find(uuid);
        if (findIndex != -1) {
            return storage[findIndex];
        }

        String message = "Такого " + uuid + " резюме нет!!!";

        return new Resume(message);

    }

    @Override
    public void update(Resume r) throws IOException {
        if (isNull())
            return;
        int findIndex = find(r.getUuid());
        if (find(r.getUuid()) != -1) {
            storage[findIndex] = r;
            System.out.println("Введите изменения:");
            String newResume = reader.readLine();
            if (find(newResume) == -1) {
                storage[findIndex] = new Resume(newResume);
                System.out.println("Резюме " + newResume + " успешно изменено!");
                return;
            } else {
                System.out.println("Извините, такое " + newResume + " резюме уже есть!!!");
                return;
            }
        } else
            System.out.println("Такого " + r + " резюме нет!!!");
    }

    private boolean isFull() {
        if (size == storageMaxLength)
            return true;
        else
            return false;
    }

    // ищет индекс элемента массива по uuid, возвращает -1, если не найден
    private int find(String uuidToFound) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuidToFound)) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public Resume[] getAll() {
        Resume[] resumes = new Resume[size];
        for (int i = 0; i < size; i++) {
            resumes[i] = storage[i];
        }
        return resumes;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            storage[i] = null;
        }
        size = 0;
    }

    private boolean isNull() {
        if (size == 0) {
            System.out.println("Хранилище резюме пустое!!!");
            return true;
        }
        return false;
    }

}
