package utils;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Peloton {


    // We want to be able to give the user a breakdown of how much time, over the duration of the workout, they spent in each heart rate zone.

    // I.e. we want to be able display the user a report like:
    // Great job on your 30 minute HIIT class! Here's a breakdown of how much time you spent in each of your heart rate zones:
    // PEAK: 7 minutes CARDIO: 10 minutes FAT BURN: 10 minutes WARM UP: 3 minutes
    // To do so, we need to write a function to calculate how much time over the workout duration was spent in each heart rate zone.
    // We'll use 4 standard heart rate zones, which we can represent as a list of pairs:

    // WARM UP: 0 - 60 percent of the user's maximum heart rate (0, 60)
    // FAT BURN: 60 - 75 percent of the user's maximum heart rate (60, 75)
    // CARDIO: 75 - 85 percent of the user's maximum heart rate (75, 85)
    // PEAK: 85 - 100 percent of the user's maximum heart rate (85, 100)
    // If a user's heart rate falls on the border of the upper and lower range of a
    // zone, we'll bucket them into the upper zone.
    // For example, if we end up with a set of zones [(157, 185), (139, 157), (111, 139), (0, 111)],
    // a heart rate of 157 will be considered in the (157, 185) heart rate zone.
    //
    // Write a function "timeInHeartRateZonesForWorkout"
    // given:
    // - an array of (time, bpm) integer pairs for a user
    // - the ending time of the of the exercise (in seconds from start)
    // - the user's maximum heart rate, which is used to calculate their heart rate zones
    //
    // The function should return an array of seconds the exerciser spent in each heart
    // rate zone sorted from PEAK to WARM UP. If the exerciser did not spend any time in
    // one of the four zones, return 0 for that zone.
    //
    // For example, given a array of times and beats per minute:
    // [(0 70),(50 90), (60 120), (70 135), (100 150), (300 180), (400 75)],
    // [(49 170),(50 90), (60 120), (70 135), (100 150), (300 180), (400 75)],
    // a maximum heart rate of 185, and a workout duration of 500, the function should return [100, 200, 40, 160].
    // The exerciser spent 100 seconds in PEAK, 200 in CARDIO, 40 in FAT BURN, and 160 in WARM UP.
    // Interviewer Notes:
    // * all times and beats per minute are always positive, whole numbers
    // * any time before the first data point is spent in the WARM UP zone

    public static void main(String[] args) {
        List<TimeBpm> timeBpms = new ArrayList<>();
        timeBpms.add(new TimeBpm(0, 70));
        timeBpms.add(new TimeBpm(50, 90));
        timeBpms.add(new TimeBpm(60, 120));
        timeBpms.add(new TimeBpm(70, 135));
        timeBpms.add(new TimeBpm(100, 150));
        timeBpms.add(new TimeBpm(300, 180));
        timeBpms.add(new TimeBpm(400, 75));
//        timeBpms.add(new TimeBpm(49, 170));
//        timeBpms.add(new TimeBpm(50, 90));
//        timeBpms.add(new TimeBpm(60, 120));
//        timeBpms.add(new TimeBpm(70, 135));
//        timeBpms.add(new TimeBpm(100, 150));
//        timeBpms.add(new TimeBpm(300, 180));
//        timeBpms.add(new TimeBpm(400, 75));

        System.out.println(timeInHeartRateZonesForWorkout(timeBpms, 185, 500));
    }

    // WARM UP: 0 - 60 percent of the user's maximum heart rate (0, 60)
    // FAT BURN: 60 - 75 percent of the user's maximum heart rate (60, 75)
    // CARDIO: 75 - 85 percent of the user's maximum heart rate (75, 85)
    // PEAK: 85 - 100 percent of the user's maximum heart rate (85, 100)
    // [100, 200, 40, 160]
    // peak - cardio - fatburn - warmup
    public static List<Integer> timeInHeartRateZonesForWorkout(List<TimeBpm> timeBpmList, int maxHeartRate, int duration) {
        List<Integer> response = new ArrayList<>();
        int peak = 0;
        int cardio = 0;
        int fatBurn = 0;
        int warmUp = 0;

        // calc zone: (bpm / maxHeartRate) * 100 = zone
        // check range
        // then add seconds to proper zone
        for(int i = 0; i < timeBpmList.size() - 1; i++){
            int zone = calculateZone(timeBpmList.get(i), maxHeartRate);
            if(zone < 60){
                warmUp += timeBpmList.get(i).time + timeBpmList.get(i + 1).time;
            }
            if (zone >= 60 && zone < 75){
                fatBurn += (timeBpmList.get(i + 1).time - timeBpmList.get(i).time);
            }
            if (zone >= 75 && zone < 85){
                cardio += (timeBpmList.get(i + 1).time - timeBpmList.get(i).time);
            }
            if (zone >= 85){
                peak += (timeBpmList.get(i + 1).time - timeBpmList.get(i).time);
            }
        }

        response.add(peak);
        response.add(cardio);
        response.add(fatBurn);
        response.add(warmUp);

        return response;
    }

    public static int calculateZone(TimeBpm timeBpm, int maxHeartRate){
        return (timeBpm.bpm * 100) / maxHeartRate;
    }

    public static class TimeBpm {
        public int time;
        public int bpm;

        public TimeBpm(int time, int bpm){
            this.time = time;
            this.bpm = bpm;
        }
    }
}
