package com.example.loginform;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class OrderAdapter extends RecyclerView.Adapter <OrderAdapter.ViewHolder> {
List<Model>modelList;
Context context;

    public OrderAdapter(Context context,List<Model>modelList) {
        this.context = context;
        this.modelList = modelList;
    }
//in order to make  our views responsive we can implement onclicklistener on our recyclerview
    @Override
    public OrderAdapter.ViewHolder onCreateViewHolder( ViewGroup parent, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.listitem,parent,false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( OrderAdapter.ViewHolder holder, int position) {
//here we will find the position and start setting the output an our views
        String nameofmedicine = modelList.get(position).getmMedicineName();
        String descriptionofmedicine = modelList.get(position).getmMedicineDetail();
        int images = modelList.get(position).getmMedicinePhoto();
        holder.mMedicineName.setText(nameofmedicine);
        holder.mMedicineDescription.setText(descriptionofmedicine);
        holder.imageView.setImageResource(images);
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        // here will be find the views that an which we will inflate our data
        TextView mMedicineName,mMedicineDescription;
        ImageView imageView;
        public ViewHolder(View itemView){
            super(itemView);

            mMedicineName = itemView.findViewById(R.id.Medicine_Name);
            mMedicineDescription = itemView.findViewById(R.id.description);
            imageView = itemView.findViewById(R.id.Medicine_Image);
            itemView.setOnClickListener(this);

    }

        @Override
        public void onClick(View view) {
// lets get the position of the view in list and then work on it
            int position = getAdapterPosition();

            if (position == 0) {
                Intent intent = new Intent(context, info.class);
                context.startActivity(intent);
            }

            if (position == 1) {
                Intent intent2 = new Intent(context, Latte.class);
                context.startActivity(intent2);
            }
        }
    }


}
