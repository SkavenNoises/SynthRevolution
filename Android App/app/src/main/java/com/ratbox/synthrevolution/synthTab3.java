package com.ratbox.synthrevolution;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class synthTab3 extends Fragment {

    private static final String FILENAME = "VisorPatternConfig.txt";

    private ArrayList patternList = new ArrayList();

    private Spinner                 configSpinner;
    private ImageButton             btnAddNewPattern;
    private FloatingActionButton    btnSave;

    private CheckBox                chkbtn1;
    private CheckBox                chkbtn2;
    private CheckBox                chkbtn3;
    private CheckBox                chkbtn4;
    private CheckBox                chkbtn5;
    private CheckBox                chkbtn6;
    private CheckBox                chkbtn7;
    private CheckBox                chkbtn8;
    private CheckBox                chkbtn9;
    private CheckBox                chkbtn10;
    private CheckBox                chkbtn11;
    private CheckBox                chkbtn12;
    private CheckBox                chkbtn13;
    private CheckBox                chkbtn14;
    private CheckBox                chkbtn15;
    private CheckBox                chkbtn16;
    private CheckBox                chkbtn17;
    private CheckBox                chkbtn18;
    private CheckBox                chkbtn19;
    private CheckBox                chkbtn20;
    private CheckBox                chkbtn21;
    private CheckBox                chkbtn22;
    private CheckBox                chkbtn23;
    private CheckBox                chkbtn24;
    private CheckBox                chkbtn25;
    private CheckBox                chkbtn26;
    private CheckBox                chkbtn27;
    private CheckBox                chkbtn28;
    private CheckBox                chkbtn29;
    private CheckBox                chkbtn30;
    private CheckBox                chkbtn31;
    private CheckBox                chkbtn32;
    private CheckBox                chkbtn33;
    private CheckBox                chkbtn34;
    private CheckBox                chkbtn35;
    private CheckBox                chkbtn36;
    private CheckBox                chkbtn37;
    private CheckBox                chkbtn38;
    private CheckBox                chkbtn39;
    private CheckBox                chkbtn40;
    private CheckBox                chkbtn41;
    private CheckBox                chkbtn42;
    private CheckBox                chkbtn43;
    private CheckBox                chkbtn44;
    private CheckBox                chkbtn45;
    private CheckBox                chkbtn46;
    private CheckBox                chkbtn47;
    private CheckBox                chkbtn48;
    private CheckBox                chkbtn49;
    private CheckBox                chkbtn50;
    private CheckBox                chkbtn51;
    private CheckBox                chkbtn52;
    private CheckBox                chkbtn53;
    private CheckBox                chkbtn54;
    private CheckBox                chkbtn55;
    private CheckBox                chkbtn56;
    private CheckBox                chkbtn57;
    private CheckBox                chkbtn58;
    private CheckBox                chkbtn59;
    private CheckBox                chkbtn60;
    private CheckBox                chkbtn61;
    private CheckBox                chkbtn62;
    private CheckBox                chkbtn63;
    private CheckBox                chkbtn64;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.synth_tab3, container, false);

        // attaching to views
        configSpinner       = view.findViewById(R.id.ledConfigSelectSpinner);
        btnAddNewPattern    = view.findViewById(R.id.ledConfigAddNewButton);
        btnSave             = view.findViewById(R.id.saveConfigButton);

        chkbtn1     = view.findViewById(R.id.r1b1);
        chkbtn2     = view.findViewById(R.id.r1b2);
        chkbtn3     = view.findViewById(R.id.r1b3);
        chkbtn4     = view.findViewById(R.id.r1b4);
        chkbtn5     = view.findViewById(R.id.r1b5);
        chkbtn6     = view.findViewById(R.id.r1b6);
        chkbtn7     = view.findViewById(R.id.r1b7);
        chkbtn8     = view.findViewById(R.id.r1b8);

        chkbtn9     = view.findViewById(R.id.r2b9);
        chkbtn10    = view.findViewById(R.id.r2b10);
        chkbtn11    = view.findViewById(R.id.r2b11);
        chkbtn12    = view.findViewById(R.id.r2b12);
        chkbtn13    = view.findViewById(R.id.r2b13);
        chkbtn14    = view.findViewById(R.id.r2b14);
        chkbtn15    = view.findViewById(R.id.r2b15);
        chkbtn16    = view.findViewById(R.id.r2b16);

        chkbtn17    = view.findViewById(R.id.r3b17);
        chkbtn18    = view.findViewById(R.id.r3b18);
        chkbtn19    = view.findViewById(R.id.r3b19);
        chkbtn20    = view.findViewById(R.id.r3b20);
        chkbtn21    = view.findViewById(R.id.r3b21);
        chkbtn22    = view.findViewById(R.id.r3b22);
        chkbtn23    = view.findViewById(R.id.r3b23);
        chkbtn24    = view.findViewById(R.id.r3b24);

        chkbtn25    = view.findViewById(R.id.r4b25);
        chkbtn26    = view.findViewById(R.id.r4b26);
        chkbtn27    = view.findViewById(R.id.r4b27);
        chkbtn28    = view.findViewById(R.id.r4b28);
        chkbtn29    = view.findViewById(R.id.r4b29);
        chkbtn30    = view.findViewById(R.id.r4b30);
        chkbtn31    = view.findViewById(R.id.r4b31);
        chkbtn32    = view.findViewById(R.id.r4b32);

        chkbtn33    = view.findViewById(R.id.r5b33);
        chkbtn34    = view.findViewById(R.id.r5b34);
        chkbtn35    = view.findViewById(R.id.r5b35);
        chkbtn36    = view.findViewById(R.id.r5b36);
        chkbtn37    = view.findViewById(R.id.r5b37);
        chkbtn38    = view.findViewById(R.id.r5b38);
        chkbtn39    = view.findViewById(R.id.r5b39);
        chkbtn40    = view.findViewById(R.id.r5b40);

        chkbtn41    = view.findViewById(R.id.r6b41);
        chkbtn42    = view.findViewById(R.id.r6b42);
        chkbtn43    = view.findViewById(R.id.r6b43);
        chkbtn44    = view.findViewById(R.id.r6b44);
        chkbtn45    = view.findViewById(R.id.r6b45);
        chkbtn46    = view.findViewById(R.id.r6b46);
        chkbtn47    = view.findViewById(R.id.r6b47);
        chkbtn48    = view.findViewById(R.id.r6b48);

        chkbtn49    = view.findViewById(R.id.r7b49);
        chkbtn50    = view.findViewById(R.id.r7b50);
        chkbtn51    = view.findViewById(R.id.r7b51);
        chkbtn52    = view.findViewById(R.id.r7b52);
        chkbtn53    = view.findViewById(R.id.r7b53);
        chkbtn54    = view.findViewById(R.id.r7b54);
        chkbtn55    = view.findViewById(R.id.r7b55);
        chkbtn56    = view.findViewById(R.id.r7b56);

        chkbtn57    = view.findViewById(R.id.r8b57);
        chkbtn58    = view.findViewById(R.id.r8b58);
        chkbtn59    = view.findViewById(R.id.r8b59);
        chkbtn60    = view.findViewById(R.id.r8b60);
        chkbtn61    = view.findViewById(R.id.r8b61);
        chkbtn62    = view.findViewById(R.id.r8b62);
        chkbtn63    = view.findViewById(R.id.r8b63);
        chkbtn64    = view.findViewById(R.id.r8b64);


        // TODO - Set onCreate display of the default pattern

        // Attempting to read the save file and parse its contents
        BufferedReader reader = null;
        try {
            FileInputStream fileInputStream = getContext().openFileInput(FILENAME);
            reader = new BufferedReader(new InputStreamReader(fileInputStream));
            
            String readString;
            while ((readString = reader.readLine()) != null){ // EoF Check
                // Splitting the line into name and pattern
                String[] splitString = readString.split("=");

                // Separating each bit into the array
                String[] tempArr = splitString[splitString.length - 1].split("");

                // Storing the Name, and the pattern array within an object array
                Object[] pattern = {splitString[0], tempArr};

                // Adding the Object array into the pattern List
                patternList.add(pattern);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Log.d("PatternFile", "No file found, Creating default");

            BufferedWriter writer = null;
            try {
                FileOutputStream fileOutputStream = getContext().openFileOutput(FILENAME, Context.MODE_PRIVATE);
                writer = new BufferedWriter(new OutputStreamWriter(fileOutputStream));

                // Creating the default pattern for the eye
                int[] defaultPattern = {0,0,0,0,0,0,0,0,
                                        0,0,1,1,1,1,1,0,
                                        0,1,1,1,1,1,1,1,
                                        1,1,0,1,1,1,1,1,
                                        1,1,0,1,1,1,1,0,
                                        1,1,0,1,1,1,0,0,
                                        0,0,0,1,1,0,0,0};

                // adding the default pattern array to the list of arrays
                patternList.add(defaultPattern);

                // StringBuilder init
                StringBuilder stringBuilder = new StringBuilder();

                // Building string to write
                stringBuilder.append("Default=");
                for (int i : defaultPattern){
                    stringBuilder.append(Integer.toString(i));
                }

                // Writing string to file
                writer.write(stringBuilder.toString());

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();

            } catch (IOException ex) {
                ex.printStackTrace();

            } finally { // Closing the writer
                if (writer != null){
                    try {
                        writer.close();

                    } catch (IOException eIO) {
                        e.printStackTrace();
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();

        } finally { // closing the reader
            if (reader != null){
                try {
                    reader.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        // Loading the default eye pattern onCreate()



        return view;
    }
}
