package com.tunahankarakok.tasit;

import com.tunahankarakok.base.Arac;
import com.tunahankarakok.impl.Kanun;
import com.tunahankarakok.impl.UlastirmaDairesi;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class Taksi extends Arac implements Kanun, UlastirmaDairesi {
    @Override
    public int hizSiniri() {
        return 120;
    }

    @Override
    public String bakimDurumu() {
        return "Haziran";
    }

    @Override
    public int Tasitvergisi() {
        return 1_000;
    }

    @Override
    public boolean ruhsatDurumu(Boolean durum) {
        return durum;
    }

    @Override
    public Boolean ehliyetGecerlilikDurumu(boolean durum) {
        return durum;
    }
}
/*
import com.tunahankarakok.base.Arac;
import com.tunahankarakok.impl.Kanun;
import com.tunahankarakok.impl.UlastirmaDairesi;
import lombok.*;

@Setter
@Getter
@ToString(callSuper = true)
public class Taksi extends Arac implements Kanun, UlastirmaDairesi {
    @Override
    public int hizSiniri() {
        return 120;
    }

    @Override
    public String bakimDurumu() {
        return "Haziran";
    }

    @Override
    public int tasitVergi() {
        return 1_000;
    }


    @Override
    public Boolean ruhsatDurumu(Boolean durum) {
        return durum;
    }

    @Override
    public Boolean ehliyetDurumu(Boolean durum) {
        return durum;
    }
}*/