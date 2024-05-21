package com.digital_nomads.zharkyn.map1;

import java.util.Map;

public class MapShare {

    /* Измените и верните данную карту следующим образом: если ключ «a» имеет значение,
       установите для ключа «b» то же самое значение. Во всех случаях уберите ключ «c»,
       оставив остальную часть карты без изменений.*/

    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("c")) {
            map.remove("c");
        }

        if (map.containsKey("a")){
            map.put("b", map.get("a"));
        }
        return map;
    }
}
