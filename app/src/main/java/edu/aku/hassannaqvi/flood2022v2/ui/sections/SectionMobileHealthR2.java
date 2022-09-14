package edu.aku.hassannaqvi.flood2022v2.ui.sections;

import static edu.aku.hassannaqvi.flood2022v2.core.MainApp.mobileHealth;
import static edu.aku.hassannaqvi.flood2022v2.utils.extension.ActivityExtKt.gotoActivity;
import static edu.aku.hassannaqvi.flood2022v2.utils.extension.ActivityExtKt.gotoActivityWithPutExtra;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
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
import edu.aku.hassannaqvi.flood2022v2.databinding.ActivityMobileHealthR2Binding;
import edu.aku.hassannaqvi.flood2022v2.models.Camps;
import edu.aku.hassannaqvi.flood2022v2.models.MobileHealth;
import edu.aku.hassannaqvi.flood2022v2.ui.MainActivity;
import edu.aku.hassannaqvi.flood2022v2.utils.AppUtilsKt;
import edu.aku.hassannaqvi.flood2022v2.utils.EndSectionActivity;
import edu.aku.hassannaqvi.flood2022v2.utils.shared.SharedStorage;

public class SectionMobileHealthR2 extends AppCompatActivity implements EndSectionActivity {

    private final boolean AllVaccinationsViewed = false;
    ActivityMobileHealthR2Binding bi;
    private String patientType;
    private List<String> campNo;
    private DatabaseHelper db;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_mobile_health_r2);
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

        if (MainApp.user.getDist_id().equals("999")) {
            bi.fldGrpCVss110a.setVisibility(View.GONE);
            bi.fldGrpCVss110b.setVisibility(View.GONE);
            bi.fldGrpCVss110c.setVisibility(View.GONE);
            bi.fldGrpCVss110d.setVisibility(View.GONE);
            bi.fldGrpCVss110e.setVisibility(View.GONE);
        }
    }


    private void setupSkips() {

        bi.ss108.setOnCheckedChangeListener((radioGroup, i) -> {
//            if (i == bi.ss108a.getId()) {
//                Clear.clearAllFields(bi.fldGrpCVss109);
//                bi.fldGrpCVss109.setVisibility(View.GONE);
//                Clear.clearAllFields(bi.fldGrpCVvs301);
//                bi.fldGrpCVvs301.setVisibility(View.GONE);
//            } else {
//                if (TextUtils.isEmpty(bi.ss107y.getText().toString())) {
//                    return;
//                } else if (Integer.parseInt(bi.ss107y.getText().toString()) >= 14) {
//                    bi.fldGrpCVss109.setVisibility(View.VISIBLE);
//                    bi.fldGrpCVvs301.setVisibility(View.VISIBLE);
//                }


            if (bi.ss108a.isChecked()) {
                Clear.clearAllFields(bi.fldGrpCVss109);
                bi.fldGrpCVss109.setVisibility(View.GONE);
                Clear.clearAllFields(bi.fldGrpCVvs301);
                bi.fldGrpCVvs301.setVisibility(View.GONE);
            } else if (bi.ss11199.isChecked() && (!TextUtils.isEmpty(bi.ss107y.getText().toString()) && Integer.parseInt(bi.ss107y.getText().toString()) < 14)) {
                bi.fldGrpCVss109.setVisibility(View.VISIBLE);
                bi.fldGrpCVvs301.setVisibility(View.VISIBLE);
                bi.ss111a.setEnabled(false);
                bi.ss111b.setEnabled(false);
                bi.ss111c.setEnabled(true);
                bi.ss111d.setEnabled(true);
            }
        });


        bi.ss108.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpCVvs301));
        bi.vs307.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpCVvs308));

        bi.vs30699.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.vs306check, !b));

