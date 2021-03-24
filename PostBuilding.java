package kz.nova.kazpostparser.models;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"newZipCode",
        "regionCode",
        "regionName",
        "regionId",
        "districtName",
        "districtId",
        "cityName",
        "cityId",
        "cityDistrictName",
        "cityDistrictId",
        "cityMicrodistrictName",
        "cityMicrodistrictId",
        "streetName",
        "streetId",
        "buildingName",
        "regionNameKz",
        "districtNameKz",
        "cityNameKz",
        "cityDistrictNameKz",
        "cityMicrodistrictNameKz",
        "streetNameKz",
        "buildingNameKz",
        "oldZipCode"})
public class PostBuilding {

    private String newZipCode;
    private String regionCode;
    private String regionName;
    private String regionId;
    private String districtName;
    private String districtId;
    private String cityName;
    private String cityId;
    private String cityDistrictName;
    private String cityDistrictId;
    private String cityMicrodistrictName;
    private String cityMicrodistrictId;
    private String streetName;
    private String streetId;
    private String buildingName;
    private String regionNameKz;
    private String districtNameKz;
    private String cityNameKz;
    private String cityDistrictNameKz;
    private String cityMicrodistrictNameKz;
    private String streetNameKz;
    private String buildingNameKz;
    private String oldZipCode;

    public String objectId() {
        if (StringUtils.hasText(streetId)) return realValue(streetId);
        if (StringUtils.hasText(cityMicrodistrictId)) return realValue(cityMicrodistrictId);
        if (StringUtils.hasText(cityDistrictId)) return realValue(cityDistrictId);
        if (StringUtils.hasText(cityId)) return realValue(cityId);
        if (StringUtils.hasText(districtId)) return realValue(districtId);
        return realValue(regionId);
    }
    private static String realValue(String id){
        if(!StringUtils.hasText(id))return id;
        if(id.indexOf('/')>=0)return id.substring(id.lastIndexOf('/') + 1);
        return id;
    }
}
