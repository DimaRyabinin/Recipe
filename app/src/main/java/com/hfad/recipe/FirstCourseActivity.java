package com.hfad.recipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ListActivity;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class FirstCourseActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listCourse = getListView();
        ArrayAdapter<FirstCourse> listAdapter = new ArrayAdapter<FirstCourse>(
                this, android.R.layout.simple_list_item_1, FirstCourse.courses);
        listCourse.setAdapter(listAdapter);

    }
}
