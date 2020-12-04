import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import sun.java2d.pipe.SpanShapeRenderer;

/**
 * Utility methods to simplify and wrap some of the common data/time operations.
 *
 * @author akutovoy
 */
public class DateTimeUtils {

    public static final SimpleDateFormat FULL_DATE =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");

    // public static final SimpleDateFormat INTEGER_DATE = new SimpleDateFormat("yyyyMMdd");

    // public static final SimpleDateFormat INTEGER_TIME = new SimpleDateFormat("HHmmss");

    public static final DateFormat INTEGER_DATETIME = new SimpleDateFormat("yyyyMMddHHmmss");
    public static final DateFormat INTEGER_DATE = new SimpleDateFormat("yyyyMMdd");
    public static final DateFormat INTEGER_TIME = new SimpleDateFormat("HHmmss");

    public final static DateTimeFormatter ISO8601_DATETIME_FORMATTER = ISODateTimeFormat.dateTime();

    public final static DateTimeFormatter ISO8601_DATE_HOUR_MINUTE_SECOND_FORMATTER = ISODateTimeFormat.dateHourMinuteSecond();

    public final static DateTimeFormatter ISO8601_GENERIC_DATETIME_FORMATTER = ISODateTimeFormat.dateTimeParser();

    public final static DateTimeFormatter ISO8601_SIMPLE_DATE_FORMATTER = DateTimeFormat.forPattern("yyyy-MM-dd");

    public final static DateTimeFormatter INTEGER_DATE_FORMATTER = DateTimeFormat.forPattern("yyyyMMdd");
    public final static DateTimeFormatter SHORT_REVERSE_INTEGER_DATE_FORMATTER = DateTimeFormat.forPattern("MMddYY");
    public final static DateTimeFormatter REVERSE_INTEGER_DATE_FORMATTER = DateTimeFormat.forPattern("MMddYYYY");

    public final static DateTimeFormatter INTERGER_TIME_FORMATTER = DateTimeFormat.forPattern("hhmmss");

    /**
     * This is not really an ISO8601 format, because there is no 'T' between date and time...
     */
    public final static DateTimeFormatter ISO8601_SIMPLE_DATETIME_FORMATTER = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");

    public final static DateTimeFormatter ISO8601_SIMPLE_DATETIME_FORMATTER_MILLIS = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.S");

    public final static DateTimeFormatter US_DATE_FORMATTER = DateTimeFormat.forPattern("MM/dd/yyyy");

    public final static DateTimeFormatter US_DATETIME_FORMATTER = DateTimeFormat.forPattern("MM/dd/yyyy HH:mm:ss");

    public final static DateTimeFormatter ORACLE_DATE_FORMATTER = DateTimeFormat.forPattern("dd-MMM-yyyy");

    private final static DateTimeFormatter DD_MMM_FORMATTER = DateTimeFormat.forPattern("d MMM");

    private static final DateTimeFormatter[] FORMATTERS = new DateTimeFormatter[]{

            ISO8601_SIMPLE_DATETIME_FORMATTER,
            ISO8601_SIMPLE_DATETIME_FORMATTER_MILLIS,
            INTEGER_DATE_FORMATTER,
            ISO8601_GENERIC_DATETIME_FORMATTER,
            US_DATE_FORMATTER,
            US_DATETIME_FORMATTER,
            ORACLE_DATE_FORMATTER
    };

    public static final DateTime BEGINNING_OF_TIME = new DateTime(1753, 1, 1, 0, 0, 0);
    public static final DateTime END_OF_TIME = new DateTime(2999, 12, 31, 0, 0, 0);
    public static final String STR_BEGINNING_OF_TIME = "1753-01-01";
    public static final String STR_END_OF_TIME = "2999-12-31";
    public static final String STR_END_OF_TIME_MMDDYYYY = "12312999";

    private static final String[] MONTH_NAMES = {"", "January", "February", "March", "April", "May",
            "June", "July", "August", "September", "October", "November", "December"
    };

    public static DateTime parseDate(String strDate) {

        if (strDate == null) {
            return null;
        }

        for (DateTimeFormatter formatter : FORMATTERS) {
            try {
                return formatter.parseDateTime(strDate);
            } catch (IllegalArgumentException ex) {
                // ignore me
            }
        }
        return null;
    }

    public static DateTime parseDate(String strDate, DateTimeFormatter formatter) {

        if (strDate == null) {
            return null;
        }

        try {
            return formatter.parseDateTime(strDate);
        } catch (IllegalArgumentException ex) {
            // ignore me
        }
        return null;
    }

    public static String formatToISODateTime(DateTime dt) {
        return ISO8601_DATETIME_FORMATTER.print(dt);
    }

    public static String formatToSimpleISODate(DateTime dt) {
        return ISO8601_SIMPLE_DATE_FORMATTER.print(dt);
    }

    public static String formatToSimpleISODateTime(DateTime dt) {
        return ISO8601_SIMPLE_DATETIME_FORMATTER.print(dt);
    }

    public static String formatToDefaultDate(DateTime dt) {
        return US_DATE_FORMATTER.print(dt);
    }

