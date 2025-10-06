class Solution {
    public boolean hasMatch(String s, String p) {
     int st = p.indexOf('*');
     String start = p.substring(0, st);
     String end = p.substring(st+1);

     int i = s.indexOf(start);
     if(i == -1) return false;
     int j = s.indexOf(end, i+start.length());
     return j != -1;
    }
}