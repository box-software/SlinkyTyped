package typingsSlinky.dateDashFns

import typingsSlinky.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// dateFns Global Interface
@js.native
trait dateFns extends js.Object {
  var maxTime: Double = js.native
  var minTime: Double = js.native
  def addBusinessDays(date: Double, amount: Double): js.Date = js.native
  def addBusinessDays(date: Date, amount: Double): js.Date = js.native
  def addDays(date: Double, amount: Double): js.Date = js.native
  def addDays(date: Date, amount: Double): js.Date = js.native
  def addHours(date: Double, amount: Double): js.Date = js.native
  def addHours(date: Date, amount: Double): js.Date = js.native
  def addISOWeekYears(date: Double, amount: Double): js.Date = js.native
  def addISOWeekYears(date: Date, amount: Double): js.Date = js.native
  def addMilliseconds(date: Double, amount: Double): js.Date = js.native
  def addMilliseconds(date: Date, amount: Double): js.Date = js.native
  def addMinutes(date: Double, amount: Double): js.Date = js.native
  def addMinutes(date: Date, amount: Double): js.Date = js.native
  def addMonths(date: Double, amount: Double): js.Date = js.native
  def addMonths(date: Date, amount: Double): js.Date = js.native
  def addQuarters(date: Double, amount: Double): js.Date = js.native
  def addQuarters(date: Date, amount: Double): js.Date = js.native
  def addSeconds(date: Double, amount: Double): js.Date = js.native
  def addSeconds(date: Date, amount: Double): js.Date = js.native
  def addWeeks(date: Double, amount: Double): js.Date = js.native
  def addWeeks(date: Date, amount: Double): js.Date = js.native
  def addYears(date: Double, amount: Double): js.Date = js.native
  def addYears(date: Date, amount: Double): js.Date = js.native
  def areIntervalsOverlapping(intervalLeft: Interval, intervalRight: Interval): Boolean = js.native
  def closestIndexTo(dateToCompare: Double, datesArray: js.Array[js.Date | Double]): Double = js.native
  def closestIndexTo(dateToCompare: Date, datesArray: js.Array[js.Date | Double]): Double = js.native
  def closestTo(dateToCompare: Double, datesArray: js.Array[js.Date | Double]): js.Date = js.native
  def closestTo(dateToCompare: Date, datesArray: js.Array[js.Date | Double]): js.Date = js.native
  def compareAsc(dateLeft: Double, dateRight: Double): Double = js.native
  def compareAsc(dateLeft: Double, dateRight: Date): Double = js.native
  def compareAsc(dateLeft: Date, dateRight: Double): Double = js.native
  def compareAsc(dateLeft: Date, dateRight: Date): Double = js.native
  def compareDesc(dateLeft: Double, dateRight: Double): Double = js.native
  def compareDesc(dateLeft: Double, dateRight: Date): Double = js.native
  def compareDesc(dateLeft: Date, dateRight: Double): Double = js.native
  def compareDesc(dateLeft: Date, dateRight: Date): Double = js.native
  def differenceInBusinessDays(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInBusinessDays(dateLeft: Double, dateRight: Date): Double = js.native
  def differenceInBusinessDays(dateLeft: Date, dateRight: Double): Double = js.native
  def differenceInBusinessDays(dateLeft: Date, dateRight: Date): Double = js.native
  def differenceInCalendarDays(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInCalendarDays(dateLeft: Double, dateRight: Date): Double = js.native
  def differenceInCalendarDays(dateLeft: Date, dateRight: Double): Double = js.native
  def differenceInCalendarDays(dateLeft: Date, dateRight: Date): Double = js.native
  def differenceInCalendarISOWeekYears(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInCalendarISOWeekYears(dateLeft: Double, dateRight: Date): Double = js.native
  def differenceInCalendarISOWeekYears(dateLeft: Date, dateRight: Double): Double = js.native
  def differenceInCalendarISOWeekYears(dateLeft: Date, dateRight: Date): Double = js.native
  def differenceInCalendarISOWeeks(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInCalendarISOWeeks(dateLeft: Double, dateRight: Date): Double = js.native
  def differenceInCalendarISOWeeks(dateLeft: Date, dateRight: Double): Double = js.native
  def differenceInCalendarISOWeeks(dateLeft: Date, dateRight: Date): Double = js.native
  def differenceInCalendarMonths(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInCalendarMonths(dateLeft: Double, dateRight: Date): Double = js.native
  def differenceInCalendarMonths(dateLeft: Date, dateRight: Double): Double = js.native
  def differenceInCalendarMonths(dateLeft: Date, dateRight: Date): Double = js.native
  def differenceInCalendarQuarters(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInCalendarQuarters(dateLeft: Double, dateRight: Date): Double = js.native
  def differenceInCalendarQuarters(dateLeft: Date, dateRight: Double): Double = js.native
  def differenceInCalendarQuarters(dateLeft: Date, dateRight: Date): Double = js.native
  def differenceInCalendarWeeks(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInCalendarWeeks(dateLeft: Double, dateRight: Double, options: Anon_012): Double = js.native
  def differenceInCalendarWeeks(dateLeft: Double, dateRight: Date): Double = js.native
  def differenceInCalendarWeeks(dateLeft: Double, dateRight: Date, options: Anon_012): Double = js.native
  def differenceInCalendarWeeks(dateLeft: Date, dateRight: Double): Double = js.native
  def differenceInCalendarWeeks(dateLeft: Date, dateRight: Double, options: Anon_012): Double = js.native
  def differenceInCalendarWeeks(dateLeft: Date, dateRight: Date): Double = js.native
  def differenceInCalendarWeeks(dateLeft: Date, dateRight: Date, options: Anon_012): Double = js.native
  def differenceInCalendarYears(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInCalendarYears(dateLeft: Double, dateRight: Date): Double = js.native
  def differenceInCalendarYears(dateLeft: Date, dateRight: Double): Double = js.native
  def differenceInCalendarYears(dateLeft: Date, dateRight: Date): Double = js.native
  def differenceInDays(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInDays(dateLeft: Double, dateRight: Date): Double = js.native
  def differenceInDays(dateLeft: Date, dateRight: Double): Double = js.native
  def differenceInDays(dateLeft: Date, dateRight: Date): Double = js.native
  def differenceInHours(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInHours(dateLeft: Double, dateRight: Date): Double = js.native
  def differenceInHours(dateLeft: Date, dateRight: Double): Double = js.native
  def differenceInHours(dateLeft: Date, dateRight: Date): Double = js.native
  def differenceInISOWeekYears(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInISOWeekYears(dateLeft: Double, dateRight: Date): Double = js.native
  def differenceInISOWeekYears(dateLeft: Date, dateRight: Double): Double = js.native
  def differenceInISOWeekYears(dateLeft: Date, dateRight: Date): Double = js.native
  def differenceInMilliseconds(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInMilliseconds(dateLeft: Double, dateRight: Date): Double = js.native
  def differenceInMilliseconds(dateLeft: Date, dateRight: Double): Double = js.native
  def differenceInMilliseconds(dateLeft: Date, dateRight: Date): Double = js.native
  def differenceInMinutes(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInMinutes(dateLeft: Double, dateRight: Date): Double = js.native
  def differenceInMinutes(dateLeft: Date, dateRight: Double): Double = js.native
  def differenceInMinutes(dateLeft: Date, dateRight: Date): Double = js.native
  def differenceInMonths(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInMonths(dateLeft: Double, dateRight: Date): Double = js.native
  def differenceInMonths(dateLeft: Date, dateRight: Double): Double = js.native
  def differenceInMonths(dateLeft: Date, dateRight: Date): Double = js.native
  def differenceInQuarters(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInQuarters(dateLeft: Double, dateRight: Date): Double = js.native
  def differenceInQuarters(dateLeft: Date, dateRight: Double): Double = js.native
  def differenceInQuarters(dateLeft: Date, dateRight: Date): Double = js.native
  def differenceInSeconds(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInSeconds(dateLeft: Double, dateRight: Date): Double = js.native
  def differenceInSeconds(dateLeft: Date, dateRight: Double): Double = js.native
  def differenceInSeconds(dateLeft: Date, dateRight: Date): Double = js.native
  def differenceInWeeks(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInWeeks(dateLeft: Double, dateRight: Date): Double = js.native
  def differenceInWeeks(dateLeft: Date, dateRight: Double): Double = js.native
  def differenceInWeeks(dateLeft: Date, dateRight: Date): Double = js.native
  def differenceInYears(dateLeft: Double, dateRight: Double): Double = js.native
  def differenceInYears(dateLeft: Double, dateRight: Date): Double = js.native
  def differenceInYears(dateLeft: Date, dateRight: Double): Double = js.native
  def differenceInYears(dateLeft: Date, dateRight: Date): Double = js.native
  def eachDayOfInterval(interval: Interval): js.Array[js.Date] = js.native
  def eachDayOfInterval(interval: Interval, options: Anon_Step): js.Array[js.Date] = js.native
  def eachWeekOfInterval(interval: Interval): js.Array[js.Date] = js.native
  def eachWeekOfInterval(interval: Interval, options: Anon_012): js.Array[js.Date] = js.native
  def eachWeekendOfInterval(interval: Interval): js.Array[js.Date] = js.native
  def eachWeekendOfMonth(date: Double): js.Array[js.Date] = js.native
  def eachWeekendOfMonth(date: Date): js.Array[js.Date] = js.native
  def eachWeekendOfYear(date: Double): js.Array[js.Date] = js.native
  def eachWeekendOfYear(date: Date): js.Array[js.Date] = js.native
  def endOfDay(date: Double): js.Date = js.native
  def endOfDay(date: Date): js.Date = js.native
  def endOfDecade(date: Double): js.Date = js.native
  def endOfDecade(date: Double, options: Anon_01): js.Date = js.native
  def endOfDecade(date: Date): js.Date = js.native
  def endOfDecade(date: Date, options: Anon_01): js.Date = js.native
  def endOfHour(date: Double): js.Date = js.native
  def endOfHour(date: Date): js.Date = js.native
  def endOfISOWeek(date: Double): js.Date = js.native
  def endOfISOWeek(date: Date): js.Date = js.native
  def endOfISOWeekYear(date: Double): js.Date = js.native
  def endOfISOWeekYear(date: Date): js.Date = js.native
  def endOfMinute(date: Double): js.Date = js.native
  def endOfMinute(date: Date): js.Date = js.native
  def endOfMonth(date: Double): js.Date = js.native
  def endOfMonth(date: Date): js.Date = js.native
  def endOfQuarter(date: Double): js.Date = js.native
  def endOfQuarter(date: Date): js.Date = js.native
  def endOfSecond(date: Double): js.Date = js.native
  def endOfSecond(date: Date): js.Date = js.native
  def endOfToday(): js.Date = js.native
  def endOfTomorrow(): js.Date = js.native
  def endOfWeek(date: Double): js.Date = js.native
  def endOfWeek(date: Double, options: Anon_012): js.Date = js.native
  def endOfWeek(date: Date): js.Date = js.native
  def endOfWeek(date: Date, options: Anon_012): js.Date = js.native
  def endOfYear(date: Double): js.Date = js.native
  def endOfYear(date: Date): js.Date = js.native
  def endOfYesterday(): js.Date = js.native
  def format(date: Double, format: String): String = js.native
  def format(date: Double, format: String, options: Anon_01234): String = js.native
  def format(date: Date, format: String): String = js.native
  def format(date: Date, format: String, options: Anon_01234): String = js.native
  def formatDistance(date: Double, baseDate: Double): String = js.native
  def formatDistance(date: Double, baseDate: Double, options: Anon_AddSuffixIncludeSeconds): String = js.native
  def formatDistance(date: Double, baseDate: Date): String = js.native
  def formatDistance(date: Double, baseDate: Date, options: Anon_AddSuffixIncludeSeconds): String = js.native
  def formatDistance(date: Date, baseDate: Double): String = js.native
  def formatDistance(date: Date, baseDate: Double, options: Anon_AddSuffixIncludeSeconds): String = js.native
  def formatDistance(date: Date, baseDate: Date): String = js.native
  def formatDistance(date: Date, baseDate: Date, options: Anon_AddSuffixIncludeSeconds): String = js.native
  def formatDistanceStrict(date: Double, baseDate: Double): String = js.native
  def formatDistanceStrict(date: Double, baseDate: Double, options: Anon_AddSuffixCeilDay): String = js.native
  def formatDistanceStrict(date: Double, baseDate: Date): String = js.native
  def formatDistanceStrict(date: Double, baseDate: Date, options: Anon_AddSuffixCeilDay): String = js.native
  def formatDistanceStrict(date: Date, baseDate: Double): String = js.native
  def formatDistanceStrict(date: Date, baseDate: Double, options: Anon_AddSuffixCeilDay): String = js.native
  def formatDistanceStrict(date: Date, baseDate: Date): String = js.native
  def formatDistanceStrict(date: Date, baseDate: Date, options: Anon_AddSuffixCeilDay): String = js.native
  def formatDistanceToNow(date: Double): String = js.native
  def formatDistanceToNow(date: Double, options: Anon_AddSuffixIncludeSeconds): String = js.native
  def formatDistanceToNow(date: Date): String = js.native
  def formatDistanceToNow(date: Date, options: Anon_AddSuffixIncludeSeconds): String = js.native
  def formatISO(date: Double): String = js.native
  def formatISO(date: Double, options: Anon_Basic): String = js.native
  def formatISO(date: Date): String = js.native
  def formatISO(date: Date, options: Anon_Basic): String = js.native
  def formatISO9075(date: Double): String = js.native
  def formatISO9075(date: Double, options: Anon_Basic): String = js.native
  def formatISO9075(date: Date): String = js.native
  def formatISO9075(date: Date, options: Anon_Basic): String = js.native
  def formatRFC3339(date: Double): String = js.native
  def formatRFC3339(date: Double, options: Anon_0123FractionDigits): String = js.native
  def formatRFC3339(date: Date): String = js.native
  def formatRFC3339(date: Date, options: Anon_0123FractionDigits): String = js.native
  def formatRFC7231(date: Double): String = js.native
  def formatRFC7231(date: Date): String = js.native
  def formatRelative(date: Double, baseDate: Double): String = js.native
  def formatRelative(date: Double, baseDate: Double, options: Anon_012): String = js.native
  def formatRelative(date: Double, baseDate: Date): String = js.native
  def formatRelative(date: Double, baseDate: Date, options: Anon_012): String = js.native
  def formatRelative(date: Date, baseDate: Double): String = js.native
  def formatRelative(date: Date, baseDate: Double, options: Anon_012): String = js.native
  def formatRelative(date: Date, baseDate: Date): String = js.native
  def formatRelative(date: Date, baseDate: Date, options: Anon_012): String = js.native
  def fromUnixTime(unixTime: Double): js.Date = js.native
  def getDate(date: Double): Double = js.native
  def getDate(date: Date): Double = js.native
  def getDay(date: Double): Double = js.native
  def getDay(date: Date): Double = js.native
  def getDayOfYear(date: Double): Double = js.native
  def getDayOfYear(date: Date): Double = js.native
  def getDaysInMonth(date: Double): Double = js.native
  def getDaysInMonth(date: Date): Double = js.native
  def getDaysInYear(date: Double): Double = js.native
  def getDaysInYear(date: Date): Double = js.native
  def getDecade(date: Double): Double = js.native
  def getDecade(date: Date): Double = js.native
  def getHours(date: Double): Double = js.native
  def getHours(date: Date): Double = js.native
  def getISODay(date: Double): Double = js.native
  def getISODay(date: Date): Double = js.native
  def getISOWeek(date: Double): Double = js.native
  def getISOWeek(date: Date): Double = js.native
  def getISOWeekYear(date: Double): Double = js.native
  def getISOWeekYear(date: Date): Double = js.native
  def getISOWeeksInYear(date: Double): Double = js.native
  def getISOWeeksInYear(date: Date): Double = js.native
  def getMilliseconds(date: Double): Double = js.native
  def getMilliseconds(date: Date): Double = js.native
  def getMinutes(date: Double): Double = js.native
  def getMinutes(date: Date): Double = js.native
  def getMonth(date: Double): Double = js.native
  def getMonth(date: Date): Double = js.native
  def getOverlappingDaysInIntervals(intervalLeft: Interval, intervalRight: Interval): Double = js.native
  def getQuarter(date: Double): Double = js.native
  def getQuarter(date: Date): Double = js.native
  def getSeconds(date: Double): Double = js.native
  def getSeconds(date: Date): Double = js.native
  def getTime(date: Double): Double = js.native
  def getTime(date: Date): Double = js.native
  def getUnixTime(date: Double): Double = js.native
  def getUnixTime(date: Date): Double = js.native
  def getWeek(date: Double): Double = js.native
  def getWeek(date: Double, options: Anon_01234567FirstWeekContainsDateLocaleWeekStartsOn): Double = js.native
  def getWeek(date: Date): Double = js.native
  def getWeek(date: Date, options: Anon_01234567FirstWeekContainsDateLocaleWeekStartsOn): Double = js.native
  def getWeekOfMonth(date: Double): Double = js.native
  def getWeekOfMonth(date: Double, options: Anon_012): Double = js.native
  def getWeekOfMonth(date: Date): Double = js.native
  def getWeekOfMonth(date: Date, options: Anon_012): Double = js.native
  def getWeekYear(date: Double): Double = js.native
  def getWeekYear(date: Double, options: Anon_01234567FirstWeekContainsDateLocaleWeekStartsOn): Double = js.native
  def getWeekYear(date: Date): Double = js.native
  def getWeekYear(date: Date, options: Anon_01234567FirstWeekContainsDateLocaleWeekStartsOn): Double = js.native
  def getWeeksInMonth(date: Double): Double = js.native
  def getWeeksInMonth(date: Double, options: Anon_012): Double = js.native
  def getWeeksInMonth(date: Date): Double = js.native
  def getWeeksInMonth(date: Date, options: Anon_012): Double = js.native
  def getYear(date: Double): Double = js.native
  def getYear(date: Date): Double = js.native
  def isAfter(date: Double, dateToCompare: Double): Boolean = js.native
  def isAfter(date: Double, dateToCompare: Date): Boolean = js.native
  def isAfter(date: Date, dateToCompare: Double): Boolean = js.native
  def isAfter(date: Date, dateToCompare: Date): Boolean = js.native
  def isBefore(date: Double, dateToCompare: Double): Boolean = js.native
  def isBefore(date: Double, dateToCompare: Date): Boolean = js.native
  def isBefore(date: Date, dateToCompare: Double): Boolean = js.native
  def isBefore(date: Date, dateToCompare: Date): Boolean = js.native
  def isDate(value: js.Any): Boolean = js.native
  def isEqual(dateLeft: Double, dateRight: Double): Boolean = js.native
  def isEqual(dateLeft: Double, dateRight: Date): Boolean = js.native
  def isEqual(dateLeft: Date, dateRight: Double): Boolean = js.native
  def isEqual(dateLeft: Date, dateRight: Date): Boolean = js.native
  def isFirstDayOfMonth(date: Double): Boolean = js.native
  def isFirstDayOfMonth(date: Date): Boolean = js.native
  def isFriday(date: Double): Boolean = js.native
  def isFriday(date: Date): Boolean = js.native
  def isFuture(date: Double): Boolean = js.native
  def isFuture(date: Date): Boolean = js.native
  def isLastDayOfMonth(date: Double): Boolean = js.native
  def isLastDayOfMonth(date: Date): Boolean = js.native
  def isLeapYear(date: Double): Boolean = js.native
  def isLeapYear(date: Date): Boolean = js.native
  def isMonday(date: Double): Boolean = js.native
  def isMonday(date: Date): Boolean = js.native
  def isPast(date: Double): Boolean = js.native
  def isPast(date: Date): Boolean = js.native
  def isSameDay(dateLeft: Double, dateRight: Double): Boolean = js.native
  def isSameDay(dateLeft: Double, dateRight: Date): Boolean = js.native
  def isSameDay(dateLeft: Date, dateRight: Double): Boolean = js.native
  def isSameDay(dateLeft: Date, dateRight: Date): Boolean = js.native
  def isSameHour(dateLeft: Double, dateRight: Double): Boolean = js.native
  def isSameHour(dateLeft: Double, dateRight: Date): Boolean = js.native
  def isSameHour(dateLeft: Date, dateRight: Double): Boolean = js.native
  def isSameHour(dateLeft: Date, dateRight: Date): Boolean = js.native
  def isSameISOWeek(dateLeft: Double, dateRight: Double): Boolean = js.native
  def isSameISOWeek(dateLeft: Double, dateRight: Date): Boolean = js.native
  def isSameISOWeek(dateLeft: Date, dateRight: Double): Boolean = js.native
  def isSameISOWeek(dateLeft: Date, dateRight: Date): Boolean = js.native
  def isSameISOWeekYear(dateLeft: Double, dateRight: Double): Boolean = js.native
  def isSameISOWeekYear(dateLeft: Double, dateRight: Date): Boolean = js.native
  def isSameISOWeekYear(dateLeft: Date, dateRight: Double): Boolean = js.native
  def isSameISOWeekYear(dateLeft: Date, dateRight: Date): Boolean = js.native
  def isSameMinute(dateLeft: Double, dateRight: Double): Boolean = js.native
  def isSameMinute(dateLeft: Double, dateRight: Date): Boolean = js.native
  def isSameMinute(dateLeft: Date, dateRight: Double): Boolean = js.native
  def isSameMinute(dateLeft: Date, dateRight: Date): Boolean = js.native
  def isSameMonth(dateLeft: Double, dateRight: Double): Boolean = js.native
  def isSameMonth(dateLeft: Double, dateRight: Date): Boolean = js.native
  def isSameMonth(dateLeft: Date, dateRight: Double): Boolean = js.native
  def isSameMonth(dateLeft: Date, dateRight: Date): Boolean = js.native
  def isSameQuarter(dateLeft: Double, dateRight: Double): Boolean = js.native
  def isSameQuarter(dateLeft: Double, dateRight: Date): Boolean = js.native
  def isSameQuarter(dateLeft: Date, dateRight: Double): Boolean = js.native
  def isSameQuarter(dateLeft: Date, dateRight: Date): Boolean = js.native
  def isSameSecond(dateLeft: Double, dateRight: Double): Boolean = js.native
  def isSameSecond(dateLeft: Double, dateRight: Date): Boolean = js.native
  def isSameSecond(dateLeft: Date, dateRight: Double): Boolean = js.native
  def isSameSecond(dateLeft: Date, dateRight: Date): Boolean = js.native
  def isSameWeek(dateLeft: Double, dateRight: Double): Boolean = js.native
  def isSameWeek(dateLeft: Double, dateRight: Double, options: Anon_012): Boolean = js.native
  def isSameWeek(dateLeft: Double, dateRight: Date): Boolean = js.native
  def isSameWeek(dateLeft: Double, dateRight: Date, options: Anon_012): Boolean = js.native
  def isSameWeek(dateLeft: Date, dateRight: Double): Boolean = js.native
  def isSameWeek(dateLeft: Date, dateRight: Double, options: Anon_012): Boolean = js.native
  def isSameWeek(dateLeft: Date, dateRight: Date): Boolean = js.native
  def isSameWeek(dateLeft: Date, dateRight: Date, options: Anon_012): Boolean = js.native
  def isSameYear(dateLeft: Double, dateRight: Double): Boolean = js.native
  def isSameYear(dateLeft: Double, dateRight: Date): Boolean = js.native
  def isSameYear(dateLeft: Date, dateRight: Double): Boolean = js.native
  def isSameYear(dateLeft: Date, dateRight: Date): Boolean = js.native
  def isSaturday(date: Double): Boolean = js.native
  def isSaturday(date: Date): Boolean = js.native
  def isSunday(date: Double): Boolean = js.native
  def isSunday(date: Date): Boolean = js.native
  def isThisHour(date: Double): Boolean = js.native
  def isThisHour(date: Date): Boolean = js.native
  def isThisISOWeek(date: Double): Boolean = js.native
  def isThisISOWeek(date: Date): Boolean = js.native
  def isThisMinute(date: Double): Boolean = js.native
  def isThisMinute(date: Date): Boolean = js.native
  def isThisMonth(date: Double): Boolean = js.native
  def isThisMonth(date: Date): Boolean = js.native
  def isThisQuarter(date: Double): Boolean = js.native
  def isThisQuarter(date: Date): Boolean = js.native
  def isThisSecond(date: Double): Boolean = js.native
  def isThisSecond(date: Date): Boolean = js.native
  def isThisWeek(date: Double): Boolean = js.native
  def isThisWeek(date: Double, options: Anon_012): Boolean = js.native
  def isThisWeek(date: Date): Boolean = js.native
  def isThisWeek(date: Date, options: Anon_012): Boolean = js.native
  def isThisYear(date: Double): Boolean = js.native
  def isThisYear(date: Date): Boolean = js.native
  def isThursday(date: Double): Boolean = js.native
  def isThursday(date: Date): Boolean = js.native
  def isToday(date: Double): Boolean = js.native
  def isToday(date: Date): Boolean = js.native
  def isTomorrow(date: Double): Boolean = js.native
  def isTomorrow(date: Date): Boolean = js.native
  def isTuesday(date: Double): Boolean = js.native
  def isTuesday(date: Date): Boolean = js.native
  def isValid(date: js.Any): Boolean = js.native
  def isWednesday(date: Double): Boolean = js.native
  def isWednesday(date: Date): Boolean = js.native
  def isWeekend(date: Double): Boolean = js.native
  def isWeekend(date: Date): Boolean = js.native
  def isWithinInterval(date: Double, interval: Interval): Boolean = js.native
  def isWithinInterval(date: Date, interval: Interval): Boolean = js.native
  def isYesterday(date: Double): Boolean = js.native
  def isYesterday(date: Date): Boolean = js.native
  def lastDayOfDecade(date: Double): js.Date = js.native
  def lastDayOfDecade(date: Date): js.Date = js.native
  def lastDayOfISOWeek(date: Double): js.Date = js.native
  def lastDayOfISOWeek(date: Date): js.Date = js.native
  def lastDayOfISOWeekYear(date: Double): js.Date = js.native
  def lastDayOfISOWeekYear(date: Date): js.Date = js.native
  def lastDayOfMonth(date: Double): js.Date = js.native
  def lastDayOfMonth(date: Date): js.Date = js.native
  def lastDayOfQuarter(date: Double): js.Date = js.native
  def lastDayOfQuarter(date: Double, options: Anon_01): js.Date = js.native
  def lastDayOfQuarter(date: Date): js.Date = js.native
  def lastDayOfQuarter(date: Date, options: Anon_01): js.Date = js.native
  def lastDayOfWeek(date: Double): js.Date = js.native
  def lastDayOfWeek(date: Double, options: Anon_012): js.Date = js.native
  def lastDayOfWeek(date: Date): js.Date = js.native
  def lastDayOfWeek(date: Date, options: Anon_012): js.Date = js.native
  def lastDayOfYear(date: Double): js.Date = js.native
  def lastDayOfYear(date: Date): js.Date = js.native
  def lightFormat(date: Double, format: String): String = js.native
  def lightFormat(date: Date, format: String): String = js.native
  def max(datesArray: js.Array[js.Date | Double]): js.Date = js.native
  def min(datesArray: js.Array[js.Date | Double]): js.Date = js.native
  def parse(dateString: String, formatString: String, backupDate: Double): js.Date = js.native
  def parse(
    dateString: String,
    formatString: String,
    backupDate: Double,
    options: Anon_01234567FirstWeekContainsDateLocaleUseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
  ): js.Date = js.native
  def parse(dateString: String, formatString: String, backupDate: Date): js.Date = js.native
  def parse(
    dateString: String,
    formatString: String,
    backupDate: Date,
    options: Anon_01234567FirstWeekContainsDateLocaleUseAdditionalDayOfYearTokensUseAdditionalWeekYearTokens
  ): js.Date = js.native
  def parseISO(argument: String): js.Date = js.native
  def parseISO(argument: String, options: Anon_01): js.Date = js.native
  def parseJSON(argument: String): js.Date = js.native
  def parseJSON(argument: Double): js.Date = js.native
  def parseJSON(argument: Date): js.Date = js.native
  def roundToNearestMinutes(date: Double): js.Date = js.native
  def roundToNearestMinutes(date: Double, options: Anon_NearestTo): js.Date = js.native
  def roundToNearestMinutes(date: Date): js.Date = js.native
  def roundToNearestMinutes(date: Date, options: Anon_NearestTo): js.Date = js.native
  def set(date: Double, values: Anon_DateHours): js.Date = js.native
  def set(date: Date, values: Anon_DateHours): js.Date = js.native
  def setDate(date: Double, dayOfMonth: Double): js.Date = js.native
  def setDate(date: Date, dayOfMonth: Double): js.Date = js.native
  def setDay(date: Double, day: Double): js.Date = js.native
  def setDay(date: Double, day: Double, options: Anon_012): js.Date = js.native
  def setDay(date: Date, day: Double): js.Date = js.native
  def setDay(date: Date, day: Double, options: Anon_012): js.Date = js.native
  def setDayOfYear(date: Double, dayOfYear: Double): js.Date = js.native
  def setDayOfYear(date: Date, dayOfYear: Double): js.Date = js.native
  def setHours(date: Double, hours: Double): js.Date = js.native
  def setHours(date: Date, hours: Double): js.Date = js.native
  def setISODay(date: Double, day: Double): js.Date = js.native
  def setISODay(date: Date, day: Double): js.Date = js.native
  def setISOWeek(date: Double, isoWeek: Double): js.Date = js.native
  def setISOWeek(date: Date, isoWeek: Double): js.Date = js.native
  def setISOWeekYear(date: Double, isoWeekYear: Double): js.Date = js.native
  def setISOWeekYear(date: Date, isoWeekYear: Double): js.Date = js.native
  def setMilliseconds(date: Double, milliseconds: Double): js.Date = js.native
  def setMilliseconds(date: Date, milliseconds: Double): js.Date = js.native
  def setMinutes(date: Double, minutes: Double): js.Date = js.native
  def setMinutes(date: Date, minutes: Double): js.Date = js.native
  def setMonth(date: Double, month: Double): js.Date = js.native
  def setMonth(date: Date, month: Double): js.Date = js.native
  def setQuarter(date: Double, quarter: Double): js.Date = js.native
  def setQuarter(date: Date, quarter: Double): js.Date = js.native
  def setSeconds(date: Double, seconds: Double): js.Date = js.native
  def setSeconds(date: Date, seconds: Double): js.Date = js.native
  def setWeek(date: Double, week: Double): js.Date = js.native
  def setWeek(date: Double, week: Double, options: Anon_01234567FirstWeekContainsDateLocaleWeekStartsOn): js.Date = js.native
  def setWeek(date: Date, week: Double): js.Date = js.native
  def setWeek(date: Date, week: Double, options: Anon_01234567FirstWeekContainsDateLocaleWeekStartsOn): js.Date = js.native
  def setWeekYear(date: Double, weekYear: Double): js.Date = js.native
  def setWeekYear(date: Double, weekYear: Double, options: Anon_01234567FirstWeekContainsDateLocaleWeekStartsOn): js.Date = js.native
  def setWeekYear(date: Date, weekYear: Double): js.Date = js.native
  def setWeekYear(date: Date, weekYear: Double, options: Anon_01234567FirstWeekContainsDateLocaleWeekStartsOn): js.Date = js.native
  def setYear(date: Double, year: Double): js.Date = js.native
  def setYear(date: Date, year: Double): js.Date = js.native
  def startOfDay(date: Double): js.Date = js.native
  def startOfDay(date: Date): js.Date = js.native
  def startOfDecade(date: Double): js.Date = js.native
  def startOfDecade(date: Date): js.Date = js.native
  def startOfHour(date: Double): js.Date = js.native
  def startOfHour(date: Date): js.Date = js.native
  def startOfISOWeek(date: Double): js.Date = js.native
  def startOfISOWeek(date: Date): js.Date = js.native
  def startOfISOWeekYear(date: Double): js.Date = js.native
  def startOfISOWeekYear(date: Date): js.Date = js.native
  def startOfMinute(date: Double): js.Date = js.native
  def startOfMinute(date: Date): js.Date = js.native
  def startOfMonth(date: Double): js.Date = js.native
  def startOfMonth(date: Date): js.Date = js.native
  def startOfQuarter(date: Double): js.Date = js.native
  def startOfQuarter(date: Date): js.Date = js.native
  def startOfSecond(date: Double): js.Date = js.native
  def startOfSecond(date: Date): js.Date = js.native
  def startOfToday(): js.Date = js.native
  def startOfTomorrow(): js.Date = js.native
  def startOfWeek(date: Double): js.Date = js.native
  def startOfWeek(date: Double, options: Anon_012): js.Date = js.native
  def startOfWeek(date: Date): js.Date = js.native
  def startOfWeek(date: Date, options: Anon_012): js.Date = js.native
  def startOfWeekYear(date: Double): js.Date = js.native
  def startOfWeekYear(date: Double, options: Anon_01234567FirstWeekContainsDateLocaleWeekStartsOn): js.Date = js.native
  def startOfWeekYear(date: Date): js.Date = js.native
  def startOfWeekYear(date: Date, options: Anon_01234567FirstWeekContainsDateLocaleWeekStartsOn): js.Date = js.native
  def startOfYear(date: Double): js.Date = js.native
  def startOfYear(date: Date): js.Date = js.native
  def startOfYesterday(): js.Date = js.native
  def subBusinessDays(date: Double, amount: Double): js.Date = js.native
  def subBusinessDays(date: Date, amount: Double): js.Date = js.native
  def subDays(date: Double, amount: Double): js.Date = js.native
  def subDays(date: Date, amount: Double): js.Date = js.native
  def subHours(date: Double, amount: Double): js.Date = js.native
  def subHours(date: Date, amount: Double): js.Date = js.native
  def subISOWeekYears(date: Double, amount: Double): js.Date = js.native
  def subISOWeekYears(date: Date, amount: Double): js.Date = js.native
  def subMilliseconds(date: Double, amount: Double): js.Date = js.native
  def subMilliseconds(date: Date, amount: Double): js.Date = js.native
  def subMinutes(date: Double, amount: Double): js.Date = js.native
  def subMinutes(date: Date, amount: Double): js.Date = js.native
  def subMonths(date: Double, amount: Double): js.Date = js.native
  def subMonths(date: Date, amount: Double): js.Date = js.native
  def subQuarters(date: Double, amount: Double): js.Date = js.native
  def subQuarters(date: Date, amount: Double): js.Date = js.native
  def subSeconds(date: Double, amount: Double): js.Date = js.native
  def subSeconds(date: Date, amount: Double): js.Date = js.native
  def subWeeks(date: Double, amount: Double): js.Date = js.native
  def subWeeks(date: Date, amount: Double): js.Date = js.native
  def subYears(date: Double, amount: Double): js.Date = js.native
  def subYears(date: Date, amount: Double): js.Date = js.native
  def toDate(argument: Double): js.Date = js.native
  def toDate(argument: Date): js.Date = js.native
}

