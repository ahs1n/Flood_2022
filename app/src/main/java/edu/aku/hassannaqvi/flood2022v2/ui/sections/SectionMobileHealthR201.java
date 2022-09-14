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

        /*if (MainApp.user.getDist_id().equals("999")) {
            bi.me20302.setVisibility(View.GONE);
            bi.me20303.setVisibility(View.GONE);
            bi.me20305.setVisibility(View.GONE);
            bi.me20306.setVisibility(View.GONE);
            bi.me20308.setVisibility(View.GONE);
            bi.me20309.setVisibility(View.GONE);
            bi.me20310.setVisibility(View.GONE);
            bi.me20311.setVisibility(View.GONE);
            bi.me20312.setVisibility(View.GONE);
            bi.me20314.setVisibility(View.GONE);
            bi.me20315.setVisibility(View.GONE);
            bi.me20316.setVisibility(View.GONE);
            bi.me20317.setVisibility(View.GONE);
            bi.me20318.setVisibility(View.GONE);
            bi.me20319.setVisibility(View.GONE);
            bi.me20320.setVisibility(View.GONE);
            bi.me20321.setVisibility(View.GONE);
            bi.me20323.setVisibility(View.GONE);
        }
        else {
            bi.medName.setVisibility(View.GONE);
            bi.medQNT.setVisibility(View.GONE);
            bi.medDAY.setVisibility(View.GONE);
            bi.me20301DAY.setVisibility(View.GONE);
            bi.me20301QTY.setVisibility(View.GONE);
            bi.me20304DAY.setVisibility(View.GONE);
            bi.me20304QTY.setVisibility(View.GONE);
            bi.me20307DAY.setVisibility(View.GONE);
            bi.me20307QTY.setVisibility(View.GONE);
            bi.me20313DAY.setVisibility(View.GONE);
            bi.me20313QTY.setVisibility(View.GONE);
            bi.me20322DAY.setVisibility(View.GONE);
            bi.me20322QTY.setVisibility(View.GONE);
            bi.me20324DAY.setVisibility(View.GONE);
            bi.me20324QTY.setVisibility(View.GONE);
            bi.me20396DAY.setVisibility(View.GONE);
            bi.me20396QTY.setVisibility(View.GONE);
            bi.me20333.setVisibility(View.GONE);
            bi.me20333DAY.setVisibility(View.GONE);
            bi.me20333QTY.setVisibility(View.GONE);
            bi.me20334.setVisibility(View.GONE);
            bi.me20334DAY.setVisibility(View.GONE);
            bi.me20334QTY.setVisibility(View.GONE);
            bi.me20335.setVisibility(View.GONE);
            bi.me20335DAY.setVisibility(View.GONE);
            bi.me20335QTY.setVisibility(View.GONE);
            bi.me20336.setVisibility(View.GONE);
            bi.me20336DAY.setVisibility(View.GONE);
            bi.me20336QTY.setVisibility(View.GONE);
            bi.me20337.setVisibility(View.GONE);
            bi.me20337DAY.setVisibility(View.GONE);
            bi.me20337QTY.setVisibility(View.GONE);
            bi.me20338.setVisibility(View.GONE);
            bi.me20338DAY.setVisibility(View.GONE);
            bi.me20338QTY.setVisibility(View.GONE);
            bi.me20339.setVisibility(View.GONE);
            bi.me20339DAY.setVisibility(View.GONE);
            bi.me20339QTY.setVisibility(View.GONE);
            bi.me20340.setVisibility(View.GONE);
            bi.me20340DAY.setVisibility(View.GONE);
            bi.me20340QTY.setVisibility(View.GONE);
            bi.me20341.setVisibility(View.GONE);
            bi.me20341DAY.setVisibility(View.GONE);
            bi.me20341QTY.setVisibility(View.GONE);
            bi.me20342.setVisibility(View.GONE);
            bi.me20342DAY.setVisibility(View.GONE);
            bi.me20342QTY.setVisibility(View.GONE);
            bi.me20343.setVisibility(View.GONE);
            bi.me20343DAY.setVisibility(View.GONE);
            bi.me20343QTY.setVisibility(View.GONE);
            bi.me20344.setVisibility(View.GONE);
            bi.me20344DAY.setVisibility(View.GONE);
            bi.me20344QTY.setVisibility(View.GONE);
            bi.me20345.setVisibility(View.GONE);
            bi.me20345DAY.setVisibility(View.GONE);
            bi.me20345QTY.setVisibility(View.GONE);
            bi.me20346.setVisibility(View.GONE);
            bi.me20346DAY.setVisibility(View.GONE);
            bi.me20346QTY.setVisibility(View.GONE);
            bi.me20347.setVisibility(View.GONE);
            bi.me20347DAY.setVisibility(View.GONE);
            bi.me20347QTY.setVisibility(View.GONE);
            bi.me20348.setVisibility(View.GONE);
            bi.me20348DAY.setVisibility(View.GONE);
            bi.me20348QTY.setVisibility(View.GONE);
            bi.me20349.setVisibility(View.GONE);
            bi.me20349DAY.setVisibility(View.GONE);
            bi.me20349QTY.setVisibility(View.GONE);
            bi.me20350.setVisibility(View.GONE);
            bi.me20350DAY.setVisibility(View.GONE);
            bi.me20350QTY.setVisibility(View.GONE);
            bi.me20351.setVisibility(View.GONE);
            bi.me20351DAY.setVisibility(View.GONE);
            bi.me20351QTY.setVisibility(View.GONE);
            bi.me20352.setVisibility(View.GONE);
            bi.me20352DAY.setVisibility(View.GONE);
            bi.me20352QTY.setVisibility(View.GONE);
            bi.me20353.setVisibility(View.GONE);
            bi.me20353DAY.setVisibility(View.GONE);
            bi.me20353QTY.setVisibility(View.GONE);
            bi.me20354.setVisibility(View.GONE);
            bi.me20354DAY.setVisibility(View.GONE);
            bi.me20354QTY.setVisibility(View.GONE);
            bi.me20355.setVisibility(View.GONE);
            bi.me20355DAY.setVisibility(View.GONE);
            bi.me20355QTY.setVisibility(View.GONE);
            bi.me20356.setVisibility(View.GONE);
            bi.me20356DAY.setVisibility(View.GONE);
            bi.me20356QTY.setVisibility(View.GONE);
            bi.me20357.setVisibility(View.GONE);
            bi.me20357DAY.setVisibility(View.GONE);
            bi.me20357QTY.setVisibility(View.GONE);
            bi.me20358.setVisibility(View.GONE);
            bi.me20358DAY.setVisibility(View.GONE);
            bi.me20358QTY.setVisibility(View.GONE);
            bi.me20359.setVisibility(View.GONE);
            bi.me20359DAY.setVisibility(View.GONE);
            bi.me20359QTY.setVisibility(View.GONE);
            bi.me20361.setVisibility(View.GONE);
            bi.me20361DAY.setVisibility(View.GONE);
            bi.me20361QTY.setVisibility(View.GONE);
            bi.me20362.setVisibility(View.GONE);
            bi.me20362DAY.setVisibility(View.GONE);
            bi.me20362QTY.setVisibility(View.GONE);
            bi.me20363.setVisibility(View.GONE);
            bi.me20363DAY.setVisibility(View.GONE);
            bi.me20363QTY.setVisibility(View.GONE);
            bi.me20364.setVisibility(View.GONE);
            bi.me20364DAY.setVisibility(View.GONE);
            bi.me20364QTY.setVisibility(View.GONE);
            bi.me20365.setVisibility(View.GONE);
            bi.me20365DAY.setVisibility(View.GONE);
            bi.me20365QTY.setVisibility(View.GONE);
            bi.me20366.setVisibility(View.GONE);
            bi.me20366DAY.setVisibility(View.GONE);
            bi.me20366QTY.setVisibility(View.GONE);
            bi.me20367.setVisibility(View.GONE);
            bi.me20367DAY.setVisibility(View.GONE);
            bi.me20367QTY.setVisibility(View.GONE);
            bi.me20368.setVisibility(View.GONE);
            bi.me20368DAY.setVisibility(View.GONE);
            bi.me20368QTY.setVisibility(View.GONE);
            bi.me20369.setVisibility(View.GONE);
            bi.me20369DAY.setVisibility(View.GONE);
            bi.me20369QTY.setVisibility(View.GONE);
            bi.me20370.setVisibility(View.GONE);
            bi.me20370DAY.setVisibility(View.GONE);
            bi.me20370QTY.setVisibility(View.GONE);
            bi.me20371.setVisibility(View.GONE);
            bi.me20371DAY.setVisibility(View.GONE);
            bi.me20371QTY.setVisibility(View.GONE);
            bi.me20372.setVisibility(View.GONE);
            bi.me20372DAY.setVisibility(View.GONE);
            bi.me20372QTY.setVisibility(View.GONE);
            bi.me20373.setVisibility(View.GONE);
            bi.me20373DAY.setVisibility(View.GONE);
            bi.me20373QTY.setVisibility(View.GONE);
            bi.me20374.setVisibility(View.GONE);
            bi.me20374DAY.setVisibility(View.GONE);
            bi.me20374QTY.setVisibility(View.GONE);
            bi.me20375.setVisibility(View.GONE);
            bi.me20375DAY.setVisibility(View.GONE);
            bi.me20375QTY.setVisibility(View.GONE);
            bi.me20376.setVisibility(View.GONE);
            bi.me20376DAY.setVisibility(View.GONE);
            bi.me20376QTY.setVisibility(View.GONE);
            bi.me20377.setVisibility(View.GONE);
            bi.me20377DAY.setVisibility(View.GONE);
            bi.me20377QTY.setVisibility(View.GONE);
            bi.me20378.setVisibility(View.GONE);
            bi.me20378DAY.setVisibility(View.GONE);
            bi.me20378QTY.setVisibility(View.GONE);

        }*/
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