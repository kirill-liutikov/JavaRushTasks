package com.javarush.task.task36.task3608.model;

/**
 * Created by kirill on 16.12.2018.
 */
public interface Model {
    ModelData getModelData();

    void loadUsers();

    void loadDeletedUsers();

    void loadUserById(long userId);

    void deleteUserById(long id);
}
