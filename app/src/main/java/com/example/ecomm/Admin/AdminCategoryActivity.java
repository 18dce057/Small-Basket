package com.example.ecomm.Admin;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecomm.HomeActivity;
import com.example.ecomm.MainActivity;
import com.example.ecomm.R;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView fruits,vegetables,shampoos;
    private ImageView dals,chocolates,flours;


    private Button LogoutBtn, CheckOrdersBtn, maintainProductsBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);


        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);
        maintainProductsBtn = (Button) findViewById(R.id.maintain_btn);



        //if admin clicks maintain product button...
        maintainProductsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeActivity.class);
                intent.putExtra("Admin", "Admin");
                startActivity(intent);
            }
        });


        //if admin clicks logout button....
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });

        //if admin clicks check new order button...
        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });


        fruits= (ImageView) findViewById(R.id.fruits);
        vegetables=(ImageView)findViewById(R.id.Vegetables);
        flours=(ImageView)findViewById(R.id.flours);
        chocolates=(ImageView)findViewById(R.id.chocolates);
        shampoos=(ImageView)findViewById(R.id.shampoos);
        dals=(ImageView)findViewById(R.id.dals);


        //if admin clicks on fruit image that means admin want to add fruits...
        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "fruits");
                startActivity(intent);
            }
        });


        //if admin clicks on vegetable image that means admin want to add vegetable...
        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "vegetables");
                startActivity(intent);
            }
        });


        //if admin clicks on chocolates image that means admin want to add chocolates...
        chocolates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "chocolates");
                startActivity(intent);
            }
        });


        //if admin clicks on shampoos image that means admin want to add shampoos...
        shampoos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Shampoos");
                startActivity(intent);
            }
        });


        //if admin clicks on dals image that means admin want to add daalss...
        dals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "dals");
                startActivity(intent);
            }
        });


        //if admin clicks on floors image that means admin want to add floors...
        flours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "flours");
                startActivity(intent);
            }
        });







            }
    }

