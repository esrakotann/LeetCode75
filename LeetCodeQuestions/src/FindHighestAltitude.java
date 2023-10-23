public class FindHighestAltitude {
    public int largestAltitude(int[] gain) {
        int[] altitudes= new int [gain.length+1];
        altitudes[0]=0;
        int highestAltitude=0;
        for(int i=0;i<gain.length;i++){
            altitudes[i+1]=altitudes[i]+gain[i];
            highestAltitude=Integer.max(altitudes[i+1],highestAltitude);
        }
        return highestAltitude;
    }
}
