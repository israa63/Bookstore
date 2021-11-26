package com.example.modelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.modelapp.model.Book;
import com.example.modelapp.model.BookDa;
import com.example.modelapp.model.BookFacory;
import com.example.modelapp.model.IBookDa;

import java.util.List;

public class MainActivity extends AppCompatActivity {
private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
        Populatespinner();
    }

    private void Populatespinner() {
        BookFacory factory =new BookFacory();
        IBookDa objbook =factory.getModel();

        String[]cats=objbook.getcategories();
        ArrayAdapter<String>adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,cats);
        spinner.setAdapter(adapter);
    }

    public void buttonOnclick(View view) {
        BookFacory factory =new BookFacory();
        IBookDa objbook =factory.getModel();

        String item ="";
        item=spinner.getSelectedItem().toString();

        List<Book>books = objbook.getbooks("item");


        for(Book b:books){
            item+=b.getTitel()+"\n";

            //Book textView = (Book) findViewById(R.id.);
        }
        Toast.makeText(view.getContext(), item,
                Toast.LENGTH_SHORT).show();
    }
}