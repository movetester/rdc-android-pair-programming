package rdc.move_test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import rdc.move_test.util.TestUtilKt;

public class ListActivityJava extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_main);
        recyclerView = findViewById(R.id.list_recyclerview);

        final ListAdapterJava listAdapter = new ListAdapterJava(this);
        listAdapter.setListItems(TestUtilKt.getTestList());
        recyclerView.setAdapter(listAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listAdapter.notifyDataSetChanged();
    }
}
