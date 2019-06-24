package com.kimosop.safstaffapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView faqCard,todoCard,chatCard,productsCard,eclassCard,newsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //defining cards
        faqCard = (CardView) findViewById(R.id.faq_card);
        todoCard = (CardView) findViewById(R.id.todo_card);
        chatCard = (CardView) findViewById(R.id.chat_card);
        productsCard = (CardView) findViewById(R.id.products_card);
        eclassCard = (CardView) findViewById(R.id.eclass_card);
        newsCard = (CardView) findViewById(R.id.news_card);

        //add click listeners

        faqCard.setOnClickListener(this);
        todoCard.setOnClickListener(this);
        chatCard.setOnClickListener(this);
        productsCard.setOnClickListener(this);
        eclassCard.setOnClickListener(this);
        newsCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;
        switch(v.getId()) {
            case R.id.faq_card : i = new Intent(this, faq.class);startActivity(i);break;
            case R.id.todo_card : i = new Intent(this, todo.class);startActivity(i);break;
            case R.id.chat_card : i = new Intent(this, chat.class);startActivity(i);break;
            case R.id.products_card : i = new Intent(this, products.class);startActivity(i);break;
            case R.id.eclass_card : i = new Intent(this, eclass.class);startActivity(i);break;
            case R.id.news_card : i = new Intent(this, news.class);startActivity(i);break;
            default:break;



        }

    }
}