//        bi.ss11199.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.ss111check, !b));

        bi.ss11199.setOnCheckedChangeListener(((compoundButton, b) -> {
            if (b) {
                Clear.clearAllFields(bi.ss111check);
                bi.ss111a.setEnabled(false);
                bi.ss111b.setEnabled(false);
                bi.ss111c.setEnabled(false);
                bi.ss111d.setEnabled(false);
            } else if (bi.ss108a.isChecked()) {
                bi.ss111a.setEnabled(false);
                bi.ss111b.setEnabled(false);
                bi.ss111c.setEnabled(true);
                bi.ss111d.setEnabled(true);
            } else if (bi.ss108b.isChecked() && (!TextUtils.isEmpty(bi.ss107y.getText().toString()) && Integer.parseInt(bi.ss107y.getText().toString()) < 14)) {
                bi.ss111a.setEnabled(false);
                bi.ss111b.setEnabled(false);
                bi.ss111c.setEnabled(true);
                bi.ss111d.setEnabled(true);
            } else {
                bi.ss111a.setEnabled(true);
                bi.ss111b.setEnabled(true);
                bi.ss111c.setEnabled(true);
                bi.ss111d.setEnabled(true);

            }
        }));
        bi.pc20199.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.pc201check, !b));
        bi.di20299.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.di202check, !b));
