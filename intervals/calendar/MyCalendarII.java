class MyCalendarTwo {
    ArrayList<ArrayList<Integer>> dB;
    ArrayList<ArrayList<Integer>> b;
    public MyCalendarTwo() {
        dB = new ArrayList<>();
        b = new ArrayList<>();



    }

    public boolean checkOverLapping(int s1, int e1, int s2, int e2){
        int s = Math.max(s1, s2);
        int e = Math.min(e1, e2);
       
        return (s < e);   
    }

    public ArrayList<Integer> findOverLappingRegion(int s1, int e1, int s2, int e2){
        int s = Math.max(s1, s2);
        int e = Math.min(e1, e2);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(s);
        ans.add(e);

        return ans;
    }
    
    public boolean book(int startTime, int endTime){
        for(ArrayList<Integer> arr : dB){
            int s  = arr.get(0);
            int e  = arr.get(1);

            if(checkOverLapping(s, e, startTime, endTime)){
                return false;
            }
        }

        for(ArrayList<Integer> arr : b){
            int s  = arr.get(0);
            int e  = arr.get(1);

            if(checkOverLapping(s, e, startTime, endTime)){
                ArrayList<Integer> overLappingRegion = findOverLappingRegion(s,e, startTime, endTime);
                dB.add(overLappingRegion);
            }
        }
        ArrayList<Integer> booking = new ArrayList<>();
        booking.add(startTime);
        booking.add(endTime);
        b.add(booking);

        return true;  
    }
}
