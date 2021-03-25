package com.example.databindingdemo;

import android.util.Log;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

public class User {

    private String name;
    private  int age;
    private boolean active;
    private static final String TAG="User";
    private String ImageUrl;

    public User(String name, int age, boolean active, String imageUrl) {
        this.name = name;
        this.age = age;
        this.active = active;
        ImageUrl = imageUrl;
    }

    public void handleClick()
    {
        Log.d(TAG, "handleClick: " +this.getName());
    }



    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", active=" + active +
                ", ImageUrl='" + ImageUrl + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }
    @BindingAdapter("android:loadimage")
    public static void loadImage(ImageView imageView,String img_url)
    {
        Glide.with(imageView)
                .load(img_url)
                .into(imageView);
    }
}
