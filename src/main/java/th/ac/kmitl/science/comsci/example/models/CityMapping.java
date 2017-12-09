package th.ac.kmitl.science.comsci.example.models;

import th.ac.kmitl.science.comsci.example.exceptions.CityNotFoundException;
import th.ac.kmitl.science.comsci.example.utilities.Mapping;

public class CityMapping implements Mapping{

    @Override
    public int getCode(String city) throws CityNotFoundException {
        int cityCode;
        switch(city){
            case "Phra Nakhon":
                cityCode = 1001;
                break;
            case "Dusit":
                cityCode = 1002;
                break;
            case "Nong Chok":
                cityCode = 1003;
                break;
            case "Bang Rak":
                cityCode = 1004;
                break;
            case "Bang Khen":
                cityCode = 1005;
                break;
            case "Bang Kapi":
                cityCode = 1006;
                break;
            case "Pathum Wan":
                cityCode = 1007;
                break;
            case "Pom Prap Sattru Phai":
                cityCode = 1008;
                break;
            case "Phra Khanong":
                cityCode = 1009;
                break;
            case "Min Buri":
                cityCode = 1010;
                break;
            case "Lat Krabang":
                cityCode = 1011;
                break;
            case "Yan Nawa":
                cityCode = 1012;
                break;
            case "Samphanthawong":
                cityCode = 1013;
                break;
            case "Phaya Thai":
                cityCode = 1014;
                break;
            case "Thon Buri":
                cityCode = 1015;
                break;
            case "Bangkok Yai":
                cityCode = 1016;
                break;
            case "Huai Khwang":
                cityCode = 1017;
                break;
            case "Khlong San":
                cityCode = 1018;
                break;
            case "Taling Chan":
                cityCode = 1019;
                break;
            case "Bangkok Noi":
                cityCode = 1020;
                break;
            case "Bang Khun Thian":
                cityCode = 1021;
                break;
            case "Phasi Charoen":
                cityCode = 1022;
                break;
            case "Nong Khaem":
                cityCode = 1023;
                break;
            case "Rat Burana":
                cityCode = 1024;
                break;
            case "Bang Phlat":
                cityCode = 1025;
                break;
            case "Din Daeng":
                cityCode = 1026;
                break;
            case "Bueng Kum":
                cityCode = 1027;
                break;
            case "Sathon":
                cityCode = 1028;
                break;
            case "Bang Sue":
                cityCode = 1029;
                break;
            case "Chatuchak":
                cityCode = 1030;
                break;
            case "Bang Kho Laem":
                cityCode = 1031;
                break;
            case "Prawet":
                cityCode = 1032;
                break;
            case "Khlong Toei":
                cityCode = 1033;
                break;
            case "Suan Luang":
                cityCode = 1034;
                break;
            case "Chom Thong":
                cityCode = 1035;
                break;
            case "Don Mueang":
                cityCode = 1036;
                break;
            case "Ratchathewi":
                cityCode = 1037;
                break;
            case "Lat Phrao":
                cityCode = 1038;
                break;
            case "Watthana":
                cityCode = 1039;
                break;
            case "Bang Khae":
                cityCode = 1040;
                break;
            case "Lak Si":
                cityCode = 1041;
                break;
            case "Sai Mai":
                cityCode = 1042;
                break;
            case "Khan Na Yao":
                cityCode = 1043;
                break;
            case "Saphan Sung":
                cityCode = 1044;
                break;
            case "Wang Thonglang":
                cityCode = 1045;
                break;
            case "Khlong Sam Wa":
                cityCode = 1046;
                break;
            case "Bang Na":
                cityCode = 1047;
                break;
            case "Thawi Watthana":
                cityCode = 1048;
                break;
            case "Thung Khru":
                cityCode = 1049;
                break;
            case "Bang Bon":
                cityCode = 1050;
                break;
            default:
                throw new CityNotFoundException("City Not Found");
        }
        return cityCode;
    }
}
