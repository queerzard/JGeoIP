package com.github.sebyplays.jgeo;

import com.github.sebyplays.jgeo.api.IGeoServiceProvider;
import com.github.sebyplays.jgeo.utils.dgsp.IPApi2DGSP;
import lombok.Getter;
import org.json.JSONObject;

import java.util.Arrays;

public class JGeo {

    @Getter private IGeoServiceProvider details;
    public JGeo(IGeoServiceProvider iGeoServiceProvider){
        this.details = iGeoServiceProvider;
    }

    public JGeo(){

    }

    public static void main(String[] args) {
        JGeo jGeo = new JGeo(new IPApi2DGSP("91.2.225.225"));
        System.out.println(Arrays.toString(jGeo.getDetails().getDataArray()));
    }


}
