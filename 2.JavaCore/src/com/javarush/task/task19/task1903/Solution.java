package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.putIfAbsent("UA", "Ukraine");
        countries.putIfAbsent("RU", "Russia");
        countries.putIfAbsent("CA", "Canada");
    }


    public static void main(String[] args) {

        IncomeData data = new IncomeData() {
            @Override
            public String getCountryCode() {
                return "UA";
            }

            @Override
            public String getCompany() {
                return "JavaRush Ltd.";
            }

            @Override
            public String getContactFirstName() {
                return "Ivan";
            }

            @Override
            public String getContactLastName() {
                return "Ivanov";
            }

            @Override
            public int getCountryPhoneCode() {
                return 38;
            }

            @Override
            public int getPhoneNumber() {
                return 234567;
            }
        };

        IncomeDataAdapter adapter = new IncomeDataAdapter(data);

        System.out.println(adapter.getPhoneNumber());

        //Customer customer = new IncomeDataAdapter(data);

        //Contact contact = new IncomeDataAdapter(data);

        //System.out.println(customer.getCompanyName());
        //System.out.println(customer.getCountryName());



    }

    public static class IncomeDataAdapter implements Customer, Contact{

        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName()+", "+data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            //String code = String.valueOf(data.getCountryPhoneCode());
            //String localPhone = String.valueOf(data.getPhoneNumber());
            //String localPhoneForm = ("0000000000"+localPhone).substring(localPhone.length());
            //String phone = "+" + code + localPhoneForm;
            //System.out.println(phone);
            //String formatPhone = phone.replaceFirst("(\\d{2})(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "$1($2)$3-$4-$5");
            String phone = String.format("%010d",data.getPhoneNumber());
            System.out.println(phone);

            return String.format("+%d(%s)%s-%s-%s", data.getCountryPhoneCode(), phone.substring(0, 3), phone.substring(3, 6),phone.substring(6, 8), phone.substring(8, 10));
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}