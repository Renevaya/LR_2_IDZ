package com.example.lr_2_idz;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override //переопределяет метод родительского класса (AppCompatActivity)
    protected void onCreate(Bundle savedInstanceState) { //protected доступен подклассам класса MainActivity и самому классу.
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this); //Включает полноэкранный режим
        setContentView(R.layout.activity_main); //Устанавливает макет (layout) приложения
    }
}