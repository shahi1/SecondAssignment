package com.example.secondassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.secondassignment.fragments.AreaofCircleFragment;
import com.example.secondassignment.fragments.AutomorphicNumFragment;
import com.example.secondassignment.fragments.PalindromeNumFragment;
import com.example.secondassignment.fragments.ReverseNoFragment;
import com.example.secondassignment.fragments.ReverseStringFragment;
import com.example.secondassignment.fragments.SumFragment;

public class MainActivity extends AppCompatActivity {

    private Button btnSum,btnArea,btnReverseN,btnPalindrome,btnAutomorphic,btnReverseS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnArea = findViewById(R.id.btnA);
        btnSum = findViewById(R.id.btnS);
        btnReverseN = findViewById(R.id.btnRN);
        btnPalindrome = findViewById(R.id.btnP);
        btnAutomorphic = findViewById(R.id.btnAuto);
        btnReverseS = findViewById(R.id.btnRS);

        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                AreaofCircleFragment areaOfCircleFragment = new AreaofCircleFragment();
                fragmentTransaction.replace(R.id.fragmentC,areaOfCircleFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                SumFragment sumFragment = new SumFragment();
                fragmentTransaction.replace(R.id.fragmentC,sumFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        btnReverseN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                ReverseNoFragment reverseNoFragment = new ReverseNoFragment();
                fragmentTransaction.replace(R.id.fragmentC,reverseNoFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        btnPalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                PalindromeNumFragment palindromeFragment = new PalindromeNumFragment();
                fragmentTransaction.replace(R.id.fragmentC,palindromeFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        btnAutomorphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                AutomorphicNumFragment automorphicNumFragment = new AutomorphicNumFragment();
                fragmentTransaction.replace(R.id.fragmentC,automorphicNumFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        btnReverseS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                ReverseStringFragment reverseStringFragment = new ReverseStringFragment();
                fragmentTransaction.replace(R.id.fragmentC,reverseStringFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
}
