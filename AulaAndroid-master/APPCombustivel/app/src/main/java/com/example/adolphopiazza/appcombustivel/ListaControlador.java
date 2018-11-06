package com.example.adolphopiazza.appcombustivel;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by 5103789 on 27-Nov-17.
 */

public class ListaControlador {

    static private RealmResults <Abastecimento> lista;

    private ListaControlador() {}

    public static void AdicionarAbastecimento (Abastecimento ab) {
        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        Abastecimento abastc = realm.createObject(Abastecimento.class);
        abastc.setData(ab.getData());
        abastc.setKilometros(ab.getKilometros());
        abastc.setLitros(ab.getLitros());
        abastc.setPosto(ab.getPosto());
        realm.copyFromRealm(abastc);
        realm.commitTransaction();
    }

    public static RealmResults <Abastecimento> getLista() {
        Realm realm = Realm.getDefaultInstance();
        lista = realm.where(Abastecimento.class).findAll();
        return lista;
    }
}
