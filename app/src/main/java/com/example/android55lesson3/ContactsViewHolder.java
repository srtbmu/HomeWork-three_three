package com.example.android55lesson3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactsViewHolder extends RecyclerView.ViewHolder {

	TextView nameTextView,SurnameTextView;
	ImageView icon;

	public ContactsViewHolder(@NonNull View itemView) {
		super(itemView);
	}

	public void onBind(String contactName,String contacSurname) {
		nameTextView = itemView.findViewById(R.id.Name);
		SurnameTextView = itemView.findViewById(R.id.Surname);
		icon = itemView.findViewById(R.id.imageView);
		nameTextView.setText(contactName);
		SurnameTextView.setText(contacSurname);
	}
}
