package com.digital_nomads.zharkyn.map1;
import java.util.Map;

public class MapBully {
    /*Измените и верните данную карту следующим образом: если ключ «a» имеет значение,
    установите для ключа «b» это значение и установите для ключа «a» значение «».
    По сути, «b» — это хулиган, берущий значение и заменяющий его пустой строкой.*/

    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
}
