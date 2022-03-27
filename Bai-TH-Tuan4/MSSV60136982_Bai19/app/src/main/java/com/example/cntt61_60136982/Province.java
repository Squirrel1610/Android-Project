package com.example.cntt61_60136982;

public class Province {
    String provinceName;
    String icon;

    public Province(String icon, String provinceName){
        this.icon = icon;
        this.provinceName = provinceName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return this.provinceName;
    }
}
