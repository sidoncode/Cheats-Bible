package com.cheatsdev.cheatsbibleforgames;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.cheatsdev.cheatsbibleforgames.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Home#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Home extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Home() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Home.
     */
    // TODO: Rename and change types and number of parameters

    public static Home newInstance(String param1, String param2) {
        Home fragment = new Home();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    private TextView Angry_Birds_MOBILE,Angry_gran_run, AngryBirdsStarWarsII,
            AgeofEmpiresOnline,
            AlanWake,
            AlienShooterVengeance,
            TheAmazingSpiderMan2,
            AngryBirdsSpace,
            AngryBirdsPC,
            ARMAII,
            AssassinsCreed,
            AssassinCreedChroniclesChina,
            AssassinCreedII
            ,AssassinCreedIII
            ,AssassinCreedSyndicate
            ,AssassinCreedUnityDeadKings
            ,AssassinCreedBrotherhood
            ,AssassinCreedRevelations
            ,AssassinCreedRogue
            ,AssassinCreedUnity,BatmanVengeance,Bioshock,Dmcry5;


        private AdView adview1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_home, container, false);

        Angry_Birds_MOBILE = v.findViewById(R.id.AngryBirdsMOBILE);
        Angry_gran_run = v.findViewById(R.id.Angry_gran_run);
        AngryBirdsStarWarsII = v.findViewById(R.id.AngryBirdsStarWarsII);
        AgeofEmpiresOnline = v.findViewById(R.id.AgeofEmpiresOnline);
        AlanWake = v.findViewById(R.id.AlanWake);
        AlienShooterVengeance = v.findViewById(R.id.AlienShooterVengeance);
        TheAmazingSpiderMan2 = v.findViewById(R.id.TheAmazingSpiderMan2);
        AngryBirdsSpace = v.findViewById(R.id.AngryBirdsSpace);
        AngryBirdsPC = v.findViewById(R.id.AngryBirdsPC);
        ARMAII = v.findViewById(R.id.ARMAII);
        AssassinsCreed = v.findViewById(R.id.AssassinsCreed);
        AssassinCreedChroniclesChina= v.findViewById(R.id.AssassinCreedChroniclesChina);
        AssassinCreedII = v.findViewById(R.id.AssassinCreedII);
        AssassinCreedIII = v.findViewById(R.id.AssassinCreedIII);
        AssassinCreedSyndicate = v.findViewById(R.id.AssassinCreedSyndicate);
        AssassinCreedUnityDeadKings = v.findViewById(R.id.AssassinCreedUnityDeadKings);
        AssassinCreedBrotherhood = v.findViewById(R.id.AssassinCreedBrotherhood);
        AssassinCreedRevelations = v.findViewById(R.id.AssassinCreedRevelations);
        AssassinCreedRogue = v.findViewById(R.id.AssassinCreedRogue);
        AssassinCreedUnity  = v.findViewById(R.id.AssassinCreedUnity);
        BatmanVengeance = v.findViewById(R.id.BatmanVengeance);
        Bioshock = v.findViewById(R.id.Bioshock);


// ad view//
        //ad id//
        adview1 = v.findViewById(R.id.ad_view1);
        MobileAds.initialize(getActivity(),"ca-app-pub-9094130848994954/4501394393");
        AdRequest adRequest= new AdRequest.Builder().build();
        Log.i("ad","add");
        adview1.loadAd(adRequest);



        // onclick listeners //

        Angry_Birds_MOBILE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Angry_Birds_MOBILE  = new Intent(getActivity(),AngryBirds.class);
                v.getContext().startActivity(Angry_Birds_MOBILE);
                //getActivity().finish();
            }
        });

        Angry_gran_run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Angry_gran_run = new Intent(getActivity(),Angry_gran_run.class);
                v.getContext().startActivity(Angry_gran_run);

            }
        });

        AngryBirdsStarWarsII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Comming Soon..,",Toast.LENGTH_SHORT).show();
            }
        });


        AgeofEmpiresOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Comming Soon...",Toast.LENGTH_SHORT).show();
            }
        });

        AlanWake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Comming Soon...",Toast.LENGTH_SHORT).show();
            }
        });

        AlienShooterVengeance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AlienShooterVengeance = new Intent(v.getContext(),AlienShooterVengeance.class);
                v.getContext().startActivity(AlienShooterVengeance);
            }
        });

        TheAmazingSpiderMan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Comming Soon!...",Toast.LENGTH_SHORT).show();
            }
        });

        AngryBirdsSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(get`)
                Toast.makeText(getActivity(),"Comming Soon...",Toast.LENGTH_SHORT).show();
            }
        });

        AngryBirdsPC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AngryBirdsPC =  new Intent(getActivity(),AngryBirdsPC.class);
                getActivity().startActivity(AngryBirdsPC);

            }
        });

        ARMAII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Commingsoon",Toast.LENGTH_SHORT).show();
            }
        });

        AssassinsCreed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AssassinsCreed = new Intent(getActivity(),AssassinsCreed.class);
                getActivity().startActivity(AssassinsCreed);

            }
        });


        AssassinCreedChroniclesChina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Comming Soon!..",Toast.LENGTH_SHORT).show();
            }
        });


        AssassinCreedII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AssassinCreedII = new Intent(getActivity(),AssassinCreedII.class);
                getActivity().startActivity(AssassinCreedII);
            }
        });

        AssassinCreedIII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AssassinCreedIII = new Intent(getActivity(),AssassinCreedIII.class);
                getActivity().startActivity(AssassinCreedIII);
            }
        });

        AssassinCreedSyndicate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AssassinCreedSyndicate = new Intent(getActivity(),AssassinCreedSyndicate.class);
                getActivity().startActivity(AssassinCreedSyndicate);

            }
        });

        AssassinCreedUnityDeadKings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AssassinCreedUnityDeadKings = new Intent(getActivity(),AssassinCreedUnityDeadKings.class);
                getActivity().startActivity(AssassinCreedUnityDeadKings);

            }
        });

        AssassinCreedBrotherhood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AssassinCreedBrotherhood = new Intent(getActivity(),AssassinCreedBrotherhood.class);
                getActivity().startActivity(AssassinCreedBrotherhood);

            }
        });
        BatmanVengeance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BatmanVengeance = new Intent(getActivity(),BatmanVengeance.class);
                getActivity().startActivity(BatmanVengeance);

            }
        });

        Bioshock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bioshock= new Intent(getActivity(),Bioshock.class);
                getActivity().startActivity(Bioshock);
            }
        });

        Dmcry5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dmcry5 = new Intent(getActivity(),Dmcry5.class);

            }
        });

        return  v;

    }
}