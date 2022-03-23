package com.example.textcounter2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.textcounter2022.utils.TextUtils;


public class MainActivity extends AppCompatActivity {

    TextView tvResult;
    EditText txtMain;
    Spinner spOptionSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tvResult = findViewById(R.id.tvResult);
        this.txtMain = findViewById(R.id.txtMain);
        this.spOptionSelection = findViewById(R.id.spOptionSelection);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.counting_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spOptionSelection.setAdapter(adapter);
    }

    public void onBtnCalculateClick(View view) {
        if(!txtMain.getText().toString().isEmpty()){
            if(this.spOptionSelection.getSelectedItem().toString().equalsIgnoreCase("Words")){
                String content = this.txtMain.getText().toString();
                String trimmed = content.trim();
                int words =  trimmed.split("\\s+").length;
                String wordsCountFormatted = String.valueOf(words);
                this.tvResult.setText(wordsCountFormatted);
            }
            else {
                int charsCount = TextUtils.getCharsCount(this.txtMain.getText().toString());
                String charsCountFormatted = String.valueOf(charsCount);
                this.tvResult.setText(charsCountFormatted);
        }
        }
        else{
            Toast.makeText(this,"This is empty", Toast.LENGTH_LONG).show();
        }
    }
}