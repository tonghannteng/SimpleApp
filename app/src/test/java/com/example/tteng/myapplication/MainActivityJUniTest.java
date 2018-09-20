package com.example.tteng.myapplication;

import android.widget.Button;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)
public class MainActivityJUniTest {

    @Test
    public void shouldDisplayHello1AfterClickButton1() {
        MainActivity mainActivity = Robolectric.setupActivity(MainActivity.class);

        Button button1 = (Button) mainActivity.findViewById(R.id.button1);
        TextView textView = (TextView) mainActivity.findViewById(R.id.text);

        button1.performClick();
        assertEquals(textView.getText().toString(), "Hello1");
    }

    @Test
    public void shouldDisplayHello2AfterClickButton2() {
        MainActivity mainActivity = Robolectric.setupActivity(MainActivity.class);

        Button button2 = (Button) mainActivity.findViewById(R.id.button2);
        TextView textView = (TextView) mainActivity.findViewById(R.id.text);

        button2.performClick();

        assertEquals(textView.getText().toString(), "Hello2");
    }



}
