package pt.fcul.cm2021.grupo9.shotop.desafio;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Base64;

import pt.fcul.cm2021.grupo9.shotop.R;
import pt.fcul.cm2021.grupo9.shotop.entidades.Spot;
import pt.fcul.cm2021.grupo9.shotop.main.MainActivity;


public class SpotInfoCriarDesafioFragment extends Fragment {

    Spot spot;

    public SpotInfoCriarDesafioFragment(Spot spot) {
        this.spot = spot;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_spot_info_criar_desafio, container, false);

        ImageView imgView = v.findViewById(R.id.photoSpot);

        Button btn = (Button) v.findViewById(R.id.butCriarDesafio);
        System.out.println("DESAFIO " + spot.isDesafio());

        if(spot.isDesafio()){
            btn.setText(R.string.desafio_criado);
            btn.setEnabled(false);
        }else{
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MainActivity.db.collection("Spot").document(spot.getId()).update("desafio", true);
                    Toast.makeText(getActivity(), "Criou um desafio para esta foto!", Toast.LENGTH_SHORT).show();
                    btn.setText(R.string.desafio_criado);
                    btn.setEnabled(false);
                }
            });
        }
        

        if (spot.getImagem() != null) {

            byte[] bytes = Base64.getDecoder().decode(spot.getImagem());
            Bitmap bm = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);


            imgView.setImageBitmap(bm);
        }


        TextView t1 = v.findViewById(R.id.nameSpot);
        if (spot.getNome() == null) {
            t1.setText("N/A");
        } else {
            t1.setText(spot.getNome());
        }

        TextView t2 = v.findViewById(R.id.locSpot);
        if (spot.getLoc() == null) {
            t2.setText("N/A");
        } else {
            t2.setText(spot.getLoc().toString());
        }

        TextView t3 = v.findViewById(R.id.caracSpot);
        if (spot.getCaracteristicas() == null) {
            t3.setText("N/A");
        } else {
            t3.setText(spot.getCaracteristicas().toString());
        }

        TextView t4 = v.findViewById(R.id.imageHeightSpot);
        if (spot.getImageHeight() == null) {
            t4.setText("N/A");
        } else {
            t4.setText(spot.getImageHeight());
        }

        TextView t5 = v.findViewById(R.id.modelSpot);
        if (spot.getModel() == null) {
            t5.setText("N/A");
        } else {
            t5.setText(spot.getModel());
        }

        TextView t6 = v.findViewById(R.id.dateTimeSpot);
        if (spot.getDateTime() == null) {
            t6.setText("N/A");
        } else {
            t6.setText(spot.getDateTime());
        }

        TextView t7 = v.findViewById(R.id.orientation);
        if (spot.getOrientation() == null) {
            t7.setText("N/A");
        } else {
            t7.setText(spot.getOrientation());
        }

        TextView t8 = v.findViewById(R.id.imageWidthSpot);
        if (spot.getImageWidth() == null) {
            t8.setText("N/A");
        } else {
            t8.setText(spot.getImageWidth());
        }

        TextView t9 = v.findViewById(R.id.fNumberSpot);
        if (spot.getfNumber() == null) {
            t9.setText("N/A");
        } else {
            t9.setText(spot.getfNumber());
        }

        TextView t10 = v.findViewById(R.id.exposureTimeSpot);
        if (spot.getExposureTime() == null) {
            t10.setText("N/A");
        } else {
            t10.setText(spot.getExposureTime());
        }

        TextView t11 = v.findViewById(R.id.focalLengthSpot);
        if (spot.getFocalLength() == null) {
            t11.setText("N/A");
        } else {
            t11.setText(spot.getFocalLength());
        }

        TextView t12 = v.findViewById(R.id.flashSpot);
        if (spot.getFlash() == null) {
            t12.setText("N/A");
        } else {
            t12.setText(spot.getFlash());
        }

        TextView t13 = v.findViewById(R.id.iSOSpeedRatingsSpot);
        if (spot.getiSOSpeedRatings() == null) {
            t13.setText("N/A");
        } else {
            t13.setText(spot.getiSOSpeedRatings());
        }

        TextView t14 = v.findViewById(R.id.whiteBalanceModeSpot);
        if (spot.getWhiteBalanceMode() == null) {
            t14.setText("N/A");
        } else {
            t14.setText(spot.getWhiteBalanceMode());
        }

        TextView t15 = v.findViewById(R.id.apertureValueSpot);
        if (spot.getApertureValue() == null) {
            t15.setText("N/A");
        } else {
            t15.setText(spot.getApertureValue());
        }

        TextView t16 = v.findViewById(R.id.shutterSpeedValueSpot);
        if (spot.getShutterSpeedValue() == null) {
            t16.setText("N/A");
        } else {
            t16.setText(spot.getShutterSpeedValue());
        }

        TextView t17 = v.findViewById(R.id.detectedFileTypeNameSpot);
        if (spot.getDetectedFileTypeName() == null) {
            t17.setText("N/A");
        } else {
            t17.setText(spot.getDetectedFileTypeName());
        }

        TextView t18 = v.findViewById(R.id.fileSizeSpot);
        if (spot.getFileSize() == null) {
            t18.setText("N/A");
        } else {
            t18.setText(spot.getFileSize());
        }

        TextView t19 = v.findViewById(R.id.brightnessValueSpot);
        if (spot.getBrightnessValue() == null) {
            t19.setText("N/A");
        } else {
            t19.setText(spot.getBrightnessValue());
        }

        TextView t20 = v.findViewById(R.id.exposureBiasValueSpot);
        if (spot.getExposureBiasValue() == null) {
            t20.setText("N/A");
        } else {
            t20.setText(spot.getExposureBiasValue());
        }

        TextView t21 = v.findViewById(R.id.maxApertureValueSpot);
        if (spot.getMaxApertureValue() == null) {
            t21.setText("N/A");
        } else {
            t21.setText(spot.getMaxApertureValue());
        }

        TextView t22 = v.findViewById(R.id.digitalZoomRatioSpot);
        if (spot.getDigitalZoomRatio() == null) {
            t22.setText("N/A");
        } else {
            t22.setText(spot.getDigitalZoomRatio());
        }

        TextView t23 = v.findViewById(R.id.contrastSpot);
        if (spot.getContrast() == null) {
            t23.setText("N/A");
        } else {
            t23.setText(spot.getContrast());
        }

        TextView t24 = v.findViewById(R.id.saturationSpot);
        if (spot.getSaturation() == null) {
            t24.setText("N/A");
        } else {
            t24.setText(spot.getSaturation());
        }

        TextView t25 = v.findViewById(R.id.sharpnessSpot);
        if (spot.getSharpness() == null) {
            t25.setText("N/A");
        } else {
            t25.setText(spot.getSharpness());
        }

        return v;
    }
}