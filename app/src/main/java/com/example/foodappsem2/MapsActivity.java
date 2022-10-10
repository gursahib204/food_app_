package com.example.foodappsem2;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.foodappsem2.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in foodland and move the camera
       /* LatLng foodland = new LatLng( 43.715032, -79.748989);
        mMap.addMarker(new MarkerOptions().position(foodland).title("Marker in Food Land"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(foodland));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(foodland, 10f));
        googleMap.getUiSettings().setZoomGesturesEnabled(true);
        googleMap.getUiSettings().setRotateGesturesEnabled(true);*/


        // Add a marker in foodland1 and move the camera
        /*LatLng foodland1 = new LatLng( 43.865058, -79.861207);
        mMap.addMarker(new MarkerOptions().position(foodland1).title("Marker in Food Land"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(foodland1));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(foodland1, 10f));
        googleMap.getUiSettings().setZoomGesturesEnabled(true);
        googleMap.getUiSettings().setRotateGesturesEnabled(true);
*/

        // Add a marker in foodland2 and move the camera
     /*   LatLng foodland2 = new LatLng( 43.903718,  -80.011889);
        mMap.addMarker(new MarkerOptions().position(foodland2).title("Marker in Food Land"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(foodland2));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(foodland2, 10f));
        googleMap.getUiSettings().setZoomGesturesEnabled(true);
        googleMap.getUiSettings().setRotateGesturesEnabled(true);

*/

        // Add a marker in foodland3 and move the camera
        /*LatLng foodland3 = new LatLng( 43.892646, -80.092044);
        mMap.addMarker(new MarkerOptions().position(foodland3).title("Marker in Food Land"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(foodland3));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(foodland3, 10f));
        googleMap.getUiSettings().setZoomGesturesEnabled(true);
        googleMap.getUiSettings().setRotateGesturesEnabled(true);

*/

        // Add a marker in foodland4 and move the camera
      /*  LatLng foodland4 = new LatLng( 44.034787, -80.178178);
        mMap.addMarker(new MarkerOptions().position(foodland4).title("Marker in Food Land"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(foodland4));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(foodland4, 10f));
        googleMap.getUiSettings().setZoomGesturesEnabled(true);
        googleMap.getUiSettings().setRotateGesturesEnabled(true);*/


        Dipslaylocation(44.034787,-80.178178);
        Dipslaylocation(43.715032, -79.748989);
        Dipslaylocation(44.034787,-80.178178);
        Dipslaylocation(44.034787,-80.17817);
    }


    public void Dipslaylocation(double lat,double longtitude){

        LatLng foodland4 = new LatLng( 44.034787, -80.178178);
        mMap.addMarker(new MarkerOptions().position(foodland4).title("Marker in Food Land"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(foodland4));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(foodland4, 10f));
        mMap.getUiSettings().setZoomGesturesEnabled(true);
        mMap.getUiSettings().setRotateGesturesEnabled(true);
    }
}