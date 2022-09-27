package edu.aku.hassannaqvi.flood2022v2.ui.sections;

import static edu.aku.hassannaqvi.flood2022v2.core.MainApp.mobileHealth;
import static edu.aku.hassannaqvi.flood2022v2.utils.extension.ActivityExtKt.gotoActivity;
import static edu.aku.hassannaqvi.flood2022v2.utils.extension.ActivityExtKt.gotoActivityWithPutExtra;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.google.gson.Gson;
import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import edu.aku.hassannaqvi.flood2022v2.R;
import edu.aku.hassannaqvi.flood2022v2.contracts.MHContract;
import edu.aku.hassannaqvi.flood2022v2.core.MainApp;
import edu.aku.hassannaqvi.flood2022v2.database.DatabaseHelper;
import edu.aku.hassannaqvi.flood2022v2.databinding.ActivityMobileHealthR201Binding;
import edu.aku.hassannaqvi.flood2022v2.models.Camps;
import edu.aku.hassannaqvi.flood2022v2.ui.MainActivity;
import edu.aku.hassannaqvi.flood2022v2.utils.AppUtilsKt;
import edu.aku.hassannaqvi.flood2022v2.utils.EndSectionActivity;
import edu.aku.hassannaqvi.flood2022v2.utils.shared.SharedStorage;

public class SectionMobileHealthR201 extends AppCompatActivity implements EndSectionActivity {

    private final boolean AllVaccinationsViewed = false;
    ActivityMobileHealthR201Binding bi;
    private String patientType;
    private List<String> campNo;
    private DatabaseHelper db;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_mobile_health_r201);
        bi.setCallback(this);
        setSupportActionBar(bi.toolbar);

        /*
         * Get camp data and set it to xml
         * */
        Camps camp = new Gson().fromJson(SharedStorage.INSTANCE.getSelectedCampData(this), Camps.class);
        bi.setCamps(camp);
        db = MainApp.appInfo.dbHelper;
        //populateSpinner(camp.getIdCamp());  // Populate Doctors' Name
