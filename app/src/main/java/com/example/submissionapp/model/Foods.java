package com.example.submissionapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Foods implements Parcelable {
    private String name;
    private String detail;
    private String price;
    private int photo;
    private float rating = 0f;

    public Foods(){

    }

    protected Foods(Parcel in) {
        name = in.readString();
        detail = in.readString();
        price = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Foods> CREATOR = new Creator<Foods>() {
        @Override
        public Foods createFromParcel(Parcel in) {
            return new Foods(in);
        }

        @Override
        public Foods[] newArray(int size) {
            return new Foods[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(detail);
        parcel.writeString(price);
        parcel.writeInt(photo);
        parcel.writeFloat(rating);
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
