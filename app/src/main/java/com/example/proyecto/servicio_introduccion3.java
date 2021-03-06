package com.example.proyecto;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class servicio_introduccion3 extends Fragment {


    public servicio_introduccion3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_servicio_social_introduccion3, container, false);

        Typeface custom_font = Typeface.createFromAsset(getContext().getApplicationContext().getAssets(),  "poppins_regular.otf");
        TextView texto = v.findViewById(R.id.texto3);
        texto.setTypeface(custom_font);

        ImageView pagina1 = v.findViewById(R.id.pag3_1);
        ImageView pagina2 = v.findViewById(R.id.pag3_2);

        View view = v.findViewById(R.id.pagina_introduccion3);
        view.setOnTouchListener(new OnSwipeTouchListener(getContext()) {

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
                getActivity().finish();
            }

            public void onSwipeRight() {
                super.onSwipeRight();
                getActivity().getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_right,R.anim.enter_from_right, R.anim.exit_to_right).replace(R.id.fragmento_introduccion, new servicio_introduccion2()).commit();
            }
        });


        pagina1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_right,R.anim.enter_from_right, R.anim.exit_to_right).replace(R.id.fragmento_introduccion, new servicio_introduccion1()).commit();
            }
        });

        pagina2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_right,R.anim.enter_from_right, R.anim.exit_to_right).replace(R.id.fragmento_introduccion, new servicio_introduccion2()).commit();
            }
        });


        return v;
    }

}