//        bi.me20399.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.me203check, !b));


        bi.ss110a99.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.ss110atempx, !b));
        bi.ss11099.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.ss110, !b));

        bi.ss110mm99.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.ss110muac, !b));
        bi.ss110f99.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.ss110fosx, !b));
        bi.ss110g99.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.ss110ghrx, !b));

        bi.ss110b99.setOnCheckedChangeListener((compoundButton, b) ->

        {
            Clear.clearAllFields(bi.ss110bdiastolicx, !b);
            Clear.clearAllFields(bi.ss110bsystolicx, !b);
        });
        bi.ss110d99.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.ss110drbsx, !b));
        bi.ss110e99.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.ss110ehbx, !b));

    }

    public void ss107yOnTextChanged(CharSequence s, int start, int before, int count) {
        if (TextUtils.isEmpty(bi.ss107y.getText().toString()))
            return;

        Clear.clearAllFields(bi.fldGrpCVss108);

        int age = Integer.parseInt(bi.ss107y.getText().toString());

        if (age >= 5) {
            Clear.clearAllFields(bi.fldGrpU5);
            bi.fldGrpU5.setVisibility(View.GONE);
        } else {
            bi.fldGrpU5.setVisibility(View.VISIBLE);
        }

        if (age < 14) {
            Clear.clearAllFields(bi.fldGrpCVss109);
            bi.fldGrpCVss109.setVisibility(View.GONE);
            Clear.clearAllFields(bi.fldGrpCVvs301);
            bi.fldGrpCVvs301.setVisibility(View.GONE);
            Clear.clearAllFields(bi.fldGrpCVss111);
            bi.ss111a.setEnabled(false);
            bi.ss111b.setEnabled(false);
        } else {
            bi.fldGrpCVss109.setVisibility(View.VISIBLE);
            bi.fldGrpCVvs301.setVisibility(View.VISIBLE);
            bi.ss111a.setEnabled(true);
            bi.ss111b.setEnabled(true);
        }
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


    /*public void ageZeroCheck(CharSequence s, int i, int i1, int i2) {
        if (TextUtils.isEmpty(bi.mh09d.getText()) || TextUtils.isEmpty(bi.mh09m.getText()) || TextUtils.isEmpty(bi.mh09y.getText()))
            return;
        int check = Integer.parseInt(bi.mh09d.getText().toString()) + Integer.parseInt(bi.mh09m.getText().toString()) + Integer.parseInt(bi.mh09y.getText().toString());
        if (check == 0) openWarningDialog(this, "Error", "All Fields Can't be ZERO", new EditTextPicker[]{bi.mh09y, bi.mh09m, bi.mh09d});
        segregate();
    }*/


    public void segregateByAge(CharSequence s, int i, int i1, int i2) {
        segregate();
    }


    public void segregateByGender(RadioGroup radioGroup, int i) {
        segregate();
    }


    public void segregate() {
       /* if (TextUtils.isEmpty(bi.mh09d.getText()) || TextUtils.isEmpty(bi.mh09m.getText()) || TextUtils.isEmpty(bi.mh09y.getText()) || bi.mh010.getCheckedRadioButtonId() == -1)
            return;
        int age = Integer.parseInt(bi.mh09d.getText().toString()) + (Integer.parseInt(bi.mh09m.getText().toString()) * 29) + (Integer.parseInt(bi.mh09y.getText().toString()) * 365);

       *//* bi.mh012.setMinvalue(15f);
        bi.mh012.setMaxvalue(250f);*//*
        bi.mh012.setMask("###.#");
        bi.mh012.setHint("###.#");
        Clear.clearAllFields(bi.fldGrpCVmh010a);
        Clear.clearAllFields(bi.fldGrpCVmh017);
        Clear.clearAllFields(bi.llmh020);
        Clear.clearAllFields(bi.fldGrpCVmh015);
        Clear.clearAllFields(bi.fldGrpCVmh016);
        Clear.clearAllFields(bi.fldGrpCVmh018);
        Clear.clearAllFields(bi.llchild);
        bi.mh02601.setChecked(false);
        bi.mh026019.setChecked(false);
        bi.fldGrpCVmh010a.setVisibility(View.GONE);
        bi.fldGrpCVmh017.setVisibility(View.GONE);
        bi.llmh020.setVisibility(View.GONE);
        bi.fldGrpCVmh015.setVisibility(View.GONE);
        bi.fldGrpCVmh016.setVisibility(View.GONE);
        bi.fldGrpCVmh018.setVisibility(View.GONE);
        bi.llchild.setVisibility(View.GONE);
        patientType = "General";

        if (age >= 5110 && age < 18250 && bi.mh01002.isChecked()) {
            bi.fldGrpCVmh017.setVisibility(View.VISIBLE);
            bi.llmh020.setVisibility(View.VISIBLE);
            patientType = "MWRA";
        }
        if (age >= 5110) {
            bi.fldGrpCVmh010a.setVisibility(View.VISIBLE);
        }
        if (age <= 1825) {
            bi.fldGrpCVmh015.setVisibility(View.VISIBLE);
            bi.fldGrpCVmh016.setVisibility(View.VISIBLE);
            bi.fldGrpCVmh018.setVisibility(View.VISIBLE);
            bi.llchild.setVisibility(View.VISIBLE);
            bi.mh012.setMinvalue(0.9f);
            bi.mh012.setMaxvalue(58f);
            bi.mh012.setMask("###.#");
            bi.mh012.setHint("###.#");
            patientType = "Child";
        }*/
    }


    private boolean UpdateDB() {
        long updcount = db.addMH(mobileHealth);
        mobileHealth.setId(String.valueOf(updcount));
        if (updcount > 0) {
            mobileHealth.setUid(mobileHealth.getDeviceId() + mobileHealth.getId());
            long count = db.updatesMHColumn(MHContract.MHTable.COLUMN_UID, mobileHealth.getUid());
            if (count > 0)
                count = db.updatesMHColumn(MHContract.MHTable.COLUMN_SA, mobileHealth.sAtoString());
            if (count > 0) return true;
            else {
                Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
                return false;
            }
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }

    }


    private void saveDraft() {

        mobileHealth = new MobileHealth();
        mobileHealth.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        mobileHealth.setUserName(MainApp.user.getUserName());
        mobileHealth.setDeviceId(MainApp.appInfo.getDeviceID());
        mobileHealth.setDeviceTag(MainApp.appInfo.getTagName());
        mobileHealth.setAppver(MainApp.appInfo.getAppVersion());


        mobileHealth.setSs101(bi.ss101.getText().toString());
        mobileHealth.setSs102(bi.ss102.getText().toString());
        mobileHealth.setSs103(bi.ss103.getText().toString());
        mobileHealth.setSs104(bi.ss104.getText().toString());
        mobileHealth.setSs105(bi.ss105.getText().toString());
        mobileHealth.setSs106(bi.ss106.getText().toString());
        mobileHealth.setSs107(bi.ss107y.getText().toString() + "-" + bi.ss107m.getText().toString() + "-" + bi.ss107d.getText().toString());
        mobileHealth.setSs107y(bi.ss107y.getText().toString());
        mobileHealth.setSs107m(bi.ss107m.getText().toString());
        mobileHealth.setSs107d(bi.ss107d.getText().toString());
        mobileHealth.setSs108(bi.ss108a.isChecked() ? "1"
                : bi.ss108b.isChecked() ? "2"
                : "-1");
        mobileHealth.setSs109(bi.ss109a.isChecked() ? "1"
                : bi.ss109b.isChecked() ? "2"
                : bi.ss10999.isChecked() ? "99"
                : "-1");
        mobileHealth.setSs110(bi.ss110.getText().toString());
        mobileHealth.setSs11099(bi.ss11099.isChecked() ? "99" : "-1");
        mobileHealth.setSs110atempx(bi.ss110atempx.getText().toString());
        mobileHealth.setSs110a99(bi.ss110a99.isChecked() ? "99" : "-1");
        mobileHealth.setSs110muac(bi.ss110muac.getText().toString());
        mobileHealth.setSs110mm99(bi.ss110mm99.isChecked() ? "99" : "-1");
        mobileHealth.setSs110fosx(bi.ss110fosx.getText().toString());
        mobileHealth.setSs110f99(bi.ss110f99.isChecked() ? "99" : "-1");
        mobileHealth.setSs110ghrx(bi.ss110ghrx.getText().toString());
        mobileHealth.setSs110g99(bi.ss110g99.isChecked() ? "99" : "-1");
        mobileHealth.setSs110bdiastolicx(bi.ss110bdiastolicx.getText().toString());
        mobileHealth.setSs110bsystolicx(bi.ss110bsystolicx.getText().toString());
        mobileHealth.setSs110b99(bi.ss110b99.isChecked() ? "99" : "-1");
        mobileHealth.setSs110c(bi.ss110c01.isChecked() ? "1"
                : bi.ss110c02.isChecked() ? "2"
                : bi.ss110c99.isChecked() ? "99"
                : "-1");
        mobileHealth.setSs110drbsx(bi.ss110drbsx.getText().toString());
        mobileHealth.setSs110d99(bi.ss110d99.isChecked() ? "99" : "-1");
        mobileHealth.setSs110ehbx(bi.ss110ehbx.getText().toString());
        mobileHealth.setSs110e99(bi.ss110e99.isChecked() ? "99" : "-1");

        mobileHealth.setSs111a(bi.ss111a.isChecked() ? "1" : "-1");
        mobileHealth.setSs111b(bi.ss111b.isChecked() ? "2" : "-1");
        mobileHealth.setSs111c(bi.ss111c.isChecked() ? "3" : "-1");
        mobileHealth.setSs111d(bi.ss111d.isChecked() ? "4" : "-1");
        mobileHealth.setSs11199(bi.ss11199.isChecked() ? "99" : "-1");
        mobileHealth.setPc20101(bi.pc20101.isChecked() ? "1" : "-1");
        mobileHealth.setPc20102(bi.pc20102.isChecked() ? "2" : "-1");
        mobileHealth.setPc20103(bi.pc20103.isChecked() ? "3" : "-1");
        /*mobileHealth.setPc20104(bi.pc20104.isChecked() ? "4" : "-1");
        mobileHealth.setPc20105(bi.pc20105.isChecked() ? "5" : "-1");
        mobileHealth.setPc20106(bi.pc20106.isChecked() ? "6" : "-1");*/
        mobileHealth.setPc20107(bi.pc20107.isChecked() ? "7" : "-1");
//        mobileHealth.setPc20108(bi.pc20108.isChecked() ? "8" : "-1");
        mobileHealth.setPc20109(bi.pc20109.isChecked() ? "9" : "-1");
        mobileHealth.setPc20110(bi.pc20110.isChecked() ? "10" : "-1");
        mobileHealth.setPc20111(bi.pc20111.isChecked() ? "11" : "-1");
        mobileHealth.setPc20112(bi.pc20112.isChecked() ? "12" : "-1");
        mobileHealth.setPc20113(bi.pc20113.isChecked() ? "13" : "-1");
        mobileHealth.setPc20114(bi.pc20114.isChecked() ? "14" : "-1");
//        mobileHealth.setPc20115(bi.pc20115.isChecked() ? "15" : "-1");
//        mobileHealth.setPc20116(bi.pc20116.isChecked() ? "16" : "-1");
        mobileHealth.setPc20117(bi.pc20117.isChecked() ? "17" : "-1");
//        mobileHealth.setPc20118(bi.pc20118.isChecked() ? "18" : "-1");
        mobileHealth.setPc20119(bi.pc20119.isChecked() ? "19" : "-1");
        mobileHealth.setPc20196(bi.pc20196.isChecked() ? "20" : "-1");
        mobileHealth.setPc20196x(bi.pc20196x.getText().toString());
        mobileHealth.setPc20199(bi.pc20199.isChecked() ? "99" : "-1");
        mobileHealth.setPc20121(bi.pc20121.isChecked() ? "21" : "-1");
        mobileHealth.setPc20122(bi.pc20122.isChecked() ? "22" : "-1");
        mobileHealth.setPc20123(bi.pc20123.isChecked() ? "23" : "-1");
        mobileHealth.setPc20124(bi.pc20124.isChecked() ? "24" : "-1");
        mobileHealth.setPc20125(bi.pc20125.isChecked() ? "25" : "-1");
        mobileHealth.setPc20126(bi.pc20126.isChecked() ? "26" : "-1");
        mobileHealth.setPc20127(bi.pc20127.isChecked() ? "27" : "-1");
        mobileHealth.setPc20128(bi.pc20128.isChecked() ? "28" : "-1");
        mobileHealth.setPc20129(bi.pc20129.isChecked() ? "29" : "-1");
        mobileHealth.setPc20130(bi.pc20130.isChecked() ? "30" : "-1");
        mobileHealth.setPc20131(bi.pc20131.isChecked() ? "31" : "-1");
        mobileHealth.setPc20132(bi.pc20132.isChecked() ? "32" : "-1");
        mobileHealth.setPc20133(bi.pc20133.isChecked() ? "33" : "-1");
        mobileHealth.setPc20134(bi.pc20134.isChecked() ? "34" : "-1");
        mobileHealth.setPc20135(bi.pc20135.isChecked() ? "35" : "-1");
        mobileHealth.setPc20136(bi.pc20136.isChecked() ? "36" : "-1");
        mobileHealth.setDi20201(bi.di20201.isChecked() ? "1" : "-1");
//        mobileHealth.setDi20202(bi.di20202.isChecked() ? "2" : "-1");
        mobileHealth.setDi20203(bi.di20203.isChecked() ? "3" : "-1");
//        mobileHealth.setDi20204(bi.di20204.isChecked() ? "4" : "-1");
        mobileHealth.setDi20205(bi.di20205.isChecked() ? "5" : "-1");
//        mobileHealth.setDi20206(bi.di20206.isChecked() ? "6" : "-1");
//        mobileHealth.setDi20207(bi.di20207.isChecked() ? "7" : "-1");
//        mobileHealth.setDi20208(bi.di20208.isChecked() ? "8" : "-1");
        mobileHealth.setDi20209(bi.di20209.isChecked() ? "9" : "-1");
        mobileHealth.setDi20210(bi.di20210.isChecked() ? "10" : "-1");
        mobileHealth.setDi20211(bi.di20211.isChecked() ? "11" : "-1");
//        mobileHealth.setDi20212(bi.di20212.isChecked() ? "12" : "-1");
//        mobileHealth.setDi20213(bi.di20213.isChecked() ? "13" : "-1");
//        mobileHealth.setDi20214(bi.di20214.isChecked() ? "14" : "-1");
//        mobileHealth.setDi20215(bi.di20215.isChecked() ? "15" : "-1");
        mobileHealth.setDi20216(bi.di20216.isChecked() ? "16" : "-1");
//        mobileHealth.setDi20217(bi.di20217.isChecked() ? "17" : "-1");
//        mobileHealth.setDi20218(bi.di20218.isChecked() ? "18" : "-1");
        mobileHealth.setDi20219(bi.di20219.isChecked() ? "19" : "-1");
        mobileHealth.setDi20221(bi.di20221.isChecked() ? "21" : "-1");
        mobileHealth.setDi20222(bi.di20222.isChecked() ? "22" : "-1");
        mobileHealth.setDi20223(bi.di20223.isChecked() ? "23" : "-1");
        mobileHealth.setDi20224(bi.di20224.isChecked() ? "24" : "-1");
        mobileHealth.setDi20225(bi.di20225.isChecked() ? "25" : "-1");
        mobileHealth.setDi20226(bi.di20226.isChecked() ? "26" : "-1");
        mobileHealth.setDi20227(bi.di20227.isChecked() ? "27" : "-1");
        mobileHealth.setDi20228(bi.di20228.isChecked() ? "28" : "-1");
        mobileHealth.setDi20229(bi.di20229.isChecked() ? "29" : "-1");
        mobileHealth.setDi20230(bi.di20230.isChecked() ? "30" : "-1");
        mobileHealth.setDi20231(bi.di20231.isChecked() ? "31" : "-1");
        mobileHealth.setDi20232(bi.di20232.isChecked() ? "32" : "-1");
        mobileHealth.setDi20233(bi.di20233.isChecked() ? "33" : "-1");
        mobileHealth.setDi20234(bi.di20234.isChecked() ? "34" : "-1");
        mobileHealth.setDi20235(bi.di20235.isChecked() ? "35" : "-1");
        mobileHealth.setDi20236(bi.di20236.isChecked() ? "36" : "-1");
        mobileHealth.setDi20237(bi.di20237.isChecked() ? "37" : "-1");
        mobileHealth.setDi20238(bi.di20238.isChecked() ? "38" : "-1");
        mobileHealth.setDi20239(bi.di20239.isChecked() ? "39" : "-1");
        mobileHealth.setDi20240(bi.di20240.isChecked() ? "40" : "-1");
        mobileHealth.setDi20241(bi.di20241.isChecked() ? "41" : "-1");
        mobileHealth.setDi20242(bi.di20242.isChecked() ? "42" : "-1");
        mobileHealth.setDi20243(bi.di20243.isChecked() ? "43" : "-1");
        mobileHealth.setDi20244(bi.di20244.isChecked() ? "44" : "-1");
        mobileHealth.setDi20245(bi.di20245.isChecked() ? "45" : "-1");
        mobileHealth.setDi20246(bi.di20246.isChecked() ? "46" : "-1");
        mobileHealth.setDi20247(bi.di20247.isChecked() ? "47" : "-1");
        mobileHealth.setDi20248(bi.di20248.isChecked() ? "48" : "-1");
        mobileHealth.setDi20249(bi.di20249.isChecked() ? "49" : "-1");
        mobileHealth.setDi20250(bi.di20250.isChecked() ? "50" : "-1");
        mobileHealth.setDi20251(bi.di20251.isChecked() ? "51" : "-1");
        mobileHealth.setDi20252(bi.di20252.isChecked() ? "52" : "-1");
        mobileHealth.setDi20253(bi.di20253.isChecked() ? "53" : "-1");
        mobileHealth.setDi20254(bi.di20254.isChecked() ? "54" : "-1");
        mobileHealth.setDi20255(bi.di20255.isChecked() ? "55" : "-1");
        mobileHealth.setDi20256(bi.di20256.isChecked() ? "56" : "-1");
        mobileHealth.setDi20257(bi.di20257.isChecked() ? "57" : "-1");
        mobileHealth.setDi20258(bi.di20258.isChecked() ? "58" : "-1");
        mobileHealth.setDi20259(bi.di20259.isChecked() ? "59" : "-1");
        mobileHealth.setDi20260(bi.di20260.isChecked() ? "60" : "-1");
        mobileHealth.setDi20261(bi.di20261.isChecked() ? "61" : "-1");
        mobileHealth.setDi20262(bi.di20262.isChecked() ? "62" : "-1");
        mobileHealth.setDi20263(bi.di20263.isChecked() ? "63" : "-1");
        mobileHealth.setDi20264(bi.di20264.isChecked() ? "64" : "-1");
        mobileHealth.setDi20265(bi.di20265.isChecked() ? "65" : "-1");
        mobileHealth.setDi20266(bi.di20266.isChecked() ? "66" : "-1");
        mobileHealth.setDi20267(bi.di20267.isChecked() ? "67" : "-1");
        mobileHealth.setDi20268(bi.di20268.isChecked() ? "68" : "-1");
        mobileHealth.setDi20269(bi.di20269.isChecked() ? "69" : "-1");
        mobileHealth.setDi20270(bi.di20270.isChecked() ? "70" : "-1");
        mobileHealth.setDi20271(bi.di20271.isChecked() ? "71" : "-1");
        mobileHealth.setDi20272(bi.di20272.isChecked() ? "72" : "-1");
        mobileHealth.setDi20273(bi.di20273.isChecked() ? "73" : "-1");
        mobileHealth.setDi20274(bi.di20274.isChecked() ? "74" : "-1");
        mobileHealth.setDi20275(bi.di20275.isChecked() ? "75" : "-1");
        mobileHealth.setDi20276(bi.di20276.isChecked() ? "76" : "-1");
        mobileHealth.setDi20277(bi.di20277.isChecked() ? "77" : "-1");
        mobileHealth.setDi20278(bi.di20278.isChecked() ? "78" : "-1");
        mobileHealth.setDi20279(bi.di20279.isChecked() ? "79" : "-1");
        mobileHealth.setDi20280(bi.di20280.isChecked() ? "80" : "-1");
        mobileHealth.setDi20281(bi.di20281.isChecked() ? "81" : "-1");
        mobileHealth.setDi20296(bi.di20296.isChecked() ? "96" : "-1");
        mobileHealth.setDi20296x(bi.di20296x.getText().toString());
        mobileHealth.setDi20299(bi.di20299.isChecked() ? "99" : "-1");
        mobileHealth.setVs301(bi.vs301a.isChecked() ? "1"
                : bi.vs301b.isChecked() ? "2"
                : bi.vs30199.isChecked() ? "99"
                : "-1");
        mobileHealth.setVs302(bi.vs302a.isChecked() ? "1"
                : bi.vs302b.isChecked() ? "2"
                : bi.vs30299.isChecked() ? "99"
                : "-1");
        mobileHealth.setVs303(bi.vs303a.isChecked() ? "1"
                : bi.vs303b.isChecked() ? "2"
                : bi.vs30399.isChecked() ? "99"
                : "-1");
        mobileHealth.setVs304(bi.vs304a.isChecked() ? "1"
                : bi.vs304b.isChecked() ? "2"
                : bi.vs304c.isChecked() ? "3"
                : bi.vs304d.isChecked() ? "4"
                : bi.vs30499.isChecked() ? "99"
                : "-1");
        mobileHealth.setVs305(bi.vs305a.isChecked() ? "1"
                : bi.vs305b.isChecked() ? "2"
                : bi.vs305c.isChecked() ? "3"
                : bi.vs305d.isChecked() ? "4"
                : bi.vs30599.isChecked() ? "99"
                : "-1");
        mobileHealth.setVs306a(bi.vs306a.isChecked() ? "1" : "-1");
        mobileHealth.setVs306b(bi.vs306b.isChecked() ? "2" : "-1");
        mobileHealth.setVs306c(bi.vs306c.isChecked() ? "3" : "-1");
        mobileHealth.setVs306d(bi.vs306d.isChecked() ? "4" : "-1");
        mobileHealth.setVs306e(bi.vs306e.isChecked() ? "5" : "-1");
        mobileHealth.setVs306f(bi.vs306f.isChecked() ? "6" : "-1");
        mobileHealth.setVs306g(bi.vs306g.isChecked() ? "7" : "-1");
        mobileHealth.setVs306i(bi.vs306i.isChecked() ? "8" : "-1");
        mobileHealth.setVs306h(bi.vs306h.isChecked() ? "9" : "-1");
        mobileHealth.setVs30699(bi.vs30699.isChecked() ? "99" : "-1");
        mobileHealth.setVs307(bi.vs307a.isChecked() ? "1"
                : bi.vs307b.isChecked() ? "2"
                : bi.vs30799.isChecked() ? "99"
                : "-1");
        mobileHealth.setVs308(bi.vs308a.isChecked() ? "1"
                : bi.vs308b.isChecked() ? "2"
                : "-1");

    }


    public void BtnContinue(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (UpdateDB()) {
//            Toast.makeText(this, "Patient Added", Toast.LENGTH_SHORT).show();
            finish();
            gotoActivityWithPutExtra(this, SectionMobileHealthR201.class, "complete", true);
        }
    }


    private boolean formValidation() {

/*

        if (!TextUtils.isEmpty(bi.mh09d.getText()) || !TextUtils.isEmpty(bi.mh09m.getText()) || !TextUtils.isEmpty(bi.mh09y.getText())) {
            int check = Integer.parseInt(bi.mh09d.getText().toString()) + Integer.parseInt(bi.mh09m.getText().toString()) + Integer.parseInt(bi.mh09y.getText().toString());
            if (check == 0)
                return Validator.emptyCustomTextBox(this, bi.mh09d, "All Fields can't be zero");
        }

        if(bi.mh027b02.isChecked()
                && bi.rgmh02601.getCheckedRadioButtonId() == -1
                && bi.rgmh02602.getCheckedRadioButtonId() == -1
                && bi.rgmh02603.getCheckedRadioButtonId() == -1
                && bi.rgmh02604.getCheckedRadioButtonId() == -1
                && bi.rgmh02605.getCheckedRadioButtonId() == -1
                && bi.rgmh02606.getCheckedRadioButtonId() == -1
                && !bi.mh02601.isChecked()
                && !bi.mh026019.isChecked()
                && !bi.mh026021.isChecked()
                && !bi.mh026022.isChecked()

        ) {
            return Validator.emptyCustomTextBox(this, bi.mh026020, "Please select at least one vaccine.");
        }
*/

       /* if (!AllVaccinationsViewed && Integer.valueOf(bi.mh09y.getText().toString()) <= 5 && bi.mh027b02.isChecked()) {

            Toast.makeText(
                    this,
                    "ERROR(Vaccinations) Probe all vaccinations ",
                    Toast.LENGTH_SHORT
            ).show();

            bi.llscrollviewmh26.requestFocus();
            return false;
        }*/

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


  /*  private void populateSpinner(String camp_id) {
        // Spinner Drop down elements
        campNo = new ArrayList<String>() {
            {
                add("....");
            }
        };
        List<String> campDoc = new ArrayList<String>() {
            {
                add("....");
            }
        };
        ArrayList<Doctor> dc = db.getDoctorByCamp(camp_id);
        for (Doctor d : dc) {
            campNo.add(d.getIddoctor());
            campDoc.add(d.getStaff_name());
        }

        bi.mh06.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, campDoc));

    }*/

}