package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivicty {
    <EditText
    android:id=”@+id/editTextAd”
    android:layout_width=”0dp”
    android:layout_height=”wrap_content”
    android:layout_marginStart=”8dp”
    android:layout_marginTop=”8dp”
    android:ems=”10”
    android:inputType=”textPersonName”
    android:minHeight=”48dp”
    android:text=”İsim”
    app:layout_constraintEnd_toStartOf=”@+id/buttonEkle”
    app:layout_constraintStart_toStartOf=”parent”
    app:layout_constraintTop_toTopOf=”parent” />
    }
}