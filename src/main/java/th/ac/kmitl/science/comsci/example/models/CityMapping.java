package th.ac.kmitl.science.comsci.example.models;

import th.ac.kmitl.science.comsci.example.utilities.Mapping;

public class CityMapping implements Mapping{

    @Override
    public int map(String city) throws Exception{
        switch(city){
            case "Phra Nakhon"          : return 1001;
            case "Dusit"                : return 1002;
            case "Nong Chok"            : return 1003;
            case "Bang Rak"             : return 1004;
            case "Bang Khen"            : return 1005;
            case "Bang Kapi"            : return 1006;
            case "Pathum Wan"           : return 1007;
            case "Pom Prap Sattru Phai" : return 1008;
            case "Phra Khanong"         : return 1009;
            case "Min Buri"             : return 1010;
            case "Lat Krabang"          : return 1011;
            case "Yan Nawa"             : return 1012;
            case "Samphanthawong"       : return 1013;
            case "Phaya Thai"           : return 1014;
            case "Thon Buri"            : return 1015;
            case "Bangkok Yai"          : return 1016;
            case "Huai Khwang"          : return 1017;
            case "Khlong San"           : return 1018;
            case "Taling Chan"          : return 1019;
            case "Bangkok Noi"          : return 1020;
            case "Bang Khun Thian"      : return 1021;
            case "Phasi Charoen"        : return 1022;
            case "Nong Khaem"           : return 1023;
            case "Rat Burana"           : return 1024;
            case "Bang Phlat"           : return 1025;
            case "Din Daeng"            : return 1026;
            case "Bueng Kum"            : return 1027;
            case "Sathon"               : return 1028;
            case "Bang Sue"             : return 1029;
            case "Chatuchak"            : return 1030;
            case "Bang Kho Laem"        : return 1031;
            case "Prawet"               : return 1032;
            case "Khlong Toei"          : return 1033;
            case "Suan Luang"           : return 1034;
            case "Chom Thong"           : return 1035;
            case "Don Mueang"           : return 1036;
            case "Ratchathewi"          : return 1037;
            case "Lat Phrao"            : return 1038;
            case "Watthana"             : return 1039;
            case "Bang Khae"            : return 1040;
            case "Lak Si"               : return 1041;
            case "Sai Mai"              : return 1042;
            case "Khan Na Yao"          : return 1043;
            case "Saphan Sung"          : return 1044;
            case "Wang Thonglang"       : return 1045;
            case "Khlong Sam Wa"        : return 1046;
            case "Bang Na"              : return 1047;
            case "Thawi Watthana"       : return 1048;
            case "Thung Khru"           : return 1049;
            case "Bang Bon"             : return 1050;
            default : throw new Exception("Not Found City");
        }
    }
}