//        bi.ss101.setMinDate(convertDateFormat(camp.getPlan_date()));
        setupSkips();

        if (MainApp.user.getDist_id().equals("345")) {
            bi.me20356.setVisibility(View.GONE);
            bi.me20301.setVisibility(View.GONE);
            bi.me20307.setVisibility(View.GONE);
            bi.me20310.setVisibility(View.GONE);
            bi.me20315.setVisibility(View.GONE);
            bi.me20322.setVisibility(View.GONE);
            bi.me20323.setVisibility(View.GONE);
            bi.me203101.setVisibility(View.GONE);
            bi.me203102.setVisibility(View.GONE);
            bi.me203103.setVisibility(View.GONE);
            bi.me203104.setVisibility(View.GONE);
            bi.me203105.setVisibility(View.GONE);
            bi.me203106.setVisibility(View.GONE);
            bi.me203107.setVisibility(View.GONE);
            bi.me203108.setVisibility(View.GONE);
            bi.me203109.setVisibility(View.GONE);
            bi.me203110.setVisibility(View.GONE);
            bi.me203111.setVisibility(View.GONE);
            bi.me203112.setVisibility(View.GONE);
            bi.me203113.setVisibility(View.GONE);
            bi.me203114.setVisibility(View.GONE);
            bi.me203115.setVisibility(View.GONE);
            bi.me203116.setVisibility(View.GONE);
            bi.me203117.setVisibility(View.GONE);
            bi.me203118.setVisibility(View.GONE);
            bi.me203119.setVisibility(View.GONE);
            bi.me203120.setVisibility(View.GONE);
            bi.me203121.setVisibility(View.GONE);
            bi.me203122.setVisibility(View.GONE);
            bi.me203123.setVisibility(View.GONE);
            bi.me203124.setVisibility(View.GONE);
            bi.me203125.setVisibility(View.GONE);
            bi.me203126.setVisibility(View.GONE);
            bi.me203127.setVisibility(View.GONE);
            bi.me203128.setVisibility(View.GONE);
            bi.me203129.setVisibility(View.GONE);
            bi.me203130.setVisibility(View.GONE);
            bi.me203131.setVisibility(View.GONE);
            bi.me203132.setVisibility(View.GONE);
            bi.me203133.setVisibility(View.GONE);
            bi.me203134.setVisibility(View.GONE);
            bi.me203135.setVisibility(View.GONE);
        } else {
            bi.medName.setVisibility(View.GONE);
            bi.medQNT.setVisibility(View.GONE);
            bi.medDAY.setVisibility(View.GONE);
            bi.me203136.setVisibility(View.GONE);
            bi.me203136QTY.setVisibility(View.GONE);
            bi.me203136DAY.setVisibility(View.GONE);
            bi.me203137.setVisibility(View.GONE);
            bi.me203137QTY.setVisibility(View.GONE);
            bi.me203137DAY.setVisibility(View.GONE);
            bi.me203138.setVisibility(View.GONE);
            bi.me203138QTY.setVisibility(View.GONE);
            bi.me203138DAY.setVisibility(View.GONE);
            bi.me203139.setVisibility(View.GONE);
            bi.me203139QTY.setVisibility(View.GONE);
            bi.me203139DAY.setVisibility(View.GONE);
            bi.me203140.setVisibility(View.GONE);
            bi.me203140QTY.setVisibility(View.GONE);
            bi.me203140DAY.setVisibility(View.GONE);
            bi.me203141.setVisibility(View.GONE);
            bi.me203141QTY.setVisibility(View.GONE);
            bi.me203141DAY.setVisibility(View.GONE);
            bi.me203142.setVisibility(View.GONE);
            bi.me203142QTY.setVisibility(View.GONE);
            bi.me203142DAY.setVisibility(View.GONE);
            bi.me203143.setVisibility(View.GONE);
            bi.me203143QTY.setVisibility(View.GONE);
            bi.me203143DAY.setVisibility(View.GONE);
            bi.me203144.setVisibility(View.GONE);
            bi.me203144QTY.setVisibility(View.GONE);
            bi.me203144DAY.setVisibility(View.GONE);
            bi.me203145.setVisibility(View.GONE);
            bi.me203145QTY.setVisibility(View.GONE);
            bi.me203145DAY.setVisibility(View.GONE);
            bi.me203146.setVisibility(View.GONE);
            bi.me203146QTY.setVisibility(View.GONE);
            bi.me203146DAY.setVisibility(View.GONE);
            bi.me203147.setVisibility(View.GONE);
            bi.me203147QTY.setVisibility(View.GONE);
            bi.me203147DAY.setVisibility(View.GONE);
            bi.me203148.setVisibility(View.GONE);
            bi.me203148QTY.setVisibility(View.GONE);
            bi.me203148DAY.setVisibility(View.GONE);
            bi.me203149.setVisibility(View.GONE);
            bi.me203149QTY.setVisibility(View.GONE);
            bi.me203149DAY.setVisibility(View.GONE);
            bi.me203150.setVisibility(View.GONE);
            bi.me203150QTY.setVisibility(View.GONE);
            bi.me203150DAY.setVisibility(View.GONE);
            bi.me203151.setVisibility(View.GONE);
            bi.me203151QTY.setVisibility(View.GONE);
            bi.me203151DAY.setVisibility(View.GONE);
            bi.me203152.setVisibility(View.GONE);
            bi.me203152QTY.setVisibility(View.GONE);
            bi.me203152DAY.setVisibility(View.GONE);
            bi.me203153.setVisibility(View.GONE);
            bi.me203153QTY.setVisibility(View.GONE);
            bi.me203153DAY.setVisibility(View.GONE);
            bi.me203154.setVisibility(View.GONE);
            bi.me203154QTY.setVisibility(View.GONE);
            bi.me203154DAY.setVisibility(View.GONE);
            bi.me203155.setVisibility(View.GONE);
            bi.me203155QTY.setVisibility(View.GONE);
            bi.me203155DAY.setVisibility(View.GONE);
            bi.me203156.setVisibility(View.GONE);
            bi.me203156QTY.setVisibility(View.GONE);
            bi.me203156DAY.setVisibility(View.GONE);
            bi.me203157.setVisibility(View.GONE);
            bi.me203157QTY.setVisibility(View.GONE);
            bi.me203157DAY.setVisibility(View.GONE);
            bi.me203158.setVisibility(View.GONE);
            bi.me203158QTY.setVisibility(View.GONE);
            bi.me203158DAY.setVisibility(View.GONE);
            bi.me203159.setVisibility(View.GONE);
            bi.me203159QTY.setVisibility(View.GONE);
            bi.me203159DAY.setVisibility(View.GONE);
            bi.me203160.setVisibility(View.GONE);
            bi.me203160QTY.setVisibility(View.GONE);
            bi.me203160DAY.setVisibility(View.GONE);
            bi.me203161.setVisibility(View.GONE);
            bi.me203161QTY.setVisibility(View.GONE);
            bi.me203161DAY.setVisibility(View.GONE);
            bi.me203162.setVisibility(View.GONE);
            bi.me203162QTY.setVisibility(View.GONE);
            bi.me203162DAY.setVisibility(View.GONE);
            bi.me203163.setVisibility(View.GONE);
            bi.me203163QTY.setVisibility(View.GONE);
            bi.me203163DAY.setVisibility(View.GONE);
            bi.me203164.setVisibility(View.GONE);
            bi.me203164QTY.setVisibility(View.GONE);
            bi.me203164DAY.setVisibility(View.GONE);
            bi.me203165.setVisibility(View.GONE);
            bi.me203165QTY.setVisibility(View.GONE);
            bi.me203165DAY.setVisibility(View.GONE);
            bi.me203166.setVisibility(View.GONE);
            bi.me203166QTY.setVisibility(View.GONE);
            bi.me203166DAY.setVisibility(View.GONE);
            bi.me203167.setVisibility(View.GONE);
            bi.me203167QTY.setVisibility(View.GONE);
            bi.me203167DAY.setVisibility(View.GONE);
            bi.me203168.setVisibility(View.GONE);
            bi.me203168QTY.setVisibility(View.GONE);
            bi.me203168DAY.setVisibility(View.GONE);
            bi.me203169.setVisibility(View.GONE);
            bi.me203169QTY.setVisibility(View.GONE);
            bi.me203169DAY.setVisibility(View.GONE);
            bi.me203170.setVisibility(View.GONE);
            bi.me203170QTY.setVisibility(View.GONE);
            bi.me203170DAY.setVisibility(View.GONE);
            bi.me203171.setVisibility(View.GONE);
            bi.me203171QTY.setVisibility(View.GONE);
            bi.me203171DAY.setVisibility(View.GONE);
            bi.me203172.setVisibility(View.GONE);
            bi.me203172QTY.setVisibility(View.GONE);
            bi.me203172DAY.setVisibility(View.GONE);
            bi.me203173.setVisibility(View.GONE);
            bi.me203173QTY.setVisibility(View.GONE);
            bi.me203173DAY.setVisibility(View.GONE);
            bi.me203174.setVisibility(View.GONE);
            bi.me203174QTY.setVisibility(View.GONE);
            bi.me203174DAY.setVisibility(View.GONE);
            bi.me203175.setVisibility(View.GONE);
            bi.me203175QTY.setVisibility(View.GONE);
            bi.me203175DAY.setVisibility(View.GONE);
            bi.me203176.setVisibility(View.GONE);
            bi.me203176QTY.setVisibility(View.GONE);
            bi.me203176DAY.setVisibility(View.GONE);
            bi.me203177.setVisibility(View.GONE);
            bi.me203177QTY.setVisibility(View.GONE);
            bi.me203177DAY.setVisibility(View.GONE);
            bi.me203178.setVisibility(View.GONE);
            bi.me203178QTY.setVisibility(View.GONE);
            bi.me203178DAY.setVisibility(View.GONE);
            bi.me203179.setVisibility(View.GONE);
            bi.me203179QTY.setVisibility(View.GONE);
            bi.me203179DAY.setVisibility(View.GONE);
            bi.me203180.setVisibility(View.GONE);
            bi.me203180QTY.setVisibility(View.GONE);
            bi.me203180DAY.setVisibility(View.GONE);
            bi.me203181.setVisibility(View.GONE);
            bi.me203181QTY.setVisibility(View.GONE);
            bi.me203181DAY.setVisibility(View.GONE);
            bi.me203182.setVisibility(View.GONE);
            bi.me203182QTY.setVisibility(View.GONE);
            bi.me203182DAY.setVisibility(View.GONE);
            bi.me203183.setVisibility(View.GONE);
            bi.me203183QTY.setVisibility(View.GONE);
            bi.me203183DAY.setVisibility(View.GONE);
            bi.me203184.setVisibility(View.GONE);
            bi.me203184QTY.setVisibility(View.GONE);
            bi.me203184DAY.setVisibility(View.GONE);
            bi.me203185.setVisibility(View.GONE);
            bi.me203185QTY.setVisibility(View.GONE);
            bi.me203185DAY.setVisibility(View.GONE);
            bi.me203186.setVisibility(View.GONE);
            bi.me203186QTY.setVisibility(View.GONE);
            bi.me203186DAY.setVisibility(View.GONE);
            bi.me203187.setVisibility(View.GONE);
            bi.me203187QTY.setVisibility(View.GONE);
            bi.me203187DAY.setVisibility(View.GONE);
            bi.me203188.setVisibility(View.GONE);
            bi.me203188QTY.setVisibility(View.GONE);
            bi.me203188DAY.setVisibility(View.GONE);
            bi.me203189.setVisibility(View.GONE);
            bi.me203189QTY.setVisibility(View.GONE);
            bi.me203189DAY.setVisibility(View.GONE);
            bi.me203190.setVisibility(View.GONE);
            bi.me203190QTY.setVisibility(View.GONE);
            bi.me203190DAY.setVisibility(View.GONE);
            bi.me203191.setVisibility(View.GONE);
            bi.me203191QTY.setVisibility(View.GONE);
            bi.me203191DAY.setVisibility(View.GONE);
        }
    }


    private void setupSkips() {
        bi.me20399.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.me203check, !b));
    }

    public void setTags(RadioGroup rg, View[] views) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            for (View view : views) view.setTag("-1");
        });
    }

    public void setTags(RadioButton rb, View[] views) {
        rb.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) for (View view : views) view.setTag("-1");
        });
    }

    public void segregateByAge(CharSequence s, int i, int i1, int i2) {
        segregate();
    }


    public void segregateByGender(RadioGroup radioGroup, int i) {
        segregate();
    }


    public void segregate() {
    }


