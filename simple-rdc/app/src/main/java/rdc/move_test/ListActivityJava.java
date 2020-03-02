package rdc.move_test;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
