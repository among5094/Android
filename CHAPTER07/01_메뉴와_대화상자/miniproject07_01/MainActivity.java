package com.cookandroid.miniproject07_01;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout baseLayout;
    Button button1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("배경색 바꾸기");

        baseLayout = (LinearLayout) findViewById(R.id.baseLayout);
        button1 = (Button) findViewById(R.id.button1);
    }

    //onCreateOptionsMenu 오버라이딩하기
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater=getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        /*
        menu.add(0,1,0, "배경색(빨강");
        menu.add(0,2,0, "배경색(초록");
        menu.add(0,3,0, "배경색(파랑");

        SubMenu sMenu = menu.addSubMenu("버튼 변경 >>");
        sMenu.add(0,4,0,"버튼 45도 회전");
        sMenu.add(0,5,0,"버튼 2배 확대");
        */
        return true;
    }

    //onOptionsItemSelected 오버라이딩하기
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.itemRed) {
            baseLayout.setBackgroundColor(Color.RED);
            return true;
        } else if (item.getItemId() == R.id.itemGreen) {
            baseLayout.setBackgroundColor(Color.GREEN);
            return true;
        } else if (item.getItemId() == R.id.itemBlue) {
            baseLayout.setBackgroundColor(Color.BLUE);
            return true;
        } else if (item.getItemId() == R.id.subRotate) {
            button1.setRotation(45);
            return true;
        } else if (item.getItemId() == R.id.subSize) {
            button1.setScaleX(2);
            return true;
        }
        return false;
    }

  

}