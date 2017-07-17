package com.samuelerwardi.app.Model;
import com.google.gson.annotations.SerializedName;
/**
 * Created by samuelerwardi on 7/17/17.
 */
public class PostPutDelKontak {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    Kontak mKontak;
    @SerializedName("message")
    String message;
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Kontak getKontak() {
        return mKontak;
    }
    public void setKontak(Kontak Kontak) {
        mKontak = Kontak;
    }
}
