package com.example.ecomm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ProductViewHolder> {


    Context context;
    ArrayList<Products> products;

    public MyAdapter(Context c, ArrayList<Products> p)
    {
        context=c;
        products=p;



    }


    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProductViewHolder(LayoutInflater.from(context).inflate(R.layout.product_items_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

        holder.product_name.setText(products.get(position).getPname());
        holder.product_price.setText(products.get(position).getPrice());
        holder.product_description.setText(products.get(position).getDescription());
        Picasso.get().load(products.get(position).getImage()).into(holder.product_image);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder

    {


        TextView product_name,product_price,product_description;
        ImageView product_image;

        @SuppressLint("WrongViewCast")
        public ProductViewHolder(View itemView) {
            super(itemView);

            product_name=(TextView)itemView.findViewById(R.id.product_name);
            product_price=(TextView)itemView.findViewById(R.id.product_price);
            product_description=(TextView)itemView.findViewById(R.id.product_description);
            product_image=(ImageView)itemView.findViewById(R.id.product_image);

        }
    }

}
