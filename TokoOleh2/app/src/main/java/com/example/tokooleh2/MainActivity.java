package com.example.tokooleh2;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.tokooleh2.Util.ServerAPI;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity {

    //Defining views
    private EditText editTextEmail;
    private EditText editTextPassword;
    private Context context;
    private AppCompatButton buttonLogin;
    private AppCompatButton btnDaftar;
    private ProgressDialog pDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;

        //Initializing views
        pDialog = new ProgressDialog(context);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);

        buttonLogin = (AppCompatButton) findViewById(R.id.buttonLogin);
        btnDaftar = (AppCompatButton) findViewById(R.id.btnDaftar);

        //Adding click listener
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent daftar = new Intent(MainActivity.this, InsertData.class);
                startActivity(daftar);
            }
        });
    }


    private void login() {
        //Getting values from edit texts
        final String username = editTextEmail.getText().toString().trim();
        final String password = editTextPassword.getText().toString().trim();
        pDialog.setMessage("Login Process...");
        showDialog();
        //Creating a string request
        StringRequest stringRequest = new StringRequest(Request.Method.POST, ServerAPI.LOGIN_URL,

                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        //If we are getting success from server
                        if (response.contains(ServerAPI.LOGIN_SUCCESS)) {
                            hideDialog();
                            gotoCourseActivity();

                        } else {
                            hideDialog();
                            //Displaying an error message on toast
                            Toast.makeText(context, "Invalid username or password", Toast.LENGTH_LONG).show();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //You can handle error here if you want
                        hideDialog();
                        Toast.makeText(context, "The server unreachable", Toast.LENGTH_LONG).show();

                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                //Adding parameters to request
                params.put(ServerAPI.KEY_EMAIL, username);
                params.put(ServerAPI.KEY_PASSWORD, password);
                //returning parameter
                return params;
            }
        };
        //Adding the string request to the queue
        Volley.newRequestQueue(this).add(stringRequest);
    }
    private void gotoCourseActivity() {
        Intent intent = new Intent(context, CourseActivity.class);
        startActivity(intent);
        finish();
    }
    private void showDialog() {
        if (!pDialog.isShowing())
            pDialog.show();
    }
    private void hideDialog() {
        if (pDialog.isShowing())
            pDialog.dismiss();
    }
}