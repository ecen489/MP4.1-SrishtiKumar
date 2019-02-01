package com.example.mp41;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        final Button button = findViewById(R.id.button_id);
//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Code here executes on main thread after user presses button
//            }
//        });
//
//    }
//}

    public class MainActivity extends AppCompatActivity {
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            final TextView textView = (TextView) findViewById(R.id.text_id);
            final Button button = findViewById(R.id.button_id);
            final EditText editText = (EditText) findViewById(R.id.editText_id);

            editText.setHint("Enter text"); // Hint user to enter text

            // When button is clicked
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Editable msg = editText.getText(); // Get user input
                    textView.setText(msg); // Display user input
                    editText.getText().clear(); // Clear text box for next message
                }
            });
        }
    }