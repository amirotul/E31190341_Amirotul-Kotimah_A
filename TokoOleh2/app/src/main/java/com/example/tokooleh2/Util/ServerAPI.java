package com.example.tokooleh2.Util;

public class ServerAPI {
    public static final String URL_DATA = "http://192.168.43.72/Website/crud_android/view_data.php";
    public static final String URL_INSERT = "http://192.168.43.72/Website/android/create_akun.php";
    public static final String URL_DELETE = "http://192.168.43.72/Website/crud_android/delete_data.php";
    public static final String URL_UPDATE = "http://192.168.43.72/Website/crud_android/update_data.php";

    public static final String LOGIN_URL = "http://192.168.43.72/Website/android/login.php";


    //Keys for email and password as defined in our $_POST['key'] in login.php
    public static final String KEY_EMAIL = "username";
    public static final String KEY_PASSWORD = "password";
    //If server response is equal to this that means login is successful
    public static final String LOGIN_SUCCESS = "success";
}
