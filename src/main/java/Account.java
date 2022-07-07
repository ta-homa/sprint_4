import  org.apache.commons.lang3.StringUtils;

public class Account {
    private final String name;
    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss ()  {
        int i=0;
//      в строке не меньше 3 и не больше 19 символов
        if (name != null &&  name.length() >= 3 && name.length() <= 19) i++;
            else return  false;
//      в строке есть только один пробел
//      пробел стоит не в начале и не в конце строки.
        if (StringUtils.countMatches(name," ") != 1
                || name.startsWith(" ")  || name.endsWith(" ") )   return  false;
            else i++;

     return  i == 2 ?  true : false;
    }

}