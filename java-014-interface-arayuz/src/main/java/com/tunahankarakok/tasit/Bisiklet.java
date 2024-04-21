package com.tunahankarakok.tasit;

import com.tunahankarakok.impl.Kanun;
import com.tunahankarakok.base.Arac;
import lombok.*;

@Setter
@Getter

@ToString(callSuper = true)
public class Bisiklet extends Arac implements Kanun {
    @Override
    public int hizSiniri() {
        return 30;
    }

    @Override
    public String bakimDurumu() {
        return "Mart";
    }

    @Override
    public int Tasitvergisi() {
        return 0;
    }


}