    public static String formatToDefaultDateTime(DateTime dt) {
        return US_DATETIME_FORMATTER.print(dt);
    }

    public static String formatToDdMmm(DateTime dt) {
        return DD_MMM_FORMATTER.print(dt);
    }

    public static String convertToDefaultDateFormat(String strDate) {
        DateTime dt = parseDate(strDate);
        if (dt != null) {
            return formatToDefaultDate(dt);
        } else {
            return null;
        }
    }

    public static String convertToDefaultDateTimeFormat(String strDate) {
        DateTime dt = parseDate(strDate);
        if (dt != null) {
            return formatToDefaultDateTime(dt);
        } else {
            return null;
        }
    }

    public static String convertToCanonicalDateFormat(String strDate) {
        DateTime dt = parseDate(strDate);
        if (dt != null) {
            return formatToSimpleISODate(dt);
        } else {
            return null;
        }
    }

    public static String convertToCanonicalDateTimeFormat(String strDate) {
        DateTime dt = parseDate(strDate);
        if (dt != null) {
            return formatToSimpleISODateTime(dt);
        } else {
            return null;
        }
    }

    public static DateTime now() {
        return DateTime.now();
    }

    public static DateTime now(String timeZone) {
        return DateTime.now(DateTimeZone.forID(timeZone));
    }

    public static DateTime today() {
        return new DateTime().withTimeAtStartOfDay();
    }

    public static DateTime today(int hour) {
        return new DateTime().withTime(hour, 0, 0, 0);
    }

    public static DateTime today(int hour, int minute) {
        return new DateTime().withTime(hour, minute, 0, 0);
    }

    public static DateTime today(String timeZone) {
        return new DateTime(DateTimeZone.forID(timeZone)).withTimeAtStartOfDay();
    }

    public static DateTime today(String timeZone, int hour) {
        return new DateTime(DateTimeZone.forID(timeZone)).withTime(hour, 0, 0, 0);
    }

    public static DateTime today(String timeZone, int hour, int minute) {
        return new DateTime(DateTimeZone.forID(timeZone)).withTime(hour, minute, 0, 0);
    }

    public static DateTime yesterday() {
        return today().minusDays(1);
    }

    public static DateTime yesterday(String timeZone) {
        return today(timeZone).minusDays(1);
    }

    public static DateTime convertToUTC(DateTime dt) {
        return dt.toDateTime(DateTimeZone.UTC);
    }

    /**
     * accepts Olson TZ IDs
     *
     * @param dt
     * @param tzId
     * @return
     */
    public static DateTime convertDateTimeToTimezone(DateTime dt, DateTimeZone tzId) {
        return dt.toDateTime(tzId);
    }

    public static int currentYear() {
        return DateTime.now().getYear();
    }

    public static long dateDiffDays(Date date1, Date date2) {
        DateTime dt1 = new DateTime(date1);
        DateTime dt2 = new DateTime(date2);
        Duration duration = new Duration(dt1, dt2);
        return duration.getStandardDays();
    }

    public static long dateDiffDays(DateTime dt1, DateTime dt2) {
        Duration duration = new Duration(dt1, dt2);
        return duration.getStandardDays();
    }

    public static long dateDiffDays(LocalDate dt1, LocalDate dt2) {
        Days d = Days.daysBetween(dt1, dt2);
        return d.getDays();
    }

    public static long dateDiffDaysAsLocalDates(DateTime dt1, DateTime dt2) {
        LocalDate ldt1 = dt1.toLocalDate();
        LocalDate ldt2 = dt2.toLocalDate();
        Days d = Days.daysBetween(ldt1, ldt2);
        return d.getDays();
    }


    public static String numericTimestamp() {
        DateTime now = DateTimeUtils.now();
        DateTimeFormatter fmt = ISODateTimeFormat.basicDate();
        String formattedDate = fmt.print(now);
        fmt = ISODateTimeFormat.hourMinuteSecond();
        String formattedTime = fmt.print(now).replace(":", "");
        return formattedDate + formattedTime;
    }

    public static String numericTimestamp(DateTime dt) {
        DateTimeFormatter fmt = ISODateTimeFormat.basicDate();
        String formattedDate = fmt.print(dt);
        fmt = ISODateTimeFormat.hourMinuteSecond();
        String formattedTime = fmt.print(dt).replace(":", "");
        return formattedDate + formattedTime;
    }

    public static String numericTimestamp(String timeZone) {
        DateTime now = DateTimeUtils.now(timeZone);
        DateTimeFormatter fmt = ISODateTimeFormat.basicDate();
        String formattedDate = fmt.print(now);
        fmt = ISODateTimeFormat.hourMinuteSecond();
        String formattedTime = fmt.print(now).replace(":", "");
        return formattedDate + formattedTime;
    }

    public static String numericDate() {
        DateTime now = DateTimeUtils.now();
        DateTimeFormatter fmt = ISODateTimeFormat.basicDate();
        String formattedDate = fmt.print(now);
        return formattedDate;
    }

