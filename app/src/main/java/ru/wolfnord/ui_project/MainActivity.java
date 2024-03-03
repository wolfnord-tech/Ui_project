package ru.wolfnord.ui_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import ru.wolfnord.ui_project.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_layout);

//        TextView textView2 = findViewById(R.id.header);
//
//        textView2.setText(R.string.hello_from_java);

//        // Создание ConstraintLayout
//        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//
//        // Создание TextView
//        TextView textView = new TextView(this);
//
//        // Установка текста в TextView
//        textView.setText(R.string.hello_android);
//
//        // Установка визуального интерфейса для activity
//        textView.setTextSize(22);
//
//        // Устанавливаем параметры размеров и расположение элемента
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
//                        ViewGroup.LayoutParams.WRAP_CONTENT,
//                        ConstraintLayout.LayoutParams.WRAP_CONTENT
//        );
//
//        // Выравнивание по левому краю ConstraintLayout
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//
//        // Выравнивание по верхней границе ConstraintLayout
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//
//        // Устанавливаем параметры для textView
//        textView.setLayoutParams(layoutParams);
//
//        // Добавляем textView в ConstraintLayout
//        constraintLayout.addView(textView);
//
////         Устанавливаем constraintLayout в качестве корневого
//        setContentView(constraintLayout);
    }
}