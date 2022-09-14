package edu.aku.hassannaqvi.flood2022v2.models;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.google.gson.GsonBuilder;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.flood2022v2.BR;
import edu.aku.hassannaqvi.flood2022v2.contracts.MHContract;
import edu.aku.hassannaqvi.flood2022v2.core.MainApp;


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
    public String ss11099;
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

    public String ss110muac;
    public String ss110mm99;
    public String ss110fosx;
    public String ss110f99;
    public String ss110ghrx;
    public String ss110g99;
    public String vs306h;
    public String vs310;
    public String pc20121;
    public String pc20122;
    public String pc20123;
    public String pc20124;
    public String pc20125;
    public String pc20126;
    public String pc20127;
    public String pc20128;
    public String pc20129;
    public String pc20130;
    public String pc20131;
    public String pc20132;
    public String pc20133;
    public String pc20134;
    public String pc20135;
    public String pc20136;
    public String di20221;
    public String di20222;
    public String di20223;
    public String di20224;
    public String di20225;
    public String di20226;
    public String di20227;
    public String di20228;
    public String di20229;
    public String di20230;
    public String di20231;
    public String di20232;
    public String di20233;
    public String di20234;
    public String di20235;
    public String di20236;
    public String di20237;
    public String di20238;
    public String di20239;
    public String di20240;
    public String di20241;
    public String di20242;
    public String di20243;
    public String di20244;
    public String di20245;
    public String di20246;
    public String di20247;
    public String di20248;
    public String di20249;
    public String di20250;
    public String di20251;
    public String di20252;
    public String di20253;
    public String di20254;
    public String di20255;
    public String di20256;
    public String di20257;
    public String di20258;
    public String di20259;
    public String di20260;
    public String di20261;
    public String di20262;
    public String di20263;
    public String di20264;
    public String di20265;
    public String di20266;
    public String di20267;
    public String di20268;
    public String di20269;
    public String di20270;
    public String di20271;
    public String di20272;
    public String di20273;
    public String di20274;
    public String di20275;
    public String di20276;
    public String di20277;
    public String di20278;
    public String di20279;
    public String di20280;
    public String di20281;
    public String me203101;
    public String me203102;
    public String me203103;
    public String me203104;
    public String me203105;
    public String me203106;
    public String me203107;
    public String me203108;
    public String me203109;
    public String me203110;
    public String me203111;
    public String me203112;
    public String me203113;
    public String me203114;
    public String me203115;
    public String me203116;
    public String me203117;
    public String me203118;
    public String me203119;
    public String me203120;
    public String me203121;
    public String me203122;
    public String me203123;
    public String me203124;
    public String me203125;
    public String me203126;
    public String me203127;
    public String me203128;
    public String me203129;
    public String me203130;
    public String me203131;
    public String me203132;
    public String me203133;
    public String me203134;
    public String me203135;


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
    private String sB;


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


    public String getsB() {
        return sB;
    }

    public MobileHealth setsB(String sB) {
        this.sB = sB;
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
        this.sB = jsonObject.getString(MHContract.MHTable.COLUMN_SB);

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
        sBHydrate(cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SB)));

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
            json.put("ss107d", ss107d)
                    .put("ss107m", ss107m)
                    .put("ss107y", ss107y)
                    .put("ss108", ss108)
                    .put("ss109", ss109)
                    .put("ss110", ss110)
                    .put("ss11099", ss11099)
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
                    .put("pc20107", pc20107)
                    .put("pc20109", pc20109)
                    .put("pc20110", pc20110)
                    .put("pc20111", pc20111)
                    .put("pc20112", pc20112)
                    .put("pc20113", pc20113)
                    .put("pc20114", pc20114)
                    .put("pc20117", pc20117)
                    .put("pc20119", pc20119)
                    .put("pc20196", pc20196)
                    .put("pc20196x", pc20196x)
                    .put("pc20199", pc20199)
                    .put("di20201", di20201)
                    .put("di20203", di20203)
                    .put("di20205", di20205)
                    .put("di20209", di20209)
                    .put("di20210", di20210)
                    .put("di20211", di20211)
                    .put("di20216", di20216)
                    .put("di20219", di20219)
                    .put("di20296", di20296)
                    .put("di20296x", di20296x)
                    .put("di20299", di20299)
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
                    .put("vs308", vs308)
                    .put("ss110muac", ss110muac)
                    .put("ss110mm99", ss110mm99)
                    .put("ss110fosx", ss110fosx)
                    .put("ss110f99", ss110f99)
                    .put("ss110ghrx", ss110ghrx)
                    .put("ss110g99", ss110g99)
                    .put("vs306h", vs306h)
                    .put("pc20121", pc20121)
                    .put("pc20122", pc20122)
                    .put("pc20123", pc20123)
                    .put("pc20124", pc20124)
                    .put("pc20125", pc20125)
                    .put("pc20126", pc20126)
                    .put("pc20127", pc20127)
                    .put("pc20128", pc20128)
                    .put("pc20129", pc20129)
                    .put("pc20130", pc20130)
                    .put("pc20131", pc20131)
                    .put("pc20132", pc20132)
                    .put("pc20133", pc20133)
                    .put("pc20134", pc20134)
                    .put("pc20135", pc20135)
                    .put("pc20136", pc20136)
                    .put("di20221", di20221)
                    .put("di20222", di20222)
                    .put("di20223", di20223)
                    .put("di20224", di20224)
                    .put("di20225", di20225)
                    .put("di20226", di20226)
                    .put("di20227", di20227)
                    .put("di20228", di20228)
                    .put("di20229", di20229)
                    .put("di20230", di20230)
                    .put("di20231", di20231)
                    .put("di20232", di20232)
                    .put("di20233", di20233)
                    .put("di20234", di20234)
                    .put("di20235", di20235)
                    .put("di20236", di20236)
                    .put("di20237", di20237)
                    .put("di20238", di20238)
                    .put("di20239", di20239)
                    .put("di20240", di20240)
                    .put("di20241", di20241)
                    .put("di20242", di20242)
                    .put("di20243", di20243)
                    .put("di20244", di20244)
                    .put("di20245", di20245)
                    .put("di20246", di20246)
                    .put("di20247", di20247)
                    .put("di20248", di20248)
                    .put("di20249", di20249)
                    .put("di20250", di20250)
                    .put("di20251", di20251)
                    .put("di20252", di20252)
                    .put("di20253", di20253)
                    .put("di20254", di20254)
                    .put("di20255", di20255)
                    .put("di20256", di20256)
                    .put("di20257", di20257)
                    .put("di20258", di20258)
                    .put("di20259", di20259)
                    .put("di20260", di20260)
                    .put("di20261", di20261)
                    .put("di20262", di20262)
                    .put("di20263", di20263)
                    .put("di20264", di20264)
                    .put("di20265", di20265)
                    .put("di20266", di20266)
                    .put("di20267", di20267)
                    .put("di20268", di20268)
                    .put("di20269", di20269)
                    .put("di20270", di20270)
                    .put("di20271", di20271)
                    .put("di20272", di20272)
                    .put("di20273", di20273)
                    .put("di20274", di20274)
                    .put("di20275", di20275)
                    .put("di20276", di20276)
                    .put("di20277", di20277)
                    .put("di20278", di20278)
                    .put("di20279", di20279)
                    .put("di20280", di20280)
                    .put("di20281", di20281);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";

        }
        return json.toString();
    }

    public String sBtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("me20301", me20301)
                    .put("me20307", me20307)
                    .put("me20310", me20310)
                    .put("me20315", me20315)
                    .put("me20322", me20322)
                    .put("me20323", me20323)
                    .put("me20356", me20356)
                    .put("me20396", me20396)
                    .put("me20396x", me20396x)
                    .put("me20399", me20399)
                    .put("me203101", me203101)
                    .put("me203102", me203102)
                    .put("me203103", me203103)
                    .put("me203104", me203104)
                    .put("me203105", me203105)
                    .put("me203106", me203106)
                    .put("me203107", me203107)
                    .put("me203108", me203108)
                    .put("me203109", me203109)
                    .put("me203110", me203110)
                    .put("me203111", me203111)
                    .put("me203112", me203112)
                    .put("me203113", me203113)
                    .put("me203114", me203114)
                    .put("me203115", me203115)
                    .put("me203116", me203116)
                    .put("me203117", me203117)
                    .put("me203118", me203118)
                    .put("me203119", me203119)
                    .put("me203120", me203120)
                    .put("me203121", me203121)
                    .put("me203122", me203122)
                    .put("me203123", me203123)
                    .put("me203124", me203124)
                    .put("me203125", me203125)
                    .put("me203126", me203126)
                    .put("me203127", me203127)
                    .put("me203128", me203128)
                    .put("me203129", me203129)
                    .put("me203130", me203130)
                    .put("me203131", me203131)
                    .put("me203132", me203132)
                    .put("me203133", me203133)
                    .put("me203134", me203134)
                    .put("me203135", me203135)
                    .put("vs310", vs310);

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
        json.put(MHContract.MHTable.COLUMN_SB, new JSONObject(sBtoString()));

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
            this.ss107d = json.getString("ss107d");
            this.ss107m = json.getString("ss107m");
            this.ss107y = json.getString("ss107y");
            this.ss108 = json.getString("ss108");
            this.ss109 = json.getString("ss109");
            this.ss110 = json.getString("ss110");
            this.ss11099 = json.getString("ss11099");
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
            this.pc20107 = json.getString("pc20107");
            this.pc20109 = json.getString("pc20109");
            this.pc20110 = json.getString("pc20110");
            this.pc20111 = json.getString("pc20111");
            this.pc20112 = json.getString("pc20112");
            this.pc20113 = json.getString("pc20113");
            this.pc20114 = json.getString("pc20114");
            this.pc20117 = json.getString("pc20117");
            this.pc20119 = json.getString("pc20119");
            this.pc20196 = json.getString("pc20196");
            this.pc20196x = json.getString("pc20196x");
            this.pc20199 = json.getString("pc20199");
            this.di20201 = json.getString("di20201");
            this.di20203 = json.getString("di20203");
            this.di20205 = json.getString("di20205");
            this.di20209 = json.getString("di20209");
            this.di20210 = json.getString("di20210");
            this.di20211 = json.getString("di20211");
            this.di20216 = json.getString("di20216");
            this.di20219 = json.getString("di20219");
            this.di20296 = json.getString("di20296");
            this.di20296x = json.getString("di20296x");
            this.di20299 = json.getString("di20299");
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
            this.ss110muac = json.getString("ss110muac");
            this.ss110mm99 = json.getString("ss110mm99");
            this.ss110fosx = json.getString("ss110fosx");
            this.ss110f99 = json.getString("ss110f99");
            this.ss110ghrx = json.getString("ss110ghrx");
            this.ss110g99 = json.getString("ss110g99");
            this.vs306h = json.getString("vs306h");
            this.pc20121 = json.getString("pc20121");
            this.pc20122 = json.getString("pc20122");
            this.pc20123 = json.getString("pc20123");
            this.pc20124 = json.getString("pc20124");
            this.pc20125 = json.getString("pc20125");
            this.pc20126 = json.getString("pc20126");
            this.pc20127 = json.getString("pc20127");
            this.pc20128 = json.getString("pc20128");
            this.pc20129 = json.getString("pc20129");
            this.pc20130 = json.getString("pc20130");
            this.pc20131 = json.getString("pc20131");
            this.pc20132 = json.getString("pc20132");
            this.pc20133 = json.getString("pc20133");
            this.pc20134 = json.getString("pc20134");
            this.pc20135 = json.getString("pc20135");
            this.pc20136 = json.getString("pc20136");
            this.di20221 = json.getString("di20221");
            this.di20222 = json.getString("di20222");
            this.di20223 = json.getString("di20223");
            this.di20224 = json.getString("di20224");
            this.di20225 = json.getString("di20225");
            this.di20226 = json.getString("di20226");
            this.di20227 = json.getString("di20227");
            this.di20228 = json.getString("di20228");
            this.di20229 = json.getString("di20229");
            this.di20230 = json.getString("di20230");
            this.di20231 = json.getString("di20231");
            this.di20232 = json.getString("di20232");
            this.di20233 = json.getString("di20233");
            this.di20234 = json.getString("di20234");
            this.di20235 = json.getString("di20235");
            this.di20236 = json.getString("di20236");
            this.di20237 = json.getString("di20237");
            this.di20238 = json.getString("di20238");
            this.di20239 = json.getString("di20239");
            this.di20240 = json.getString("di20240");
            this.di20241 = json.getString("di20241");
            this.di20242 = json.getString("di20242");
            this.di20243 = json.getString("di20243");
            this.di20244 = json.getString("di20244");
            this.di20245 = json.getString("di20245");
            this.di20246 = json.getString("di20246");
            this.di20247 = json.getString("di20247");
            this.di20248 = json.getString("di20248");
            this.di20249 = json.getString("di20249");
            this.di20250 = json.getString("di20250");
            this.di20251 = json.getString("di20251");
            this.di20252 = json.getString("di20252");
            this.di20253 = json.getString("di20253");
            this.di20254 = json.getString("di20254");
            this.di20255 = json.getString("di20255");
            this.di20256 = json.getString("di20256");
            this.di20257 = json.getString("di20257");
            this.di20258 = json.getString("di20258");
            this.di20259 = json.getString("di20259");
            this.di20260 = json.getString("di20260");
            this.di20261 = json.getString("di20261");
            this.di20262 = json.getString("di20262");
            this.di20263 = json.getString("di20263");
            this.di20264 = json.getString("di20264");
            this.di20265 = json.getString("di20265");
            this.di20266 = json.getString("di20266");
            this.di20267 = json.getString("di20267");
            this.di20268 = json.getString("di20268");
            this.di20269 = json.getString("di20269");
            this.di20270 = json.getString("di20270");
            this.di20271 = json.getString("di20271");
            this.di20272 = json.getString("di20272");
            this.di20273 = json.getString("di20273");
            this.di20274 = json.getString("di20274");
            this.di20275 = json.getString("di20275");
            this.di20276 = json.getString("di20276");
            this.di20277 = json.getString("di20277");
            this.di20278 = json.getString("di20278");
            this.di20279 = json.getString("di20279");
            this.di20280 = json.getString("di20280");
            this.di20281 = json.getString("di20281");


        }
    }


    public void sBHydrate(String string) throws JSONException {
        Log.d("sBHydrate", "string: " + string);

        if (string != null) {


            JSONObject json = null;
            json = new JSONObject(string);
            this.me20301 = json.has("me20301") ? json.getString("me20301") : "";
            this.me20307 = json.has("me20307") ? json.getString("me20307") : "";
            this.me20310 = json.has("me20310") ? json.getString("me20310") : "";
            this.me20315 = json.has("me20315") ? json.getString("me20315") : "";
            this.me20322 = json.has("me20322") ? json.getString("me20322") : "";
            this.me20323 = json.has("me20323") ? json.getString("me20323") : "";
            this.me20356 = json.has("me20356") ? json.getString("me20356") : "";
            this.me20396 = json.has("me20396") ? json.getString("me20396") : "";
            this.me20396x = json.has("me20396x") ? json.getString("me20396x") : "";
            this.me20399 = json.has("me20399") ? json.getString("me20399") : "";
            this.me203101 = json.has("me203101") ? json.getString("me203101") : "";
            this.me203102 = json.has("me203102") ? json.getString("me203102") : "";
            this.me203103 = json.has("me203103") ? json.getString("me203103") : "";
            this.me203104 = json.has("me203104") ? json.getString("me203104") : "";
            this.me203105 = json.has("me203105") ? json.getString("me203105") : "";
            this.me203106 = json.has("me203106") ? json.getString("me203106") : "";
            this.me203107 = json.has("me203107") ? json.getString("me203107") : "";
            this.me203108 = json.has("me203108") ? json.getString("me203108") : "";
            this.me203109 = json.has("me203109") ? json.getString("me203109") : "";
            this.me203110 = json.has("me203110") ? json.getString("me203110") : "";
            this.me203111 = json.has("me203111") ? json.getString("me203111") : "";
            this.me203112 = json.has("me203112") ? json.getString("me203112") : "";
            this.me203113 = json.has("me203113") ? json.getString("me203113") : "";
            this.me203114 = json.has("me203114") ? json.getString("me203114") : "";
            this.me203115 = json.has("me203115") ? json.getString("me203115") : "";
            this.me203116 = json.has("me203116") ? json.getString("me203116") : "";
            this.me203117 = json.has("me203117") ? json.getString("me203117") : "";
            this.me203118 = json.has("me203118") ? json.getString("me203118") : "";
            this.me203119 = json.has("me203119") ? json.getString("me203119") : "";
            this.me203120 = json.has("me203120") ? json.getString("me203120") : "";
            this.me203121 = json.has("me203121") ? json.getString("me203121") : "";
            this.me203122 = json.has("me203122") ? json.getString("me203122") : "";
            this.me203123 = json.has("me203123") ? json.getString("me203123") : "";
            this.me203124 = json.has("me203124") ? json.getString("me203124") : "";
            this.me203125 = json.has("me203125") ? json.getString("me203125") : "";
            this.me203126 = json.has("me203126") ? json.getString("me203126") : "";
            this.me203127 = json.has("me203127") ? json.getString("me203127") : "";
            this.me203128 = json.has("me203128") ? json.getString("me203128") : "";
            this.me203129 = json.has("me203129") ? json.getString("me203129") : "";
            this.me203130 = json.has("me203130") ? json.getString("me203130") : "";
            this.me203131 = json.has("me203131") ? json.getString("me203131") : "";
            this.me203132 = json.has("me203132") ? json.getString("me203132") : "";
            this.me203133 = json.has("me203133") ? json.getString("me203133") : "";
            this.me203134 = json.has("me203134") ? json.getString("me203134") : "";
            this.me203135 = json.has("me203135") ? json.getString("me203135") : "";
            this.vs310 = json.has("vs310") ? json.getString("vs310") : "";
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
    public String getSs11099() {
        return ss11099;
    }

    public void setSs11099(String ss11099) {
        this.ss11099 = ss11099;
        notifyPropertyChanged(BR.ss11099);
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


    @Bindable
    public String getSs110muac() {
        return ss110muac;
    }

    public void setSs110muac(String ss110muac) {
        this.ss110muac = ss110muac;
        notifyPropertyChanged(BR.ss110muac);
    }

    @Bindable
    public String getSs110mm99() {
        return ss110mm99;
    }

    public void setSs110mm99(String ss110mm99) {
        this.ss110mm99 = ss110mm99;
        notifyPropertyChanged(BR.ss110mm99);
    }

    @Bindable
    public String getSs110fosx() {
        return ss110fosx;
    }

    public void setSs110fosx(String ss110fosx) {
        this.ss110fosx = ss110fosx;
        notifyPropertyChanged(BR.ss110fosx);
    }

    @Bindable
    public String getSs110f99() {
        return ss110f99;
    }

    public void setSs110f99(String ss110f99) {
        this.ss110f99 = ss110f99;
        notifyPropertyChanged(BR.ss110f99);
    }

    @Bindable
    public String getSs110ghrx() {
        return ss110ghrx;
    }

    public void setSs110ghrx(String ss110ghrx) {
        this.ss110ghrx = ss110ghrx;
        notifyPropertyChanged(BR.ss110ghrx);
    }

    @Bindable
    public String getSs110g99() {
        return ss110g99;
    }

    public void setSs110g99(String ss110g99) {
        this.ss110g99 = ss110g99;
        notifyPropertyChanged(BR.ss110g99);
    }

    @Bindable
    public String getVs306h() {
        return vs306h;
    }

    public void setVs306h(String vs306h) {
        this.vs306h = vs306h;
        notifyPropertyChanged(BR.vs306h);
    }

    @Bindable
    public String getVs310() {
        return vs310;
    }

    public void setVs310(String vs310) {
        this.vs310 = vs310;
        notifyPropertyChanged(BR.vs310);
    }

    @Bindable
    public String getPc20121() {
        return pc20121;
    }

    public void setPc20121(String pc20121) {
        this.pc20121 = pc20121;
        notifyPropertyChanged(BR.pc20121);
    }

    @Bindable
    public String getPc20122() {
        return pc20122;
    }

    public void setPc20122(String pc20122) {
        this.pc20122 = pc20122;
        notifyPropertyChanged(BR.pc20122);
    }

    @Bindable
    public String getPc20123() {
        return pc20123;
    }

    public void setPc20123(String pc20123) {
        this.pc20123 = pc20123;
        notifyPropertyChanged(BR.pc20123);
    }

    @Bindable
    public String getPc20124() {
        return pc20124;
    }

    public void setPc20124(String pc20124) {
        this.pc20124 = pc20124;
        notifyPropertyChanged(BR.pc20124);
    }

    @Bindable
    public String getPc20125() {
        return pc20125;
    }

    public void setPc20125(String pc20125) {
        this.pc20125 = pc20125;
        notifyPropertyChanged(BR.pc20125);
    }

    @Bindable
    public String getPc20126() {
        return pc20126;
    }

    public void setPc20126(String pc20126) {
        this.pc20126 = pc20126;
        notifyPropertyChanged(BR.pc20126);
    }

    @Bindable
    public String getPc20127() {
        return pc20127;
    }

    public void setPc20127(String pc20127) {
        this.pc20127 = pc20127;
        notifyPropertyChanged(BR.pc20127);
    }

    @Bindable
    public String getPc20128() {
        return pc20128;
    }

    public void setPc20128(String pc20128) {
        this.pc20128 = pc20128;
        notifyPropertyChanged(BR.pc20128);
    }

    @Bindable
    public String getPc20129() {
        return pc20129;
    }

    public void setPc20129(String pc20129) {
        this.pc20129 = pc20129;
        notifyPropertyChanged(BR.pc20129);
    }

    @Bindable
    public String getPc20130() {
        return pc20130;
    }

    public void setPc20130(String pc20130) {
        this.pc20130 = pc20130;
        notifyPropertyChanged(BR.pc20130);
    }

    @Bindable
    public String getPc20131() {
        return pc20131;
    }

    public void setPc20131(String pc20131) {
        this.pc20131 = pc20131;
        notifyPropertyChanged(BR.pc20131);
    }

    @Bindable
    public String getPc20132() {
        return pc20132;
    }

    public void setPc20132(String pc20132) {
        this.pc20132 = pc20132;
        notifyPropertyChanged(BR.pc20132);
    }

    @Bindable
    public String getPc20133() {
        return pc20133;
    }

    public void setPc20133(String pc20133) {
        this.pc20133 = pc20133;
        notifyPropertyChanged(BR.pc20133);
    }

    @Bindable
    public String getPc20134() {
        return pc20134;
    }

    public void setPc20134(String pc20134) {
        this.pc20134 = pc20134;
        notifyPropertyChanged(BR.pc20134);
    }

    @Bindable
    public String getPc20135() {
        return pc20135;
    }

    public void setPc20135(String pc20135) {
        this.pc20135 = pc20135;
        notifyPropertyChanged(BR.pc20135);
    }

    @Bindable
    public String getPc20136() {
        return pc20136;
    }

    public void setPc20136(String pc20136) {
        this.pc20136 = pc20136;
        notifyPropertyChanged(BR.pc20136);
    }

    @Bindable
    public String getDi20221() {
        return di20221;
    }

    public void setDi20221(String di20221) {
        this.di20221 = di20221;
        notifyPropertyChanged(BR.di20221);
    }

    @Bindable
    public String getDi20222() {
        return di20222;
    }

    public void setDi20222(String di20222) {
        this.di20222 = di20222;
        notifyPropertyChanged(BR.di20222);
    }

    @Bindable
    public String getDi20223() {
        return di20223;
    }

    public void setDi20223(String di20223) {
        this.di20223 = di20223;
        notifyPropertyChanged(BR.di20223);
    }

    @Bindable
    public String getDi20224() {
        return di20224;
    }

    public void setDi20224(String di20224) {
        this.di20224 = di20224;
        notifyPropertyChanged(BR.di20224);
    }

    @Bindable
    public String getDi20225() {
        return di20225;
    }

    public void setDi20225(String di20225) {
        this.di20225 = di20225;
        notifyPropertyChanged(BR.di20225);
    }

    @Bindable
    public String getDi20226() {
        return di20226;
    }

    public void setDi20226(String di20226) {
        this.di20226 = di20226;
        notifyPropertyChanged(BR.di20226);
    }

    @Bindable
    public String getDi20227() {
        return di20227;
    }

    public void setDi20227(String di20227) {
        this.di20227 = di20227;
        notifyPropertyChanged(BR.di20227);
    }

    @Bindable
    public String getDi20228() {
        return di20228;
    }

    public void setDi20228(String di20228) {
        this.di20228 = di20228;
        notifyPropertyChanged(BR.di20228);
    }

    @Bindable
    public String getDi20229() {
        return di20229;
    }

    public void setDi20229(String di20229) {
        this.di20229 = di20229;
        notifyPropertyChanged(BR.di20229);
    }

    @Bindable
    public String getDi20230() {
        return di20230;
    }

    public void setDi20230(String di20230) {
        this.di20230 = di20230;
        notifyPropertyChanged(BR.di20230);
    }

    @Bindable
    public String getDi20231() {
        return di20231;
    }

    public void setDi20231(String di20231) {
        this.di20231 = di20231;
        notifyPropertyChanged(BR.di20231);
    }

    @Bindable
    public String getDi20232() {
        return di20232;
    }

    public void setDi20232(String di20232) {
        this.di20232 = di20232;
        notifyPropertyChanged(BR.di20232);
    }

    @Bindable
    public String getDi20233() {
        return di20233;
    }

    public void setDi20233(String di20233) {
        this.di20233 = di20233;
        notifyPropertyChanged(BR.di20233);
    }

    @Bindable
    public String getDi20234() {
        return di20234;
    }

    public void setDi20234(String di20234) {
        this.di20234 = di20234;
        notifyPropertyChanged(BR.di20234);
    }

    @Bindable
    public String getDi20235() {
        return di20235;
    }

    public void setDi20235(String di20235) {
        this.di20235 = di20235;
        notifyPropertyChanged(BR.di20235);
    }

    @Bindable
    public String getDi20236() {
        return di20236;
    }

    public void setDi20236(String di20236) {
        this.di20236 = di20236;
        notifyPropertyChanged(BR.di20236);
    }

    @Bindable
    public String getDi20237() {
        return di20237;
    }

    public void setDi20237(String di20237) {
        this.di20237 = di20237;
        notifyPropertyChanged(BR.di20237);
    }

    @Bindable
    public String getDi20238() {
        return di20238;
    }

    public void setDi20238(String di20238) {
        this.di20238 = di20238;
        notifyPropertyChanged(BR.di20238);
    }

    @Bindable
    public String getDi20239() {
        return di20239;
    }

    public void setDi20239(String di20239) {
        this.di20239 = di20239;
        notifyPropertyChanged(BR.di20239);
    }

    @Bindable
    public String getDi20240() {
        return di20240;
    }

    public void setDi20240(String di20240) {
        this.di20240 = di20240;
        notifyPropertyChanged(BR.di20240);
    }

    @Bindable
    public String getDi20241() {
        return di20241;
    }

    public void setDi20241(String di20241) {
        this.di20241 = di20241;
        notifyPropertyChanged(BR.di20241);
    }

    @Bindable
    public String getDi20242() {
        return di20242;
    }

    public void setDi20242(String di20242) {
        this.di20242 = di20242;
        notifyPropertyChanged(BR.di20242);
    }

    @Bindable
    public String getDi20243() {
        return di20243;
    }

    public void setDi20243(String di20243) {
        this.di20243 = di20243;
        notifyPropertyChanged(BR.di20243);
    }

    @Bindable
    public String getDi20244() {
        return di20244;
    }

    public void setDi20244(String di20244) {
        this.di20244 = di20244;
        notifyPropertyChanged(BR.di20244);
    }

    @Bindable
    public String getDi20245() {
        return di20245;
    }

    public void setDi20245(String di20245) {
        this.di20245 = di20245;
        notifyPropertyChanged(BR.di20245);
    }

    @Bindable
    public String getDi20246() {
        return di20246;
    }

    public void setDi20246(String di20246) {
        this.di20246 = di20246;
        notifyPropertyChanged(BR.di20246);
    }

    @Bindable
    public String getDi20247() {
        return di20247;
    }

    public void setDi20247(String di20247) {
        this.di20247 = di20247;
        notifyPropertyChanged(BR.di20247);
    }

    @Bindable
    public String getDi20248() {
        return di20248;
    }

    public void setDi20248(String di20248) {
        this.di20248 = di20248;
        notifyPropertyChanged(BR.di20248);
    }

    @Bindable
    public String getDi20249() {
        return di20249;
    }

    public void setDi20249(String di20249) {
        this.di20249 = di20249;
        notifyPropertyChanged(BR.di20249);
    }

    @Bindable
    public String getDi20250() {
        return di20250;
    }

    public void setDi20250(String di20250) {
        this.di20250 = di20250;
        notifyPropertyChanged(BR.di20250);
    }

    @Bindable
    public String getDi20251() {
        return di20251;
    }

    public void setDi20251(String di20251) {
        this.di20251 = di20251;
        notifyPropertyChanged(BR.di20251);
    }

    @Bindable
    public String getDi20252() {
        return di20252;
    }

    public void setDi20252(String di20252) {
        this.di20252 = di20252;
        notifyPropertyChanged(BR.di20252);
    }

    @Bindable
    public String getDi20253() {
        return di20253;
    }

    public void setDi20253(String di20253) {
        this.di20253 = di20253;
        notifyPropertyChanged(BR.di20253);
    }

    @Bindable
    public String getDi20254() {
        return di20254;
    }

    public void setDi20254(String di20254) {
        this.di20254 = di20254;
        notifyPropertyChanged(BR.di20254);
    }

    @Bindable
    public String getDi20255() {
        return di20255;
    }

    public void setDi20255(String di20255) {
        this.di20255 = di20255;
        notifyPropertyChanged(BR.di20255);
    }

    @Bindable
    public String getDi20256() {
        return di20256;
    }

    public void setDi20256(String di20256) {
        this.di20256 = di20256;
        notifyPropertyChanged(BR.di20256);
    }

    @Bindable
    public String getDi20257() {
        return di20257;
    }

    public void setDi20257(String di20257) {
        this.di20257 = di20257;
        notifyPropertyChanged(BR.di20257);
    }

    @Bindable
    public String getDi20258() {
        return di20258;
    }

    public void setDi20258(String di20258) {
        this.di20258 = di20258;
        notifyPropertyChanged(BR.di20258);
    }

    @Bindable
    public String getDi20259() {
        return di20259;
    }

    public void setDi20259(String di20259) {
        this.di20259 = di20259;
        notifyPropertyChanged(BR.di20259);
    }

    @Bindable
    public String getDi20260() {
        return di20260;
    }

    public void setDi20260(String di20260) {
        this.di20260 = di20260;
        notifyPropertyChanged(BR.di20260);
    }

    @Bindable
    public String getDi20261() {
        return di20261;
    }

    public void setDi20261(String di20261) {
        this.di20261 = di20261;
        notifyPropertyChanged(BR.di20261);
    }

    @Bindable
    public String getDi20262() {
        return di20262;
    }

    public void setDi20262(String di20262) {
        this.di20262 = di20262;
        notifyPropertyChanged(BR.di20262);
    }

    @Bindable
    public String getDi20263() {
        return di20263;
    }

    public void setDi20263(String di20263) {
        this.di20263 = di20263;
        notifyPropertyChanged(BR.di20263);
    }

    @Bindable
    public String getDi20264() {
        return di20264;
    }

    public void setDi20264(String di20264) {
        this.di20264 = di20264;
        notifyPropertyChanged(BR.di20264);
    }

    @Bindable
    public String getDi20265() {
        return di20265;
    }

    public void setDi20265(String di20265) {
        this.di20265 = di20265;
        notifyPropertyChanged(BR.di20265);
    }

    @Bindable
    public String getDi20266() {
        return di20266;
    }

    public void setDi20266(String di20266) {
        this.di20266 = di20266;
        notifyPropertyChanged(BR.di20266);
    }

    @Bindable
    public String getDi20267() {
        return di20267;
    }

    public void setDi20267(String di20267) {
        this.di20267 = di20267;
        notifyPropertyChanged(BR.di20267);
    }

    @Bindable
    public String getDi20268() {
        return di20268;
    }

    public void setDi20268(String di20268) {
        this.di20268 = di20268;
        notifyPropertyChanged(BR.di20268);
    }

    @Bindable
    public String getDi20269() {
        return di20269;
    }

    public void setDi20269(String di20269) {
        this.di20269 = di20269;
        notifyPropertyChanged(BR.di20269);
    }

    @Bindable
    public String getDi20270() {
        return di20270;
    }

    public void setDi20270(String di20270) {
        this.di20270 = di20270;
        notifyPropertyChanged(BR.di20270);
    }

    @Bindable
    public String getDi20271() {
        return di20271;
    }

    public void setDi20271(String di20271) {
        this.di20271 = di20271;
        notifyPropertyChanged(BR.di20271);
    }

    @Bindable
    public String getDi20272() {
        return di20272;
    }

    public void setDi20272(String di20272) {
        this.di20272 = di20272;
        notifyPropertyChanged(BR.di20272);
    }

    @Bindable
    public String getDi20273() {
        return di20273;
    }

    public void setDi20273(String di20273) {
        this.di20273 = di20273;
        notifyPropertyChanged(BR.di20273);
    }

    @Bindable
    public String getDi20274() {
        return di20274;
    }

    public void setDi20274(String di20274) {
        this.di20274 = di20274;
        notifyPropertyChanged(BR.di20274);
    }

    @Bindable
    public String getDi20275() {
        return di20275;
    }

    public void setDi20275(String di20275) {
        this.di20275 = di20275;
        notifyPropertyChanged(BR.di20275);
    }

    @Bindable
    public String getDi20276() {
        return di20276;
    }

    public void setDi20276(String di20276) {
        this.di20276 = di20276;
        notifyPropertyChanged(BR.di20276);
    }

    @Bindable
    public String getDi20277() {
        return di20277;
    }

    public void setDi20277(String di20277) {
        this.di20277 = di20277;
        notifyPropertyChanged(BR.di20277);
    }

    @Bindable
    public String getDi20278() {
        return di20278;
    }

    public void setDi20278(String di20278) {
        this.di20278 = di20278;
        notifyPropertyChanged(BR.di20278);
    }

    @Bindable
    public String getDi20279() {
        return di20279;
    }

    public void setDi20279(String di20279) {
        this.di20279 = di20279;
        notifyPropertyChanged(BR.di20279);
    }

    @Bindable
    public String getDi20280() {
        return di20280;
    }

    public void setDi20280(String di20280) {
        this.di20280 = di20280;
        notifyPropertyChanged(BR.di20280);
    }

    @Bindable
    public String getDi20281() {
        return di20281;
    }

    public void setDi20281(String di20281) {
        this.di20281 = di20281;
        notifyPropertyChanged(BR.di20281);
    }

    @Bindable
    public String getMe203101() {
        return me203101;
    }

    public void setMe203101(String me203101) {
        this.me203101 = me203101;
        notifyPropertyChanged(BR.me203101);
    }

    @Bindable
    public String getMe203102() {
        return me203102;
    }

    public void setMe203102(String me203102) {
        this.me203102 = me203102;
        notifyPropertyChanged(BR.me203102);
    }

    @Bindable
    public String getMe203103() {
        return me203103;
    }

    public void setMe203103(String me203103) {
        this.me203103 = me203103;
        notifyPropertyChanged(BR.me203103);
    }

    @Bindable
    public String getMe203104() {
        return me203104;
    }

    public void setMe203104(String me203104) {
        this.me203104 = me203104;
        notifyPropertyChanged(BR.me203104);
    }

    @Bindable
    public String getMe203105() {
        return me203105;
    }

    public void setMe203105(String me203105) {
        this.me203105 = me203105;
        notifyPropertyChanged(BR.me203105);
    }

    @Bindable
    public String getMe203106() {
        return me203106;
    }

    public void setMe203106(String me203106) {
        this.me203106 = me203106;
        notifyPropertyChanged(BR.me203106);
    }

    @Bindable
    public String getMe203107() {
        return me203107;
    }

    public void setMe203107(String me203107) {
        this.me203107 = me203107;
        notifyPropertyChanged(BR.me203107);
    }

    @Bindable
    public String getMe203108() {
        return me203108;
    }

    public void setMe203108(String me203108) {
        this.me203108 = me203108;
        notifyPropertyChanged(BR.me203108);
    }

    @Bindable
    public String getMe203109() {
        return me203109;
    }

    public void setMe203109(String me203109) {
        this.me203109 = me203109;
        notifyPropertyChanged(BR.me203109);
    }

    @Bindable
    public String getMe203110() {
        return me203110;
    }

    public void setMe203110(String me203110) {
        this.me203110 = me203110;
        notifyPropertyChanged(BR.me203110);
    }

    @Bindable
    public String getMe203111() {
        return me203111;
    }

    public void setMe203111(String me203111) {
        this.me203111 = me203111;
        notifyPropertyChanged(BR.me203111);
    }

    @Bindable
    public String getMe203112() {
        return me203112;
    }

    public void setMe203112(String me203112) {
        this.me203112 = me203112;
        notifyPropertyChanged(BR.me203112);
    }

    @Bindable
    public String getMe203113() {
        return me203113;
    }

    public void setMe203113(String me203113) {
        this.me203113 = me203113;
        notifyPropertyChanged(BR.me203113);
    }

    @Bindable
    public String getMe203114() {
        return me203114;
    }

    public void setMe203114(String me203114) {
        this.me203114 = me203114;
        notifyPropertyChanged(BR.me203114);
    }

    @Bindable
    public String getMe203115() {
        return me203115;
    }

    public void setMe203115(String me203115) {
        this.me203115 = me203115;
        notifyPropertyChanged(BR.me203115);
    }

    @Bindable
    public String getMe203116() {
        return me203116;
    }

    public void setMe203116(String me203116) {
        this.me203116 = me203116;
        notifyPropertyChanged(BR.me203116);
    }

    @Bindable
    public String getMe203117() {
        return me203117;
    }

    public void setMe203117(String me203117) {
        this.me203117 = me203117;
        notifyPropertyChanged(BR.me203117);
    }

    @Bindable
    public String getMe203118() {
        return me203118;
    }

    public void setMe203118(String me203118) {
        this.me203118 = me203118;
        notifyPropertyChanged(BR.me203118);
    }

    @Bindable
    public String getMe203119() {
        return me203119;
    }

    public void setMe203119(String me203119) {
        this.me203119 = me203119;
        notifyPropertyChanged(BR.me203119);
    }

    @Bindable
    public String getMe203120() {
        return me203120;
    }

    public void setMe203120(String me203120) {
        this.me203120 = me203120;
        notifyPropertyChanged(BR.me203120);
    }

    @Bindable
    public String getMe203121() {
        return me203121;
    }

    public void setMe203121(String me203121) {
        this.me203121 = me203121;
        notifyPropertyChanged(BR.me203121);
    }

    @Bindable
    public String getMe203122() {
        return me203122;
    }

    public void setMe203122(String me203122) {
        this.me203122 = me203122;
        notifyPropertyChanged(BR.me203122);
    }

    @Bindable
    public String getMe203123() {
        return me203123;
    }

    public void setMe203123(String me203123) {
        this.me203123 = me203123;
        notifyPropertyChanged(BR.me203123);
    }

    @Bindable
    public String getMe203124() {
        return me203124;
    }

    public void setMe203124(String me203124) {
        this.me203124 = me203124;
        notifyPropertyChanged(BR.me203124);
    }

    @Bindable
    public String getMe203125() {
        return me203125;
    }

    public void setMe203125(String me203125) {
        this.me203125 = me203125;
        notifyPropertyChanged(BR.me203125);
    }

    @Bindable
    public String getMe203126() {
        return me203126;
    }

    public void setMe203126(String me203126) {
        this.me203126 = me203126;
        notifyPropertyChanged(BR.me203126);
    }

    @Bindable
    public String getMe203127() {
        return me203127;
    }

    public void setMe203127(String me203127) {
        this.me203127 = me203127;
        notifyPropertyChanged(BR.me203127);
    }

    @Bindable
    public String getMe203128() {
        return me203128;
    }

    public void setMe203128(String me203128) {
        this.me203128 = me203128;
        notifyPropertyChanged(BR.me203128);
    }

    @Bindable
    public String getMe203129() {
        return me203129;
    }

    public void setMe203129(String me203129) {
        this.me203129 = me203129;
        notifyPropertyChanged(BR.me203129);
    }

    @Bindable
    public String getMe203130() {
        return me203130;
    }

    public void setMe203130(String me203130) {
        this.me203130 = me203130;
        notifyPropertyChanged(BR.me203130);
    }

    @Bindable
    public String getMe203131() {
        return me203131;
    }

    public void setMe203131(String me203131) {
        this.me203131 = me203131;
        notifyPropertyChanged(BR.me203131);
    }

    @Bindable
    public String getMe203132() {
        return me203132;
    }

    public void setMe203132(String me203132) {
        this.me203132 = me203132;
        notifyPropertyChanged(BR.me203132);
    }

    @Bindable
    public String getMe203133() {
        return me203133;
    }

    public void setMe203133(String me203133) {
        this.me203133 = me203133;
        notifyPropertyChanged(BR.me203133);
    }

    @Bindable
    public String getMe203134() {
        return me203134;
    }

    public void setMe203134(String me203134) {
        this.me203134 = me203134;
        notifyPropertyChanged(BR.me203134);
    }

    @Bindable
    public String getMe203135() {
        return me203135;
    }

    public void setMe203135(String me203135) {
        this.me203135 = me203135;
        notifyPropertyChanged(BR.me203135);
    }
}
