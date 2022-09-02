package edu.aku.hassannaqvi.flood2022.models;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.google.gson.GsonBuilder;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.flood2022.BR;
import edu.aku.hassannaqvi.flood2022.contracts.MHContract;
import edu.aku.hassannaqvi.flood2022.core.MainApp;


public class MobileHealth extends BaseObservable {

    private final String patientType = StringUtils.EMPTY;
    private final String chkWeight = StringUtils.EMPTY;
    private final String chkHeight = StringUtils.EMPTY;
    private final String chkMUAC = StringUtils.EMPTY;
    //Section MobileHealth
    public String ss101;
    public String ss101d;
    public String ss101m;
    public String ss101y;
    public String ss102;
    public String ss103;
    public String ss104;
    public String ss105;
    public String ss106;
    public String ss107;
    public String ss107y;
    public String ss107m;
    public String ss107d;
    public String ss108;
    public String ss109;
    public String ss110;
    public String ss110atempx;
    public String ss110a99;
    public String ss110bdiastolicx;
    public String ss110bsystolicx;
    public String ss110b99;
    public String ss110c;
    public String ss110drbsx;
    public String ss110d99;
    public String ss110ehbx;
    public String ss110e99;
    public String ss111;
    public String ss111a;
    public String ss111b;
    public String ss111c;
    public String ss111d;
    public String ss11199;
    public String pc201;
    public String pc20101;
    public String pc20102;
    public String pc20103;
    public String pc20104;
    public String pc20105;
    public String pc20106;
    public String pc20107;
    public String pc20108;
    public String pc20109;
    public String pc20110;
    public String pc20111;
    public String pc20112;
    public String pc20113;
    public String pc20114;
    public String pc20115;
    public String pc20116;
    public String pc20117;
    public String pc20118;
    public String pc20119;
    public String pc20196;
    public String pc20196x;
    public String pc20199;
    public String di202;
    public String di20201;
    public String di20202;
    public String di20203;
    public String di20204;
    public String di20205;
    public String di20206;
    public String di20207;
    public String di20208;
    public String di20209;
    public String di20210;
    public String di20211;
    public String di20212;
    public String di20213;
    public String di20214;
    public String di20215;
    public String di20216;
    public String di20217;
    public String di20218;
    public String di20219;
    public String di20296;
    public String di20296x;
    public String di20299;
    public String me203;
    public String me20301;
    public String me20302;
    public String me20303;
    public String me20304;
    public String me20305;
    public String me20306;
    public String me20307;
    public String me20308;
    public String me20309;
    public String me20310;
    public String me20311;
    public String me20312;
    public String me20313;
    public String me20314;
    public String me20315;
    public String me20316;
    public String me20317;
    public String me20318;
    public String me20319;
    public String me20320;
    public String me20321;
    public String me20322;
    public String me20323;
    public String me20324;
    public String me20333;
    public String me20335;
    public String me20336;
    public String me20337;
    public String me20338;
    public String me20339;
    public String me20340;
    public String me20341;
    public String me20342;
    public String me20343;
    public String me20344;
    public String me20345;
    public String me20346;
    public String me20347;
    public String me20348;
    public String me20349;
    public String me20350;
    public String me20351;
    public String me20352;
    public String me20353;
    public String me20354;
    public String me20355;
    public String me20356;
    public String me20357;
    public String me20358;
    public String me20359;
    public String me20361;
    public String me20362;
    public String me20363;
    public String me20364;
    public String me20365;
    public String me20366;
    public String me20367;
    public String me20368;
    public String me20369;
    public String me20370;
    public String me20371;
    public String me20372;
    public String me20373;
    public String me20374;
    public String me20375;
    public String me20376;
    public String me20377;
    public String me20378;
    public String me20375x;
    public String me20376x;
    public String me20377x;
    public String me20378x;
    public String me20396;
    public String me20396x;
    public String me20301DAY;
    public String me20301QTY;
    public String me20304DAY;
    public String me20304QTY;
    public String me20307DAY;
    public String me20307QTY;
    public String me20313DAY;
    public String me20313QTY;
    public String me20322DAY;
    public String me20322QTY;
    public String me20324DAY;
    public String me20324QTY;
    public String me20333DAY;
    public String me20333QTY;
    public String me20334DAY;
    public String me20334QTY;
    public String me20335DAY;
    public String me20335QTY;
    public String me20336DAY;
    public String me20336QTY;
    public String me20337DAY;
    public String me20337QTY;
    public String me20338DAY;
    public String me20338QTY;
    public String me20339DAY;
    public String me20339QTY;
    public String me20340DAY;
    public String me20340QTY;
    public String me20341DAY;
    public String me20341QTY;
    public String me20342DAY;
    public String me20342QTY;
    public String me20343DAY;
    public String me20343QTY;
    public String me20344DAY;
    public String me20344QTY;
    public String me20345DAY;
    public String me20345QTY;
    public String me20346DAY;
    public String me20346QTY;
    public String me20347DAY;
    public String me20347QTY;
    public String me20348DAY;
    public String me20348QTY;
    public String me20349DAY;
    public String me20349QTY;
    public String me20350DAY;
    public String me20350QTY;
    public String me20351DAY;
    public String me20351QTY;
    public String me20352DAY;
    public String me20352QTY;
    public String me20353DAY;
    public String me20353QTY;
    public String me20354DAY;
    public String me20354QTY;
    public String me20355DAY;
    public String me20355QTY;
    public String me20356DAY;
    public String me20356QTY;
    public String me20357DAY;
    public String me20357QTY;
    public String me20358DAY;
    public String me20358QTY;
    public String me20359DAY;
    public String me20359QTY;
    public String me20361DAY;
    public String me20361QTY;
    public String me20362DAY;
    public String me20362QTY;
    public String me20363DAY;
    public String me20363QTY;
    public String me20364DAY;
    public String me20364QTY;
    public String me20365DAY;
    public String me20365QTY;
    public String me20366DAY;
    public String me20366QTY;
    public String me20367DAY;
    public String me20367QTY;
    public String me20368DAY;
    public String me20368QTY;
    public String me20369DAY;
    public String me20369QTY;
    public String me20370DAY;
    public String me20370QTY;
    public String me20371DAY;
    public String me20371QTY;
    public String me20372DAY;
    public String me20372QTY;
    public String me20373DAY;
    public String me20373QTY;
    public String me20374DAY;
    public String me20374QTY;
    public String me20375DAY;
    public String me20375QTY;
    public String me20376DAY;
    public String me20376QTY;
    public String me20377DAY;
    public String me20377QTY;
    public String me20378DAY;
    public String me20378QTY;
    public String me20396DAY;
    public String me20396QTY;
    public String me20399;
    public String vs301;
    public String vs302;
    public String vs303;
    public String vs304;
    public String vs305;
    public String vs306;
    public String vs306a;
    public String vs306b;
    public String vs306c;
    public String vs306d;
    public String vs306e;
    public String vs306f;
    public String vs306g;
    public String vs306i;
    public String vs30699;
    public String vs307;
    public String vs308;
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    private String id;
    private String uid;
    private String userName;
    private String sysDate;
    private String deviceId;
    private String deviceTag;
    private String appver;
    private String endTime;
    private String status;
    private String synced;
    private String syncDate;
    // SECTION VARIABLES
    private String serial;
    private String sA;


    public MobileHealth() {

    }

    @Bindable
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        if (projectName != projectName)
            this.projectName = projectName;

