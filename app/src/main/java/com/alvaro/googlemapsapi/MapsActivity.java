package com.alvaro.googlemapsapi;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback
{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this); //Hace en un hilo separado la carga del mapa
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        /*// Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));*/

        setMap3();
    }

    private void setMap1()
    {
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marca en Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

    private void setMap2()
    {
        //Añadir marker situado en el IES Portada Alta
        LatLng portadaAlta = new LatLng(36.718833, -4.453743);
        mMap.addMarker(new MarkerOptions().position(portadaAlta).title("Marca IES Portada Alta")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .snippet("Centro de enseñanza"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(portadaAlta, 14));
    }

    private void setMap3()
    {
        //Añadir marker situado en el IES Portada Alta
        LatLng portadaAlta = new LatLng(36.718833, -4.453743);
        try
        {
            mMap.setMyLocationEnabled(true); //Mi localizacion
        }
        catch (Exception e){

        }
        mMap.addMarker(new MarkerOptions().position(portadaAlta).title("Marca IES Portada Alta")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .snippet("Centro de enseñanza"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(portadaAlta, 14));
    }

    private void setMap4()
    {
        //Añadir marker situado en el IES Portada Alta
        LatLng portadaAlta = new LatLng(36.718833, -4.453743);
        try
        {
            mMap.setMyLocationEnabled(true);
        }
        catch (Exception e){

        }
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        mMap.addMarker(new MarkerOptions().position(portadaAlta).title("Marca IES Portada Alta")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .snippet("Centro de enseñanza"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(portadaAlta, 14));
    }
}
