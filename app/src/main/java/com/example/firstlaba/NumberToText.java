package com.example.firstlaba;

import static java.lang.StrictMath.pow;

public class NumberToText {

    public static  String converting(int number){
        StringBuilder result = new StringBuilder("");
        if (number == 1000000){
            result.append("миллион");
        } else {
            int rank = 0;
            int buf_num = number;
            while( buf_num > 0){
                buf_num = buf_num / 10;
                rank++;
            }
            while (rank > 0) {
                int buf = number / (int) (pow(10,(rank - 1)));
                if (rank  == 6 || rank == 3){
                    switch (buf){
                        case 1:
                            result.append("сто ");  break;
                        case 2:
                            result.append("двести ");  break;
                        case 3:
                            result.append("триста ");  break;
                        case 4:
                            result.append("четыреста ");  break;
                        case 5:
                            result.append("пятьсот ");  break;
                        case 6:
                            result.append("шестьсот ");  break;
                        case 7:
                            result.append("семьсот ");  break;
                        case 8:
                            result.append("восемьсот "); break;
                        case 9:
                            result.append("девятьсот ");  break;
                        default:
                            break;
                    }
                }

                if (rank == 4 || rank == 1){
                    if (rank == 4){
                        switch (buf) {
                            case 0:
                                result.append("тысяч ");
                                break;
                            case 1:
                                result.append("одна тысяча ");
                                break;
                            case 2:
                                result.append("две тысячи ");
                                break;
                        }
                    }

                    if (rank == 1) {
                        switch (buf) {
                            case 0:
                                break;
                            case 1:
                                result.append("один");
                                break;
                            case 2:
                                result.append("два");
                                break;
                        }
                    }
                    switch (buf) {

                        case 3:
                            result.append("три ");
                            if (rank == 4) result.append("тысячи ");
                            break;
                        case 4:
                            result.append("четыре ");
                            if (rank == 4) result.append("тысячи ");
                            break;
                        case 5:
                            result.append("пять ");
                            if (rank == 4) result.append("тысяч ");
                            break;
                        case 6:
                            result.append("шесть ");
                            if (rank == 4) result.append("тысяч ");
                            break;
                        case 7:
                            result.append("семь ");
                            if (rank == 4) result.append("тысяч ");
                            break;
                        case 8:
                            result.append("восемь ");
                            if (rank == 4) result.append("тысяч ");
                            break;
                        case 9:
                            result.append("девять ");
                            if (rank == 4) result.append("тысяч ");
                            break;
                        default:
                            break;
                    }
                }

                if (rank == 5 || rank == 2) {
                    if (buf == 1) {
                        int dop_buf = number /(int) (pow(10, (rank - 2)));
                        switch (dop_buf) {
                            case 10:
                                result.append("десять");
                                break;
                            case 11:
                                result.append("одиннадцать ");
                                break;
                            case 12:
                                result.append("двенадцать ");
                                break;
                            case 13:
                                result.append("тринадцать ");
                                break;
                            case 14:
                                result.append("четырнадцать ");
                                break;
                            case 15:
                                result.append("пятнадцать ");
                                break;
                            case 16:
                                result.append("шестнадцать ");
                                break;
                            case 17:
                                result.append("семнадцать ");
                                break;
                            case 18:
                                result.append("восемнадцать ");
                                break;
                            case 19:
                                result.append("девятнадцать ");
                                break;
                        }
                        number = number % (int) (pow(10,(rank - 1)));
                        rank--;
                    } else {
                        switch (buf) {
                            case 0:
                                break;
                            case 2:
                                result.append("двадцать ");
                                break;
                            case 3:
                                result.append("тридцать ");
                                break;

                            case 4:
                                result.append("сорок ");
                                break;
                            case 5:
                                result.append("пятьдесят ");
                                break;
                            case 6:
                                result.append("шестьдесят ");
                                break;
                            case 7:
                                result.append("семьдесят ");
                                break;
                            case 8:
                                result.append("восемьдесят ");
                                break;
                            case 9:
                                result.append("девяносто ");
                                break;
                        }

                    }
                    if (rank == 4) result.append("тысяч ");
                }
                number = number % (int) (pow(10,(rank - 1)));
                rank--;
            }
        }
        return result.toString();
    }




}
