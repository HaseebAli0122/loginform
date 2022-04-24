package com.example.loginform;

import android.app.LoaderManager;
import android.content.ContentValues;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Latte extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor>{
    // first of all we will get the views that are  present in the layout of info

    ImageView imageView;
    ImageButton plusquantity, minusquantity;
    TextView quantitynumber, medicineName, medicinePrice;
    CheckBox tabletstrip, tabletbox;
    Button addtoCart;
    int quantity;
    public Uri mCurrentCartUri;
    boolean hasAllRequiredValues = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        imageView = findViewById(R.id.imageViewInfo);
        plusquantity = findViewById(R.id.addquantity);
        minusquantity  = findViewById(R.id.subquantity);
        quantitynumber = findViewById(R.id.quantity);
        medicineName = findViewById(R.id.MedicineNameinInfo);
        medicinePrice = findViewById(R.id.medicinePrice);
        tabletstrip = findViewById(R.id.strip);
        addtoCart = findViewById(R.id.addtocart);
        tabletbox = findViewById(R.id.tabletbox);

        // setting the name of drink

        medicineName.setText("Panadol");
        imageView.setImageResource(R.drawable.panadol);

        addtoCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Latte.this, SummaryActivity.class);
                startActivity(intent);
                // once this button is clicked we want to save our values in the database and send those values
                // right away to summary activity where we display the order info

                SaveCart();
            }
        });

        plusquantity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // medicine price
                int basePrice = 5;
                quantity++;
                displayQuantity();
                int MedicinePrice = basePrice * quantity;
                String setnewPrice = String.valueOf(MedicinePrice);
                medicinePrice.setText(setnewPrice);


                // checkBoxes functionality

                int ifCheckBox = CalculatePrice(tabletstrip, tabletbox);
                medicinePrice.setText ("$ " + ifCheckBox);

            }
        });

        minusquantity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int basePrice = 5;
                // because we dont want the quantity go less than 0
                if (quantity == 0) {
                    Toast.makeText(Latte.this, "Cant decrease quantity < 0", Toast.LENGTH_SHORT).show();
                } else {
                    quantity--;
                    displayQuantity();
                    int MedicinePrice = basePrice * quantity;
                    String setnewPrice = String.valueOf(MedicinePrice);
                    medicinePrice.setText(setnewPrice);


                    // checkBoxes functionality

                    int ifCheckBox = CalculatePrice(tabletstrip, tabletbox);
                    medicinePrice.setText("$ " + ifCheckBox);
                }
            }
        });



    }

    private boolean SaveCart() {

        // getting the values from our views
        String name = medicineName.getText().toString();
        String price = medicinePrice.getText().toString();
        String quantity = quantitynumber.getText().toString();

        ContentValues values = new ContentValues();
        values.put(OrderContract.OrderEntry.COLUMN_NAME, name);
        values.put(OrderContract.OrderEntry.COLUMN_PRICE, price);
        values.put(OrderContract.OrderEntry.COLUMN_QUANTITY, quantity);

        if (tabletbox.isChecked()) {
            values.put(OrderContract.OrderEntry.COLUMN_box, "Has box: YES");
        } else {
            values.put(OrderContract.OrderEntry.COLUMN_box, "Has box: NO");

        }

        if (tabletstrip.isChecked()) {
            values.put(OrderContract.OrderEntry.COLUMN_strip, "Has Strip: YES");
        } else {
            values.put(OrderContract.OrderEntry.COLUMN_strip, "Has Strip: NO");

        }

        if (mCurrentCartUri == null) {
            Uri newUri = getContentResolver().insert(OrderContract.OrderEntry.CONTENT_URI, values);
            if (newUri==null) {
                Toast.makeText(this, "Failed to add to Cart", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Success  adding to Cart", Toast.LENGTH_SHORT).show();

            }
        }

        hasAllRequiredValues = true;
        return hasAllRequiredValues;

    }

    private int CalculatePrice(CheckBox tabletbox, CheckBox tabletstrip) {

        int basePrice = 5;

        if (tabletbox.isChecked()) {
            // add the cream cost $2
            basePrice = basePrice + 2;
        }

        if (tabletstrip.isChecked()) {
            // topping cost is $3
            basePrice = basePrice + 3;
        }

        return basePrice * quantity;
    }

    private void displayQuantity() {
        quantitynumber.setText(String.valueOf(quantity));
    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        String[] projection = {OrderContract.OrderEntry._ID,
                OrderContract.OrderEntry.COLUMN_NAME,
                OrderContract.OrderEntry.COLUMN_PRICE,
                OrderContract.OrderEntry.COLUMN_QUANTITY,
                OrderContract.OrderEntry.COLUMN_box,
                OrderContract.OrderEntry.COLUMN_strip
        };

        return new CursorLoader(this, mCurrentCartUri,
                projection,
                null,
                null,
                null);
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {

        if (cursor == null || cursor.getCount() < 1) {
            return;
        }

        if (cursor.moveToFirst()) {

            int name = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_NAME);
            int price = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_PRICE);
            int quantity = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_QUANTITY);
            int hasbox = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_box);
            int hasstrip = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_strip);


            String nameofmedicine = cursor.getString(name);
            String priceofmedicine = cursor.getString(price);
            String quantityofmedicine = cursor.getString(quantity);
            String yeshastbox = cursor.getString(hasbox);
            String yeshastabletstrip = cursor.getString(hasstrip);


            medicineName.setText(nameofmedicine);
            medicinePrice.setText(priceofmedicine);
            quantitynumber.setText(quantityofmedicine);
        }


    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {


        medicineName.setText("");
        medicinePrice.setText("");
        quantitynumber.setText("");

    }
}
