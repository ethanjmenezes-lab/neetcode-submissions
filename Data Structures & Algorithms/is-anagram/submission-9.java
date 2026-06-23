

class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length() != s.length())
        {
            return false;
        }
        int length = 0;
        char[] CharS = s.toCharArray();
        char[] CharT = t.toCharArray();
        Arrays.sort(CharS);
        Arrays.sort(CharT);
        if(s.length() < t.length())
        {
            length = s.length();

        }
        else
        {
            length = t.length();
        }
       
            for(int i = 0; i < length; i++)
                {
                    if(CharS[i] != CharT[i])
                    {
                        return false;
                    }
                }
                return true;



    }
}
