package com.samuelerwardi.app.Model;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by samuelerwardi on 7/17/17.
 */
public class GetKontak {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    List<Kontak> listDataKontak;
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
    public List<Kontak> getListDataKontak() {
        return listDataKontak;
    }
    public void setListDataKontak(List<Kontak> listDataKontak) {
        this.listDataKontak = listDataKontak;
    }
}
