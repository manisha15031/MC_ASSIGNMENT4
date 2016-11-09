package com.example.hp.todolist_mc;

/**
 * Created by HP on 07-11-2016.
 */
public class Constants {
    //COLUMNS
    static final String ROW_ID="id";
    static final String NAME = "name";
    static final String POSITION = "position";
    //DB PROPERTIES
    static final String DB_NAME="d_DB";
    static final String TB_NAME="d_TB";
    static final int DB_VERSION='1';
    static final String CREATE_TB="CREATE TABLE d_TB(id INTEGER PRIMARY KEY AUTOINCREMENT,"
            + "name TEXT NOT NULL,position TEXT NOT NULL);";
}
