package com.example.android55lesson3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsViewHolder> {

	ArrayList<String> adapterArraylist;

	public ContactsAdapter(ArrayList<String> arrayList) {
		adapterArraylist = arrayList;
	}

	@NonNull
	@Override
	public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		return new ContactsViewHolder(
				LayoutInflater.from(parent.getContext())
						.inflate(R.layout.item_contact, parent, false));
	}

	@Override
	public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
		holder.onBind(adapterArraylist.get(position),adapterArraylist.get(position));
	}

	@Override
	public int getItemCount() {
		return adapterArraylist.size();
	}
}
