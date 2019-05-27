package ru.geekbrains.converter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class ConvertActivity extends AppCompatActivity {

    private EditText sourceText;    // Элемент с входным значением, которое надо сконвертировать
    private EditText destText;      // Элемент с результирующим значением

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);
        sourceText = (EditText) findViewById(R.id.value);
        destText = (EditText) findViewById(R.id.result);
    }

    // обработка нажатия
    public void onButtonClick(View view) {
        // получить входное значение
        float sourceValue = Float.parseFloat(sourceText.getText().toString());
        // инстанцировать конвертер
        Converter converter = new Converter(sourceValue);
        Float destValue = null;
        switch (view.getId()) {
            case R.id.toFahrenheitButton:
                // преобразовать, обратите внимание на параметр ConvertToFahrenheit
                destValue = converter.Convert(new ConvertToFahrenheit()).GetResult();
                break;
            case R.id.toMetersPerSecondButton:
                destValue = converter.Convert(new ConvertToMetersPerSecond()).GetResult();
                break;
        }
        if (destValue != null) {
            destText.setText(String.format("%.02f", destValue));
        }
    }
}
