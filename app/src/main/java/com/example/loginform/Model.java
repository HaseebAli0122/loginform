package com.example.loginform;


public class Model {
    String mMedicineName;
    String mMedicineDetail;
    int mMedicinePhoto;

    public Model(String mMedicineName, String mMedicineDetail, int mDrinkPhoto) {
        this.mMedicineName = mMedicineName;
        this.mMedicineDetail = mMedicineDetail;
        this.mMedicinePhoto = mDrinkPhoto;
    }

    public String getmMedicineName() {
        return mMedicineName;
    }

    public String getmMedicineDetail() {
        return mMedicineDetail;
    }

    public int getmMedicinePhoto() {
        return mMedicinePhoto;
    }
}
