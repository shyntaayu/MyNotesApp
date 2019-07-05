package com.example.mynotesapp;

import android.database.Cursor;

import com.example.mynotesapp.entity.Note;

import java.util.ArrayList;

public interface LoadNotesCallback {
    void preExecute();
    void postExecute(Cursor notes);

}
