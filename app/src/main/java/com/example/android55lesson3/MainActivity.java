package com.example.android55lesson3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {

	ArrayList<String> arrayList;
	ArrayList<Integer> Add;
	ArrayList<Integer> evendandodd;
	ArrayList<Integer> multiplication;
	RecyclerView recyclerView;

	@SuppressLint("MissingInflatedId")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setName();
		GetId();
		Dowloand();
		MinMx();
		EvenAndOdd();
		Multiplication();
	}

	private void Dowloand() {
		ContactsAdapter adapter = new ContactsAdapter(arrayList);
		recyclerView.setAdapter(adapter);
	}

	private void GetId() {
		recyclerView = findViewById(R.id.recyclerView);
	}

	private void setName(){
		arrayList = new ArrayList<>();
		arrayList.add("ZULFIA");
		arrayList.add("VARIS");
		arrayList.add("KENCH");
		arrayList.add("SULTAN");
		arrayList.add("BAYAS");
		arrayList.add("RYSYA");
	}

	private void MinMx() {
		Add = new ArrayList<>();
		Add.add(12001);
		Add.add(29384);
		Add.add(12384);
		Add.add(909345);
		Add.add(34289);
		Add.add(001);
		Add.add(002);
		Add.add(003);

		int evenSum = 0;
		int oddProduct = 1;

		for (int number : Add) {
			if (number % 2 == 0) {
				evenSum += number;
			} else {
				oddProduct *= number;
			}
		}
		System.out.println("Обшая сумма четных числа: " + evenSum);
		System.out.println("Обшая сумма нечетных чисел: " + oddProduct);
	}

	private void EvenAndOdd() {
		evendandodd = new ArrayList<>();
		evendandodd.add(10002);
		evendandodd.add(293);
		evendandodd.add(123);
		evendandodd.add(4352);
		evendandodd.add(96354);
		evendandodd.add(816);
		evendandodd.add(992);
		evendandodd.add(984);
		evendandodd.add(884);
		evendandodd.add(38);

		ArrayList<Integer> evenNumbers = new ArrayList<>();
		ArrayList<Integer> oddNumbers = new ArrayList<>();

		for (int number : evendandodd) {
			if (number % 2 == 0) {
				evenNumbers.add(number);
			} else {
				oddNumbers.add(number);
			}
		}
		System.out.println("Четные числа: " + evenNumbers);
		System.out.println("Нечетные числа: " + oddNumbers);
	}


	private void Multiplication() {
		multiplication = new ArrayList<>();
		multiplication.add(9991);
		multiplication.add(821923);
		multiplication.add(2832);
		multiplication.add(22);
		multiplication.add(1120);
		multiplication.add(109);
		multiplication.add(103);
		multiplication.add(1033);
		multiplication.add(1233);
		Comparator<Integer> comparator = Collections.reverseOrder();
		Collections.sort(multiplication, comparator);
		for (Integer i : multiplication) {
			System.out.println(i);
		}
	}
}