    public static String numericDate(String timeZone) {
        DateTime now = DateTimeUtils.now(timeZone);
        DateTimeFormatter fmt = ISODateTimeFormat.basicDate();
        String formattedDate = fmt.print(now);
        return formattedDate;
    }

    public static String numericTime() {
        DateTime now = DateTimeUtils.now();
        DateTimeFormatter fmt = ISODateTimeFormat.hourMinuteSecond();
        String formattedTime = fmt.print(now).replace(":", "");
        return formattedTime;
    }

    public static String numericTime(String timeZone) {
        DateTime now = DateTimeUtils.now(timeZone);
        DateTimeFormatter fmt = ISODateTimeFormat.hourMinuteSecond();
        String formattedTime = fmt.print(now).replace(":", "");
        return formattedTime;
    }

    public static boolean isEndOfTime(DateTime dt) {
        return dt.getYear() == 2999 && dt.getMonthOfYear() == DateTimeConstants.DECEMBER;
    }

    /**
     * Takes a one-base month number and returns English name of the month
     *
     * @param monthNum Month number, one-based (January = 1, December = 12)
     * @return English name of the month
     * @throws IllegalArgumentException if month number is outside the range 1 to 12
     */
    public static String getMonthName(int monthNum) {
        if (monthNum >= 1 && monthNum <= 12) {
            return MONTH_NAMES[monthNum];
        } else {
            throw new IllegalArgumentException("Month number must be between 1 and 12");
        }
    }

    /**
     * Helper method to convert the "integer" date format (yyyyMMdd) to ISO format
     * (yyyy-MM-dd). This type of conversion is frequently used when importing
     * the data files (our standard requirement is to use the integer data format).
     *
     * @param strDate String representing the date in yyyyMMdd format
     * @return String representing the date in yyyy-MM-dd format. If input string
     * is an invalid date or is empty, returns the dummy date corresponding to
     * the "end-of-time" (2999-12-31)
     */
    public static String convertIntDateToISODate(String strDate) {
        String convertedDate;
        if (!StringUtils.isEmpty(strDate)) {
            DateTime dt = DateTimeUtils.parseDate(strDate, DateTimeUtils.INTEGER_DATE_FORMATTER);
            if (dt == null) {
                convertedDate = DateTimeUtils.STR_END_OF_TIME;
            } else {
                convertedDate = DateTimeUtils.formatToSimpleISODate(dt);
            }
        } else {
            convertedDate = DateTimeUtils.STR_END_OF_TIME;
        }
        return convertedDate;
    }

    /**
     * Helper method to convert the standard US date format (MM/dd/yyyy) to ISO format
     * (yyyy-MM-dd). This type of conversion is frequently used when importing
     * the data files (our standard requirement is to use the integer data format).
     *
     * @param strDate String representing the date in MM/dd/yyyy format
     * @return String representing the date in yyyy-MM-dd format. If input string
     * is an invalid date or is empty, returns the dummy date corresponding to
     * the "end-of-time" (2999-12-31)
     */
    public static String convertUSDateToISODate(String strDate) {
        String convertedDate;
        if (!StringUtils.isEmpty(strDate)) {
            DateTime dt = DateTimeUtils.parseDate(strDate, DateTimeUtils.US_DATE_FORMATTER);
            if (dt == null) {
                convertedDate = DateTimeUtils.STR_END_OF_TIME;
            } else {
                convertedDate = DateTimeUtils.formatToSimpleISODate(dt);
            }
        } else {
            convertedDate = DateTimeUtils.STR_END_OF_TIME;
        }
        return convertedDate;
    }

    public static DateTime getCurrentDayStartOfDay() {
        DateTime now = new DateTime()
                .withTimeAtStartOfDay();
        return now;
    }

    public static DateTime getCurrentDayStartOfDay(String timezoneId) {
        DateTime now = new DateTime()
                .withZone(DateTimeZone.forID(timezoneId))
                .withTimeAtStartOfDay();
        return now;
    }

    /**
     * Returns the "end of current date", which is actually the midnight of the
     * next day. E.g. if it is currently 2019-12-09T18:23:55, then the end of
     * current date is 2019-12-10T00:00:00
     *
     * @return
     */
    public static DateTime getCurrentDayEndOfDay() {
        DateTime dt = new DateTime()
                .withTimeAtStartOfDay().plusDays(1);
        return dt;
    }

    public static DateTime getCurrentDayEndOfDay(String timezoneId) {
        DateTime dt = new DateTime()
                .withZone(DateTimeZone.forID(timezoneId))
                .withTimeAtStartOfDay()
                .plusDays(1);
        return dt;
    }

// https://walletron.atlassian.net/browse/MOBILLS-290 "Support for Expiration timestamp in enrollment URL"

    public static long dateDiffSeconds(DateTime dt1, DateTime dt2) {
        Duration duration = new Duration(dt1, dt2);
        return duration.getStandardSeconds();
    }

    // Get a full list of time zones
    public static List<String> getAllTimeZones() {
        return Arrays.asList(TimeZone.getAvailableIDs());
    }
}

