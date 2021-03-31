package com.rakovets.course.java.core.practice.looping_statement;

import java.text.DecimalFormat;

/**
 * Разработать программу для бухгалтерии.
 * Конвертировать числовую сумму в сумму бухгалтерском формате, т.е. начиная справа, каждые три позиции отделяются
 * пробелом.
 * <p>
 * Например:
 * 1234567890 -> "1 234 567 890"
 *
 * @author Dmitry Rakovets
 */
class Task06 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        long amount = 1500;

        String amountWithAccountingFormat = convertToAccountingFormat(amount);
        System.out.printf("Result: %s", amountWithAccountingFormat);
    }

    /**
     * Конвертировать числовую сумму в сумму бухгалтерском формате, т.е. начиная справа, каждые три позиции отделяются
     * пробелом.
     *
     * @param amount сумма
     * @return сумма в бухгалтерском формате
     */
    static String convertToAccountingFormat(long amount) {
        boolean numbers;

        if (amount < 0) {
            amount *= -1;
            numbers = false;
        } else {
            numbers = true;
        }

        String result = "";

        int rank = 0;
        long digit;
        long accountigFormat = amount;

        while (accountigFormat / 10 != 0) {
            digit = accountigFormat % 10;
            accountigFormat /= 10;
            rank++;
            if (rank % 3 == 0) {
                result = " " + digit + result;
            } else {
                result = digit + result;
            }
        }
        digit = accountigFormat % 10;
        result = digit + result;

        if (numbers == false) {
            result = "-" + result;
        }
        return result;
    }
}
