package com.example.loginform;


public class Model {
    String mMedicineName;
    String mMedicineDetail;
    int mMedicinePhoto;

    public Model(String mMedicineName, String mMedicineDetail, int mMedicinePhoto) {
        this.mMedicineName = mMedicineName;
        this.mMedicineDetail = mMedicineDetail;
        this.mMedicinePhoto = mMedicinePhoto;
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
