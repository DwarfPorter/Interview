package ru.geekbrains.converter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class ConvertActivity extends AppCompatActivity {

    private EditText sourceText;
    private EditText destText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);
        sourceText = (EditText) findViewById(R.id.celsiusValue);
        destText = (EditText) findViewById(R.id.fahrenheitValue);
    }

    public void onToFahrenheitClick(View view) {
        float sourceValue = Float.parseFloat(sourceText.getText().toString());
        Converter converter = new Converter(sourceValue);
        float destValue = converter.Convert(new ConvertToFahrenheit()).GetResult();
        destText.setText(String.format("%.02f", destValue));
    }
}
