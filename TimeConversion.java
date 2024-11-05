public class TimeConversion {
    public static void main(String[] args) {
        String time12HourFormat = "07:45 PM";

        SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm a"); // 12-hour format with AM/PM
        SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm");   // 24-hour format

        try {
            Date date = inputFormat.parse(time12HourFormat);

            // Format the Date object into a 24-hour time string
            String time24HourFormat = outputFormat.format(date);

            // Output the 24-hour time
            System.out.println("Time in 24-hour format: " + time24HourFormat);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
