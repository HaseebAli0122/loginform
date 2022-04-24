package com.example.loginform;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

public class CartAdapter extends CursorAdapter {
    public CartAdapter(Context context, Cursor cursor) {
        super(context, cursor, 0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.cartlist, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

        // getting theviews

        TextView medicineName, hasbox, hasstrip, price, quantity;


        medicineName = view.findViewById(R.id.MedicineNameinOrderSummary);
        price = view.findViewById(R.id.priceinOrderSummary);
        hasbox= view.findViewById(R.id.tabletbox);
        hasstrip = view.findViewById(R.id.strip);
        quantity = view.findViewById(R.id.quantityinOrderSummary);

        // getting the values by first getting the position of their columns

        int name = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_NAME);
        int priceofmedicine = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_PRICE);
        int quantityofmedicine = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_QUANTITY);
        int tabletbox = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_box);
        int  tabletstrip= cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_strip);


        String nameofmedicine = cursor.getString(name);
        String pricesofmedicine = cursor.getString(priceofmedicine);
        String quantitysofmedicine = cursor.getString(quantityofmedicine);
        String yeshasbox = cursor.getString(tabletbox);
        String yeshasstrip = cursor.getString(tabletstrip);



        medicineName.setText(nameofmedicine);
        price.setText(priceofmedicine);

        hasbox.setText(yeshasbox);

        hasstrip.setText(yeshasstrip);
        quantity.setText(quantitysofmedicine);





    }
}
