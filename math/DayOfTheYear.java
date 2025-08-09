class Solution {
    public int numberOfDays(int month, int year){
        if (month == 2) {
            // Check for leap year
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                return 29;
            else
                return 28;
        }else if (month == 1 || month == 3 || month == 5 || month == 7 ||
                   month == 8 || month == 10 || month == 12) {
            return 31;
        } else {
            return 30;
        }
    }
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        int totalDays = 0;
        for(int  i =1; i < month; i++){
            totalDays+=numberOfDays(i,year);
        }
        totalDays+=day;
        return totalDays;
    }
}
