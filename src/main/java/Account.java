import  org.apache.commons.lang3.StringUtils;

public class Account {
    private final String name;
    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss ()  {
//      в строке не меньше 3 и не больше 19 символов
//      в строке есть только один пробел
//      пробел стоит не в начале и не в конце строки.
        return (name !=null && name.matches("^[^\\s]\\S*\\s{1}\\S*[^\\s]$") && name.matches(".{3,19}")) ;

    }

}