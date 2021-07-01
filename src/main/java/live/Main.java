package live;

//На вход приходит строка, строка должна начинаться с пробела и заканчиваться на пробел
//На выходе получить строку будет начинаться на букву, заканчиваться на букву и пробелы между символами
//"_abc_" -> "a_b_c";  "_abc__d__e_" -> "a__b__c_d_e"; "_abcd_" -> "a_b_cd"
//Посчитать количество пробелов и количество букв
//Если количество пробелов больше количества букв, убираем пробелы
//Получим остаток от деления кол-во пробелов на количество букв
//На первые количество букв равное остатку от деления будем добовлять 2 пробела
//На остальные по одному
//Если кол-во пробелов меньше чем количество букв, то добавляем от начала по одному пробелу
//После каждой буквы
public class Main {
    private static final String symbol = "_";

    public static String algorithm(String inputString) {
        String stringWithoutSpaces = inputString.replace(symbol, "");
        StringBuilder result = new StringBuilder();
        int countLetters = 0;
        int countSpaces = 0;

        for(int i = 0; i < inputString.length(); i++) {
            String stringOfCurrentChar = String.valueOf(inputString.charAt(i));
            if(symbol.equals(stringOfCurrentChar)) {
                countSpaces++;
            } else {
                countLetters++;
            }
        }

        for(int i = 0; i < stringWithoutSpaces.length(); i++) {
            if(countSpaces >= countLetters) {
                int quantityOfAddingSpaces = countSpaces / countLetters;
                int numberOfAdditionalSpaces = countSpaces % countLetters;

                result.append(stringWithoutSpaces.charAt(i));

                if(i < stringWithoutSpaces.length() - 1) {
                    result.append(symbol.repeat(quantityOfAddingSpaces));
                }

                if(i <= numberOfAdditionalSpaces) {
                    result.append(symbol);
                }

            } else {
                result.append(stringWithoutSpaces.charAt(i));

                if(i < countSpaces) {
                    result.append(symbol);
                }
            }
        }

        return result.toString();
    }

}
