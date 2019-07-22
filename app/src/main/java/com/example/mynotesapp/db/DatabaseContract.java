package com.example.mynotesapp.db;

import android.database.Cursor;
import android.net.Uri;
import android.provider.BaseColumns;

public final class DatabaseContract {

    // Authority yang digunakan
    public static final String AUTHORITY = "com.example.mynotesapp";
    private static final String SCHEME = "content";
    public static final String CONTENT_AUTHORITY = "com.example.mynotesapp";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    //
    private DatabaseContract(){}

    /*
    Penggunaan Base Columns akan memudahkan dalam penggunaan suatu table
    Untuk id yang autoincrement sudah default ada di dalam kelas BaseColumns dengan nama field _ID
     */
    public static final class NoteColumns implements BaseColumns {
        // Note table name
        public static final String TABLE_NAME = "note";

        // Note title
        public static final String TITLE = "title";
        // Note description
        public static final String DESCRIPTION = "description";
        // Note date
        public static final String DATE = "date";

        // Base content yang digunakan untuk akses content provider
        public static final Uri CONTENT_URI = new Uri.Builder().scheme(SCHEME)
                .authority(AUTHORITY)
                .appendPath(TABLE_NAME)
                .build();

    }

    /*
    Digunakan untuk mempermudah akses data di dalam cursor dengan parameter nama column
    */
    public static String getColumnString(Cursor cursor, String columnName) {
        return cursor.getString(cursor.getColumnIndex(columnName));
    }

    public static int getColumnInt(Cursor cursor, String columnName) {
        return cursor.getInt(cursor.getColumnIndex(columnName));
    }

    public static long getColumnLong(Cursor cursor, String columnName) {
        return cursor.getLong(cursor.getColumnIndex(columnName));
    }

}

