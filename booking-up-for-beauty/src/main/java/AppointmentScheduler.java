import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

        return LocalDateTime.parse(appointmentDateDescription, parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int minutes = (60 * appointmentDate.getHour()) + appointmentDate.getMinute();

        // Checks if the appointment is in the afternoon (>= 12:00 and < 18:00)
        return (minutes >= (12 * 60) && minutes < (18 * 60));
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy").withLocale(Locale.US);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a").withLocale(Locale.US);

        return "You have an appointment on "
                + appointmentDate.format(dateFormatter) + ", "
                + "at "
                + appointmentDate.format(timeFormatter)
                + ".";
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDateTime.now().getYear(), 9, 15);
    }
}
