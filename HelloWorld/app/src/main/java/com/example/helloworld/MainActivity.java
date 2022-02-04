package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

        // User can tap a button to change the text color of the label
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change the text color of the label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.pink));
            }
        });

        // User can tap a button to change the color of the background
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change the color of the background
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.teal_200));
            }
        });

        // User can change the text displayed at the top to "Android is Awesome!"
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change the text at the top
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");

            }
        });

        // User can tap on the background view to reset all views to default settings
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 1. Reset text to "Hello from Garvey" id - text
                textView.setText("Hello from Garvey!");

                // 2. Reset color of text to original color
                    // original text color - black, text id- text
                textView.setTextColor(getResources().getColor(R.color.black));

                // 3. Reset background color to original color
                    // original background color - R.color.lime
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.lime));

            }
        });

        // User can tap the "Change text string" button to update the label with the text from the text field.
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change the text view to what's in the edit text view
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();

                if (userEnteredText.isEmpty()) {
                    textView.setText("Enter your own text!");
                }
                else{
                    textView.setText(userEnteredText);
                }
            }
        });

    }
}