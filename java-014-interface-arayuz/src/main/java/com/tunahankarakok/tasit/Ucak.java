package com.tunahankarakok.tasit;

import com.tunahankarakok.impl.HavacilikDernegi;
import com.tunahankarakok.impl.Kanun;
import com.tunahankarakok.base.Arac;
import lombok.*;

@Setter
@Getter

@ToString(callSuper = true)

public class Ucak extends Arac implements Kanun, HavacilikDernegi {
    @Override
    public int hizSiniri() {
        return 35_000;
    }

    @Override
    public String bakimDurumu() {
        return "Haftalık";
    }

    @Override
    public int Tasitvergisi() {
        return 18000;
    }

    @Override
    public boolean dernekUyeDurumu() {
        return true;
    }

    @Override
    public int aidat() {
        return 2_000;
    }

    @Override
    public boolean vizeDurumu() {
        return true;
    }

    @Override
    public int yolcuKapasitesi() {
        return 200;
    }
}