/*    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesMHColumn(MHContract.MHTable.COLUMN_SB, mobileHealth.sBtoString());
        if (updcount > 0) {
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }
    }*/

    private boolean updateDB() {
        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        updcount = db.updatesMHColumn(MHContract.MHTable.COLUMN_SB, mobileHealth.sBtoString());
        if (updcount > 0) {
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void saveDraft() {

//        mobileHealth = new MobileHealth();
        mobileHealth.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        mobileHealth.setUserName(MainApp.user.getUserName());
        mobileHealth.setDeviceId(MainApp.appInfo.getDeviceID());
        mobileHealth.setDeviceTag(MainApp.appInfo.getTagName());
        mobileHealth.setAppver(MainApp.appInfo.getAppVersion());

        mobileHealth.setMe20301(bi.me20301.isChecked() ? "1" : "-1");
        /*mobileHealth.setMe20302(bi.me20302.isChecked() ? "2" : "-1");
        mobileHealth.setMe20303(bi.me20303.isChecked() ? "3" : "-1");
        mobileHealth.setMe20304(bi.me20304.isChecked() ? "4" : "-1");
        mobileHealth.setMe20305(bi.me20305.isChecked() ? "5" : "-1");
        mobileHealth.setMe20306(bi.me20306.isChecked() ? "6" : "-1");*/
        mobileHealth.setMe20307(bi.me20307.isChecked() ? "7" : "-1");
        /*mobileHealth.setMe20308(bi.me20308.isChecked() ? "8" : "-1");
        mobileHealth.setMe20309(bi.me20309.isChecked() ? "9" : "-1");*/
        mobileHealth.setMe20310(bi.me20310.isChecked() ? "10" : "-1");
        /*mobileHealth.setMe20311(bi.me20311.isChecked() ? "11" : "-1");
        mobileHealth.setMe20312(bi.me20312.isChecked() ? "12" : "-1");
        mobileHealth.setMe20313(bi.me20313.isChecked() ? "13" : "-1");
        mobileHealth.setMe20314(bi.me20314.isChecked() ? "14" : "-1");*/
        mobileHealth.setMe20315(bi.me20315.isChecked() ? "15" : "-1");
        /*mobileHealth.setMe20316(bi.me20316.isChecked() ? "16" : "-1");
        mobileHealth.setMe20317(bi.me20317.isChecked() ? "17" : "-1");
        mobileHealth.setMe20318(bi.me20318.isChecked() ? "18" : "-1");
        mobileHealth.setMe20319(bi.me20319.isChecked() ? "19" : "-1");
        mobileHealth.setMe20320(bi.me20320.isChecked() ? "20" : "-1");
        mobileHealth.setMe20321(bi.me20321.isChecked() ? "21" : "-1");*/
        mobileHealth.setMe20322(bi.me20322.isChecked() ? "22" : "-1");
        mobileHealth.setMe20323(bi.me20323.isChecked() ? "23" : "-1");
        /*mobileHealth.setMe20324(bi.me20324.isChecked() ? "24" : "-1");
        mobileHealth.setMe20333(bi.me20333.isChecked() ? "33" : "-1");
        mobileHealth.setMe20335(bi.me20335.isChecked() ? "35" : "-1");
        mobileHealth.setMe20336(bi.me20336.isChecked() ? "36" : "-1");
        mobileHealth.setMe20337(bi.me20337.isChecked() ? "37" : "-1");
        mobileHealth.setMe20338(bi.me20338.isChecked() ? "38" : "-1");
        mobileHealth.setMe20339(bi.me20339.isChecked() ? "39" : "-1");
        mobileHealth.setMe20340(bi.me20340.isChecked() ? "40" : "-1");
        mobileHealth.setMe20341(bi.me20341.isChecked() ? "41" : "-1");
        mobileHealth.setMe20342(bi.me20342.isChecked() ? "42" : "-1");
        mobileHealth.setMe20343(bi.me20343.isChecked() ? "43" : "-1");
        mobileHealth.setMe20344(bi.me20344.isChecked() ? "44" : "-1");
        mobileHealth.setMe20345(bi.me20345.isChecked() ? "45" : "-1");
        mobileHealth.setMe20346(bi.me20346.isChecked() ? "46" : "-1");
        mobileHealth.setMe20347(bi.me20347.isChecked() ? "47" : "-1");
        mobileHealth.setMe20348(bi.me20348.isChecked() ? "48" : "-1");
        mobileHealth.setMe20349(bi.me20349.isChecked() ? "49" : "-1");
        mobileHealth.setMe20350(bi.me20350.isChecked() ? "50" : "-1");
        mobileHealth.setMe20351(bi.me20351.isChecked() ? "51" : "-1");
        mobileHealth.setMe20352(bi.me20352.isChecked() ? "52" : "-1");
        mobileHealth.setMe20353(bi.me20353.isChecked() ? "53" : "-1");
        mobileHealth.setMe20354(bi.me20354.isChecked() ? "54" : "-1");
        mobileHealth.setMe20355(bi.me20355.isChecked() ? "55" : "-1");*/
        mobileHealth.setMe20356(bi.me20356.isChecked() ? "56" : "-1");
        /*mobileHealth.setMe20357(bi.me20357.isChecked() ? "57" : "-1");
        mobileHealth.setMe20358(bi.me20358.isChecked() ? "58" : "-1");
        mobileHealth.setMe20359(bi.me20359.isChecked() ? "59" : "-1");
        mobileHealth.setMe20361(bi.me20361.isChecked() ? "61" : "-1");
        mobileHealth.setMe20362(bi.me20362.isChecked() ? "62" : "-1");
        mobileHealth.setMe20363(bi.me20363.isChecked() ? "63" : "-1");
        mobileHealth.setMe20364(bi.me20364.isChecked() ? "64" : "-1");
        mobileHealth.setMe20365(bi.me20365.isChecked() ? "65" : "-1");
        mobileHealth.setMe20366(bi.me20366.isChecked() ? "66" : "-1");
        mobileHealth.setMe20367(bi.me20367.isChecked() ? "67" : "-1");
        mobileHealth.setMe20368(bi.me20368.isChecked() ? "68" : "-1");
        mobileHealth.setMe20369(bi.me20369.isChecked() ? "69" : "-1");
        mobileHealth.setMe20370(bi.me20370.isChecked() ? "70" : "-1");
        mobileHealth.setMe20371(bi.me20371.isChecked() ? "71" : "-1");
        mobileHealth.setMe20372(bi.me20372.isChecked() ? "72" : "-1");
        mobileHealth.setMe20373(bi.me20373.isChecked() ? "73" : "-1");
        mobileHealth.setMe20374(bi.me20374.isChecked() ? "74" : "-1");
        mobileHealth.setMe20375(bi.me20375.isChecked() ? "96" : "-1");
        mobileHealth.setMe20375x(bi.me20375x.getText().toString());
        mobileHealth.setMe20376(bi.me20376.isChecked() ? "96" : "-1");
        mobileHealth.setMe20376x(bi.me20376x.getText().toString());
        mobileHealth.setMe20377(bi.me20377.isChecked() ? "96" : "-1");
        mobileHealth.setMe20377x(bi.me20377x.getText().toString());
        mobileHealth.setMe20378(bi.me20378.isChecked() ? "96" : "-1");
        mobileHealth.setMe20378x(bi.me20378x.getText().toString());*/
        mobileHealth.setMe203101(bi.me203101.isChecked() ? "101" : "-1");
        mobileHealth.setMe203102(bi.me203102.isChecked() ? "102" : "-1");
        mobileHealth.setMe203103(bi.me203103.isChecked() ? "103" : "-1");
        mobileHealth.setMe203104(bi.me203104.isChecked() ? "104" : "-1");
        mobileHealth.setMe203105(bi.me203105.isChecked() ? "105" : "-1");
        mobileHealth.setMe203106(bi.me203106.isChecked() ? "106" : "-1");
        mobileHealth.setMe203107(bi.me203107.isChecked() ? "107" : "-1");
        mobileHealth.setMe203108(bi.me203108.isChecked() ? "108" : "-1");
        mobileHealth.setMe203109(bi.me203109.isChecked() ? "109" : "-1");
        mobileHealth.setMe203110(bi.me203110.isChecked() ? "110" : "-1");
        mobileHealth.setMe203111(bi.me203111.isChecked() ? "111" : "-1");
        mobileHealth.setMe203112(bi.me203112.isChecked() ? "112" : "-1");
        mobileHealth.setMe203113(bi.me203113.isChecked() ? "113" : "-1");
        mobileHealth.setMe203114(bi.me203114.isChecked() ? "114" : "-1");
        mobileHealth.setMe203115(bi.me203115.isChecked() ? "115" : "-1");
        mobileHealth.setMe203116(bi.me203116.isChecked() ? "116" : "-1");
        mobileHealth.setMe203117(bi.me203117.isChecked() ? "117" : "-1");
        mobileHealth.setMe203118(bi.me203118.isChecked() ? "118" : "-1");
        mobileHealth.setMe203119(bi.me203119.isChecked() ? "119" : "-1");
        mobileHealth.setMe203120(bi.me203120.isChecked() ? "120" : "-1");
        mobileHealth.setMe203121(bi.me203121.isChecked() ? "121" : "-1");
        mobileHealth.setMe203122(bi.me203122.isChecked() ? "122" : "-1");
        mobileHealth.setMe203123(bi.me203123.isChecked() ? "123" : "-1");
        mobileHealth.setMe203124(bi.me203124.isChecked() ? "124" : "-1");
        mobileHealth.setMe203125(bi.me203125.isChecked() ? "125" : "-1");
        mobileHealth.setMe203126(bi.me203126.isChecked() ? "126" : "-1");
        mobileHealth.setMe203127(bi.me203127.isChecked() ? "127" : "-1");
        mobileHealth.setMe203129(bi.me203129.isChecked() ? "129" : "-1");
        mobileHealth.setMe203128(bi.me203128.isChecked() ? "128" : "-1");
        mobileHealth.setMe203130(bi.me203130.isChecked() ? "130" : "-1");
        mobileHealth.setMe203131(bi.me203131.isChecked() ? "131" : "-1");
        mobileHealth.setMe203132(bi.me203132.isChecked() ? "132" : "-1");
        mobileHealth.setMe203133(bi.me203133.isChecked() ? "133" : "-1");
        mobileHealth.setMe203134(bi.me203134.isChecked() ? "134" : "-1");
        mobileHealth.setMe203135(bi.me203135.isChecked() ? "135" : "-1");

        mobileHealth.setMe203136(bi.me203136.isChecked() ? "136" : "-1");
        mobileHealth.setMe203136QTY(bi.me203136QTY.getText().toString());
        mobileHealth.setMe203136DAY(bi.me203136DAY.getText().toString());
        mobileHealth.setMe203137(bi.me203137.isChecked() ? "137" : "-1");
        mobileHealth.setMe203137QTY(bi.me203137QTY.getText().toString());
        mobileHealth.setMe203137DAY(bi.me203137DAY.getText().toString());
        mobileHealth.setMe203138(bi.me203138.isChecked() ? "138" : "-1");
        mobileHealth.setMe203138QTY(bi.me203138QTY.getText().toString());
        mobileHealth.setMe203138DAY(bi.me203138DAY.getText().toString());
        mobileHealth.setMe203139(bi.me203139.isChecked() ? "139" : "-1");
        mobileHealth.setMe203139QTY(bi.me203139QTY.getText().toString());
        mobileHealth.setMe203139DAY(bi.me203139DAY.getText().toString());
        mobileHealth.setMe203140(bi.me203140.isChecked() ? "140" : "-1");
        mobileHealth.setMe203140QTY(bi.me203140QTY.getText().toString());
        mobileHealth.setMe203140DAY(bi.me203140DAY.getText().toString());
        mobileHealth.setMe203141(bi.me203141.isChecked() ? "141" : "-1");
        mobileHealth.setMe203141QTY(bi.me203141QTY.getText().toString());
        mobileHealth.setMe203141DAY(bi.me203141DAY.getText().toString());
        mobileHealth.setMe203142(bi.me203142.isChecked() ? "142" : "-1");
        mobileHealth.setMe203142QTY(bi.me203142QTY.getText().toString());
        mobileHealth.setMe203142DAY(bi.me203142DAY.getText().toString());
        mobileHealth.setMe203143(bi.me203143.isChecked() ? "143" : "-1");
        mobileHealth.setMe203143QTY(bi.me203143QTY.getText().toString());
        mobileHealth.setMe203143DAY(bi.me203143DAY.getText().toString());
        mobileHealth.setMe203144(bi.me203144.isChecked() ? "144" : "-1");
        mobileHealth.setMe203144QTY(bi.me203144QTY.getText().toString());
        mobileHealth.setMe203144DAY(bi.me203144DAY.getText().toString());
        mobileHealth.setMe203145(bi.me203145.isChecked() ? "145" : "-1");
        mobileHealth.setMe203145QTY(bi.me203145QTY.getText().toString());
        mobileHealth.setMe203145DAY(bi.me203145DAY.getText().toString());
        mobileHealth.setMe203146(bi.me203146.isChecked() ? "146" : "-1");
        mobileHealth.setMe203146QTY(bi.me203146QTY.getText().toString());
        mobileHealth.setMe203146DAY(bi.me203146DAY.getText().toString());
        mobileHealth.setMe203147(bi.me203147.isChecked() ? "147" : "-1");
        mobileHealth.setMe203147QTY(bi.me203147QTY.getText().toString());
        mobileHealth.setMe203147DAY(bi.me203147DAY.getText().toString());
        mobileHealth.setMe203148(bi.me203148.isChecked() ? "148" : "-1");
        mobileHealth.setMe203148QTY(bi.me203148QTY.getText().toString());
        mobileHealth.setMe203148DAY(bi.me203148DAY.getText().toString());
        mobileHealth.setMe203149(bi.me203149.isChecked() ? "149" : "-1");
        mobileHealth.setMe203149QTY(bi.me203149QTY.getText().toString());
        mobileHealth.setMe203149DAY(bi.me203149DAY.getText().toString());
        mobileHealth.setMe203150(bi.me203150.isChecked() ? "150" : "-1");
        mobileHealth.setMe203150QTY(bi.me203150QTY.getText().toString());
        mobileHealth.setMe203150DAY(bi.me203150DAY.getText().toString());
        mobileHealth.setMe203151(bi.me203151.isChecked() ? "151" : "-1");
        mobileHealth.setMe203151QTY(bi.me203151QTY.getText().toString());
        mobileHealth.setMe203151DAY(bi.me203151DAY.getText().toString());
        mobileHealth.setMe203152(bi.me203152.isChecked() ? "152" : "-1");
        mobileHealth.setMe203152QTY(bi.me203152QTY.getText().toString());
        mobileHealth.setMe203152DAY(bi.me203152DAY.getText().toString());
        mobileHealth.setMe203153(bi.me203153.isChecked() ? "153" : "-1");
        mobileHealth.setMe203153QTY(bi.me203153QTY.getText().toString());
        mobileHealth.setMe203153DAY(bi.me203153DAY.getText().toString());
        mobileHealth.setMe203154(bi.me203154.isChecked() ? "154" : "-1");
        mobileHealth.setMe203154QTY(bi.me203154QTY.getText().toString());
        mobileHealth.setMe203154DAY(bi.me203154DAY.getText().toString());
        mobileHealth.setMe203155(bi.me203155.isChecked() ? "155" : "-1");
        mobileHealth.setMe203155QTY(bi.me203155QTY.getText().toString());
        mobileHealth.setMe203155DAY(bi.me203155DAY.getText().toString());
        mobileHealth.setMe203156(bi.me203156.isChecked() ? "156" : "-1");
        mobileHealth.setMe203156QTY(bi.me203156QTY.getText().toString());
        mobileHealth.setMe203156DAY(bi.me203156DAY.getText().toString());
        mobileHealth.setMe203157(bi.me203157.isChecked() ? "157" : "-1");
        mobileHealth.setMe203157QTY(bi.me203157QTY.getText().toString());
        mobileHealth.setMe203157DAY(bi.me203157DAY.getText().toString());
        mobileHealth.setMe203158(bi.me203158.isChecked() ? "158" : "-1");
        mobileHealth.setMe203158QTY(bi.me203158QTY.getText().toString());
        mobileHealth.setMe203158DAY(bi.me203158DAY.getText().toString());
        mobileHealth.setMe203159(bi.me203159.isChecked() ? "159" : "-1");
        mobileHealth.setMe203159QTY(bi.me203159QTY.getText().toString());
        mobileHealth.setMe203159DAY(bi.me203159DAY.getText().toString());
        mobileHealth.setMe203160(bi.me203160.isChecked() ? "160" : "-1");
        mobileHealth.setMe203160QTY(bi.me203160QTY.getText().toString());
        mobileHealth.setMe203160DAY(bi.me203160DAY.getText().toString());
        mobileHealth.setMe203161(bi.me203161.isChecked() ? "161" : "-1");
        mobileHealth.setMe203161QTY(bi.me203161QTY.getText().toString());
        mobileHealth.setMe203161DAY(bi.me203161DAY.getText().toString());
        mobileHealth.setMe203162(bi.me203162.isChecked() ? "162" : "-1");
        mobileHealth.setMe203162QTY(bi.me203162QTY.getText().toString());
        mobileHealth.setMe203162DAY(bi.me203162DAY.getText().toString());
        mobileHealth.setMe203163(bi.me203163.isChecked() ? "163" : "-1");
        mobileHealth.setMe203163QTY(bi.me203163QTY.getText().toString());
        mobileHealth.setMe203163DAY(bi.me203163DAY.getText().toString());
        mobileHealth.setMe203164(bi.me203164.isChecked() ? "164" : "-1");
        mobileHealth.setMe203164QTY(bi.me203164QTY.getText().toString());
        mobileHealth.setMe203164DAY(bi.me203164DAY.getText().toString());
        mobileHealth.setMe203165(bi.me203165.isChecked() ? "165" : "-1");
        mobileHealth.setMe203165QTY(bi.me203165QTY.getText().toString());
        mobileHealth.setMe203165DAY(bi.me203165DAY.getText().toString());
        mobileHealth.setMe203166(bi.me203166.isChecked() ? "166" : "-1");
        mobileHealth.setMe203166QTY(bi.me203166QTY.getText().toString());
        mobileHealth.setMe203166DAY(bi.me203166DAY.getText().toString());
        mobileHealth.setMe203167(bi.me203167.isChecked() ? "167" : "-1");
        mobileHealth.setMe203167QTY(bi.me203167QTY.getText().toString());
        mobileHealth.setMe203167DAY(bi.me203167DAY.getText().toString());
        mobileHealth.setMe203168(bi.me203168.isChecked() ? "168" : "-1");
        mobileHealth.setMe203168QTY(bi.me203168QTY.getText().toString());
        mobileHealth.setMe203168DAY(bi.me203168DAY.getText().toString());
        mobileHealth.setMe203169(bi.me203169.isChecked() ? "169" : "-1");
        mobileHealth.setMe203169QTY(bi.me203169QTY.getText().toString());
        mobileHealth.setMe203169DAY(bi.me203169DAY.getText().toString());
        mobileHealth.setMe203170(bi.me203170.isChecked() ? "170" : "-1");
        mobileHealth.setMe203170QTY(bi.me203170QTY.getText().toString());
        mobileHealth.setMe203170DAY(bi.me203170DAY.getText().toString());
        mobileHealth.setMe203171(bi.me203171.isChecked() ? "171" : "-1");
        mobileHealth.setMe203171QTY(bi.me203171QTY.getText().toString());
        mobileHealth.setMe203171DAY(bi.me203171DAY.getText().toString());
        mobileHealth.setMe203172(bi.me203172.isChecked() ? "172" : "-1");
        mobileHealth.setMe203172QTY(bi.me203172QTY.getText().toString());
        mobileHealth.setMe203172DAY(bi.me203172DAY.getText().toString());
        mobileHealth.setMe203173(bi.me203173.isChecked() ? "173" : "-1");
        mobileHealth.setMe203173QTY(bi.me203173QTY.getText().toString());
        mobileHealth.setMe203173DAY(bi.me203173DAY.getText().toString());
        mobileHealth.setMe203174(bi.me203174.isChecked() ? "174" : "-1");
        mobileHealth.setMe203174QTY(bi.me203174QTY.getText().toString());
        mobileHealth.setMe203174DAY(bi.me203174DAY.getText().toString());
        mobileHealth.setMe203175(bi.me203175.isChecked() ? "175" : "-1");
        mobileHealth.setMe203175QTY(bi.me203175QTY.getText().toString());
        mobileHealth.setMe203175DAY(bi.me203175DAY.getText().toString());
        mobileHealth.setMe203176(bi.me203176.isChecked() ? "176" : "-1");
        mobileHealth.setMe203176QTY(bi.me203176QTY.getText().toString());
        mobileHealth.setMe203176DAY(bi.me203176DAY.getText().toString());
        mobileHealth.setMe203177(bi.me203177.isChecked() ? "177" : "-1");
        mobileHealth.setMe203177QTY(bi.me203177QTY.getText().toString());
        mobileHealth.setMe203177DAY(bi.me203177DAY.getText().toString());
        mobileHealth.setMe203178(bi.me203178.isChecked() ? "178" : "-1");
        mobileHealth.setMe203178QTY(bi.me203178QTY.getText().toString());
        mobileHealth.setMe203178DAY(bi.me203178DAY.getText().toString());
        mobileHealth.setMe203179(bi.me203179.isChecked() ? "179" : "-1");
        mobileHealth.setMe203179QTY(bi.me203179QTY.getText().toString());
        mobileHealth.setMe203179DAY(bi.me203179DAY.getText().toString());
        mobileHealth.setMe203180(bi.me203180.isChecked() ? "180" : "-1");
        mobileHealth.setMe203180QTY(bi.me203180QTY.getText().toString());
        mobileHealth.setMe203180DAY(bi.me203180DAY.getText().toString());
        mobileHealth.setMe203181(bi.me203181.isChecked() ? "181" : "-1");
        mobileHealth.setMe203181QTY(bi.me203181QTY.getText().toString());
        mobileHealth.setMe203181DAY(bi.me203181DAY.getText().toString());
        mobileHealth.setMe203182(bi.me203182.isChecked() ? "182" : "-1");
        mobileHealth.setMe203182QTY(bi.me203182QTY.getText().toString());
        mobileHealth.setMe203182DAY(bi.me203182DAY.getText().toString());
        mobileHealth.setMe203183(bi.me203183.isChecked() ? "183" : "-1");
        mobileHealth.setMe203183QTY(bi.me203183QTY.getText().toString());
        mobileHealth.setMe203183DAY(bi.me203183DAY.getText().toString());
        mobileHealth.setMe203184(bi.me203184.isChecked() ? "184" : "-1");
        mobileHealth.setMe203184QTY(bi.me203184QTY.getText().toString());
        mobileHealth.setMe203184DAY(bi.me203184DAY.getText().toString());
        mobileHealth.setMe203185(bi.me203185.isChecked() ? "185" : "-1");
        mobileHealth.setMe203185QTY(bi.me203185QTY.getText().toString());
        mobileHealth.setMe203185DAY(bi.me203185DAY.getText().toString());
        mobileHealth.setMe203186(bi.me203186.isChecked() ? "186" : "-1");
        mobileHealth.setMe203186QTY(bi.me203186QTY.getText().toString());
        mobileHealth.setMe203186DAY(bi.me203186DAY.getText().toString());
        mobileHealth.setMe203187(bi.me203187.isChecked() ? "187" : "-1");
        mobileHealth.setMe203187QTY(bi.me203187QTY.getText().toString());
        mobileHealth.setMe203187DAY(bi.me203187DAY.getText().toString());
        mobileHealth.setMe203188(bi.me203188.isChecked() ? "188" : "-1");
        mobileHealth.setMe203188QTY(bi.me203188QTY.getText().toString());
        mobileHealth.setMe203188DAY(bi.me203188DAY.getText().toString());
        mobileHealth.setMe203189(bi.me203189.isChecked() ? "189" : "-1");
        mobileHealth.setMe203189QTY(bi.me203189QTY.getText().toString());
        mobileHealth.setMe203189DAY(bi.me203189DAY.getText().toString());
        mobileHealth.setMe203190(bi.me203190.isChecked() ? "190" : "-1");
        mobileHealth.setMe203190QTY(bi.me203190QTY.getText().toString());
        mobileHealth.setMe203190DAY(bi.me203190DAY.getText().toString());
        mobileHealth.setMe203191(bi.me203191.isChecked() ? "191" : "-1");
        mobileHealth.setMe203191QTY(bi.me203191QTY.getText().toString());
        mobileHealth.setMe203191DAY(bi.me203191DAY.getText().toString());

        mobileHealth.setMe20396(bi.me20396.isChecked() ? "96" : "-1");
        mobileHealth.setMe20396x(bi.me20396x.getText().toString());
        mobileHealth.setMe20399(bi.me20399.isChecked() ? "99" : "-1");
        mobileHealth.setVs310(bi.vs310.getText().toString());
    }


    public void BtnContinue(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (updateDB()) {
            Toast.makeText(this, "Patient Added", Toast.LENGTH_SHORT).show();
            finish();
            gotoActivityWithPutExtra(this, SectionMobileHealthR2.class, "complete", true);
        }
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    public void BtnEnd(View view) {
        AppUtilsKt.contextEndActivity(this);
    }


    @Override
    public void endSecActivity(boolean flag) {
        //if (!Validator.emptyTextBox(this, bi.mh01)) return;
        finish();
        gotoActivity(this, MainActivity.class);
    }
}