        //TODO: Update field in layout
        // notifyPropertyChanged(BR.layoutFieldName);
    }

    @Bindable
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;

    }


    @Bindable
    public String getUid() {
        return uid;
    }

    public MobileHealth setUid(String uid) {
        this.uid = uid;
        return this;
    }


    @Bindable
    public String getUserName() {
        return userName;
    }

    public MobileHealth setUserName(String userName) {
        this.userName = userName;
        return this;
    }


    @Bindable
    public String getDeviceId() {
        return deviceId;
    }

    public MobileHealth setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    @Bindable
    public String getDeviceTag() {
        return deviceTag;
    }

    public MobileHealth setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }

    @Bindable
    public String getAppver() {
        return appver;
    }

    public MobileHealth setAppver(String appver) {
        this.appver = appver;
        return this;
    }

    @Bindable
    public String getSysDate() {
        return sysDate;
    }

    public MobileHealth setSysDate(String sysDate) {
        this.sysDate = sysDate;
        return this;
    }


    @Bindable
    public String getEndTime() {
        return endTime;
    }

    public MobileHealth setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    @Bindable
    public String getSynced() {
        return synced;
    }

    public MobileHealth setSynced(String synced) {
        this.synced = synced;
        return this;
    }

    @Bindable
    public String getSyncDate() {
        return syncDate;
    }

    public MobileHealth setSyncDate(String syncDate) {
        this.syncDate = syncDate;
        return this;
    }


    public String getSerial() {
        return serial;
    }

    public MobileHealth setSerial(String serial) {
        this.serial = serial;
        return this;
    }


    public String getsA() {
        return sA;
    }

    public MobileHealth setsA(String sA) {
        this.sA = sA;
        return this;
    }

    @Bindable
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyPropertyChanged(BR.status);
    }


    public MobileHealth Sync(JSONObject jsonObject) throws JSONException {
        this.id = jsonObject.getString(MHContract.MHTable.COLUMN_ID);
        this.uid = jsonObject.getString(MHContract.MHTable.COLUMN_UID);
        this.userName = jsonObject.getString(MHContract.MHTable.COLUMN_USERNAME);
        this.sysDate = jsonObject.getString(MHContract.MHTable.COLUMN_SYSDATE);
        this.deviceId = jsonObject.getString(MHContract.MHTable.COLUMN_DEVICEID);
        this.deviceTag = jsonObject.getString(MHContract.MHTable.COLUMN_DEVICETAGID);
        this.appver = jsonObject.getString(MHContract.MHTable.COLUMN_APPVERSION);
        this.synced = jsonObject.getString(MHContract.MHTable.COLUMN_SYNCED);
        this.syncDate = jsonObject.getString(MHContract.MHTable.COLUMN_SYNCED_DATE);
        this.status = jsonObject.getString(MHContract.MHTable.COLUMN_STATUS);
        this.serial = jsonObject.getString(MHContract.MHTable.COLUMN_SERIAL);
        this.ss101 = jsonObject.getString(MHContract.MHTable.COLUMN_SS101);
        this.ss102 = jsonObject.getString(MHContract.MHTable.COLUMN_SS102);
        this.ss103 = jsonObject.getString(MHContract.MHTable.COLUMN_SS103);
        this.ss104 = jsonObject.getString(MHContract.MHTable.COLUMN_SS104);
        this.ss105 = jsonObject.getString(MHContract.MHTable.COLUMN_SS105);
        this.ss106 = jsonObject.getString(MHContract.MHTable.COLUMN_SS106);
        this.ss107 = jsonObject.getString(MHContract.MHTable.COLUMN_SS107);

        this.sA = jsonObject.getString(MHContract.MHTable.COLUMN_SA);

        return this;

    }


    public MobileHealth Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_UID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_APPVERSION));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SYNCED_DATE));
        this.status = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_STATUS));
        this.serial = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SERIAL));
        this.ss101 = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SS101));
        this.ss102 = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SS102));
        this.ss103 = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SS103));
        this.ss104 = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SS104));
        this.ss105 = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SS105));
        this.ss106 = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SS106));
        this.ss107 = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SS107));

        //For childCount
        //this.sA = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SA));

        sAHydrate(cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SA)));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, MobileHealth.class);
    }


    public String sAtoString() {
        JSONObject json = new JSONObject();

        try {
            json
                    /*  .put("ss101d", ss101d)
                      .put("ss101m", ss101m)
                      .put("ss101y", ss101y)
                      .put("ss102", ss102)
                      .put("ss103", ss103)
                      .put("ss104", ss104)
                      .put("ss105", ss105)
                      .put("ss106", ss106)
                      .put("ss107y", ss107y)
                      .put("ss107m", ss107m)
                      .put("ss107d", ss107d)*/
                    .put("ss108", ss108)
                    .put("ss109", ss109)
                    .put("ss110", ss110)
                    .put("ss110atempx", ss110atempx)
                    .put("ss110a99", ss110a99)
                    .put("ss110bdiastolicx", ss110bdiastolicx)
                    .put("ss110bsystolicx", ss110bsystolicx)
                    .put("ss110b99", ss110b99)
                    .put("ss110c", ss110c)
                    .put("ss110drbsx", ss110drbsx)
                    .put("ss110d99", ss110d99)
                    .put("ss110ehbx", ss110ehbx)
                    .put("ss110e99", ss110e99)
                    .put("ss111a", ss111a)
                    .put("ss111b", ss111b)
                    .put("ss111c", ss111c)
                    .put("ss111d", ss111d)
                    .put("ss11199", ss11199)
                    .put("pc20101", pc20101)
                    .put("pc20102", pc20102)
                    .put("pc20103", pc20103)
                    .put("pc20104", pc20104)
                    .put("pc20105", pc20105)
                    .put("pc20106", pc20106)
                    .put("pc20107", pc20107)
                    .put("pc20108", pc20108)
                    .put("pc20109", pc20109)
                    .put("pc20110", pc20110)
                    .put("pc20111", pc20111)
                    .put("pc20112", pc20112)
                    .put("pc20113", pc20113)
                    .put("pc20114", pc20114)
                    .put("pc20115", pc20115)
                    .put("pc20116", pc20116)
                    .put("pc20117", pc20117)
                    .put("pc20118", pc20118)
                    .put("pc20119", pc20119)
                    .put("pc20196", pc20196)
                    .put("pc20196x", pc20196x)
                    .put("pc20199", pc20199)
                    .put("di20201", di20201)
                    .put("di20202", di20202)
                    .put("di20203", di20203)
                    .put("di20204", di20204)
                    .put("di20205", di20205)
                    .put("di20206", di20206)
                    .put("di20207", di20207)
                    .put("di20208", di20208)
                    .put("di20209", di20209)
                    .put("di20210", di20210)
                    .put("di20211", di20211)
                    .put("di20212", di20212)
                    .put("di20213", di20213)
                    .put("di20214", di20214)
                    .put("di20215", di20215)
                    .put("di20216", di20216)
                    .put("di20217", di20217)
                    .put("di20218", di20218)
                    .put("di20219", di20219)
                    .put("di20296", di20296)
                    .put("di20296x", di20296x)
                    .put("di20299", di20299)
                    .put("me20301", me20301)
                    .put("me20302", me20302)
                    .put("me20303", me20303)
                    .put("me20304", me20304)
                    .put("me20305", me20305)
                    .put("me20306", me20306)
                    .put("me20307", me20307)
                    .put("me20308", me20308)
                    .put("me20309", me20309)
                    .put("me20310", me20310)
                    .put("me20311", me20311)
                    .put("me20312", me20312)
                    .put("me20313", me20313)
                    .put("me20314", me20314)
                    .put("me20315", me20315)
                    .put("me20316", me20316)
                    .put("me20317", me20317)
                    .put("me20318", me20318)
                    .put("me20319", me20319)
                    .put("me20320", me20320)
                    .put("me20321", me20321)
                    .put("me20322", me20322)
                    .put("me20323", me20323)
                    .put("me20324", me20324)
                    .put("me20333", me20333)
                    .put("me20335", me20335)
                    .put("me20336", me20336)
                    .put("me20337", me20337)
                    .put("me20338", me20338)
                    .put("me20339", me20339)
                    .put("me20340", me20340)
                    .put("me20341", me20341)
                    .put("me20342", me20342)
                    .put("me20343", me20343)
                    .put("me20344", me20344)
                    .put("me20345", me20345)
                    .put("me20346", me20346)
                    .put("me20347", me20347)
                    .put("me20348", me20348)
                    .put("me20349", me20349)
                    .put("me20350", me20350)
                    .put("me20351", me20351)
                    .put("me20352", me20352)
                    .put("me20353", me20353)
                    .put("me20354", me20354)
                    .put("me20355", me20355)
                    .put("me20356", me20356)
                    .put("me20357", me20357)
                    .put("me20358", me20358)
                    .put("me20359", me20359)
                    .put("me20361", me20361)
                    .put("me20362", me20362)
                    .put("me20363", me20363)
                    .put("me20364", me20364)
                    .put("me20365", me20365)
                    .put("me20366", me20366)
                    .put("me20367", me20367)
                    .put("me20368", me20368)
                    .put("me20369", me20369)
                    .put("me20370", me20370)
                    .put("me20371", me20371)
                    .put("me20372", me20372)
                    .put("me20373", me20373)
                    .put("me20374", me20374)
                    .put("me20375", me20375)
                    .put("me20376", me20376)
                    .put("me20377", me20377)
                    .put("me20378", me20378)
                    .put("me20375x", me20375x)
                    .put("me20376x", me20376x)
                    .put("me20377x", me20377x)
                    .put("me20378x", me20378x)
                    .put("me20396", me20396)
                    .put("me20396x", me20396x)
                    .put("me20399", me20399)
                    .put("me20301DAY", me20301DAY)
                    .put("me20301QTY", me20301QTY)
                    .put("me20304DAY", me20304DAY)
                    .put("me20304QTY", me20304QTY)
                    .put("me20307DAY", me20307DAY)
                    .put("me20307QTY", me20307QTY)
                    .put("me20313DAY", me20313DAY)
                    .put("me20313QTY", me20313QTY)
                    .put("me20322DAY", me20322DAY)
                    .put("me20322QTY", me20322QTY)
                    .put("me20324DAY", me20324DAY)
                    .put("me20324QTY", me20324QTY)
                    .put("me20333DAY", me20333DAY)
                    .put("me20333QTY", me20333QTY)
                    .put("me20334DAY", me20334DAY)
                    .put("me20334QTY", me20334QTY)
                    .put("me20335DAY", me20335DAY)
                    .put("me20335QTY", me20335QTY)
                    .put("me20336DAY", me20336DAY)
                    .put("me20336QTY", me20336QTY)
                    .put("me20337DAY", me20337DAY)
                    .put("me20337QTY", me20337QTY)
                    .put("me20338DAY", me20338DAY)
                    .put("me20338QTY", me20338QTY)
                    .put("me20339DAY", me20339DAY)
                    .put("me20339QTY", me20339QTY)
                    .put("me20340DAY", me20340DAY)
                    .put("me20340QTY", me20340QTY)
                    .put("me20341DAY", me20341DAY)
                    .put("me20341QTY", me20341QTY)
                    .put("me20342DAY", me20342DAY)
                    .put("me20342QTY", me20342QTY)
                    .put("me20343DAY", me20343DAY)
                    .put("me20343QTY", me20343QTY)
                    .put("me20344DAY", me20344DAY)
                    .put("me20344QTY", me20344QTY)
                    .put("me20345DAY", me20345DAY)
                    .put("me20345QTY", me20345QTY)
                    .put("me20346DAY", me20346DAY)
                    .put("me20346QTY", me20346QTY)
                    .put("me20347DAY", me20347DAY)
                    .put("me20347QTY", me20347QTY)
                    .put("me20348DAY", me20348DAY)
                    .put("me20348QTY", me20348QTY)
                    .put("me20349DAY", me20349DAY)
                    .put("me20349QTY", me20349QTY)
                    .put("me20350DAY", me20350DAY)
                    .put("me20350QTY", me20350QTY)
                    .put("me20351DAY", me20351DAY)
                    .put("me20351QTY", me20351QTY)
                    .put("me20352DAY", me20352DAY)
                    .put("me20352QTY", me20352QTY)
                    .put("me20353DAY", me20353DAY)
                    .put("me20353QTY", me20353QTY)
                    .put("me20354DAY", me20354DAY)
                    .put("me20354QTY", me20354QTY)
                    .put("me20355DAY", me20355DAY)
                    .put("me20355QTY", me20355QTY)
                    .put("me20356DAY", me20356DAY)
                    .put("me20356QTY", me20356QTY)
                    .put("me20357DAY", me20357DAY)
                    .put("me20357QTY", me20357QTY)
                    .put("me20358DAY", me20358DAY)
                    .put("me20358QTY", me20358QTY)
                    .put("me20359DAY", me20359DAY)
                    .put("me20359QTY", me20359QTY)
                    .put("me20361DAY", me20361DAY)
                    .put("me20361QTY", me20361QTY)
                    .put("me20362DAY", me20362DAY)
                    .put("me20362QTY", me20362QTY)
                    .put("me20363DAY", me20363DAY)
                    .put("me20363QTY", me20363QTY)
                    .put("me20364DAY", me20364DAY)
                    .put("me20364QTY", me20364QTY)
                    .put("me20365DAY", me20365DAY)
                    .put("me20365QTY", me20365QTY)
                    .put("me20366DAY", me20366DAY)
                    .put("me20366QTY", me20366QTY)
                    .put("me20367DAY", me20367DAY)
                    .put("me20367QTY", me20367QTY)
                    .put("me20368DAY", me20368DAY)
                    .put("me20368QTY", me20368QTY)
                    .put("me20369DAY", me20369DAY)
                    .put("me20369QTY", me20369QTY)
                    .put("me20370DAY", me20370DAY)
                    .put("me20370QTY", me20370QTY)
                    .put("me20371DAY", me20371DAY)
                    .put("me20371QTY", me20371QTY)
                    .put("me20372DAY", me20372DAY)
                    .put("me20372QTY", me20372QTY)
                    .put("me20373DAY", me20373DAY)
                    .put("me20373QTY", me20373QTY)
                    .put("me20374DAY", me20374DAY)
                    .put("me20374QTY", me20374QTY)
                    .put("me20375DAY", me20375DAY)
                    .put("me20375QTY", me20375QTY)
                    .put("me20376DAY", me20376DAY)
                    .put("me20376QTY", me20376QTY)
                    .put("me20377DAY", me20377DAY)
                    .put("me20377QTY", me20377QTY)
                    .put("me20378DAY", me20378DAY)
                    .put("me20378QTY", me20378QTY)
                    .put("me20396DAY", me20396DAY)
                    .put("me20396QTY", me20396QTY)
                    .put("vs301", vs301)
                    .put("vs302", vs302)
                    .put("vs303", vs303)
                    .put("vs304", vs304)
                    .put("vs305", vs305)
                    .put("vs306a", vs306a)
                    .put("vs306b", vs306b)
                    .put("vs306c", vs306c)
                    .put("vs306d", vs306d)
                    .put("vs306e", vs306e)
                    .put("vs306f", vs306f)
                    .put("vs306g", vs306g)
                    .put("vs306i", vs306i)
                    .put("vs30699", vs30699)
                    .put("vs307", vs307)
                    .put("vs308", vs308);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";

        }
        return json.toString();
    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();


        json.put(MHContract.MHTable.COLUMN_ID, this.id);
        json.put(MHContract.MHTable.COLUMN_UID, this.uid);
        json.put(MHContract.MHTable.COLUMN_USERNAME, this.userName);
        json.put(MHContract.MHTable.COLUMN_SYSDATE, this.sysDate);
        json.put(MHContract.MHTable.COLUMN_DEVICEID, this.deviceId);
        json.put(MHContract.MHTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(MHContract.MHTable.COLUMN_APPVERSION, this.appver);
        json.put(MHContract.MHTable.COLUMN_SYNCED, this.synced);
        json.put(MHContract.MHTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(MHContract.MHTable.COLUMN_STATUS, this.status);
        json.put(MHContract.MHTable.COLUMN_SERIAL, this.serial);
        json.put(MHContract.MHTable.COLUMN_SS101, this.ss101);
        json.put(MHContract.MHTable.COLUMN_SS102, this.ss102);
        json.put(MHContract.MHTable.COLUMN_SS103, this.ss103);
        json.put(MHContract.MHTable.COLUMN_SS104, this.ss104);
        json.put(MHContract.MHTable.COLUMN_SS105, this.ss105);
        json.put(MHContract.MHTable.COLUMN_SS106, this.ss106);
        json.put(MHContract.MHTable.COLUMN_SS107, this.ss107);

        json.put(MHContract.MHTable.COLUMN_SA, new JSONObject(sAtoString()));

        //For ChildCount
        //json.put(MHContract.MHTable.COLUMN_SA, this.sA == null ? JSONObject.NULL : this.sA);


/*
            if (this.sA != null && !this.sA.equals("")) {
                json.put(MHContract.MHTable.COLUMN_SA, new JSONObject(this.sA));
            }*/

        return json;

    }


    public void sAHydrate(String string) throws JSONException {
        Log.d("sAHydrateS", "string: " + string);

        if (string != null) {


            JSONObject json = null;
            json = new JSONObject(string);

/*                this.ss101d = json.getString("ss101d");
                this.ss101m = json.getString("ss101m");
                this.ss101y = json.getString("ss101y");
                this.ss102 = json.getString("ss102");
                this.ss103 = json.getString("ss103");
                this.ss104 = json.getString("ss104");
                this.ss105 = json.getString("ss105");
                this.ss106 = json.getString("ss106");
                this.ss107y = json.getString("ss107y");
                this.ss107m = json.getString("ss107m");
                this.ss107d = json.getString("ss107d");*/
            this.ss108 = json.getString("ss108");
            this.ss109 = json.getString("ss109");
            this.ss110 = json.getString("ss110");
            this.ss110atempx = json.getString("ss110atempx");
            this.ss110a99 = json.getString("ss110a99");
            this.ss110bdiastolicx = json.getString("ss110bdiastolicx");
            this.ss110bsystolicx = json.getString("ss110bsystolicx");
            this.ss110b99 = json.getString("ss110b99");
            this.ss110c = json.getString("ss110c");
            this.ss110drbsx = json.getString("ss110drbsx");
            this.ss110d99 = json.getString("ss110d99");
            this.ss110ehbx = json.getString("ss110ehbx");
            this.ss110e99 = json.getString("ss110e99");
            this.ss111a = json.getString("ss111a");
            this.ss111b = json.getString("ss111b");
            this.ss111c = json.getString("ss111c");
            this.ss111d = json.getString("ss111d");
            this.ss11199 = json.getString("ss11199");
            this.pc20101 = json.getString("pc20101");
            this.pc20102 = json.getString("pc20102");
            this.pc20103 = json.getString("pc20103");
            this.pc20104 = json.getString("pc20104");
            this.pc20105 = json.getString("pc20105");
            this.pc20106 = json.getString("pc20106");
            this.pc20107 = json.getString("pc20107");
            this.pc20108 = json.getString("pc20108");
            this.pc20109 = json.getString("pc20109");
            this.pc20110 = json.getString("pc20110");
            this.pc20111 = json.getString("pc20111");
            this.pc20112 = json.getString("pc20112");
            this.pc20113 = json.getString("pc20113");
            this.pc20114 = json.getString("pc20114");
            this.pc20115 = json.getString("pc20115");
            this.pc20116 = json.getString("pc20116");
            this.pc20117 = json.getString("pc20117");
            this.pc20118 = json.getString("pc20118");
            this.pc20119 = json.getString("pc20119");
            this.pc20196 = json.getString("pc20196");
            this.pc20196x = json.getString("pc20196x");
            this.pc20199 = json.getString("pc20199");
            this.di20201 = json.getString("di20201");
            this.di20202 = json.getString("di20202");
            this.di20203 = json.getString("di20203");
            this.di20204 = json.getString("di20204");
            this.di20205 = json.getString("di20205");
            this.di20206 = json.getString("di20206");
            this.di20207 = json.getString("di20207");
            this.di20208 = json.getString("di20208");
            this.di20209 = json.getString("di20209");
            this.di20210 = json.getString("di20210");
            this.di20211 = json.getString("di20211");
            this.di20212 = json.getString("di20212");
            this.di20213 = json.getString("di20213");
            this.di20214 = json.getString("di20214");
            this.di20215 = json.getString("di20215");
            this.di20216 = json.getString("di20216");
            this.di20217 = json.getString("di20217");
            this.di20218 = json.getString("di20218");
            this.di20219 = json.getString("di20219");
            this.di20296 = json.getString("di20296");
            this.di20296x = json.getString("di20296x");
            this.di20299 = json.getString("di20299");
            this.me20301 = json.getString("me20301");
            this.me20302 = json.getString("me20302");
            this.me20303 = json.getString("me20303");
            this.me20304 = json.getString("me20304");
            this.me20305 = json.getString("me20305");
            this.me20306 = json.getString("me20306");
            this.me20307 = json.getString("me20307");
            this.me20308 = json.getString("me20308");
            this.me20309 = json.getString("me20309");
            this.me20310 = json.getString("me20310");
            this.me20311 = json.getString("me20311");
            this.me20312 = json.getString("me20312");
            this.me20313 = json.getString("me20313");
            this.me20314 = json.getString("me20314");
            this.me20315 = json.getString("me20315");
            this.me20316 = json.getString("me20316");
            this.me20317 = json.getString("me20317");
            this.me20318 = json.getString("me20318");
            this.me20319 = json.getString("me20319");
            this.me20320 = json.getString("me20320");
            this.me20321 = json.getString("me20321");
            this.me20322 = json.getString("me20322");
            this.me20323 = json.getString("me20323");
            this.me20324 = json.getString("me20324");
            this.me20333 = json.getString("me20333");
            this.me20335 = json.getString("me20335");
            this.me20336 = json.getString("me20336");
            this.me20337 = json.getString("me20337");
            this.me20338 = json.getString("me20338");
            this.me20339 = json.getString("me20339");
            this.me20340 = json.getString("me20340");
            this.me20341 = json.getString("me20341");
            this.me20342 = json.getString("me20342");
            this.me20343 = json.getString("me20343");
            this.me20344 = json.getString("me20344");
            this.me20345 = json.getString("me20345");
            this.me20346 = json.getString("me20346");
            this.me20347 = json.getString("me20347");
            this.me20348 = json.getString("me20348");
            this.me20349 = json.getString("me20349");
            this.me20350 = json.getString("me20350");
            this.me20351 = json.getString("me20351");
            this.me20352 = json.getString("me20352");
            this.me20353 = json.getString("me20353");
            this.me20354 = json.getString("me20354");
            this.me20355 = json.getString("me20355");
            this.me20356 = json.getString("me20356");
            this.me20357 = json.getString("me20357");
            this.me20358 = json.getString("me20358");
            this.me20359 = json.getString("me20359");
            this.me20361 = json.getString("me20361");
            this.me20362 = json.getString("me20362");
            this.me20363 = json.getString("me20363");
            this.me20364 = json.getString("me20364");
            this.me20365 = json.getString("me20365");
            this.me20366 = json.getString("me20366");
            this.me20367 = json.getString("me20367");
            this.me20368 = json.getString("me20368");
            this.me20369 = json.getString("me20369");
            this.me20370 = json.getString("me20370");
            this.me20371 = json.getString("me20371");
            this.me20372 = json.getString("me20372");
            this.me20373 = json.getString("me20373");
            this.me20374 = json.getString("me20374");
            this.me20375 = json.getString("me20375");
            this.me20376 = json.getString("me20376");
            this.me20377 = json.getString("me20377");
            this.me20378 = json.getString("me20378");
            this.me20375x = json.getString("me20375x");
            this.me20376x = json.getString("me20376x");
            this.me20377x = json.getString("me20377x");
            this.me20378x = json.getString("me20378x");
            this.me20396 = json.getString("me20396");
            this.me20396x = json.getString("me20396x");
            this.me20399 = json.getString("me20399");
            this.me20301DAY = json.getString("me20301DAY");
            this.me20301QTY = json.getString("me20301QTY");
            this.me20304DAY = json.getString("me20304DAY");
            this.me20304QTY = json.getString("me20304QTY");
            this.me20307DAY = json.getString("me20307DAY");
            this.me20307QTY = json.getString("me20307QTY");
            this.me20313DAY = json.getString("me20313DAY");
            this.me20313QTY = json.getString("me20313QTY");
            this.me20322DAY = json.getString("me20322DAY");
            this.me20322QTY = json.getString("me20322QTY");
            this.me20324DAY = json.getString("me20324DAY");
            this.me20324QTY = json.getString("me20324QTY");
            this.me20333DAY = json.getString("me20333DAY");
            this.me20333QTY = json.getString("me20333QTY");
            this.me20334DAY = json.getString("me20334DAY");
            this.me20334QTY = json.getString("me20334QTY");
            this.me20335DAY = json.getString("me20335DAY");
            this.me20335QTY = json.getString("me20335QTY");
            this.me20336DAY = json.getString("me20336DAY");
            this.me20336QTY = json.getString("me20336QTY");
            this.me20337DAY = json.getString("me20337DAY");
            this.me20337QTY = json.getString("me20337QTY");
            this.me20338DAY = json.getString("me20338DAY");
            this.me20338QTY = json.getString("me20338QTY");
            this.me20339DAY = json.getString("me20339DAY");
            this.me20339QTY = json.getString("me20339QTY");
            this.me20340DAY = json.getString("me20340DAY");
            this.me20340QTY = json.getString("me20340QTY");
            this.me20341DAY = json.getString("me20341DAY");
            this.me20341QTY = json.getString("me20341QTY");
            this.me20342DAY = json.getString("me20342DAY");
            this.me20342QTY = json.getString("me20342QTY");
            this.me20343DAY = json.getString("me20343DAY");
            this.me20343QTY = json.getString("me20343QTY");
            this.me20344DAY = json.getString("me20344DAY");
            this.me20344QTY = json.getString("me20344QTY");
            this.me20345DAY = json.getString("me20345DAY");
            this.me20345QTY = json.getString("me20345QTY");
            this.me20346DAY = json.getString("me20346DAY");
            this.me20346QTY = json.getString("me20346QTY");
            this.me20347DAY = json.getString("me20347DAY");
            this.me20347QTY = json.getString("me20347QTY");
            this.me20348DAY = json.getString("me20348DAY");
            this.me20348QTY = json.getString("me20348QTY");
            this.me20349DAY = json.getString("me20349DAY");
            this.me20349QTY = json.getString("me20349QTY");
            this.me20350DAY = json.getString("me20350DAY");
            this.me20350QTY = json.getString("me20350QTY");
            this.me20351DAY = json.getString("me20351DAY");
            this.me20351QTY = json.getString("me20351QTY");
            this.me20352DAY = json.getString("me20352DAY");
            this.me20352QTY = json.getString("me20352QTY");
            this.me20353DAY = json.getString("me20353DAY");
            this.me20353QTY = json.getString("me20353QTY");
            this.me20354DAY = json.getString("me20354DAY");
            this.me20354QTY = json.getString("me20354QTY");
            this.me20355DAY = json.getString("me20355DAY");
            this.me20355QTY = json.getString("me20355QTY");
            this.me20356DAY = json.getString("me20356DAY");
            this.me20356QTY = json.getString("me20356QTY");
            this.me20357DAY = json.getString("me20357DAY");
            this.me20357QTY = json.getString("me20357QTY");
            this.me20358DAY = json.getString("me20358DAY");
            this.me20358QTY = json.getString("me20358QTY");
            this.me20359DAY = json.getString("me20359DAY");
            this.me20359QTY = json.getString("me20359QTY");
            this.me20361DAY = json.getString("me20361DAY");
            this.me20361QTY = json.getString("me20361QTY");
            this.me20362DAY = json.getString("me20362DAY");
            this.me20362QTY = json.getString("me20362QTY");
            this.me20363DAY = json.getString("me20363DAY");
            this.me20363QTY = json.getString("me20363QTY");
            this.me20364DAY = json.getString("me20364DAY");
            this.me20364QTY = json.getString("me20364QTY");
            this.me20365DAY = json.getString("me20365DAY");
            this.me20365QTY = json.getString("me20365QTY");
            this.me20366DAY = json.getString("me20366DAY");
            this.me20366QTY = json.getString("me20366QTY");
            this.me20367DAY = json.getString("me20367DAY");
            this.me20367QTY = json.getString("me20367QTY");
            this.me20368DAY = json.getString("me20368DAY");
            this.me20368QTY = json.getString("me20368QTY");
            this.me20369DAY = json.getString("me20369DAY");
            this.me20369QTY = json.getString("me20369QTY");
            this.me20370DAY = json.getString("me20370DAY");
            this.me20370QTY = json.getString("me20370QTY");
            this.me20371DAY = json.getString("me20371DAY");
            this.me20371QTY = json.getString("me20371QTY");
            this.me20372DAY = json.getString("me20372DAY");
            this.me20372QTY = json.getString("me20372QTY");
            this.me20373DAY = json.getString("me20373DAY");
            this.me20373QTY = json.getString("me20373QTY");
            this.me20374DAY = json.getString("me20374DAY");
            this.me20374QTY = json.getString("me20374QTY");
            this.me20375DAY = json.getString("me20375DAY");
            this.me20375QTY = json.getString("me20375QTY");
            this.me20376DAY = json.getString("me20376DAY");
            this.me20376QTY = json.getString("me20376QTY");
            this.me20377DAY = json.getString("me20377DAY");
            this.me20377QTY = json.getString("me20377QTY");
            this.me20378DAY = json.getString("me20378DAY");
            this.me20378QTY = json.getString("me20378QTY");
            this.me20396DAY = json.getString("me20396DAY");
            this.me20396QTY = json.getString("me20396QTY");
            this.vs301 = json.getString("vs301");
            this.vs302 = json.getString("vs302");
            this.vs303 = json.getString("vs303");
            this.vs304 = json.getString("vs304");
            this.vs305 = json.getString("vs305");
            this.vs306a = json.getString("vs306a");
            this.vs306b = json.getString("vs306b");
            this.vs306c = json.getString("vs306c");
            this.vs306d = json.getString("vs306d");
            this.vs306e = json.getString("vs306e");
            this.vs306f = json.getString("vs306f");
            this.vs306g = json.getString("vs306g");
            this.vs306i = json.getString("vs306i");
            this.vs30699 = json.getString("vs30699");
            this.vs307 = json.getString("vs307");
            this.vs308 = json.getString("vs308");


        }
    }

    @Bindable
    public String getSs101d() {
        return ss101d;
    }

    public void setSs101d(String ss101d) {
        this.ss101d = ss101d;
        notifyPropertyChanged(BR.ss101d);
    }

    @Bindable
    public String getSs101m() {
        return ss101m;
    }

    public void setSs101m(String ss101m) {
        this.ss101m = ss101m;
        notifyPropertyChanged(BR.ss101m);
    }

    @Bindable
    public String getSs101y() {
        return ss101y;
    }

    public void setSs101y(String ss101y) {
        this.ss101y = ss101y;
        notifyPropertyChanged(BR.ss101y);
    }

    @Bindable
    public String getSs102() {
        return ss102;
    }

    public void setSs102(String ss102) {
        this.ss102 = ss102;
        notifyPropertyChanged(BR.ss102);
    }

    @Bindable
    public String getSs103() {
        return ss103;
    }

    public void setSs103(String ss103) {
        this.ss103 = ss103;
        notifyPropertyChanged(BR.ss103);
    }

    @Bindable
    public String getSs104() {
        return ss104;
    }

    public void setSs104(String ss104) {
        this.ss104 = ss104;
        notifyPropertyChanged(BR.ss104);
    }

    @Bindable
    public String getSs105() {
        return ss105;
    }

    public void setSs105(String ss105) {
        this.ss105 = ss105;
        notifyPropertyChanged(BR.ss105);
    }

    @Bindable
    public String getSs106() {
        return ss106;
    }

    public void setSs106(String ss106) {
        this.ss106 = ss106;
        notifyPropertyChanged(BR.ss106);
    }

    @Bindable
    public String getSs107y() {
        return ss107y;
    }

    public void setSs107y(String ss107y) {
        this.ss107y = ss107y;
        notifyPropertyChanged(BR.ss107y);
    }

    @Bindable
    public String getSs107m() {
        return ss107m;
    }

    public void setSs107m(String ss107m) {
        this.ss107m = ss107m;
        notifyPropertyChanged(BR.ss107m);
    }

    @Bindable
    public String getSs107d() {
        return ss107d;
    }

    public void setSs107d(String ss107d) {
        this.ss107d = ss107d;
        notifyPropertyChanged(BR.ss107d);
    }

    @Bindable
    public String getSs108() {
        return ss108;
    }

    public void setSs108(String ss108) {
        this.ss108 = ss108;
        notifyPropertyChanged(BR.ss108);
    }

    @Bindable
    public String getSs109() {
        return ss109;
    }

    public void setSs109(String ss109) {
        this.ss109 = ss109;
        notifyPropertyChanged(BR.ss109);
    }

    @Bindable
    public String getSs110() {
        return ss110;
    }

    public void setSs110(String ss110) {
        this.ss110 = ss110;
        notifyPropertyChanged(BR.ss110);
    }

    @Bindable
    public String getSs110atempx() {
        return ss110atempx;
    }

    public void setSs110atempx(String ss110atempx) {
        this.ss110atempx = ss110atempx;
        notifyPropertyChanged(BR.ss110atempx);
    }

    @Bindable
    public String getSs110a99() {
        return ss110a99;
    }

    public void setSs110a99(String ss110a99) {
        this.ss110a99 = ss110a99;
        notifyPropertyChanged(BR.ss110a99);
    }

    @Bindable
    public String getSs110bdiastolicx() {
        return ss110bdiastolicx;
    }

    public void setSs110bdiastolicx(String ss110bdiastolicx) {
        this.ss110bdiastolicx = ss110bdiastolicx;
        notifyPropertyChanged(BR.ss110bdiastolicx);
    }

    @Bindable
    public String getSs110bsystolicx() {
        return ss110bsystolicx;
    }

    public void setSs110bsystolicx(String ss110bsystolicx) {
        this.ss110bsystolicx = ss110bsystolicx;
        notifyPropertyChanged(BR.ss110bsystolicx);
    }

    @Bindable
    public String getSs110b99() {
        return ss110b99;
    }

    public void setSs110b99(String ss110b99) {
        this.ss110b99 = ss110b99;
        notifyPropertyChanged(BR.ss110b99);
    }

    @Bindable
    public String getSs110c() {
        return ss110c;
    }

    public void setSs110c(String ss110c) {
        this.ss110c = ss110c;
        notifyPropertyChanged(BR.ss110c);
    }

    @Bindable
    public String getSs110drbsx() {
        return ss110drbsx;
    }

    public void setSs110drbsx(String ss110drbsx) {
        this.ss110drbsx = ss110drbsx;
        notifyPropertyChanged(BR.ss110drbsx);
    }

    @Bindable
    public String getSs110d99() {
        return ss110d99;
    }

    public void setSs110d99(String ss110d99) {
        this.ss110d99 = ss110d99;
        notifyPropertyChanged(BR.ss110d99);
    }

    @Bindable
    public String getSs110ehbx() {
        return ss110ehbx;
    }

    public void setSs110ehbx(String ss110ehbx) {
        this.ss110ehbx = ss110ehbx;
        notifyPropertyChanged(BR.ss110ehbx);
    }

    @Bindable
    public String getSs110e99() {
        return ss110e99;
    }

    public void setSs110e99(String ss110e99) {
        this.ss110e99 = ss110e99;
        notifyPropertyChanged(BR.ss110e99);
    }

    @Bindable
    public String getSs111() {
        return ss111;
    }

    public void setSs111(String ss111) {
        this.ss111 = ss111;
        notifyPropertyChanged(BR.ss111);
    }

    @Bindable
    public String getSs111a() {
        return ss111a;
    }

    public void setSs111a(String ss111a) {
        this.ss111a = ss111a;
        notifyPropertyChanged(BR.ss111a);
    }

    @Bindable
    public String getSs111b() {
        return ss111b;
    }

    public void setSs111b(String ss111b) {
        this.ss111b = ss111b;
        notifyPropertyChanged(BR.ss111b);
    }

    @Bindable
    public String getSs111c() {
        return ss111c;
    }

    public void setSs111c(String ss111c) {
        this.ss111c = ss111c;
        notifyPropertyChanged(BR.ss111c);
    }

    @Bindable
    public String getSs111d() {
        return ss111d;
    }

    public void setSs111d(String ss111d) {
        this.ss111d = ss111d;
        notifyPropertyChanged(BR.ss111d);
    }

    @Bindable
    public String getSs11199() {
        return ss11199;
    }

    public void setSs11199(String ss11199) {
        this.ss11199 = ss11199;
        notifyPropertyChanged(BR.ss11199);
    }


    @Bindable
    public String getPc201() {
        return pc201;
    }

    public void setPc201(String pc201) {
        this.pc201 = pc201;
        notifyPropertyChanged(BR.pc201);
    }

    @Bindable
    public String getPc20101() {
        return pc20101;
    }

    public void setPc20101(String pc20101) {
        this.pc20101 = pc20101;
        notifyPropertyChanged(BR.pc20101);
    }

    @Bindable
    public String getPc20102() {
        return pc20102;
    }

    public void setPc20102(String pc20102) {
        this.pc20102 = pc20102;
        notifyPropertyChanged(BR.pc20102);
    }

    @Bindable
    public String getPc20103() {
        return pc20103;
    }

    public void setPc20103(String pc20103) {
        this.pc20103 = pc20103;
        notifyPropertyChanged(BR.pc20103);
    }

    @Bindable
    public String getPc20104() {
        return pc20104;
    }

    public void setPc20104(String pc20104) {
        this.pc20104 = pc20104;
        notifyPropertyChanged(BR.pc20104);
    }

    @Bindable
    public String getPc20105() {
        return pc20105;
    }

    public void setPc20105(String pc20105) {
        this.pc20105 = pc20105;
        notifyPropertyChanged(BR.pc20105);
    }

    @Bindable
    public String getPc20106() {
        return pc20106;
    }

    public void setPc20106(String pc20106) {
        this.pc20106 = pc20106;
        notifyPropertyChanged(BR.pc20106);
    }

    @Bindable
    public String getPc20107() {
        return pc20107;
    }

    public void setPc20107(String pc20107) {
        this.pc20107 = pc20107;
        notifyPropertyChanged(BR.pc20107);
    }

    @Bindable
    public String getPc20108() {
        return pc20108;
    }

    public void setPc20108(String pc20108) {
        this.pc20108 = pc20108;
        notifyPropertyChanged(BR.pc20108);
    }

    @Bindable
    public String getPc20109() {
        return pc20109;
    }

    public void setPc20109(String pc20109) {
        this.pc20109 = pc20109;
        notifyPropertyChanged(BR.pc20109);
    }

    @Bindable
    public String getPc20110() {
        return pc20110;
    }

    public void setPc20110(String pc20110) {
        this.pc20110 = pc20110;
        notifyPropertyChanged(BR.pc20110);
    }

    @Bindable
    public String getPc20111() {
        return pc20111;
    }

    public void setPc20111(String pc20111) {
        this.pc20111 = pc20111;
        notifyPropertyChanged(BR.pc20111);
    }

    @Bindable
    public String getPc20112() {
        return pc20112;
    }

    public void setPc20112(String pc20112) {
        this.pc20112 = pc20112;
        notifyPropertyChanged(BR.pc20112);
    }

    @Bindable
    public String getPc20113() {
        return pc20113;
    }

    public void setPc20113(String pc20113) {
        this.pc20113 = pc20113;
        notifyPropertyChanged(BR.pc20113);
    }

    @Bindable
    public String getPc20114() {
        return pc20114;
    }

    public void setPc20114(String pc20114) {
        this.pc20114 = pc20114;
        notifyPropertyChanged(BR.pc20114);
    }

    @Bindable
    public String getPc20115() {
        return pc20115;
    }

    public void setPc20115(String pc20115) {
        this.pc20115 = pc20115;
        notifyPropertyChanged(BR.pc20115);
    }

    @Bindable
    public String getPc20116() {
        return pc20116;
    }

    public void setPc20116(String pc20116) {
        this.pc20116 = pc20116;
        notifyPropertyChanged(BR.pc20116);
    }

    @Bindable
    public String getPc20117() {
        return pc20117;
    }

    public void setPc20117(String pc20117) {
        this.pc20117 = pc20117;
        notifyPropertyChanged(BR.pc20117);
    }

    @Bindable
    public String getPc20118() {
        return pc20118;
    }

    public void setPc20118(String pc20118) {
        this.pc20118 = pc20118;
        notifyPropertyChanged(BR.pc20118);
    }

    @Bindable
    public String getPc20119() {
        return pc20119;
    }

    public void setPc20119(String pc20119) {
        this.pc20119 = pc20119;
        notifyPropertyChanged(BR.pc20119);
    }

    @Bindable
    public String getPc20196() {
        return pc20196;
    }

    public void setPc20196(String pc20196) {
        this.pc20196 = pc20196;
        notifyPropertyChanged(BR.pc20196);
    }

    @Bindable
    public String getPc20196x() {
        return pc20196x;
    }

    public void setPc20196x(String pc20196x) {
        this.pc20196x = pc20196x;
        notifyPropertyChanged(BR.pc20196x);
    }

    @Bindable
    public String getPc20199() {
        return pc20199;
    }

    public void setPc20199(String pc20199) {
        this.pc20199 = pc20199;
        notifyPropertyChanged(BR.pc20199);
    }


    @Bindable
    public String getDi202() {
        return di202;
    }

    public void setDi202(String di202) {
        this.di202 = di202;
        notifyPropertyChanged(BR.di202);
    }

    @Bindable
    public String getDi20201() {
        return di20201;
    }

    public void setDi20201(String di20201) {
        this.di20201 = di20201;
        notifyPropertyChanged(BR.di20201);
    }

    @Bindable
    public String getDi20202() {
        return di20202;
    }

    public void setDi20202(String di20202) {
        this.di20202 = di20202;
        notifyPropertyChanged(BR.di20202);
    }

    @Bindable
    public String getDi20203() {
        return di20203;
    }

    public void setDi20203(String di20203) {
        this.di20203 = di20203;
        notifyPropertyChanged(BR.di20203);
    }

    @Bindable
    public String getDi20204() {
        return di20204;
    }

    public void setDi20204(String di20204) {
        this.di20204 = di20204;
        notifyPropertyChanged(BR.di20204);
    }

    @Bindable
    public String getDi20205() {
        return di20205;
    }

    public void setDi20205(String di20205) {
        this.di20205 = di20205;
        notifyPropertyChanged(BR.di20205);
    }

    @Bindable
    public String getDi20206() {
        return di20206;
    }

    public void setDi20206(String di20206) {
        this.di20206 = di20206;
        notifyPropertyChanged(BR.di20206);
    }

    @Bindable
    public String getDi20207() {
        return di20207;
    }

    public void setDi20207(String di20207) {
        this.di20207 = di20207;
        notifyPropertyChanged(BR.di20207);
    }

    @Bindable
    public String getDi20208() {
        return di20208;
    }

    public void setDi20208(String di20208) {
        this.di20208 = di20208;
        notifyPropertyChanged(BR.di20208);
    }

    @Bindable
    public String getDi20209() {
        return di20209;
    }

    public void setDi20209(String di20209) {
        this.di20209 = di20209;
        notifyPropertyChanged(BR.di20209);
    }

    @Bindable
    public String getDi20210() {
        return di20210;
    }

    public void setDi20210(String di20210) {
        this.di20210 = di20210;
        notifyPropertyChanged(BR.di20210);
    }

    @Bindable
    public String getDi20211() {
        return di20211;
    }

    public void setDi20211(String di20211) {
        this.di20211 = di20211;
        notifyPropertyChanged(BR.di20211);
    }

    @Bindable
    public String getDi20212() {
        return di20212;
    }

    public void setDi20212(String di20212) {
        this.di20212 = di20212;
        notifyPropertyChanged(BR.di20212);
    }

    @Bindable
    public String getDi20213() {
        return di20213;
    }

    public void setDi20213(String di20213) {
        this.di20213 = di20213;
        notifyPropertyChanged(BR.di20213);
    }

    @Bindable
    public String getDi20214() {
        return di20214;
    }

    public void setDi20214(String di20214) {
        this.di20214 = di20214;
        notifyPropertyChanged(BR.di20214);
    }

    @Bindable
    public String getDi20215() {
        return di20215;
    }

    public void setDi20215(String di20215) {
        this.di20215 = di20215;
        notifyPropertyChanged(BR.di20215);
    }

    @Bindable
    public String getDi20216() {
        return di20216;
    }

    public void setDi20216(String di20216) {
        this.di20216 = di20216;
        notifyPropertyChanged(BR.di20216);
    }

    @Bindable
    public String getDi20217() {
        return di20217;
    }

    public void setDi20217(String di20217) {
        this.di20217 = di20217;
        notifyPropertyChanged(BR.di20217);
    }

    @Bindable
    public String getDi20218() {
        return di20218;
    }

    public void setDi20218(String di20218) {
        this.di20218 = di20218;
        notifyPropertyChanged(BR.di20218);
    }

    @Bindable
    public String getDi20219() {
        return di20219;
    }

    public void setDi20219(String di20219) {
        this.di20219 = di20219;
        notifyPropertyChanged(BR.di20219);
    }

    @Bindable
    public String getDi20296() {
        return di20296;
    }

    public void setDi20296(String di20296) {
        this.di20296 = di20296;
        notifyPropertyChanged(BR.di20296);
    }

    @Bindable
    public String getDi20296x() {
        return di20296x;
    }

    public void setDi20296x(String di20296x) {
        this.di20296x = di20296x;
        notifyPropertyChanged(BR.di20296x);
    }

    @Bindable
    public String getDi20299() {
        return di20299;
    }

    public void setDi20299(String di20299) {
        this.di20299 = di20299;
        notifyPropertyChanged(BR.di20299);
    }

    @Bindable
    public String getMe203() {
        return me203;
    }

    public void setMe203(String me203) {
        this.me203 = me203;
        notifyPropertyChanged(BR.me203);
    }

    @Bindable
    public String getMe20301() {
        return me20301;
    }

    public void setMe20301(String me20301) {
        this.me20301 = me20301;
        notifyPropertyChanged(BR.me20301);
    }

    @Bindable
    public String getMe20302() {
        return me20302;
    }

    public void setMe20302(String me20302) {
        this.me20302 = me20302;
        notifyPropertyChanged(BR.me20302);
    }

    @Bindable
    public String getMe20303() {
        return me20303;
    }

    public void setMe20303(String me20303) {
        this.me20303 = me20303;
        notifyPropertyChanged(BR.me20303);
    }

    @Bindable
    public String getMe20304() {
        return me20304;
    }

    public void setMe20304(String me20304) {
        this.me20304 = me20304;
        notifyPropertyChanged(BR.me20304);
    }

    @Bindable
    public String getMe20305() {
        return me20305;
    }

    public void setMe20305(String me20305) {
        this.me20305 = me20305;
        notifyPropertyChanged(BR.me20305);
    }

    @Bindable
    public String getMe20306() {
        return me20306;
    }

    public void setMe20306(String me20306) {
        this.me20306 = me20306;
        notifyPropertyChanged(BR.me20306);
    }

    @Bindable
    public String getMe20307() {
        return me20307;
    }

    public void setMe20307(String me20307) {
        this.me20307 = me20307;
        notifyPropertyChanged(BR.me20307);
    }

    @Bindable
    public String getMe20308() {
        return me20308;
    }

    public void setMe20308(String me20308) {
        this.me20308 = me20308;
        notifyPropertyChanged(BR.me20308);
    }

    @Bindable
    public String getMe20309() {
        return me20309;
    }

    public void setMe20309(String me20309) {
        this.me20309 = me20309;
        notifyPropertyChanged(BR.me20309);
    }

    @Bindable
    public String getMe20310() {
        return me20310;
    }

    public void setMe20310(String me20310) {
        this.me20310 = me20310;
        notifyPropertyChanged(BR.me20310);
    }

    @Bindable
    public String getMe20311() {
        return me20311;
    }

    public void setMe20311(String me20311) {
        this.me20311 = me20311;
        notifyPropertyChanged(BR.me20311);
    }

    @Bindable
    public String getMe20312() {
        return me20312;
    }

    public void setMe20312(String me20312) {
        this.me20312 = me20312;
        notifyPropertyChanged(BR.me20312);
    }

    @Bindable
    public String getMe20313() {
        return me20313;
    }

    public void setMe20313(String me20313) {
        this.me20313 = me20313;
        notifyPropertyChanged(BR.me20313);
    }

    @Bindable
    public String getMe20314() {
        return me20314;
    }

    public void setMe20314(String me20314) {
        this.me20314 = me20314;
        notifyPropertyChanged(BR.me20314);
    }

    @Bindable
    public String getMe20315() {
        return me20315;
    }

    public void setMe20315(String me20315) {
        this.me20315 = me20315;
        notifyPropertyChanged(BR.me20315);
    }

    @Bindable
    public String getMe20316() {
        return me20316;
    }

    public void setMe20316(String me20316) {
        this.me20316 = me20316;
        notifyPropertyChanged(BR.me20316);
    }

    @Bindable
    public String getMe20317() {
        return me20317;
    }

    public void setMe20317(String me20317) {
        this.me20317 = me20317;
        notifyPropertyChanged(BR.me20317);
    }

    @Bindable
    public String getMe20318() {
        return me20318;
    }

    public void setMe20318(String me20318) {
        this.me20318 = me20318;
        notifyPropertyChanged(BR.me20318);
    }

    @Bindable
    public String getMe20319() {
        return me20319;
    }

    public void setMe20319(String me20319) {
        this.me20319 = me20319;
        notifyPropertyChanged(BR.me20319);
    }

    @Bindable
    public String getMe20320() {
        return me20320;
    }

    public void setMe20320(String me20320) {
        this.me20320 = me20320;
        notifyPropertyChanged(BR.me20320);
    }

    @Bindable
    public String getMe20321() {
        return me20321;
    }

    public void setMe20321(String me20321) {
        this.me20321 = me20321;
        notifyPropertyChanged(BR.me20321);
    }

    @Bindable
    public String getMe20322() {
        return me20322;
    }

    public void setMe20322(String me20322) {
        this.me20322 = me20322;
        notifyPropertyChanged(BR.me20322);
    }

    @Bindable
    public String getMe20323() {
        return me20323;
    }

    public void setMe20323(String me20323) {
        this.me20323 = me20323;
        notifyPropertyChanged(BR.me20323);
    }

    @Bindable
    public String getMe20324() {
        return me20324;
    }

    public void setMe20324(String me20324) {
        this.me20324 = me20324;
        notifyPropertyChanged(BR.me20324);
    }

    @Bindable
    public String getMe20333() {
        return me20333;
    }

    public void setMe20333(String me20333) {
        this.me20333 = me20333;
        notifyPropertyChanged(BR.me20333);
    }

    @Bindable
    public String getMe20335() {
        return me20335;
    }

    public void setMe20335(String me20335) {
        this.me20335 = me20335;
        notifyPropertyChanged(BR.me20335);
    }

    @Bindable
    public String getMe20336() {
        return me20336;
    }

    public void setMe20336(String me20336) {
        this.me20336 = me20336;
        notifyPropertyChanged(BR.me20336);
    }

    @Bindable
    public String getMe20337() {
        return me20337;
    }

    public void setMe20337(String me20337) {
        this.me20337 = me20337;
        notifyPropertyChanged(BR.me20337);
    }

    @Bindable
    public String getMe20338() {
        return me20338;
    }

    public void setMe20338(String me20338) {
        this.me20338 = me20338;
        notifyPropertyChanged(BR.me20338);
    }

    @Bindable
    public String getMe20339() {
        return me20339;
    }

    public void setMe20339(String me20339) {
        this.me20339 = me20339;
        notifyPropertyChanged(BR.me20339);
    }

    @Bindable
    public String getMe20340() {
        return me20340;
    }

    public void setMe20340(String me20340) {
        this.me20340 = me20340;
        notifyPropertyChanged(BR.me20340);
    }

    @Bindable
    public String getMe20341() {
        return me20341;
    }

    public void setMe20341(String me20341) {
        this.me20341 = me20341;
        notifyPropertyChanged(BR.me20341);
    }

    @Bindable
    public String getMe20342() {
        return me20342;
    }

    public void setMe20342(String me20342) {
        this.me20342 = me20342;
        notifyPropertyChanged(BR.me20342);
    }

    @Bindable
    public String getMe20343() {
        return me20343;
    }

    public void setMe20343(String me20343) {
        this.me20343 = me20343;
        notifyPropertyChanged(BR.me20343);
    }

    @Bindable
    public String getMe20344() {
        return me20344;
    }

    public void setMe20344(String me20344) {
        this.me20344 = me20344;
        notifyPropertyChanged(BR.me20344);
    }

    @Bindable
    public String getMe20345() {
        return me20345;
    }

    public void setMe20345(String me20345) {
        this.me20345 = me20345;
        notifyPropertyChanged(BR.me20345);
    }

    @Bindable
    public String getMe20346() {
        return me20346;
    }

    public void setMe20346(String me20346) {
        this.me20346 = me20346;
        notifyPropertyChanged(BR.me20346);
    }

    @Bindable
    public String getMe20347() {
        return me20347;
    }

    public void setMe20347(String me20347) {
        this.me20347 = me20347;
        notifyPropertyChanged(BR.me20347);
    }

    @Bindable
    public String getMe20348() {
        return me20348;
    }

    public void setMe20348(String me20348) {
        this.me20348 = me20348;
        notifyPropertyChanged(BR.me20348);
    }

    @Bindable
    public String getMe20349() {
        return me20349;
    }

    public void setMe20349(String me20349) {
        this.me20349 = me20349;
        notifyPropertyChanged(BR.me20349);
    }

    @Bindable
    public String getMe20350() {
        return me20350;
    }

    public void setMe20350(String me20350) {
        this.me20350 = me20350;
        notifyPropertyChanged(BR.me20350);
    }

    @Bindable
    public String getMe20351() {
        return me20351;
    }

    public void setMe20351(String me20351) {
        this.me20351 = me20351;
        notifyPropertyChanged(BR.me20351);
    }

    @Bindable
    public String getMe20352() {
        return me20352;
    }

    public void setMe20352(String me20352) {
        this.me20352 = me20352;
        notifyPropertyChanged(BR.me20352);
    }

    @Bindable
    public String getMe20353() {
        return me20353;
    }

    public void setMe20353(String me20353) {
        this.me20353 = me20353;
        notifyPropertyChanged(BR.me20353);
    }

    @Bindable
    public String getMe20354() {
        return me20354;
    }

    public void setMe20354(String me20354) {
        this.me20354 = me20354;
        notifyPropertyChanged(BR.me20354);
    }

    @Bindable
    public String getMe20355() {
        return me20355;
    }

    public void setMe20355(String me20355) {
        this.me20355 = me20355;
        notifyPropertyChanged(BR.me20355);
    }

    @Bindable
    public String getMe20356() {
        return me20356;
    }

    public void setMe20356(String me20356) {
        this.me20356 = me20356;
        notifyPropertyChanged(BR.me20356);
    }

    @Bindable
    public String getMe20357() {
        return me20357;
    }

    public void setMe20357(String me20357) {
        this.me20357 = me20357;
        notifyPropertyChanged(BR.me20357);
    }

    @Bindable
    public String getMe20358() {
        return me20358;
    }

    public void setMe20358(String me20358) {
        this.me20358 = me20358;
        notifyPropertyChanged(BR.me20358);
    }

    @Bindable
    public String getMe20359() {
        return me20359;
    }

    public void setMe20359(String me20359) {
        this.me20359 = me20359;
        notifyPropertyChanged(BR.me20359);
    }

    @Bindable
    public String getMe20361() {
        return me20361;
    }

    public void setMe20361(String me20361) {
        this.me20361 = me20361;
        notifyPropertyChanged(BR.me20361);
    }

    @Bindable
    public String getMe20362() {
        return me20362;
    }

    public void setMe20362(String me20362) {
        this.me20362 = me20362;
        notifyPropertyChanged(BR.me20362);
    }

    @Bindable
    public String getMe20363() {
        return me20363;
    }

    public void setMe20363(String me20363) {
        this.me20363 = me20363;
        notifyPropertyChanged(BR.me20363);
    }

    @Bindable
    public String getMe20364() {
        return me20364;
    }

    public void setMe20364(String me20364) {
        this.me20364 = me20364;
        notifyPropertyChanged(BR.me20364);
    }

    @Bindable
    public String getMe20365() {
        return me20365;
    }

    public void setMe20365(String me20365) {
        this.me20365 = me20365;
        notifyPropertyChanged(BR.me20365);
    }

    @Bindable
    public String getMe20366() {
        return me20366;
    }

    public void setMe20366(String me20366) {
        this.me20366 = me20366;
        notifyPropertyChanged(BR.me20366);
    }

    @Bindable
    public String getMe20367() {
        return me20367;
    }

    public void setMe20367(String me20367) {
        this.me20367 = me20367;
        notifyPropertyChanged(BR.me20367);
    }

    @Bindable
    public String getMe20368() {
        return me20368;
    }

    public void setMe20368(String me20368) {
        this.me20368 = me20368;
        notifyPropertyChanged(BR.me20368);
    }

    @Bindable
    public String getMe20369() {
        return me20369;
    }

    public void setMe20369(String me20369) {
        this.me20369 = me20369;
        notifyPropertyChanged(BR.me20369);
    }

    @Bindable
    public String getMe20370() {
        return me20370;
    }

    public void setMe20370(String me20370) {
        this.me20370 = me20370;
        notifyPropertyChanged(BR.me20370);
    }

    @Bindable
    public String getMe20371() {
        return me20371;
    }

    public void setMe20371(String me20371) {
        this.me20371 = me20371;
        notifyPropertyChanged(BR.me20371);
    }

    @Bindable
    public String getMe20372() {
        return me20372;
    }

    public void setMe20372(String me20372) {
        this.me20372 = me20372;
        notifyPropertyChanged(BR.me20372);
    }

    @Bindable
    public String getMe20373() {
        return me20373;
    }

    public void setMe20373(String me20373) {
        this.me20373 = me20373;
        notifyPropertyChanged(BR.me20373);
    }

    @Bindable
    public String getMe20374() {
        return me20374;
    }

    public void setMe20374(String me20374) {
        this.me20374 = me20374;
        notifyPropertyChanged(BR.me20374);
    }

    @Bindable
    public String getMe20375() {
        return me20375;
    }

    public void setMe20375(String me20375) {
        this.me20375 = me20375;
        notifyPropertyChanged(BR.me20375);
    }

    @Bindable
    public String getMe20376() {
        return me20376;
    }

    public void setMe20376(String me20376) {
        this.me20376 = me20376;
        notifyPropertyChanged(BR.me20376);
    }

    @Bindable
    public String getMe20377() {
        return me20377;
    }

    public void setMe20377(String me20377) {
        this.me20377 = me20377;
        notifyPropertyChanged(BR.me20377);
    }

    @Bindable
    public String getMe20378() {
        return me20378;
    }

    public void setMe20378(String me20378) {
        this.me20378 = me20378;
        notifyPropertyChanged(BR.me20378);
    }

    @Bindable
    public String getMe20375x() {
        return me20375x;
    }

    public void setMe20375x(String me20375x) {
        this.me20375x = me20375x;
        notifyPropertyChanged(BR.me20375x);
    }

    @Bindable
    public String getMe20376x() {
        return me20376x;
    }

    public void setMe20376x(String me20376x) {
        this.me20376x = me20376x;
        notifyPropertyChanged(BR.me20376x);
    }

    @Bindable
    public String getMe20377x() {
        return me20377x;
    }

    public void setMe20377x(String me20377x) {
        this.me20377x = me20377x;
        notifyPropertyChanged(BR.me20377x);
    }

    @Bindable
    public String getMe20378x() {
        return me20378x;
    }

    public void setMe20378x(String me20378x) {
        this.me20378x = me20378x;
        notifyPropertyChanged(BR.me20378x);
    }


    @Bindable
    public String getMe20396() {
        return me20396;
    }

    public void setMe20396(String me20396) {
        this.me20396 = me20396;
        notifyPropertyChanged(BR.me20396);
    }

    @Bindable
    public String getMe20396x() {
        return me20396x;
    }

    public void setMe20396x(String me20396x) {
        this.me20396x = me20396x;
        notifyPropertyChanged(BR.me20396x);
    }

    @Bindable
    public String getMe20399() {
        return me20399;
    }

    public void setMe20399(String me20399) {
        this.me20399 = me20399;
        notifyPropertyChanged(BR.me20399);
    }

    @Bindable
    public String getMe20301DAY() {
        return me20301DAY;
    }

    public void setMe20301DAY(String me20301DAY) {
        this.me20301DAY = me20301DAY;
        notifyPropertyChanged(BR.me20301DAY);
    }

    @Bindable
    public String getMe20301QTY() {
        return me20301QTY;
    }

    public void setMe20301QTY(String me20301QTY) {
        this.me20301QTY = me20301QTY;
        notifyPropertyChanged(BR.me20301QTY);
    }

    @Bindable
    public String getMe20304DAY() {
        return me20304DAY;
    }

    public void setMe20304DAY(String me20304DAY) {
        this.me20304DAY = me20304DAY;
        notifyPropertyChanged(BR.me20304DAY);
    }

    @Bindable
    public String getMe20304QTY() {
        return me20304QTY;
    }

    public void setMe20304QTY(String me20304QTY) {
        this.me20304QTY = me20304QTY;
        notifyPropertyChanged(BR.me20304QTY);
    }

    @Bindable
    public String getMe20307DAY() {
        return me20307DAY;
    }

    public void setMe20307DAY(String me20307DAY) {
        this.me20307DAY = me20307DAY;
        notifyPropertyChanged(BR.me20307DAY);
    }

    @Bindable
    public String getMe20307QTY() {
        return me20307QTY;
    }

    public void setMe20307QTY(String me20307QTY) {
        this.me20307QTY = me20307QTY;
        notifyPropertyChanged(BR.me20307QTY);
    }

    @Bindable
    public String getMe20313DAY() {
        return me20313DAY;
    }

    public void setMe20313DAY(String me20313DAY) {
        this.me20313DAY = me20313DAY;
        notifyPropertyChanged(BR.me20313DAY);
    }

    @Bindable
    public String getMe20313QTY() {
        return me20313QTY;
    }

    public void setMe20313QTY(String me20313QTY) {
        this.me20313QTY = me20313QTY;
        notifyPropertyChanged(BR.me20313QTY);
    }

    @Bindable
    public String getMe20322DAY() {
        return me20322DAY;
    }

    public void setMe20322DAY(String me20322DAY) {
        this.me20322DAY = me20322DAY;
        notifyPropertyChanged(BR.me20322DAY);
    }

    @Bindable
    public String getMe20322QTY() {
        return me20322QTY;
    }

    public void setMe20322QTY(String me20322QTY) {
        this.me20322QTY = me20322QTY;
        notifyPropertyChanged(BR.me20322QTY);
    }

    @Bindable
    public String getMe20324DAY() {
        return me20324DAY;
    }

    public void setMe20324DAY(String me20324DAY) {
        this.me20324DAY = me20324DAY;
        notifyPropertyChanged(BR.me20324DAY);
    }

    @Bindable
    public String getMe20324QTY() {
        return me20324QTY;
    }

    public void setMe20324QTY(String me20324QTY) {
        this.me20324QTY = me20324QTY;
        notifyPropertyChanged(BR.me20324QTY);
    }

    @Bindable
    public String getMe20333DAY() {
        return me20333DAY;
    }

    public void setMe20333DAY(String me20333DAY) {
        this.me20333DAY = me20333DAY;
        notifyPropertyChanged(BR.me20333DAY);
    }

    @Bindable
    public String getMe20333QTY() {
        return me20333QTY;
    }

    public void setMe20333QTY(String me20333QTY) {
        this.me20333QTY = me20333QTY;
        notifyPropertyChanged(BR.me20333QTY);
    }

    @Bindable
    public String getMe20334DAY() {
        return me20334DAY;
    }

    public void setMe20334DAY(String me20334DAY) {
        this.me20334DAY = me20334DAY;
        notifyPropertyChanged(BR.me20334DAY);
    }

    @Bindable
    public String getMe20334QTY() {
        return me20334QTY;
    }

    public void setMe20334QTY(String me20334QTY) {
        this.me20334QTY = me20334QTY;
        notifyPropertyChanged(BR.me20334QTY);
    }

    @Bindable
    public String getMe20335DAY() {
        return me20335DAY;
    }

    public void setMe20335DAY(String me20335DAY) {
        this.me20335DAY = me20335DAY;
        notifyPropertyChanged(BR.me20335DAY);
    }

    @Bindable
    public String getMe20335QTY() {
        return me20335QTY;
    }

    public void setMe20335QTY(String me20335QTY) {
        this.me20335QTY = me20335QTY;
        notifyPropertyChanged(BR.me20335QTY);
    }

    @Bindable
    public String getMe20336DAY() {
        return me20336DAY;
    }

    public void setMe20336DAY(String me20336DAY) {
        this.me20336DAY = me20336DAY;
        notifyPropertyChanged(BR.me20336DAY);
    }

    @Bindable
    public String getMe20336QTY() {
        return me20336QTY;
    }

    public void setMe20336QTY(String me20336QTY) {
        this.me20336QTY = me20336QTY;
        notifyPropertyChanged(BR.me20336QTY);
    }

    @Bindable
    public String getMe20337DAY() {
        return me20337DAY;
    }

    public void setMe20337DAY(String me20337DAY) {
        this.me20337DAY = me20337DAY;
        notifyPropertyChanged(BR.me20337DAY);
    }

    @Bindable
    public String getMe20337QTY() {
        return me20337QTY;
    }

    public void setMe20337QTY(String me20337QTY) {
        this.me20337QTY = me20337QTY;
        notifyPropertyChanged(BR.me20337QTY);
    }

    @Bindable
    public String getMe20338DAY() {
        return me20338DAY;
    }

    public void setMe20338DAY(String me20338DAY) {
        this.me20338DAY = me20338DAY;
        notifyPropertyChanged(BR.me20338DAY);
    }

    @Bindable
    public String getMe20338QTY() {
        return me20338QTY;
    }

    public void setMe20338QTY(String me20338QTY) {
        this.me20338QTY = me20338QTY;
        notifyPropertyChanged(BR.me20338QTY);
    }

    @Bindable
    public String getMe20339DAY() {
        return me20339DAY;
    }

    public void setMe20339DAY(String me20339DAY) {
        this.me20339DAY = me20339DAY;
        notifyPropertyChanged(BR.me20339DAY);
    }

    @Bindable
    public String getMe20339QTY() {
        return me20339QTY;
    }

    public void setMe20339QTY(String me20339QTY) {
        this.me20339QTY = me20339QTY;
        notifyPropertyChanged(BR.me20339QTY);
    }

    @Bindable
    public String getMe20340DAY() {
        return me20340DAY;
    }

    public void setMe20340DAY(String me20340DAY) {
        this.me20340DAY = me20340DAY;
        notifyPropertyChanged(BR.me20340DAY);
    }

    @Bindable
    public String getMe20340QTY() {
        return me20340QTY;
    }

    public void setMe20340QTY(String me20340QTY) {
        this.me20340QTY = me20340QTY;
        notifyPropertyChanged(BR.me20340QTY);
    }

    @Bindable
    public String getMe20341DAY() {
        return me20341DAY;
    }

    public void setMe20341DAY(String me20341DAY) {
        this.me20341DAY = me20341DAY;
        notifyPropertyChanged(BR.me20341DAY);
    }

    @Bindable
    public String getMe20341QTY() {
        return me20341QTY;
    }

    public void setMe20341QTY(String me20341QTY) {
        this.me20341QTY = me20341QTY;
        notifyPropertyChanged(BR.me20341QTY);
    }

    @Bindable
    public String getMe20342DAY() {
        return me20342DAY;
    }

    public void setMe20342DAY(String me20342DAY) {
        this.me20342DAY = me20342DAY;
        notifyPropertyChanged(BR.me20342DAY);
    }

    @Bindable
    public String getMe20342QTY() {
        return me20342QTY;
    }

    public void setMe20342QTY(String me20342QTY) {
        this.me20342QTY = me20342QTY;
        notifyPropertyChanged(BR.me20342QTY);
    }

    @Bindable
    public String getMe20343DAY() {
        return me20343DAY;
    }

    public void setMe20343DAY(String me20343DAY) {
        this.me20343DAY = me20343DAY;
        notifyPropertyChanged(BR.me20343DAY);
    }

    @Bindable
    public String getMe20343QTY() {
        return me20343QTY;
    }

    public void setMe20343QTY(String me20343QTY) {
        this.me20343QTY = me20343QTY;
        notifyPropertyChanged(BR.me20343QTY);
    }

    @Bindable
    public String getMe20344DAY() {
        return me20344DAY;
    }

    public void setMe20344DAY(String me20344DAY) {
        this.me20344DAY = me20344DAY;
        notifyPropertyChanged(BR.me20344DAY);
    }

    @Bindable
    public String getMe20344QTY() {
        return me20344QTY;
    }

    public void setMe20344QTY(String me20344QTY) {
        this.me20344QTY = me20344QTY;
        notifyPropertyChanged(BR.me20344QTY);
    }

    @Bindable
    public String getMe20345DAY() {
        return me20345DAY;
    }

    public void setMe20345DAY(String me20345DAY) {
        this.me20345DAY = me20345DAY;
        notifyPropertyChanged(BR.me20345DAY);
    }

    @Bindable
    public String getMe20345QTY() {
        return me20345QTY;
    }

    public void setMe20345QTY(String me20345QTY) {
        this.me20345QTY = me20345QTY;
        notifyPropertyChanged(BR.me20345QTY);
    }

    @Bindable
    public String getMe20346DAY() {
        return me20346DAY;
    }

    public void setMe20346DAY(String me20346DAY) {
        this.me20346DAY = me20346DAY;
        notifyPropertyChanged(BR.me20346DAY);
    }

    @Bindable
    public String getMe20346QTY() {
        return me20346QTY;
    }

    public void setMe20346QTY(String me20346QTY) {
        this.me20346QTY = me20346QTY;
        notifyPropertyChanged(BR.me20346QTY);
    }

    @Bindable
    public String getMe20347DAY() {
        return me20347DAY;
    }

    public void setMe20347DAY(String me20347DAY) {
        this.me20347DAY = me20347DAY;
        notifyPropertyChanged(BR.me20347DAY);
    }

    @Bindable
    public String getMe20347QTY() {
        return me20347QTY;
    }

    public void setMe20347QTY(String me20347QTY) {
        this.me20347QTY = me20347QTY;
        notifyPropertyChanged(BR.me20347QTY);
    }

    @Bindable
    public String getMe20348DAY() {
        return me20348DAY;
    }

    public void setMe20348DAY(String me20348DAY) {
        this.me20348DAY = me20348DAY;
        notifyPropertyChanged(BR.me20348DAY);
    }

    @Bindable
    public String getMe20348QTY() {
        return me20348QTY;
    }

    public void setMe20348QTY(String me20348QTY) {
        this.me20348QTY = me20348QTY;
        notifyPropertyChanged(BR.me20348QTY);
    }

    @Bindable
    public String getMe20349DAY() {
        return me20349DAY;
    }

    public void setMe20349DAY(String me20349DAY) {
        this.me20349DAY = me20349DAY;
        notifyPropertyChanged(BR.me20349DAY);
    }

    @Bindable
    public String getMe20349QTY() {
        return me20349QTY;
    }

    public void setMe20349QTY(String me20349QTY) {
        this.me20349QTY = me20349QTY;
        notifyPropertyChanged(BR.me20349QTY);
    }

    @Bindable
    public String getMe20350DAY() {
        return me20350DAY;
    }

    public void setMe20350DAY(String me20350DAY) {
        this.me20350DAY = me20350DAY;
        notifyPropertyChanged(BR.me20350DAY);
    }

    @Bindable
    public String getMe20350QTY() {
        return me20350QTY;
    }

    public void setMe20350QTY(String me20350QTY) {
        this.me20350QTY = me20350QTY;
        notifyPropertyChanged(BR.me20350QTY);
    }

    @Bindable
    public String getMe20351DAY() {
        return me20351DAY;
    }

    public void setMe20351DAY(String me20351DAY) {
        this.me20351DAY = me20351DAY;
        notifyPropertyChanged(BR.me20351DAY);
    }

    @Bindable
    public String getMe20351QTY() {
        return me20351QTY;
    }

    public void setMe20351QTY(String me20351QTY) {
        this.me20351QTY = me20351QTY;
        notifyPropertyChanged(BR.me20351QTY);
    }

    @Bindable
    public String getMe20352DAY() {
        return me20352DAY;
    }

    public void setMe20352DAY(String me20352DAY) {
        this.me20352DAY = me20352DAY;
        notifyPropertyChanged(BR.me20352DAY);
    }

    @Bindable
    public String getMe20352QTY() {
        return me20352QTY;
    }

    public void setMe20352QTY(String me20352QTY) {
        this.me20352QTY = me20352QTY;
        notifyPropertyChanged(BR.me20352QTY);
    }

    @Bindable
    public String getMe20353DAY() {
        return me20353DAY;
    }

    public void setMe20353DAY(String me20353DAY) {
        this.me20353DAY = me20353DAY;
        notifyPropertyChanged(BR.me20353DAY);
    }

    @Bindable
    public String getMe20353QTY() {
        return me20353QTY;
    }

    public void setMe20353QTY(String me20353QTY) {
        this.me20353QTY = me20353QTY;
        notifyPropertyChanged(BR.me20353QTY);
    }

    @Bindable
    public String getMe20354DAY() {
        return me20354DAY;
    }

    public void setMe20354DAY(String me20354DAY) {
        this.me20354DAY = me20354DAY;
        notifyPropertyChanged(BR.me20354DAY);
    }

    @Bindable
    public String getMe20354QTY() {
        return me20354QTY;
    }

    public void setMe20354QTY(String me20354QTY) {
        this.me20354QTY = me20354QTY;
        notifyPropertyChanged(BR.me20354QTY);
    }

    @Bindable
    public String getMe20355DAY() {
        return me20355DAY;
    }

    public void setMe20355DAY(String me20355DAY) {
        this.me20355DAY = me20355DAY;
        notifyPropertyChanged(BR.me20355DAY);
    }

    @Bindable
    public String getMe20355QTY() {
        return me20355QTY;
    }

    public void setMe20355QTY(String me20355QTY) {
        this.me20355QTY = me20355QTY;
        notifyPropertyChanged(BR.me20355QTY);
    }

    @Bindable
    public String getMe20356DAY() {
        return me20356DAY;
    }

    public void setMe20356DAY(String me20356DAY) {
        this.me20356DAY = me20356DAY;
        notifyPropertyChanged(BR.me20356DAY);
    }

    @Bindable
    public String getMe20356QTY() {
        return me20356QTY;
    }

    public void setMe20356QTY(String me20356QTY) {
        this.me20356QTY = me20356QTY;
        notifyPropertyChanged(BR.me20356QTY);
    }

    @Bindable
    public String getMe20357DAY() {
        return me20357DAY;
    }

    public void setMe20357DAY(String me20357DAY) {
        this.me20357DAY = me20357DAY;
        notifyPropertyChanged(BR.me20357DAY);
    }

    @Bindable
    public String getMe20357QTY() {
        return me20357QTY;
    }

    public void setMe20357QTY(String me20357QTY) {
        this.me20357QTY = me20357QTY;
        notifyPropertyChanged(BR.me20357QTY);
    }

    @Bindable
    public String getMe20358DAY() {
        return me20358DAY;
    }

    public void setMe20358DAY(String me20358DAY) {
        this.me20358DAY = me20358DAY;
        notifyPropertyChanged(BR.me20358DAY);
    }

    @Bindable
    public String getMe20358QTY() {
        return me20358QTY;
    }

    public void setMe20358QTY(String me20358QTY) {
        this.me20358QTY = me20358QTY;
        notifyPropertyChanged(BR.me20358QTY);
    }

    @Bindable
    public String getMe20359DAY() {
        return me20359DAY;
    }

    public void setMe20359DAY(String me20359DAY) {
        this.me20359DAY = me20359DAY;
        notifyPropertyChanged(BR.me20359DAY);
    }

    @Bindable
    public String getMe20359QTY() {
        return me20359QTY;
    }

    public void setMe20359QTY(String me20359QTY) {
        this.me20359QTY = me20359QTY;
        notifyPropertyChanged(BR.me20359QTY);
    }

    @Bindable
    public String getMe20361DAY() {
        return me20361DAY;
    }

    public void setMe20361DAY(String me20361DAY) {
        this.me20361DAY = me20361DAY;
        notifyPropertyChanged(BR.me20361DAY);
    }

    @Bindable
    public String getMe20361QTY() {
        return me20361QTY;
    }

    public void setMe20361QTY(String me20361QTY) {
        this.me20361QTY = me20361QTY;
        notifyPropertyChanged(BR.me20361QTY);
    }

    @Bindable
    public String getMe20362DAY() {
        return me20362DAY;
    }

    public void setMe20362DAY(String me20362DAY) {
        this.me20362DAY = me20362DAY;
        notifyPropertyChanged(BR.me20362DAY);
    }

    @Bindable
    public String getMe20362QTY() {
        return me20362QTY;
    }

    public void setMe20362QTY(String me20362QTY) {
        this.me20362QTY = me20362QTY;
        notifyPropertyChanged(BR.me20362QTY);
    }

    @Bindable
    public String getMe20363DAY() {
        return me20363DAY;
    }

    public void setMe20363DAY(String me20363DAY) {
        this.me20363DAY = me20363DAY;
        notifyPropertyChanged(BR.me20363DAY);
    }

    @Bindable
    public String getMe20363QTY() {
        return me20363QTY;
    }

    public void setMe20363QTY(String me20363QTY) {
        this.me20363QTY = me20363QTY;
        notifyPropertyChanged(BR.me20363QTY);
    }

    @Bindable
    public String getMe20364DAY() {
        return me20364DAY;
    }

    public void setMe20364DAY(String me20364DAY) {
        this.me20364DAY = me20364DAY;
        notifyPropertyChanged(BR.me20364DAY);
    }

    @Bindable
    public String getMe20364QTY() {
        return me20364QTY;
    }

    public void setMe20364QTY(String me20364QTY) {
        this.me20364QTY = me20364QTY;
        notifyPropertyChanged(BR.me20364QTY);
    }

    @Bindable
    public String getMe20365DAY() {
        return me20365DAY;
    }

    public void setMe20365DAY(String me20365DAY) {
        this.me20365DAY = me20365DAY;
        notifyPropertyChanged(BR.me20365DAY);
    }

    @Bindable
    public String getMe20365QTY() {
        return me20365QTY;
    }

    public void setMe20365QTY(String me20365QTY) {
        this.me20365QTY = me20365QTY;
        notifyPropertyChanged(BR.me20365QTY);
    }

    @Bindable
    public String getMe20366DAY() {
        return me20366DAY;
    }

    public void setMe20366DAY(String me20366DAY) {
        this.me20366DAY = me20366DAY;
        notifyPropertyChanged(BR.me20366DAY);
    }

    @Bindable
    public String getMe20366QTY() {
        return me20366QTY;
    }

    public void setMe20366QTY(String me20366QTY) {
        this.me20366QTY = me20366QTY;
        notifyPropertyChanged(BR.me20366QTY);
    }

    @Bindable
    public String getMe20367DAY() {
        return me20367DAY;
    }

    public void setMe20367DAY(String me20367DAY) {
        this.me20367DAY = me20367DAY;
        notifyPropertyChanged(BR.me20367DAY);
    }

    @Bindable
    public String getMe20367QTY() {
        return me20367QTY;
    }

    public void setMe20367QTY(String me20367QTY) {
        this.me20367QTY = me20367QTY;
        notifyPropertyChanged(BR.me20367QTY);
    }

    @Bindable
    public String getMe20368DAY() {
        return me20368DAY;
    }

    public void setMe20368DAY(String me20368DAY) {
        this.me20368DAY = me20368DAY;
        notifyPropertyChanged(BR.me20368DAY);
    }

    @Bindable
    public String getMe20368QTY() {
        return me20368QTY;
    }

    public void setMe20368QTY(String me20368QTY) {
        this.me20368QTY = me20368QTY;
        notifyPropertyChanged(BR.me20368QTY);
    }

    @Bindable
    public String getMe20369DAY() {
        return me20369DAY;
    }

    public void setMe20369DAY(String me20369DAY) {
        this.me20369DAY = me20369DAY;
        notifyPropertyChanged(BR.me20369DAY);
    }

    @Bindable
    public String getMe20369QTY() {
        return me20369QTY;
    }

    public void setMe20369QTY(String me20369QTY) {
        this.me20369QTY = me20369QTY;
        notifyPropertyChanged(BR.me20369QTY);
    }

    @Bindable
    public String getMe20370DAY() {
        return me20370DAY;
    }

    public void setMe20370DAY(String me20370DAY) {
        this.me20370DAY = me20370DAY;
        notifyPropertyChanged(BR.me20370DAY);
    }

    @Bindable
    public String getMe20370QTY() {
        return me20370QTY;
    }

    public void setMe20370QTY(String me20370QTY) {
        this.me20370QTY = me20370QTY;
        notifyPropertyChanged(BR.me20370QTY);
    }

    @Bindable
    public String getMe20371DAY() {
        return me20371DAY;
    }

    public void setMe20371DAY(String me20371DAY) {
        this.me20371DAY = me20371DAY;
        notifyPropertyChanged(BR.me20371DAY);
    }

    @Bindable
    public String getMe20371QTY() {
        return me20371QTY;
    }

    public void setMe20371QTY(String me20371QTY) {
        this.me20371QTY = me20371QTY;
        notifyPropertyChanged(BR.me20371QTY);
    }

    @Bindable
    public String getMe20372DAY() {
        return me20372DAY;
    }

    public void setMe20372DAY(String me20372DAY) {
        this.me20372DAY = me20372DAY;
        notifyPropertyChanged(BR.me20372DAY);
    }

    @Bindable
    public String getMe20372QTY() {
        return me20372QTY;
    }

    public void setMe20372QTY(String me20372QTY) {
        this.me20372QTY = me20372QTY;
        notifyPropertyChanged(BR.me20372QTY);
    }

    @Bindable
    public String getMe20373DAY() {
        return me20373DAY;
    }

    public void setMe20373DAY(String me20373DAY) {
        this.me20373DAY = me20373DAY;
        notifyPropertyChanged(BR.me20373DAY);
    }

    @Bindable
    public String getMe20373QTY() {
        return me20373QTY;
    }

    public void setMe20373QTY(String me20373QTY) {
        this.me20373QTY = me20373QTY;
        notifyPropertyChanged(BR.me20373QTY);
    }

    @Bindable
    public String getMe20374DAY() {
        return me20374DAY;
    }

    public void setMe20374DAY(String me20374DAY) {
        this.me20374DAY = me20374DAY;
        notifyPropertyChanged(BR.me20374DAY);
    }

    @Bindable
    public String getMe20374QTY() {
        return me20374QTY;
    }

    public void setMe20374QTY(String me20374QTY) {
        this.me20374QTY = me20374QTY;
        notifyPropertyChanged(BR.me20374QTY);
    }

    @Bindable
    public String getMe20375DAY() {
        return me20375DAY;
    }

    public void setMe20375DAY(String me20375DAY) {
        this.me20375DAY = me20375DAY;
        notifyPropertyChanged(BR.me20375DAY);
    }

    @Bindable
    public String getMe20375QTY() {
        return me20375QTY;
    }

    public void setMe20375QTY(String me20375QTY) {
        this.me20375QTY = me20375QTY;
        notifyPropertyChanged(BR.me20375QTY);
    }

    @Bindable
    public String getMe20376DAY() {
        return me20376DAY;
    }

    public void setMe20376DAY(String me20376DAY) {
        this.me20376DAY = me20376DAY;
        notifyPropertyChanged(BR.me20376DAY);
    }

    @Bindable
    public String getMe20376QTY() {
        return me20376QTY;
    }

    public void setMe20376QTY(String me20376QTY) {
        this.me20376QTY = me20376QTY;
        notifyPropertyChanged(BR.me20376QTY);
    }

    @Bindable
    public String getMe20377DAY() {
        return me20377DAY;
    }

    public void setMe20377DAY(String me20377DAY) {
        this.me20377DAY = me20377DAY;
        notifyPropertyChanged(BR.me20377DAY);
    }

    @Bindable
    public String getMe20377QTY() {
        return me20377QTY;
    }

    public void setMe20377QTY(String me20377QTY) {
        this.me20377QTY = me20377QTY;
        notifyPropertyChanged(BR.me20377QTY);
    }

    @Bindable
    public String getMe20378DAY() {
        return me20378DAY;
    }

    public void setMe20378DAY(String me20378DAY) {
        this.me20378DAY = me20378DAY;
        notifyPropertyChanged(BR.me20378DAY);
    }

    @Bindable
    public String getMe20378QTY() {
        return me20378QTY;
    }

    public void setMe20378QTY(String me20378QTY) {
        this.me20378QTY = me20378QTY;
        notifyPropertyChanged(BR.me20378QTY);
    }

    @Bindable
    public String getMe20396DAY() {
        return me20396DAY;
    }

    public void setMe20396DAY(String me20396DAY) {
        this.me20396DAY = me20396DAY;
        notifyPropertyChanged(BR.me20396DAY);
    }

    @Bindable
    public String getMe20396QTY() {
        return me20396QTY;
    }

    public void setMe20396QTY(String me20396QTY) {
        this.me20396QTY = me20396QTY;
        notifyPropertyChanged(BR.me20396QTY);
    }


    @Bindable
    public String getVs301() {
        return vs301;
    }

    public void setVs301(String vs301) {
        this.vs301 = vs301;
        notifyPropertyChanged(BR.vs301);
    }

    @Bindable
    public String getVs302() {
        return vs302;
    }

    public void setVs302(String vs302) {
        this.vs302 = vs302;
        notifyPropertyChanged(BR.vs302);
    }

    @Bindable
    public String getVs303() {
        return vs303;
    }

    public void setVs303(String vs303) {
        this.vs303 = vs303;
        notifyPropertyChanged(BR.vs303);
    }

    @Bindable
    public String getVs304() {
        return vs304;
    }

    public void setVs304(String vs304) {
        this.vs304 = vs304;
        notifyPropertyChanged(BR.vs304);
    }

    @Bindable
    public String getVs305() {
        return vs305;
    }

    public void setVs305(String vs305) {
        this.vs305 = vs305;
        notifyPropertyChanged(BR.vs305);
    }

    @Bindable
    public String getVs306() {
        return vs306;
    }

    public void setVs306(String vs306) {
        this.vs306 = vs306;
        notifyPropertyChanged(BR.vs306);
    }

    @Bindable
    public String getVs306a() {
        return vs306a;
    }

    public void setVs306a(String vs306a) {
        this.vs306a = vs306a;
        notifyPropertyChanged(BR.vs306a);
    }

    @Bindable
    public String getVs306b() {
        return vs306b;
    }

    public void setVs306b(String vs306b) {
        this.vs306b = vs306b;
        notifyPropertyChanged(BR.vs306b);
    }

    @Bindable
    public String getVs306c() {
        return vs306c;
    }

    public void setVs306c(String vs306c) {
        this.vs306c = vs306c;
        notifyPropertyChanged(BR.vs306c);
    }

    @Bindable
    public String getVs306d() {
        return vs306d;
    }

    public void setVs306d(String vs306d) {
        this.vs306d = vs306d;
        notifyPropertyChanged(BR.vs306d);
    }

    @Bindable
    public String getVs306e() {
        return vs306e;
    }

    public void setVs306e(String vs306e) {
        this.vs306e = vs306e;
        notifyPropertyChanged(BR.vs306e);
    }

    @Bindable
    public String getVs306f() {
        return vs306f;
    }

    public void setVs306f(String vs306f) {
        this.vs306f = vs306f;
        notifyPropertyChanged(BR.vs306f);
    }

    @Bindable
    public String getVs306g() {
        return vs306g;
    }

    public void setVs306g(String vs306g) {
        this.vs306g = vs306g;
        notifyPropertyChanged(BR.vs306g);
    }

    @Bindable
    public String getVs306i() {
        return vs306i;
    }

    public void setVs306i(String vs306i) {
        this.vs306i = vs306i;
        notifyPropertyChanged(BR.vs306i);
    }

    @Bindable
    public String getVs30699() {
        return vs30699;
    }

    public void setVs30699(String vs30699) {
        this.vs30699 = vs30699;
        notifyPropertyChanged(BR.vs30699);
    }

    @Bindable
    public String getVs307() {
        return vs307;
    }

    public void setVs307(String vs307) {
        this.vs307 = vs307;
        notifyPropertyChanged(BR.vs307);
    }

    @Bindable
    public String getVs308() {
        return vs308;
    }

    public void setVs308(String vs308) {
        this.vs308 = vs308;
        notifyPropertyChanged(BR.vs308);
    }


    @Bindable
    public String getSs101() {
        return ss101;
    }

    public void setSs101(String ss101) {
        this.ss101 = ss101;
        notifyPropertyChanged(BR.ss101);
    }

    @Bindable
    public String getSs107() {
        return ss107;
    }

    public void setSs107(String ss107) {
        this.ss107 = ss107;
        notifyPropertyChanged(BR.ss107);
    }
}
