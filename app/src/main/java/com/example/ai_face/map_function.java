package com.example.ai_face;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

public class map_function extends AppCompatActivity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_screen);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        // 지도가 준비되면 여기서 지도를 사용자의 선호에 맞게 설정할 수 있습니다.

        // 내 위치 위도 경도 설정
        LatLng myLocation = new LatLng( 37.5428428,  126.6772096);

        // 내 위치 기준 지도 출력
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(myLocation));

        // 내 위치 기준 지도 확대 출력, 숫자가 클수록 Zoom
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(myLocation, 16));
    }
}
